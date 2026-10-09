package com.example.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entidad de persistencia para el progreso de los retos de hábitos de 66 días.
 */
@Entity(tableName = "habit_progress", primaryKeys = ["challengeId", "dayNumber"])
data class HabitProgressEntity(
    val challengeId: String,
    val dayNumber: Int,
    val isCompleted: Boolean = true,
    val completedDate: Long = System.currentTimeMillis()
)

/**
 * Entidad de persistencia para la bitácora / diario personal del reto.
 */
@Entity(tableName = "challenge_journal")
data class ChallengeJournalEntry(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val challengeId: String,
    val dayNumber: Int,
    val dateTimestamp: Long = System.currentTimeMillis(),
    val feelings: String, // ¿Cómo me sentí hoy?
    val achievements: String, // ¿Qué logros obtuve hoy?
    val photoUri: String? = null, // URI opcional de foto desde galería/cámara
    val verseReference: String = "",
    val verseText: String = ""
)

/**
 * Tipos de actividades dinámicas recomendadas por el coach.
 */
enum class CoachActivityType(val label: String, val iconName: String) {
    EJERCICIO("Ejercicio físico", "fitness_center"),
    NUTRICION("Alimentación e hidratación", "restaurant"),
    NATURALEZA("Contacto con la naturaleza", "park"),
    RESPIRACION("Meditación y respiración", "air"),
    DESCANSO("Descanso y sueño reparador", "bedtime"),
    GRATITUD("Reflexión y gratitud", "favorite"),
    DESCONEXION("Desconexión digital", "phonelink_erase"),
    ACCION_PRACTICA("Acción concreta", "track_changes")
}

/**
 * Representa un día de un reto de 66 días.
 */
data class HabitDay(
    val dayNumber: Int,
    val title: String,
    val verseReference: String,
    val verseText: String,
    val reflection: String,
    val practicalTask: String,
    val activityType: CoachActivityType = CoachActivityType.ACCION_PRACTICA,
    val isCompleted: Boolean = false
) {
    val phaseNumber: Int
        get() = when {
            dayNumber <= 22 -> 1
            dayNumber <= 44 -> 2
            else -> 3
        }

    val phaseName: String
        get() = when (phaseNumber) {
            1 -> "Fase 1: Desaprendizaje y Ruptura (Días 1-22)"
            2 -> "Fase 2: Instalación y Cableado (Días 23-44)"
            else -> "Fase 3: Integración e Identidad (Días 45-66)"
        }
}

/**
 * Representa un reto de 66 días completo.
 */
data class HabitChallenge(
    val id: String,
    val title: String,
    val category: String,
    val description: String,
    val iconKey: String = "flag",
    val days: List<HabitDay>
)
