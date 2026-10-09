package com.example.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entidad que representa un versículo bíblico de Proverbios (NBV).
 * Incluye categorización temática, consejo práctico y soporte para favoritos y notas personales.
 */
@Entity(tableName = "verses")
data class Verse(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val chapter: Int,
    val verseNumber: Int,
    val verseEndNumber: Int = verseNumber,
    val reference: String,
    val text: String,
    val primaryCategory: String,
    val tags: String, // Etiquetas separadas por coma
    val practicalAdvice: String,
    val actionPrompt: String,
    val isFavorite: Boolean = false,
    val personalNote: String = "",
    val favoriteTimestamp: Long = 0L
)
