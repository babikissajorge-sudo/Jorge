package com.example

import android.app.Application
import androidx.test.core.app.ApplicationProvider
import com.example.data.local.AppDatabase
import com.example.data.local.ProverbsDataSeeder
import com.example.data.repository.ProverbsRepository
import com.example.ui.viewmodel.ProverbsViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@OptIn(ExperimentalCoroutinesApi::class)
@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class VerseNavigationTest {

    private lateinit var application: Application
    private lateinit var repository: ProverbsRepository
    private lateinit var viewModel: ProverbsViewModel

    @Before
    fun setUp() = runTest {
        application = ApplicationProvider.getApplicationContext()
        val db = AppDatabase.getDatabase(application, this)
        repository = ProverbsRepository(
            verseDao = db.verseDao(),
            habitProgressDao = db.habitProgressDao(),
            challengeJournalDao = db.challengeJournalDao(),
            habitCertificateDao = db.habitCertificateDao()
        )
        // Sembrar datos para tener los 31 capítulos con todos sus versículos
        repository.ensureDataSeeded(application)

        viewModel = ProverbsViewModel(application, repository)
    }

    @Test
    fun testNavigationToLongChapterProverbs3Verse27() = runTest {
        // Prueba 1: Navegar a Proverbios 3:27 (Capítulo largo con 35 versículos)
        viewModel.navigateToChapterAndVerse(chapter = 3, verseNumber = 27)

        val navEvent = viewModel.targetVerseNav.value
        assertNotNull("El evento de navegación a versículo objetivo no debe ser nulo", navEvent)
        assertEquals(3, navEvent?.chapter)
        assertEquals(27, navEvent?.verseNumber)
        assertEquals(3, viewModel.selectedChapter.value)

        // Obtener versículos del capítulo 3
        val chapter3Verses = repository.getVersesByChapter(3).first()
        assertTrue("Proverbios 3 debe tener versículos", chapter3Verses.isNotEmpty())
        assertEquals(35, chapter3Verses.size)

        // Verificar índice exacto para el desplazamiento
        val targetIndex = chapter3Verses.indexOfFirst { it.verseNumber == 27 }
        assertEquals(26, targetIndex)
        val targetVerse = chapter3Verses[targetIndex]
        assertEquals(3, targetVerse.chapter)
        assertEquals(27, targetVerse.verseNumber)

        // Limpiar el evento para simular el desplazamiento completado
        viewModel.clearTargetVerseNav()
        assertNull(viewModel.targetVerseNav.value)
    }

    @Test
    fun testNavigationToLongChapterProverbs31Verse30() = runTest {
        // Prueba 2: Navegar a Proverbios 31:30 (Capítulo final con 31 versículos)
        viewModel.navigateToChapterAndVerse(chapter = 31, verseNumber = 30)

        val navEvent = viewModel.targetVerseNav.value
        assertNotNull(navEvent)
        assertEquals(31, navEvent?.chapter)
        assertEquals(30, navEvent?.verseNumber)
        assertEquals(31, viewModel.selectedChapter.value)

        val chapter31Verses = repository.getVersesByChapter(31).first()
        assertTrue(chapter31Verses.isNotEmpty())
        assertEquals(31, chapter31Verses.size)

        val targetIndex = chapter31Verses.indexOfFirst { it.verseNumber == 30 }
        assertEquals(29, targetIndex)
        val targetVerse = chapter31Verses[targetIndex]
        assertEquals(31, targetVerse.chapter)
        assertEquals(30, targetVerse.verseNumber)
    }

    @Test
    fun testRegularChapterSelectionDoesNotHighlightVerse() = runTest {
        // Prueba 3: Selección normal de capítulo desde la barra o selector
        viewModel.selectChapter(15)

        val navEvent = viewModel.targetVerseNav.value
        assertNotNull(navEvent)
        assertEquals(15, navEvent?.chapter)
        assertNull("La selección regular no debe apuntar a un versículo específico", navEvent?.verseNumber)
        assertEquals(15, viewModel.selectedChapter.value)
    }
}
