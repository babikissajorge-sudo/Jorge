package com.example.data.local

/**
 * Subtítulos de sección oficiales según la estructura de la Nueva Biblia Viva (NBV).
 * Organizados por capítulo y número de versículo donde inicia la sección.
 */
object ProverbsSectionHeadings {

    private val headings: Map<Pair<Int, Int>, String> = mapOf(
        // CAPÍTULO 1
        Pair(1, 1) to "Prólogo: Propósito y tema",
        Pair(1, 8) to "Advertencias contra el engaño",
        Pair(1, 20) to "El llamado de la sabiduría",

        // CAPÍTULO 2
        Pair(2, 1) to "Beneficios morales de la sabiduría",

        // CAPÍTULO 3
        Pair(3, 1) to "Consejos para jóvenes",
        Pair(3, 13) to "La bienaventuranza de la sabiduría",
        Pair(3, 27) to "El trato con el prójimo",

        // CAPÍTULO 4
        Pair(4, 1) to "Instrucción de un padre",
        Pair(4, 10) to "Los dos caminos",
        Pair(4, 20) to "Guarda tu corazón",

        // CAPÍTULO 5
        Pair(5, 1) to "Advertencia contra la inmoralidad",
        Pair(5, 15) to "Fidelidad en el matrimonio",

        // CAPÍTULO 6
        Pair(6, 1) to "Peligros de la fianza imprudente",
        Pair(6, 6) to "Lección de la hormiga",
        Pair(6, 12) to "El hombre perverso y depravado",
        Pair(6, 16) to "Siete cosas que aborrece el Señor",
        Pair(6, 20) to "Advertencia contra el adulterio",

        // CAPÍTULO 7
        Pair(7, 1) to "Las trampas de la seducción",

        // CAPÍTULO 8
        Pair(8, 1) to "La sabiduría convoca a los hombres",
        Pair(8, 12) to "La excelencia de la sabiduría",
        Pair(8, 22) to "La sabiduría en la creación",

        // CAPÍTULO 9
        Pair(9, 1) to "El banquete de la sabiduría",
        Pair(9, 13) to "La invitación de la insensatez",

        // CAPÍTULO 10
        Pair(10, 1) to "Proverbios de Salomón: Contrastes entre el justo y el malvado",

        // CAPÍTULO 11
        Pair(11, 1) to "Integridad, justicia y rectitud",

        // CAPÍTULO 12
        Pair(12, 1) to "El valor de la disciplina y el trabajo",

        // CAPÍTULO 13
        Pair(13, 1) to "El poder del consejo y la honradez",

        // CAPÍTULO 14
        Pair(14, 1) to "Edificar la casa y andar en rectitud",

        // CAPÍTULO 15
        Pair(15, 1) to "La palabra apacible y el corazón alegre",

        // CAPÍTULO 16
        Pair(16, 1) to "La soberanía de Dios y los planes humanos",

        // CAPÍTULO 17
        Pair(17, 1) to "Armonía, amistad y sensatez",

        // CAPÍTULO 18
        Pair(18, 1) to "Prudencia al hablar y refugio en el Señor",

        // CAPÍTULO 19
        Pair(19, 1) to "Humildad, contentamiento y generosidad",

        // CAPÍTULO 20
        Pair(20, 1) to "Sobriedad, diligencia y discernimiento",

        // CAPÍTULO 21
        Pair(21, 1) to "La justicia es más grata que el sacrificio",

        // CAPÍTULO 22
        Pair(22, 1) to "El valor del buen nombre",
        Pair(22, 17) to "Treinta dichos de los sabios",

        // CAPÍTULO 23
        Pair(23, 1) to "Prudencia en la mesa y en los negocios",
        Pair(23, 19) to "Consejos para evitar el desvío",
        Pair(23, 29) to "Peligros del exceso con el vino",

        // CAPÍTULO 24
        Pair(24, 1) to "Sabiduría para edificar la vida",
        Pair(24, 23) to "Otros dichos de los sabios",
        Pair(24, 30) to "El campo del perezoso",

        // CAPÍTULO 25
        Pair(25, 1) to "Otros proverbios de Salomón transcritos por los sabios de Ezequías",
        Pair(25, 16) to "Moderación y autocontrol",

        // CAPÍTULO 26
        Pair(26, 1) to "Advertencias sobre los necios",
        Pair(26, 13) to "El perezoso y el chismoso",

        // CAPÍTULO 27
        Pair(27, 1) to "El valor del presente y la lealtad de los amigos",
        Pair(27, 23) to "Cuidado diligente de los bienes",

        // CAPÍTULO 28
        Pair(28, 1) to "La ley, los gobernantes y la honradez",

        // CAPÍTULO 29
        Pair(29, 1) to "Consecuencias de la obstinación y la justicia",

        // CAPÍTULO 30
        Pair(30, 1) to "Palabras de Agur hijo de Jaqué",
        Pair(30, 11) to "Cuatro generaciones y cuatro cosas insaciables",
        Pair(30, 24) to "Cuatro seres pequeños pero sumamente sabios",

        // CAPÍTULO 31
        Pair(31, 1) to "Los consejos del rey Lemuel",
        Pair(31, 10) to "Elogio de la mujer virtuosa y sabia"
    )

    fun getSectionHeading(chapter: Int, verseNumber: Int): String? {
        return headings[Pair(chapter, verseNumber)]
    }

    /**
     * Retorna el subtítulo de la sección a la que pertenece un versículo dado.
     */
    fun getCurrentSectionTitle(chapter: Int, verseNumber: Int): String? {
        val chapterHeadings = headings.filterKeys { it.first == chapter }
            .toList()
            .sortedBy { it.first.second }

        var currentTitle: String? = null
        for ((key, title) in chapterHeadings) {
            if (verseNumber >= key.second) {
                currentTitle = title
            } else {
                break
            }
        }
        return currentTitle
    }
}
