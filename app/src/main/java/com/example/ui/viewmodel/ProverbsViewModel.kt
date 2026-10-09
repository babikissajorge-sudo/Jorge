package com.example.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.ProverbiosApp
import com.example.data.model.ChallengeJournalEntry
import com.example.data.model.HabitCertificate
import com.example.data.model.HabitChallenge
import com.example.data.model.Verse
import com.example.data.repository.ProverbsRepository
import com.example.reminder.ReminderScheduler
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

@OptIn(ExperimentalCoroutinesApi::class)
class ProverbsViewModel(
    application: Application,
    private val repository: ProverbsRepository
) : AndroidViewModel(application) {

    init {
        viewModelScope.launch {
            repository.ensureDataSeeded(application)
        }
    }

    // Lista completa de versículos
    val allVerses: StateFlow<List<Verse>> = repository.getAllVerses()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    // Versículo del día determinista
    val verseOfTheDay: StateFlow<Verse?> = allVerses.map { list ->
        repository.getVerseOfTheDay(list)
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)

    // Búsqueda
    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    val searchResults: StateFlow<List<Verse>> = _searchQuery.flatMapLatest { query ->
        if (query.isBlank()) {
            repository.getAllVerses()
        } else {
            repository.searchVerses(query.trim())
        }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    // Categoría seleccionada
    private val _selectedCategory = MutableStateFlow("Finanzas")
    val selectedCategory: StateFlow<String> = _selectedCategory.asStateFlow()

    val categoryVerses: StateFlow<List<Verse>> = _selectedCategory.flatMapLatest { cat ->
        repository.getVersesByCategory(cat)
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    // Capítulo seleccionado (1 al 31)
    private val _selectedChapter = MutableStateFlow(1)
    val selectedChapter: StateFlow<Int> = _selectedChapter.asStateFlow()

    // Navegación objetivo con versículo específico
    private val _targetVerseNav = MutableStateFlow<TargetVerseNavigation?>(null)
    val targetVerseNav: StateFlow<TargetVerseNavigation?> = _targetVerseNav.asStateFlow()

    val chapterVerses: StateFlow<List<Verse>> = _selectedChapter.flatMapLatest { ch ->
        repository.getVersesByChapter(ch)
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    // Favoritos
    val favoriteVerses: StateFlow<List<Verse>> = repository.getFavoriteVerses()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    // Retos de hábitos
    val habitChallenges: List<HabitChallenge> = repository.getHabitChallenges()

    val habitProgressMap: StateFlow<Map<String, Set<Int>>> = repository.getAllHabitProgress()
        .map { progressList ->
            progressList.groupBy({ it.challengeId }, { it.dayNumber })
                .mapValues { it.value.toSet() }
        }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyMap())

    // Ajustes
    private val _fontSizeFactor = MutableStateFlow(1.0f) // 0.9f, 1.0f, 1.2f, 1.35f
    val fontSizeFactor: StateFlow<Float> = _fontSizeFactor.asStateFlow()

    private val _darkThemeMode = MutableStateFlow<Boolean?>(null) // null = sistema, true = oscuro, false = claro
    val darkThemeMode: StateFlow<Boolean?> = _darkThemeMode.asStateFlow()

    private val _isReminderEnabled = MutableStateFlow(
        ReminderScheduler.isReminderEnabled(application)
    )
    val isReminderEnabled: StateFlow<Boolean> = _isReminderEnabled.asStateFlow()

    private val _reminderTime = MutableStateFlow(
        ReminderScheduler.getReminderTime(application)
    )
    val reminderTime: StateFlow<Pair<Int, Int>> = _reminderTime.asStateFlow()

    // Acciones
    fun setSearchQuery(query: String) {
        _searchQuery.value = query
    }

    fun selectCategory(category: String) {
        _selectedCategory.value = category
    }

    fun selectChapter(chapter: Int) {
        val validChapter = chapter.coerceIn(1, 31)
        _selectedChapter.value = validChapter
        _targetVerseNav.value = TargetVerseNavigation(validChapter, null, System.currentTimeMillis())
    }

    fun navigateToChapterAndVerse(chapter: Int, verseNumber: Int? = null) {
        val validChapter = chapter.coerceIn(1, 31)
        _selectedChapter.value = validChapter
        _targetVerseNav.value = TargetVerseNavigation(validChapter, verseNumber, System.currentTimeMillis())
    }

    fun clearTargetVerseNav() {
        _targetVerseNav.value = null
    }

    fun toggleFavorite(verse: Verse) {
        viewModelScope.launch {
            repository.toggleFavorite(verse)
        }
    }

    fun saveNote(verseId: Int, note: String) {
        viewModelScope.launch {
            repository.saveNote(verseId, note)
        }
    }

    fun toggleHabitDay(challengeId: String, dayNumber: Int, currentCompleted: Boolean) {
        viewModelScope.launch {
            repository.toggleHabitDay(challengeId, dayNumber, !currentCompleted)
        }
    }

    // Bitácora del reto
    fun getJournalEntries(challengeId: String): Flow<List<ChallengeJournalEntry>> =
        repository.getJournalEntries(challengeId)

    fun saveJournalEntry(entry: ChallengeJournalEntry) {
        viewModelScope.launch {
            repository.saveJournalEntry(entry)
        }
    }

    fun deleteJournalEntry(entry: ChallengeJournalEntry) {
        viewModelScope.launch {
            repository.deleteJournalEntry(entry)
        }
    }

    // Certificados de Logro (66 Días)
    val allCertificates: StateFlow<List<HabitCertificate>> = repository.getAllCertificates()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    fun observeCertificateForChallenge(challengeId: String): Flow<HabitCertificate?> =
        repository.observeCertificateForChallenge(challengeId)

    fun saveCertificate(certificate: HabitCertificate) {
        viewModelScope.launch {
            repository.saveCertificate(certificate)
        }
    }

    fun setFontSize(factor: Float) {
        _fontSizeFactor.value = factor
    }

    fun setDarkThemeMode(mode: Boolean?) {
        _darkThemeMode.value = mode
    }

    fun setReminder(enabled: Boolean, hour: Int, minute: Int) {
        _isReminderEnabled.value = enabled
        _reminderTime.value = Pair(hour, minute)
        ReminderScheduler.setReminder(getApplication(), enabled, hour, minute)
    }

    companion object {
        fun provideFactory(application: Application): ViewModelProvider.Factory =
            object : ViewModelProvider.Factory {
                @Suppress("UNCHECKED_CAST")
                override fun <T : ViewModel> create(modelClass: Class<T>): T {
                    val app = application as ProverbiosApp
                    return ProverbsViewModel(app, app.repository) as T
                }
            }
    }
}

/**
 * Evento de navegación a un capítulo y versículo específico del Lector.
 */
data class TargetVerseNavigation(
    val chapter: Int,
    val verseNumber: Int? = null,
    val timestamp: Long = System.currentTimeMillis()
)
