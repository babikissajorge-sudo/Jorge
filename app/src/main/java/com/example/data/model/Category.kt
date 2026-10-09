package com.example.data.model

import androidx.compose.ui.graphics.Color
import com.example.ui.theme.*

/**
 * Modelo de Categoría temática para explorar Proverbios.
 */
data class CategoryInfo(
    val id: String,
    val name: String,
    val description: String,
    val iconName: String,
    val color: Color
)

object PredefinedCategories {
    val list = listOf(
        CategoryInfo(
            id = "Finanzas",
            name = "Finanzas",
            description = "Ahorro, prudencia económica y buen uso de los recursos.",
            iconName = "account_balance_wallet",
            color = CatFinanzas
        ),
        CategoryInfo(
            id = "Autoestima",
            name = "Autoestima",
            description = "Identidad, valor intrínseco y humildad sabia.",
            iconName = "sentiment_very_satisfied",
            color = CatAutoestima
        ),
        CategoryInfo(
            id = "Enfoque",
            name = "Enfoque",
            description = "Claridad de propósitos y superación de distracciones.",
            iconName = "track_changes",
            color = CatEnfoque
        ),
        CategoryInfo(
            id = "Ansiedad",
            name = "Ansiedad",
            description = "Paz mental, tranquilidad y confianza ante la incertidumbre.",
            iconName = "spa",
            color = CatAnsiedad
        ),
        CategoryInfo(
            id = "Relaciones",
            name = "Relaciones",
            description = "Amistades sanas, convivencia en paz y lealtad.",
            iconName = "favorite",
            color = CatRelaciones
        ),
        CategoryInfo(
            id = "Disciplina",
            name = "Disciplina",
            description = "Constancia, autocontrol y hábitos que edifican.",
            iconName = "fitness_center",
            color = CatDisciplina
        ),
        CategoryInfo(
            id = "Sabiduría",
            name = "Sabiduría",
            description = "Discernimiento, buen juicio y búsqueda de la verdad.",
            iconName = "menu_book",
            color = CatSabiduria
        ),
        CategoryInfo(
            id = "Trabajo",
            name = "Trabajo",
            description = "Excelencia, laboriosidad y satisfacción laboral.",
            iconName = "work",
            color = CatTrabajo
        ),
        CategoryInfo(
            id = "Familia",
            name = "Familia",
            description = "Amor en el hogar, crianza y honra familiar.",
            iconName = "home",
            color = CatFamilia
        ),
        CategoryInfo(
            id = "Salud",
            name = "Salud",
            description = "Bienestar integral, corazón alegre y descanso.",
            iconName = "favorite_border",
            color = CatSalud
        ),
        CategoryInfo(
            id = "Fe",
            name = "Fe",
            description = "Confianza plena en el Creador y rectitud moral.",
            iconName = "light_mode",
            color = CatFe
        ),
        CategoryInfo(
            id = "Enojo",
            name = "Enojo",
            description = "Manejo de la ira, serenidad y respuestas amables.",
            iconName = "local_fire_department",
            color = CatEnojo
        ),
        CategoryInfo(
            id = "Palabras",
            name = "Palabras",
            description = "El poder del hablar, prudencia y aliento mutuo.",
            iconName = "chat_bubble",
            color = CatPalabras
        ),
        CategoryInfo(
            id = "Generosidad",
            name = "Generosidad",
            description = "El gozo de dar, bendecir a otros y desprendimiento.",
            iconName = "volunteer_activism",
            color = CatGenerosidad
        ),
        CategoryInfo(
            id = "Pereza",
            name = "Pereza",
            description = "Superar la postergación y valorar el tiempo presente.",
            iconName = "alarm_off",
            color = CatPereza
        ),
        CategoryInfo(
            id = "Tentación",
            name = "Tentación",
            description = "Cuidar el corazón y mantenerse firme ante el error.",
            iconName = "shield",
            color = CatTentacion
        )
    )
}
