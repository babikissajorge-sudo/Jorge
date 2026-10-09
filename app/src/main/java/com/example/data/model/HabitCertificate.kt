package com.example.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entidad de persistencia para los certificados obtenidos al completar retos de 66 días.
 */
@Entity(tableName = "habit_certificates")
data class HabitCertificate(
    @PrimaryKey
    val challengeId: String,
    val challengeTitle: String,
    val userName: String,
    val completionDate: Long = System.currentTimeMillis(),
    val startDate: Long = System.currentTimeMillis() - (66L * 24 * 60 * 60 * 1000), // 66 días atrás aprox
    val featuredVerseRef: String = "Proverbios 4:13",
    val featuredVerseText: String = "Aférrate a la instrucción, no la dejes ir; cuídala bien, porque ella es tu vida.",
    val motivationalPhrase: String = "La constancia y la sabiduría forjan el destino. Has conquistado 66 días de transformación personal."
)
