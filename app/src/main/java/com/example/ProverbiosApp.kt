package com.example

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import com.example.data.local.AppDatabase
import com.example.data.repository.ProverbsRepository
import com.example.reminder.ReminderScheduler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

class ProverbiosApp : Application() {

    private val applicationScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)

    val database by lazy { AppDatabase.getDatabase(this, applicationScope) }
    val repository by lazy {
        ProverbsRepository(
            database.verseDao(),
            database.habitProgressDao(),
            database.challengeJournalDao(),
            database.habitCertificateDao()
        )
    }

    override fun onCreate() {
        super.onCreate()
        createNotificationChannel()
        applicationScope.launch {
            repository.ensureDataSeeded(this@ProverbiosApp)
        }
        ReminderScheduler.rescheduleIfEnabled(this)
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                "daily_verse_channel",
                "Versículo Diario de Proverbios",
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                description = "Recordatorio diario con sabiduría de Proverbios para la vida"
            }
            val manager = getSystemService(NotificationManager::class.java)
            manager.createNotificationChannel(channel)
        }
    }
}
