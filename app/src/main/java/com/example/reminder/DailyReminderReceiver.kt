package com.example.reminder

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import com.example.MainActivity
import com.example.data.local.AppDatabase
import com.example.data.local.ProverbsDataSeeder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DailyReminderReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent?) {
        val channelId = "daily_verse_channel"
        val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                channelId,
                "Versículo Diario de Proverbios",
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                description = "Recordatorio diario con sabiduría de Proverbios para tu jornada"
            }
            notificationManager.createNotificationChannel(channel)
        }

        val openIntent = Intent(context, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntent = PendingIntent.getActivity(
            context,
            0,
            openIntent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        // Obtener un versículo representativo para hoy
        val initialVerses = ProverbsDataSeeder.getInitialVerses()
        val dayIndex = (java.util.Calendar.getInstance().get(java.util.Calendar.DAY_OF_YEAR)) % initialVerses.size
        val verse = initialVerses[dayIndex]

        val notification = NotificationCompat.Builder(context, channelId)
            .setSmallIcon(android.R.drawable.ic_menu_agenda)
            .setContentTitle("🌿 ${verse.reference} — Sabiduría para hoy")
            .setContentText("«${verse.text}»")
            .setStyle(
                NotificationCompat.BigTextStyle()
                    .bigText("«${verse.text}»\n\n💡 Consejo: ${verse.practicalAdvice}")
            )
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)
            .build()

        notificationManager.notify(1001, notification)

        // Si el dispositivo se reinició, reprogramar
        if (intent?.action == Intent.ACTION_BOOT_COMPLETED) {
            ReminderScheduler.rescheduleIfEnabled(context)
        }
    }
}
