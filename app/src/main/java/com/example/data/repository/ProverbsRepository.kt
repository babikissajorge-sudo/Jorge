package com.example.data.repository

import android.content.Context
import com.example.data.local.ChallengeJournalDao
import com.example.data.local.HabitCertificateDao
import com.example.data.local.HabitChallenges66Provider
import com.example.data.local.HabitProgressDao
import com.example.data.local.ProverbsDataSeeder
import com.example.data.local.VerseDao
import com.example.data.model.ChallengeJournalEntry
import com.example.data.model.HabitCertificate
import com.example.data.model.HabitChallenge
import com.example.data.model.HabitProgressEntity
import com.example.data.model.Verse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.util.Calendar

class ProverbsRepository(
    private val verseDao: VerseDao,
    private val habitProgressDao: HabitProgressDao,
    private val challengeJournalDao: ChallengeJournalDao,
    private val habitCertificateDao: HabitCertificateDao
) {

    fun getAllVerses(): Flow<List<Verse>> = verseDao.getAllVerses()

    fun getVerseById(id: Int): Flow<Verse?> = verseDao.getVerseById(id)

    fun getVersesByChapter(chapter: Int): Flow<List<Verse>> = verseDao.getVersesByChapter(chapter)

    fun getVersesByCategory(category: String): Flow<List<Verse>> = verseDao.getVersesByCategory(category)

    fun searchVerses(query: String): Flow<List<Verse>> = verseDao.searchVerses(query)

    fun getFavoriteVerses(): Flow<List<Verse>> = verseDao.getFavoriteVerses()

    suspend fun toggleFavorite(verse: Verse) {
        val newFav = !verse.isFavorite
        val timestamp = if (newFav) System.currentTimeMillis() else 0L
        verseDao.updateFavorite(verse.id, newFav, timestamp)
    }

    suspend fun saveNote(verseId: Int, note: String) {
        verseDao.updatePersonalNote(verseId, note)
    }

    suspend fun ensureDataSeeded(context: Context) {
        val currentCount = verseDao.getVerseCount()
        if (currentCount < 900) {
            val existingFavorites = verseDao.getAllVersesSnapshot().filter { it.isFavorite || it.personalNote.isNotBlank() }
            val favMap = existingFavorites.associateBy { Pair(it.chapter, it.verseNumber) }
            val allVerses = ProverbsDataSeeder.loadAllVerses(context).map { v ->
                val existing = favMap[Pair(v.chapter, v.verseNumber)]
                if (existing != null) {
                    v.copy(
                        isFavorite = existing.isFavorite,
                        personalNote = existing.personalNote,
                        favoriteTimestamp = existing.favoriteTimestamp
                    )
                } else {
                    v
                }
            }
            verseDao.insertAll(allVerses)
        }
    }

    /**
     * Calcula de forma determinista el Versículo del Día basado en el día del año.
     */
    fun getVerseOfTheDay(allVerses: List<Verse>): Verse? {
        if (allVerses.isEmpty()) return null
        val dayOfYear = Calendar.getInstance().get(Calendar.DAY_OF_YEAR)
        val index = (dayOfYear + 42) % allVerses.size
        return allVerses[index]
    }

    fun getHabitChallenges(): List<HabitChallenge> = HabitChallenges66Provider.getAllChallenges()

    fun getHabitProgress(challengeId: String): Flow<List<HabitProgressEntity>> =
        habitProgressDao.getProgressByChallenge(challengeId)

    fun getAllHabitProgress(): Flow<List<HabitProgressEntity>> =
        habitProgressDao.getAllProgress()

    suspend fun toggleHabitDay(challengeId: String, dayNumber: Int, isCompleted: Boolean) {
        if (isCompleted) {
            habitProgressDao.markDayCompleted(
                HabitProgressEntity(
                    challengeId = challengeId,
                    dayNumber = dayNumber,
                    isCompleted = true,
                    completedDate = System.currentTimeMillis()
                )
            )
        } else {
            habitProgressDao.unmarkDay(challengeId, dayNumber)
        }
    }

    // Métodos para la Bitácora del reto
    fun getJournalEntries(challengeId: String): Flow<List<ChallengeJournalEntry>> =
        challengeJournalDao.getEntriesForChallenge(challengeId)

    suspend fun saveJournalEntry(entry: ChallengeJournalEntry): Long =
        challengeJournalDao.insertEntry(entry)

    suspend fun deleteJournalEntry(entry: ChallengeJournalEntry) =
        challengeJournalDao.deleteEntry(entry)

    // Métodos para Certificados de Logro
    fun getAllCertificates(): Flow<List<HabitCertificate>> =
        habitCertificateDao.getAllCertificates()

    suspend fun getCertificateForChallenge(challengeId: String): HabitCertificate? =
        habitCertificateDao.getCertificateForChallenge(challengeId)

    fun observeCertificateForChallenge(challengeId: String): Flow<HabitCertificate?> =
        habitCertificateDao.observeCertificateForChallenge(challengeId)

    suspend fun saveCertificate(certificate: HabitCertificate): Long =
        habitCertificateDao.insertCertificate(certificate)

    suspend fun deleteCertificate(challengeId: String) =
        habitCertificateDao.deleteCertificate(challengeId)
}
