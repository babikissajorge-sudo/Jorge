package com.example.data.local

import com.example.data.model.CoachActivityType
import com.example.data.model.HabitChallenge
import com.example.data.model.HabitDay

/**
 * Proveedor completo de los Retos de Hábitos de 66 Días con enfoque de coaching
 * basado en la curva científica de consolidación de hábitos (Dr. Phillippa Lally / UCL)
 * y la sabiduría práctica de los Proverbios bíblicos.
 */
object HabitChallenges66Provider {

    fun getAllChallenges(): List<HabitChallenge> = listOf(
        HabitChallenge(
            id = "ahorro",
            title = "Aprender a ahorrar y administrar mi dinero",
            category = "Finanzas",
            iconKey = "account_balance_wallet",
            description = "¿Cansado de que el dinero se esfume y de vivir con estrés financiero? Este reto de 66 días te guiará paso a paso con la sabiduría de Proverbios para transformar tu relación con las finanzas, liquidar deudas, eliminar gastos hormiga y construir un fondo de paz.",
            days = listOf(
            HabitDay(
                dayNumber = 1,
                title = "Conciencia total de gastos",
                verseReference = "Proverbios 1:13",
                verseText = "Hallaremos riquezas de toda clase, Llenaremos nuestras casas de despojos;",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Anota en una libreta absolutamente todo lo que gastes hoy, desde el boleto de transporte hasta el café más pequeño.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 2,
                title = "El primer no a un gasto impulsivo",
                verseReference = "Proverbios 1:27",
                verseText = "Cuando viniere como una destrucción lo que teméis, Y vuestra calamidad llegare como un torbellino; Cuando sobre vosotros viniere tribulación y angustia.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Haz 15 minutos de caminata al aire libre reflexionando en cómo el dinero sirve a tus valores y no al revés.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 3,
                title = "Auditoría de suscripciones",
                verseReference = "Proverbios 1:29",
                verseText = "Por cuanto aborrecieron la sabiduría, Y no escogieron el temor de Jehová,",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Prepara hoy tus alimentos en casa para el almuerzo y lleva tu propia botella de agua reutilizable.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 4,
                title = "La alcancía de emergencia",
                verseReference = "Proverbios 2:4",
                verseText = "Si como a la plata la buscares, Y la escudriñares como a tesoros,",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Sal a un parque o mira el cielo 10 minutos para recordar que las cosas más valiosas de la vida son gratis.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 5,
                title = "Regla de las 24 horas",
                verseReference = "Proverbios 2:5",
                verseText = "Entonces entenderás el temor de Jehová, Y hallarás el conocimiento de Dios.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Haz 5 minutos de respiración lenta 4-7-8 antes de entrar a cualquier tienda o aplicación de compras.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 6,
                title = "Cero compras de consuelo emocional",
                verseReference = "Proverbios 3:2",
                verseText = "Porque largura de días y años de vida Y paz te aumentarán.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Duerme 8 horas completas hoy apagando el celular 30 minutos antes; descansar bien evita compras impulsivas por fatiga.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 7,
                title = "Mapeo de fugas hormiga",
                verseReference = "Proverbios 3:14",
                verseText = "Porque su ganancia es mejor que la ganancia de la plata, Y sus frutos más que el oro fino.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Escribe 3 cosas no materiales por las que estás profundamente agradecido en tu vida actual.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 8,
                title = "Comida hecha en casa",
                verseReference = "Proverbios 3:16",
                verseText = "Largura de días está en su mano derecha; En su izquierda, riquezas y honra.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Desinstala o silencia por hoy las apps de compras y delivery para romper la tentación del clic automático.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 9,
                title = "Presupuesto semanal en papel",
                verseReference = "Proverbios 3:17",
                verseText = "Sus caminos son caminos deleitosos, Y todas sus veredas paz.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Anota en una libreta absolutamente todo lo que gastes hoy, desde el boleto de transporte hasta el café más pequeño.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 10,
                title = "Conversación financiera honesta",
                verseReference = "Proverbios 3:25",
                verseText = "No tendrás temor de pavor repentino, Ni de la ruina de los impíos cuando viniere,",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Haz 15 minutos de caminata al aire libre reflexionando en cómo el dinero sirve a tus valores y no al revés.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 11,
                title = "Agradecer antes de comprar",
                verseReference = "Proverbios 3:26",
                verseText = "Porque Jehová será tu confianza, Y él preservará tu pie de quedar preso.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Prepara hoy tus alimentos en casa para el almuerzo y lleva tu propia botella de agua reutilizable.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 12,
                title = "Plan bola de nieve para deudas",
                verseReference = "Proverbios 4:9",
                verseText = "Adorno de gracia dará a tu cabeza; Corona de hermosura te entregará.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Sal a un parque o mira el cielo 10 minutos para recordar que las cosas más valiosas de la vida son gratis.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 13,
                title = "Separar las primicias",
                verseReference = "Proverbios 6:11",
                verseText = "Así vendrá tu necesidad como caminante, Y tu pobreza como hombre armado.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Haz 5 minutos de respiración lenta 4-7-8 antes de entrar a cualquier tienda o aplicación de compras.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 14,
                title = "Desafío día sin gastar",
                verseReference = "Proverbios 7:11",
                verseText = "Alborotadora y rencillosa, Sus pies no pueden estar en casa;",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Duerme 8 horas completas hoy apagando el celular 30 minutos antes; descansar bien evita compras impulsivas por fatiga.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 15,
                title = "Buscar precios con calma",
                verseReference = "Proverbios 7:14",
                verseText = "Sacrificios de paz había prometido, Hoy he pagado mis votos;",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Escribe 3 cosas no materiales por las que estás profundamente agradecido en tu vida actual.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 16,
                title = "Vender algo que no uses",
                verseReference = "Proverbios 7:20",
                verseText = "La bolsa de dinero llevó en su mano; El día señalado volverá a su casa.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Desinstala o silencia por hoy las apps de compras y delivery para romper la tentación del clic automático.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 17,
                title = "Separar el 10% intocable",
                verseReference = "Proverbios 8:10",
                verseText = "Recibid mi enseñanza, y no plata; Y ciencia antes que el oro escogido.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Anota en una libreta absolutamente todo lo que gastes hoy, desde el boleto de transporte hasta el café más pequeño.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 18,
                title = "Aprender una habilidad rentable",
                verseReference = "Proverbios 8:18",
                verseText = "Las riquezas y la honra están conmigo; Riquezas duraderas, y justicia.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Haz 15 minutos de caminata al aire libre reflexionando en cómo el dinero sirve a tus valores y no al revés.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 19,
                title = "Evitar tarjetas en salidas",
                verseReference = "Proverbios 8:19",
                verseText = "Mejor es mi fruto que el oro, y que el oro refinado; Y mi rédito mejor que la plata escogida.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Prepara hoy tus alimentos en casa para el almuerzo y lleva tu propia botella de agua reutilizable.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 20,
                title = "Revisar facturas de servicios",
                verseReference = "Proverbios 8:21",
                verseText = "Para hacer que los que me aman tengan su heredad, Y que yo llene sus tesoros.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Sal a un parque o mira el cielo 10 minutos para recordar que las cosas más valiosas de la vida son gratis.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 21,
                title = "Ahorrar en el supermercado con lista",
                verseReference = "Proverbios 9:10",
                verseText = "El temor de Jehová es el principio de la sabiduría, Y el conocimiento del Santísimo es la inteligencia.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Haz 5 minutos de respiración lenta 4-7-8 antes de entrar a cualquier tienda o aplicación de compras.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 22,
                title = "Celebrar la victoria de la Fase 1",
                verseReference = "Proverbios 9:13",
                verseText = "La mujer insensata es alborotadora; Es simple e ignorante.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Duerme 8 horas completas hoy apagando el celular 30 minutos antes; descansar bien evita compras impulsivas por fatiga.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 23,
                title = "Automatizar el ahorro semanal",
                verseReference = "Proverbios 10:2",
                verseText = "Los tesoros de maldad no serán de provecho; Mas la justicia libra de muerte.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Escribe 3 cosas no materiales por las que estás profundamente agradecido en tu vida actual.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 24,
                title = "Fondo para imprevistos de salud",
                verseReference = "Proverbios 10:4",
                verseText = "Las manos ociosas conducen a la pobreza; las manos diligentes traen riqueza.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Desinstala o silencia por hoy las apps de compras y delivery para romper la tentación del clic automático.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 25,
                title = "Decir no con educación y firmeza",
                verseReference = "Proverbios 10:15",
                verseText = "Las riquezas del rico son su ciudad fortificada; Y el desmayo de los pobres es su pobreza.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Anota en una libreta absolutamente todo lo que gastes hoy, desde el boleto de transporte hasta el café más pequeño.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 26,
                title = "Comprar por calidad no por estatus",
                verseReference = "Proverbios 10:20",
                verseText = "Plata escogida es la lengua del justo; Mas el corazón de los impíos es como nada.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Haz 15 minutos de caminata al aire libre reflexionando en cómo el dinero sirve a tus valores y no al revés.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 27,
                title = "Mapear metas financieras a 1 año",
                verseReference = "Proverbios 10:27",
                verseText = "El temor de Jehová aumentará los días; Mas los años de los impíos serán acortados.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Prepara hoy tus alimentos en casa para el almuerzo y lleva tu propia botella de agua reutilizable.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 28,
                title = "Cero préstamos a ciegas",
                verseReference = "Proverbios 10:28",
                verseText = "La esperanza de los justos es alegría; Mas la esperanza de los impíos perecerá.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Sal a un parque o mira el cielo 10 minutos para recordar que las cosas más valiosas de la vida son gratis.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 29,
                title = "El placer de la sencillez",
                verseReference = "Proverbios 11:1",
                verseText = "El Señor aborrece las balanzas falsas, pero le agradan las pesas exactas.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Haz 5 minutos de respiración lenta 4-7-8 antes de entrar a cualquier tienda o aplicación de compras.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 30,
                title = "Regalar algo con generosidad",
                verseReference = "Proverbios 11:4",
                verseText = "No aprovecharán las riquezas en el día de la ira; Mas la justicia librará de muerte.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Duerme 8 horas completas hoy apagando el celular 30 minutos antes; descansar bien evita compras impulsivas por fatiga.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 31,
                title = "Monitorear progreso semanal",
                verseReference = "Proverbios 11:7",
                verseText = "Cuando muere el hombre impío, perece su esperanza; Y la expectación de los malos perecerá.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Escribe 3 cosas no materiales por las que estás profundamente agradecido en tu vida actual.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 32,
                title = "Aprender sobre interés compuesto",
                verseReference = "Proverbios 11:15",
                verseText = "Con ansiedad será afligido el que sale por fiador de un extraño; Mas el que aborreciere las fianzas vivirá seguro.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Desinstala o silencia por hoy las apps de compras y delivery para romper la tentación del clic automático.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 33,
                title = "Optimizar costos de transporte",
                verseReference = "Proverbios 11:16",
                verseText = "La mujer agraciada tendrá honra, Y los fuertes tendrán riquezas.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Anota en una libreta absolutamente todo lo que gastes hoy, desde el boleto de transporte hasta el café más pequeño.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 34,
                title = "El ayuno financiero de 48 horas",
                verseReference = "Proverbios 11:22",
                verseText = "Como zarcillo de oro en el hocico de un cerdo Es la mujer hermosa y apartada de razón.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Haz 15 minutos de caminata al aire libre reflexionando en cómo el dinero sirve a tus valores y no al revés.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 35,
                title = "Negociar un mejor descuento",
                verseReference = "Proverbios 11:24",
                verseText = "Hay quienes reparten, y les es añadido más; y hay quienes retienen más de lo que es justo, pero vienen a pobreza. El alma generosa será prosperada.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Prepara hoy tus alimentos en casa para el almuerzo y lleva tu propia botella de agua reutilizable.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 36,
                title = "Planear compras del próximo mes",
                verseReference = "Proverbios 11:28",
                verseText = "El que confía en sus riquezas caerá; Mas los justos reverdecerán como ramas.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Sal a un parque o mira el cielo 10 minutos para recordar que las cosas más valiosas de la vida son gratis.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 37,
                title = "Blindar la mente contra la publicidad",
                verseReference = "Proverbios 12:4",
                verseText = "La mujer virtuosa es corona de su marido; Mas la mala, como carcoma en sus huesos.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Haz 5 minutos de respiración lenta 4-7-8 antes de entrar a cualquier tienda o aplicación de compras.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 38,
                title = "Ahorrar en diversión creativa",
                verseReference = "Proverbios 13:7",
                verseText = "Hay quienes pretenden ser ricos, y no tienen nada; Y hay quienes pretenden ser pobres, y tienen muchas riquezas.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Duerme 8 horas completas hoy apagando el celular 30 minutos antes; descansar bien evita compras impulsivas por fatiga.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 39,
                title = "Fondo de educación o libros",
                verseReference = "Proverbios 13:8",
                verseText = "El rescate de la vida del hombre está en sus riquezas; Pero el pobre no oye censuras.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Escribe 3 cosas no materiales por las que estás profundamente agradecido en tu vida actual.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 40,
                title = "Comer sano sin gastar de más",
                verseReference = "Proverbios 13:11",
                verseText = "Las riquezas de vanidad disminuirán; pero el que recoge con mano laboriosa las aumentará.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Desinstala o silencia por hoy las apps de compras y delivery para romper la tentación del clic automático.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 41,
                title = "Revisar suscripciones anuales",
                verseReference = "Proverbios 13:12",
                verseText = "La esperanza que se demora es tormento del corazón; Pero árbol de vida es el deseo cumplido.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Anota en una libreta absolutamente todo lo que gastes hoy, desde el boleto de transporte hasta el café más pequeño.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 42,
                title = "Hacer mantenimiento preventivo",
                verseReference = "Proverbios 13:18",
                verseText = "Pobreza y vergüenza tendrá el que menosprecia el consejo; Mas el que guarda la corrección recibirá honra.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Haz 15 minutos de caminata al aire libre reflexionando en cómo el dinero sirve a tus valores y no al revés.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 43,
                title = "Agradecer por el techo y sustento",
                verseReference = "Proverbios 13:22",
                verseText = "El bueno dejará herederos a los hijos de sus hijos; Pero la riqueza del pecador está guardada para el justo.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Prepara hoy tus alimentos en casa para el almuerzo y lleva tu propia botella de agua reutilizable.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 44,
                title = "Celebrar la victoria de la Fase 2",
                verseReference = "Proverbios 13:23",
                verseText = "En el barbecho de los pobres hay mucho pan; Mas se pierde por falta de juicio.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Sal a un parque o mira el cielo 10 minutos para recordar que las cosas más valiosas de la vida son gratis.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 45,
                title = "Invertir tiempo en capacitación",
                verseReference = "Proverbios 14:18",
                verseText = "Los simples heredarán necedad; Mas los prudentes se coronarán de sabiduría.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Haz 5 minutos de respiración lenta 4-7-8 antes de entrar a cualquier tienda o aplicación de compras.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 46,
                title = "Construir paz mental financiera",
                verseReference = "Proverbios 14:20",
                verseText = "El pobre es odioso aun a su amigo; Pero muchos son los que aman al rico.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Duerme 8 horas completas hoy apagando el celular 30 minutos antes; descansar bien evita compras impulsivas por fatiga.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 47,
                title = "Eliminar la segunda deuda",
                verseReference = "Proverbios 14:21",
                verseText = "Peca el que menosprecia a su prójimo; Mas el que tiene misericordia de los pobres es bienaventurado.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Escribe 3 cosas no materiales por las que estás profundamente agradecido en tu vida actual.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 48,
                title = "Aprender a decir 'tengo suficiente'",
                verseReference = "Proverbios 14:23",
                verseText = "En toda labor hay fruto; Mas las vanas palabras de los labios empobrecen.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Desinstala o silencia por hoy las apps de compras y delivery para romper la tentación del clic automático.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 49,
                title = "Escribir tu manifiesto financiero",
                verseReference = "Proverbios 14:24",
                verseText = "Las riquezas de los sabios son su corona; Pero la insensatez de los necios es infatuación.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Anota en una libreta absolutamente todo lo que gastes hoy, desde el boleto de transporte hasta el café más pequeño.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 50,
                title = "Proteger el fondo de 3 meses",
                verseReference = "Proverbios 14:26",
                verseText = "En el temor de Jehová está la fuerte confianza; Y esperanza tendrán sus hijos.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Haz 15 minutos de caminata al aire libre reflexionando en cómo el dinero sirve a tus valores y no al revés.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 51,
                title = "Donar a quien verdaderamente lo necesite",
                verseReference = "Proverbios 14:27",
                verseText = "El temor de Jehová es manantial de vida Para apartarse de los lazos de la muerte.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Prepara hoy tus alimentos en casa para el almuerzo y lleva tu propia botella de agua reutilizable.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 52,
                title = "Enseñar a un familiar a ahorrar",
                verseReference = "Proverbios 14:31",
                verseText = "El que oprime al pobre afrenta a su Hacedor; Mas el que tiene misericordia del pobre, lo honra.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Sal a un parque o mira el cielo 10 minutos para recordar que las cosas más valiosas de la vida son gratis.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 53,
                title = "Celebrar con cena sencilla en casa",
                verseReference = "Proverbios 14:32",
                verseText = "Por su maldad será lanzado el impío; Mas el justo en su muerte tiene esperanza.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Haz 5 minutos de respiración lenta 4-7-8 antes de entrar a cualquier tienda o aplicación de compras.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 54,
                title = "Revisar tu nuevo balance patrimonial",
                verseReference = "Proverbios 15:6",
                verseText = "En la casa del justo hay gran provisión; Pero turbación en las ganancias del impío.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Duerme 8 horas completas hoy apagando el celular 30 minutos antes; descansar bien evita compras impulsivas por fatiga.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 55,
                title = "Disfrutar sin culpa lo necesario",
                verseReference = "Proverbios 15:16",
                verseText = "Mejor es lo poco con el temor del Señor, que el gran tesoro donde hay turbación.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Escribe 3 cosas no materiales por las que estás profundamente agradecido en tu vida actual.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 56,
                title = "Cero comparaciones de estilo de vida",
                verseReference = "Proverbios 15:27",
                verseText = "Alborota su casa el codicioso; Mas el que aborrece el soborno vivirá.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Desinstala o silencia por hoy las apps de compras y delivery para romper la tentación del clic automático.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 57,
                title = "Automatizar pagos fijos para evitar recargos",
                verseReference = "Proverbios 15:33",
                verseText = "El temor de Jehová es enseñanza de sabiduría; Y a la honra precede la humildad.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Anota en una libreta absolutamente todo lo que gastes hoy, desde el boleto de transporte hasta el café más pequeño.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 58,
                title = "Día de gratitud por la provisión",
                verseReference = "Proverbios 16:7",
                verseText = "Cuando los caminos del hombre son agradables a Jehová, Aun a sus enemigos hace estar en paz con él.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Haz 15 minutos de caminata al aire libre reflexionando en cómo el dinero sirve a tus valores y no al revés.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 59,
                title = "Planear proyectos del próximo año",
                verseReference = "Proverbios 16:11",
                verseText = "Peso y balanzas justas son de Jehová; Obra suya son todas las pesas de la bolsa.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Prepara hoy tus alimentos en casa para el almuerzo y lleva tu propia botella de agua reutilizable.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 60,
                title = "Vivir por debajo de tus ingresos con gozo",
                verseReference = "Proverbios 16:16",
                verseText = "Mejor es adquirir sabiduría que oro preciado; Y adquirir inteligencia vale más que la plata.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Sal a un parque o mira el cielo 10 minutos para recordar que las cosas más valiosas de la vida son gratis.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 61,
                title = "Desconectar de tiendas online",
                verseReference = "Proverbios 16:31",
                verseText = "Corona de honra es la vejez Que se halla en el camino de justicia.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Haz 5 minutos de respiración lenta 4-7-8 antes de entrar a cualquier tienda o aplicación de compras.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 62,
                title = "Dar gracias por el camino recorrido",
                verseReference = "Proverbios 17:3",
                verseText = "El crisol para la plata, y la hornaza para el oro; Pero Jehová prueba los corazones.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Duerme 8 horas completas hoy apagando el celular 30 minutos antes; descansar bien evita compras impulsivas por fatiga.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 63,
                title = "Evaluar los 60 días de nuevos hábitos",
                verseReference = "Proverbios 17:5",
                verseText = "El que escarnece al pobre afrenta a su Hacedor; Y el que se alegra de la calamidad no quedará sin castigo.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Escribe 3 cosas no materiales por las que estás profundamente agradecido en tu vida actual.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 64,
                title = "El hábito del ahorro es ya parte de ti",
                verseReference = "Proverbios 17:6",
                verseText = "Corona de los viejos son los nietos, Y la honra de los hijos, sus padres.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Desinstala o silencia por hoy las apps de compras y delivery para romper la tentación del clic automático.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 65,
                title = "Consolidar tu libertad financiera",
                verseReference = "Proverbios 17:16",
                verseText = "¿De qué sirve el precio en la mano del necio para comprar sabiduría, No teniendo entendimiento?",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Anota en una libreta absolutamente todo lo que gastes hoy, desde el boleto de transporte hasta el café más pequeño.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 66,
                title = "Graduación: Mayordomo sabio y libre",
                verseReference = "Proverbios 17:18",
                verseText = "El hombre falto de entendimiento presta fianzas, Y sale por fiador en presencia de su amigo.",
                reflection = "Tu relación con el dinero no depende de cuánto ganas, sino del orden y el contentamiento con el que administras lo que tienes hoy.",
                practicalTask = "Tu coach te reta hoy: Haz 15 minutos de caminata al aire libre reflexionando en cómo el dinero sirve a tus valores y no al revés.",
                activityType = CoachActivityType.EJERCICIO
            )
            )
        ),
        HabitChallenge(
            id = "peso_salud",
            title = "Bajar de peso con sabiduría",
            category = "Salud",
            iconKey = "monitor_weight",
            description = "¿Frustrado con dietas estrictas y rebotes continuos? Aprende a dominar los impulsos, escuchar a tu cuerpo y sanar tu relación con la comida mediante dominio propio, hidratación consciente y hábitos sostenibles durante 66 días.",
            days = listOf(
            HabitDay(
                dayNumber = 1,
                title = "Escuchar el hambre real",
                verseReference = "Proverbios 1:7",
                verseText = "El principio de la sabiduría es el temor del Señor; los necios desprecian la sabiduría y la disciplina.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Mastica cada bocado con calma durante la comida principal y suelta el tenedor entre bocados.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 2,
                title = "El vaso de agua antes de comer",
                verseReference = "Proverbios 1:19",
                verseText = "Tales son las sendas de todo el que es dado a la codicia, La cual quita la vida de sus poseedores.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Realiza 20 minutos de caminata continua a paso moderado tras tu comida principal.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 3,
                title = "Comer sin pantallas",
                verseReference = "Proverbios 2:2",
                verseText = "Haciendo estar atento tu oído a la sabiduría; Si inclinares tu corazón a la prudencia,",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Bebe un gran vaso de agua fresca al levantarte y añade una porción extra de verduras crudas o cocidas a tu almuerzo.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 4,
                title = "Masticar lento y saborear",
                verseReference = "Proverbios 2:7",
                verseText = "Él provee de sana sabiduría a los rectos; Es escudo a los que caminan rectamente.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Da un paseo de 15 minutos en un parque o área verde respirando aire limpio y agradeciendo por tu salud.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 5,
                title = "Cero azúcar en bebidas hoy",
                verseReference = "Proverbios 2:10",
                verseText = "Cuando la sabiduría entrare en tu corazón, Y la ciencia fuere grata a tu alma,",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Si sientes ganas de comer por aburrimiento o estrés, siéntate y haz 10 respiraciones diafragmáticas lentas antes de decidir.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 6,
                title = "Reconocer el apetito emocional",
                verseReference = "Proverbios 2:11",
                verseText = "El buen juicio te protegerá, y la prudencia cuidará de ti.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Cena ligero al menos 2 horas antes de acostarte y deja tu habitación fresca y a oscuras para un sueño reparador.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 7,
                title = "Llenar medio plato con vegetales",
                verseReference = "Proverbios 2:17",
                verseText = "La cual abandona al compañero de su juventud, Y se olvida del pacto de su Dios.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Mírate al espejo con aprecio y anota 3 cosas maravillosas que tu cuerpo te permite hacer cada día.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 8,
                title = "Desayuno con proteína limpia",
                verseReference = "Proverbios 2:19",
                verseText = "Todos los que a ella se lleguen, no volverán, Ni seguirán otra vez los senderos de la vida.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Come hoy todas tus comidas sin televisión, teléfono ni computadora; solo tú y el alimento.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 9,
                title = "Cenar ligero 2 horas antes de dormir",
                verseReference = "Proverbios 3:1",
                verseText = "Hijo mío, no te olvides de mi ley, Y tu corazón guarde mis mandamientos;",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Mastica cada bocado con calma durante la comida principal y suelta el tenedor entre bocados.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 10,
                title = "La pausa de 5 minutos antes de repetir",
                verseReference = "Proverbios 3:2",
                verseText = "Porque largura de días y años de vida Y paz te aumentarán.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Realiza 20 minutos de caminata continua a paso moderado tras tu comida principal.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 11,
                title = "Dormir 7 a 8 horas para regular grelina",
                verseReference = "Proverbios 3:3",
                verseText = "Nunca se aparten de ti la misericordia y la verdad; Átalas a tu cuello, Escríbelas en la tabla de tu corazón;",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Bebe un gran vaso de agua fresca al levantarte y añade una porción extra de verduras crudas o cocidas a tu almuerzo.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 12,
                title = "Identificar tus disparadores de ansiedad",
                verseReference = "Proverbios 3:5",
                verseText = "Confía en el Señor con todo tu corazón, y no te apoyes en tu propio entendimiento. Reconócelo en todos tus caminos, y él enderezará tus sendas.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Da un paseo de 15 minutos en un parque o área verde respirando aire limpio y agradeciendo por tu salud.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 13,
                title = "Cambiar postre por fruta fresca",
                verseReference = "Proverbios 3:8",
                verseText = "Porque será medicina a tu cuerpo, Y refrigerio para tus huesos.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Si sientes ganas de comer por aburrimiento o estrés, siéntate y haz 10 respiraciones diafragmáticas lentas antes de decidir.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 14,
                title = "Caminar 20 minutos tras almorzar",
                verseReference = "Proverbios 3:18",
                verseText = "Ella es árbol de vida a los que de ella echan mano, Y bienaventurados son los que la retienen.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Cena ligero al menos 2 horas antes de acostarte y deja tu habitación fresca y a oscuras para un sueño reparador.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 15,
                title = "Aprender a dejar comida en el plato",
                verseReference = "Proverbios 3:22",
                verseText = "Y serán vida a tu alma, Y gracia a tu cuello.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Mírate al espejo con aprecio y anota 3 cosas maravillosas que tu cuerpo te permite hacer cada día.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 16,
                title = "Celebrar cómo te sientes por dentro",
                verseReference = "Proverbios 4:4",
                verseText = "Y él me enseñaba, y me decía: Retenga tu corazón mis razones, Guarda mis mandamientos, y vivirás.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Come hoy todas tus comidas sin televisión, teléfono ni computadora; solo tú y el alimento.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 17,
                title = "Hidratación: 2 litros de agua pura",
                verseReference = "Proverbios 4:10",
                verseText = "Oye, hijo mío, y recibe mis razones, Y se te multiplicarán años de vida.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Mastica cada bocado con calma durante la comida principal y suelta el tenedor entre bocados.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 18,
                title = "Preparar meriendas saludables en casa",
                verseReference = "Proverbios 4:13",
                verseText = "Retén el consejo, no lo dejes; Guárdalo, porque eso es tu vida.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Realiza 20 minutos de caminata continua a paso moderado tras tu comida principal.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 19,
                title = "Decir no amablemente a la comida chatarra",
                verseReference = "Proverbios 4:21",
                verseText = "No se aparten de tus ojos; Guárdalas en medio de tu corazón;",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Bebe un gran vaso de agua fresca al levantarte y añade una porción extra de verduras crudas o cocidas a tu almuerzo.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 20,
                title = "Agradecer por el alimento nutritivo",
                verseReference = "Proverbios 4:22",
                verseText = "Porque son vida a los que las hallan, Y medicina a todo su cuerpo.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Da un paseo de 15 minutos en un parque o área verde respirando aire limpio y agradeciendo por tu salud.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 21,
                title = "Observar cómo la ropa queda más holgada",
                verseReference = "Proverbios 4:23",
                verseText = "Sobre toda cosa guardada, guarda tu corazón; porque de él mana la vida.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Si sientes ganas de comer por aburrimiento o estrés, siéntate y haz 10 respiraciones diafragmáticas lentas antes de decidir.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 22,
                title = "Celebrar la victoria de la Fase 1",
                verseReference = "Proverbios 5:3",
                verseText = "Porque los labios de la mujer extraña destilan miel, Y su paladar es más blando que el aceite;",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Cena ligero al menos 2 horas antes de acostarte y deja tu habitación fresca y a oscuras para un sueño reparador.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 23,
                title = "Cocinar al vapor o a la plancha",
                verseReference = "Proverbios 5:6",
                verseText = "Sus caminos son inestables; no los conocerás, Si no considerares el camino de vida.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Mírate al espejo con aprecio y anota 3 cosas maravillosas que tu cuerpo te permite hacer cada día.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 24,
                title = "Eliminar snacks ultraprocesados de la despensa",
                verseReference = "Proverbios 5:11",
                verseText = "Y gimas al final, Cuando se consuma tu carne y tu cuerpo,",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Come hoy todas tus comidas sin televisión, teléfono ni computadora; solo tú y el alimento.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 25,
                title = "Comer con gratitud y alegría familiar",
                verseReference = "Proverbios 5:12",
                verseText = "Y digas: ¡Cómo aborrecí el consejo, Y mi corazón menospreció la reprensión;",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Mastica cada bocado con calma durante la comida principal y suelta el tenedor entre bocados.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 26,
                title = "Tomar té o infusión caliente para calmar la noche",
                verseReference = "Proverbios 5:21",
                verseText = "Los caminos del hombre están ante los ojos del Señor, y él observa todas sus sendas.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Realiza 20 minutos de caminata continua a paso moderado tras tu comida principal.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 27,
                title = "Un día completo sin harinas refinadas",
                verseReference = "Proverbios 5:23",
                verseText = "Él morirá por falta de corrección, Y errará por lo inmenso de su locura.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Bebe un gran vaso de agua fresca al levantarte y añade una porción extra de verduras crudas o cocidas a tu almuerzo.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 28,
                title = "Medir tu nivel de energía al despertar",
                verseReference = "Proverbios 6:6",
                verseText = "Ve a la hormiga, oh perezoso, mira sus caminos y sé sabio; la cual no teniendo capitán ni gobernador, prepara en el verano su comida.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Da un paseo de 15 minutos en un parque o área verde respirando aire limpio y agradeciendo por tu salud.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 29,
                title = "Aprender a decir 'ya estoy satisfecho'",
                verseReference = "Proverbios 6:14",
                verseText = "Perversidades hay en su corazón; anda pensando el mal en todo tiempo; Siembra las discordias.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Si sientes ganas de comer por aburrimiento o estrés, siéntate y haz 10 respiraciones diafragmáticas lentas antes de decidir.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 30,
                title = "Caminar a buen ritmo 30 minutos",
                verseReference = "Proverbios 6:18",
                verseText = "El corazón que maquina pensamientos inicuos, Los pies presurosos para correr al mal,",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Cena ligero al menos 2 horas antes de acostarte y deja tu habitación fresca y a oscuras para un sueño reparador.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 31,
                title = "Elegir alimentos vivos y frescos en el mercado",
                verseReference = "Proverbios 6:21",
                verseText = "Átalos siempre en tu corazón, Enlázalos a tu cuello.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Mírate al espejo con aprecio y anota 3 cosas maravillosas que tu cuerpo te permite hacer cada día.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 32,
                title = "Registrar cómo tu digestión ha mejorado",
                verseReference = "Proverbios 6:23",
                verseText = "Porque el mandamiento es lámpara, y la enseñanza es luz, Y camino de vida las reprensiones que te instruyen,",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Come hoy todas tus comidas sin televisión, teléfono ni computadora; solo tú y el alimento.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 33,
                title = "Superar el fin de semana con equilibrio",
                verseReference = "Proverbios 6:25",
                verseText = "No codicies su hermosura en tu corazón, Ni ella te prenda con sus ojos;",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Mastica cada bocado con calma durante la comida principal y suelta el tenedor entre bocados.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 34,
                title = "Respirar profundo cuando sientas antojo",
                verseReference = "Proverbios 6:30",
                verseText = "No tienen en poco al ladrón si hurta Para saciar su apetito cuando tiene hambre;",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Realiza 20 minutos de caminata continua a paso moderado tras tu comida principal.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 35,
                title = "Reemplazar el refresco por agua con limón",
                verseReference = "Proverbios 7:2",
                verseText = "Guarda mis mandamientos y vivirás, y mi ley como la niña de tus ojos.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Bebe un gran vaso de agua fresca al levantarte y añade una porción extra de verduras crudas o cocidas a tu almuerzo.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 36,
                title = "Hacer estiramientos suaves al levantarte",
                verseReference = "Proverbios 7:3",
                verseText = "Lígalos a tus dedos; Escríbelos en la tabla de tu corazón.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Da un paseo de 15 minutos en un parque o área verde respirando aire limpio y agradeciendo por tu salud.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 37,
                title = "Cero culpa si un día no fue perfecto: sigue adelante",
                verseReference = "Proverbios 7:10",
                verseText = "Cuando he aquí, una mujer le sale al encuentro, Con atavío de ramera y astuta de corazón.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Si sientes ganas de comer por aburrimiento o estrés, siéntate y haz 10 respiraciones diafragmáticas lentas antes de decidir.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 38,
                title = "Cuidar tu cuerpo como templo sagrado",
                verseReference = "Proverbios 7:21",
                verseText = "Lo rindió con la suavidad de sus muchas palabras, Le obligó con la zalamería de sus labios.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Cena ligero al menos 2 horas antes de acostarte y deja tu habitación fresca y a oscuras para un sueño reparador.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 39,
                title = "Elegir snacks de semillas o frutos secos",
                verseReference = "Proverbios 7:23",
                verseText = "Como el ave que se apresura a la red, Y no sabe que es contra su vida, Hasta que la saeta traspasa su corazón.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Mírate al espejo con aprecio y anota 3 cosas maravillosas que tu cuerpo te permite hacer cada día.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 40,
                title = "Disfrutar del movimiento sin castigarte",
                verseReference = "Proverbios 7:25",
                verseText = "No se aparte tu corazón a sus caminos; No yerres en sus veredas.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Come hoy todas tus comidas sin televisión, teléfono ni computadora; solo tú y el alimento.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 41,
                title = "Comer despacio en la cena",
                verseReference = "Proverbios 8:35",
                verseText = "Porque el que me halle, hallará la vida, Y alcanzará el favor de Jehová.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Mastica cada bocado con calma durante la comida principal y suelta el tenedor entre bocados.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 42,
                title = "Dormir temprano para evitar asaltar el refrigerador",
                verseReference = "Proverbios 9:9",
                verseText = "Instruye al sabio, y se hará más sabio; enseña al justo, y aumentará su saber.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Realiza 20 minutos de caminata continua a paso moderado tras tu comida principal.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 43,
                title = "Agradecer por tu salud y vitalidad recuperadas",
                verseReference = "Proverbios 9:11",
                verseText = "Porque por mí se aumentarán tus días, Y años de vida se te añadirán.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Bebe un gran vaso de agua fresca al levantarte y añade una porción extra de verduras crudas o cocidas a tu almuerzo.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 44,
                title = "Celebrar la victoria de la Fase 2",
                verseReference = "Proverbios 9:18",
                verseText = "Y no saben que allí están los muertos; Que sus convidados están en lo profundo del Seol.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Da un paseo de 15 minutos en un parque o área verde respirando aire limpio y agradeciendo por tu salud.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 45,
                title = "Compartir una receta saludable con un amigo",
                verseReference = "Proverbios 10:4",
                verseText = "Las manos ociosas conducen a la pobreza; las manos diligentes traen riqueza.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Si sientes ganas de comer por aburrimiento o estrés, siéntate y haz 10 respiraciones diafragmáticas lentas antes de decidir.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 46,
                title = "Cero balanzas obsesivas: siente tu agilidad",
                verseReference = "Proverbios 10:8",
                verseText = "El sabio de corazón recibirá los mandamientos; Mas el necio de labios caerá.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Cena ligero al menos 2 horas antes de acostarte y deja tu habitación fresca y a oscuras para un sueño reparador.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 47,
                title = "Entrenamiento de fuerza suave en casa",
                verseReference = "Proverbios 10:11",
                verseText = "Manantial de vida es la boca del justo; Pero violencia cubrirá la boca de los impíos.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Mírate al espejo con aprecio y anota 3 cosas maravillosas que tu cuerpo te permite hacer cada día.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 48,
                title = "Elegir opciones saludables al salir a comer",
                verseReference = "Proverbios 10:16",
                verseText = "La obra del justo es para vida; Mas el fruto del impío es para pecado.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Come hoy todas tus comidas sin televisión, teléfono ni computadora; solo tú y el alimento.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 49,
                title = "Mantener el dominio propio como un estilo de vida",
                verseReference = "Proverbios 10:17",
                verseText = "Camino a la vida es guardar la instrucción; Pero quien desecha la reprensión, yerra.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Mastica cada bocado con calma durante la comida principal y suelta el tenedor entre bocados.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 50,
                title = "Hidratarte al despertar con un gran vaso de agua",
                verseReference = "Proverbios 10:20",
                verseText = "Plata escogida es la lengua del justo; Mas el corazón de los impíos es como nada.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Realiza 20 minutos de caminata continua a paso moderado tras tu comida principal.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 51,
                title = "Hacer las paces con el espejo",
                verseReference = "Proverbios 11:19",
                verseText = "Como la justicia conduce a la vida, Así el que sigue el mal lo hace para su muerte.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Bebe un gran vaso de agua fresca al levantarte y añade una porción extra de verduras crudas o cocidas a tu almuerzo.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 52,
                title = "Caminar 5,000 pasos conscientes en la naturaleza",
                verseReference = "Proverbios 11:20",
                verseText = "Abominación son a Jehová los perversos de corazón; Mas los perfectos de camino le son agradables.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Da un paseo de 15 minutos en un parque o área verde respirando aire limpio y agradeciendo por tu salud.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 53,
                title = "Disfrutar de comidas que te den energía real",
                verseReference = "Proverbios 11:29",
                verseText = "El que turba su casa heredará viento; Y el necio será siervo del sabio de corazón.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Si sientes ganas de comer por aburrimiento o estrés, siéntate y haz 10 respiraciones diafragmáticas lentas antes de decidir.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 54,
                title = "Notar la ligereza en tus articulaciones",
                verseReference = "Proverbios 11:30",
                verseText = "El fruto del justo es árbol de vida; Y el que gana almas es sabio.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Cena ligero al menos 2 horas antes de acostarte y deja tu habitación fresca y a oscuras para un sueño reparador.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 55,
                title = "Celebrar que tu apetito ahora tiene equilibrio",
                verseReference = "Proverbios 12:1",
                verseText = "El que ama la instrucción ama la sabiduría; Mas el que aborrece la reprensión es ignorante.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Mírate al espejo con aprecio y anota 3 cosas maravillosas que tu cuerpo te permite hacer cada día.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 56,
                title = "Mantener la constancia en tus horarios de comida",
                verseReference = "Proverbios 12:3",
                verseText = "El hombre no se afirmará por medio de la impiedad; Mas la raíz de los justos no será removida.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Come hoy todas tus comidas sin televisión, teléfono ni computadora; solo tú y el alimento.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 57,
                title = "Elegir salud por encima de la gratificación inmediata",
                verseReference = "Proverbios 12:4",
                verseText = "La mujer virtuosa es corona de su marido; Mas la mala, como carcoma en sus huesos.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Mastica cada bocado con calma durante la comida principal y suelta el tenedor entre bocados.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 58,
                title = "Agradecer a Dios por la fuerza de voluntad",
                verseReference = "Proverbios 12:8",
                verseText = "Según su sabiduría es alabado el hombre; Mas el perverso de corazón será menospreciado.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Realiza 20 minutos de caminata continua a paso moderado tras tu comida principal.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 59,
                title = "Cuidar de tu templo con amor y respeto",
                verseReference = "Proverbios 12:10",
                verseText = "El justo cuida de la vida de su bestia; Mas el corazón de los impíos es cruel.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Bebe un gran vaso de agua fresca al levantarte y añade una porción extra de verduras crudas o cocidas a tu almuerzo.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 60,
                title = "Integrar este estilo de vida para siempre",
                verseReference = "Proverbios 12:18",
                verseText = "Hay hombres cuyas palabras son como golpes de espada; mas la lengua de los sabios es medicina.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Da un paseo de 15 minutos en un parque o área verde respirando aire limpio y agradeciendo por tu salud.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 61,
                title = "Desconectar de redes sociales que promuevan cuerpos irreales",
                verseReference = "Proverbios 12:20",
                verseText = "Engaño hay en el corazón de los que piensan el mal; Pero alegría en el de los que piensan el bien.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Si sientes ganas de comer por aburrimiento o estrés, siéntate y haz 10 respiraciones diafragmáticas lentas antes de decidir.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 62,
                title = "Revisar tus hábitos de alimentación de los últimos dos meses",
                verseReference = "Proverbios 12:23",
                verseText = "El hombre cuerdo encubre su saber; Mas el corazón de los necios publica la necedad.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Cena ligero al menos 2 horas antes de acostarte y deja tu habitación fresca y a oscuras para un sueño reparador.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 63,
                title = "El dominio propio es tu mayor victoria interior",
                verseReference = "Proverbios 12:25",
                verseText = "La angustia en el corazón del hombre lo deprime; pero la buena palabra lo alegra.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Mírate al espejo con aprecio y anota 3 cosas maravillosas que tu cuerpo te permite hacer cada día.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 64,
                title = "Tu energía vital está en su mejor momento",
                verseReference = "Proverbios 12:28",
                verseText = "En el camino de la justicia está la vida; Y en sus caminos no hay muerte.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Come hoy todas tus comidas sin televisión, teléfono ni computadora; solo tú y el alimento.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 65,
                title = "Consolidar tu peso saludable con paz",
                verseReference = "Proverbios 13:8",
                verseText = "El rescate de la vida del hombre está en sus riquezas; Pero el pobre no oye censuras.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Mastica cada bocado con calma durante la comida principal y suelta el tenedor entre bocados.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 66,
                title = "Graduación: Cuerpo sano y mente sabia",
                verseReference = "Proverbios 13:11",
                verseText = "Las riquezas de vanidad disminuirán; pero el que recoge con mano laboriosa las aumentará.",
                reflection = "Tu cuerpo es un regalo para cuidar con amor y sabiduría. El dominio propio no es castigo, es la llave de tu libertad y vitalidad.",
                practicalTask = "Tu coach te reta hoy: Realiza 20 minutos de caminata continua a paso moderado tras tu comida principal.",
                activityType = CoachActivityType.EJERCICIO
            )
            )
        ),
        HabitChallenge(
            id = "ejercicio",
            title = "Mover mi cuerpo: ejercicio diario",
            category = "Salud",
            iconKey = "fitness_center",
            description = "¿Luchando contra la pereza y el sedentarismo? Diseña una identidad activa paso a paso. Desde caminatas ligeras y estiramientos hasta rutinas completas en casa, elevando tu energía física y vitalidad durante 66 días.",
            days = listOf(
            HabitDay(
                dayNumber = 1,
                title = "Día 1: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 1:19",
                verseText = "Tales son las sendas de todo el que es dado a la codicia, La cual quita la vida de sus poseedores.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: 25 minutos de caminata rápida o trote suave manteniendo un ritmo constante.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 2,
                title = "Día 2: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 1:28",
                verseText = "Entonces me llamarán, y no responderé; Me buscarán de mañana, y no me hallarán.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Realiza una rutina de fuerza en casa: 3 series de 10 sentadillas, 10 flexiones de rodillas y 20 segundos de plancha.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 3,
                title = "Día 3: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 2:7",
                verseText = "Él provee de sana sabiduría a los rectos; Es escudo a los que caminan rectamente.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Hidrátate con 500ml de agua antes de tu entrenamiento y toma un snack de fruta natural al terminar.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 4,
                title = "Día 4: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 2:13",
                verseText = "Que dejan los caminos derechos, Para andar por sendas tenebrosas;",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Sal a entrenar o caminar en un parque o entorno natural bajo la luz del sol de la mañana.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 5,
                title = "Día 5: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 3:5",
                verseText = "Confía en el Señor con todo tu corazón, y no te apoyes en tu propio entendimiento. Reconócelo en todos tus caminos, y él enderezará tus sendas.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Al terminar tu actividad física, siéntate 5 minutos a respirar profundo y sentir los latidos de tu corazón calmándose.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 6,
                title = "Día 6: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 3:28",
                verseText = "No digas a tu prójimo: Anda, y vuelve, Y mañana te daré, Cuando tienes contigo qué darle.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Dedica 10 minutos a estiramientos suaves de espalda y piernas antes de irte a dormir.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 7,
                title = "Día 7: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 4:11",
                verseText = "Por el camino de la sabiduría te he encaminado, Y por veredas derechas te he hecho andar.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Agradece de corazón por la fuerza de tus piernas, tus pulmones y la capacidad de moverte libremente.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 8,
                title = "Día 8: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 4:12",
                verseText = "Cuando anduvieres, no se estrecharán tus pasos, Y si corrieres, no tropezarás.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Pon música alegre o sal a moverte dejando el celular en silencio en el bolsillo.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 9,
                title = "Día 9: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 4:18",
                verseText = "Mas la senda de los justos es como la luz de la aurora, Que va en aumento hasta que el día es perfecto.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: 25 minutos de caminata rápida o trote suave manteniendo un ritmo constante.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 10,
                title = "Día 10: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 4:26",
                verseText = "Examina la senda de tus pies, Y todos tus caminos sean rectos.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Realiza una rutina de fuerza en casa: 3 series de 10 sentadillas, 10 flexiones de rodillas y 20 segundos de plancha.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 11,
                title = "Día 11: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 5:5",
                verseText = "Sus pies descienden a la muerte; Sus pasos conducen al Seol.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Hidrátate con 500ml de agua antes de tu entrenamiento y toma un snack de fruta natural al terminar.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 12,
                title = "Día 12: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 5:10",
                verseText = "No sea que extraños se sacien de tu fuerza, Y tus trabajos estén en casa del extraño;",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Sal a entrenar o caminar en un parque o entorno natural bajo la luz del sol de la mañana.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 13,
                title = "Día 13: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 5:21",
                verseText = "Los caminos del hombre están ante los ojos del Señor, y él observa todas sus sendas.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Al terminar tu actividad física, siéntate 5 minutos a respirar profundo y sentir los latidos de tu corazón calmándose.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 14,
                title = "Día 14: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 6:6",
                verseText = "Ve a la hormiga, oh perezoso, mira sus caminos y sé sabio; la cual no teniendo capitán ni gobernador, prepara en el verano su comida.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Dedica 10 minutos a estiramientos suaves de espalda y piernas antes de irte a dormir.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 15,
                title = "Día 15: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 6:9",
                verseText = "Perezoso, ¿hasta cuándo has de dormir? ¿Cuándo te levantarás de tu sueño?",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Agradece de corazón por la fuerza de tus piernas, tus pulmones y la capacidad de moverte libremente.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 16,
                title = "Día 16: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 6:10",
                verseText = "Un poco de sueño, un poco de dormitar, Y cruzar por un poco las manos para reposo;",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Pon música alegre o sal a moverte dejando el celular en silencio en el bolsillo.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 17,
                title = "Día 17: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 6:11",
                verseText = "Así vendrá tu necesidad como caminante, Y tu pobreza como hombre armado.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: 25 minutos de caminata rápida o trote suave manteniendo un ritmo constante.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 18,
                title = "Día 18: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 6:16",
                verseText = "Seis cosas aborrece el Señor... los ojos altivos, la lengua mentirosa, las manos que derraman sangre inocente y el que siembra discordia.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Realiza una rutina de fuerza en casa: 3 series de 10 sentadillas, 10 flexiones de rodillas y 20 segundos de plancha.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 19,
                title = "Día 19: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 6:17",
                verseText = "Los ojos altivos, la lengua mentirosa, Las manos derramadoras de sangre inocente,",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Hidrátate con 500ml de agua antes de tu entrenamiento y toma un snack de fruta natural al terminar.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 20,
                title = "Día 20: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 6:19",
                verseText = "El testigo falso que habla mentiras, Y el que siembra discordia entre hermanos.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Sal a entrenar o caminar en un parque o entorno natural bajo la luz del sol de la mañana.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 21,
                title = "Día 21: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 7:15",
                verseText = "Por tanto, he salido a encontrarte, Buscando diligentemente tu rostro, y te he hallado.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Al terminar tu actividad física, siéntate 5 minutos a respirar profundo y sentir los latidos de tu corazón calmándose.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 22,
                title = "Día 22: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 7:18",
                verseText = "Ven, embriaguémonos de amores hasta la mañana; Alegrémonos en amores.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Dedica 10 minutos a estiramientos suaves de espalda y piernas antes de irte a dormir.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 23,
                title = "Día 23: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 8:20",
                verseText = "Por vereda de justicia guiaré, Por en medio de sendas de juicio,",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Agradece de corazón por la fuerza de tus piernas, tus pulmones y la capacidad de moverte libremente.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 24,
                title = "Día 24: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 10:4",
                verseText = "Las manos ociosas conducen a la pobreza; las manos diligentes traen riqueza.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Pon música alegre o sal a moverte dejando el celular en silencio en el bolsillo.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 25,
                title = "Día 25: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 10:9",
                verseText = "El que camina en integridad anda confiado; Mas el que pervierte sus caminos será quebrantado.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: 25 minutos de caminata rápida o trote suave manteniendo un ritmo constante.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 26,
                title = "Día 26: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 10:12",
                verseText = "El odio despierta rencillas; pero el amor cubrirá todas las faltas.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Realiza una rutina de fuerza en casa: 3 series de 10 sentadillas, 10 flexiones de rodillas y 20 segundos de plancha.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 27,
                title = "Día 27: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 10:26",
                verseText = "Como el vinagre a los dientes, y como el humo a los ojos, Así es el perezoso a los que lo envían.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Hidrátate con 500ml de agua antes de tu entrenamiento y toma un snack de fruta natural al terminar.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 28,
                title = "Día 28: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 11:3",
                verseText = "La integridad de los rectos los encaminará; Pero destruirá a los pecadores la perversidad de ellos.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Sal a entrenar o caminar en un parque o entorno natural bajo la luz del sol de la mañana.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 29,
                title = "Día 29: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 12:14",
                verseText = "El hombre será saciado de bien del fruto de su boca; Y le será pagado según la obra de sus manos.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Al terminar tu actividad física, siéntate 5 minutos a respirar profundo y sentir los latidos de tu corazón calmándose.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 30,
                title = "Día 30: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 12:24",
                verseText = "La mano de los diligentes señoreará; Mas la negligencia será tributaria.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Dedica 10 minutos a estiramientos suaves de espalda y piernas antes de irte a dormir.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 31,
                title = "Día 31: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 13:4",
                verseText = "El alma del perezoso desea, y nada alcanza; Mas el alma de los diligentes será prosperada.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Agradece de corazón por la fuerza de tus piernas, tus pulmones y la capacidad de moverte libremente.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 32,
                title = "Día 32: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 14:1",
                verseText = "La mujer sabia edifica su casa; Mas la necia con sus manos la derriba.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Pon música alegre o sal a moverte dejando el celular en silencio en el bolsillo.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 33,
                title = "Día 33: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 14:2",
                verseText = "El que camina en su rectitud teme a Jehová; Mas el de caminos pervertidos lo menosprecia.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: 25 minutos de caminata rápida o trote suave manteniendo un ritmo constante.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 34,
                title = "Día 34: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 14:4",
                verseText = "Sin bueyes el granero está vacío; Mas por la fuerza del buey hay abundancia de pan.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Realiza una rutina de fuerza en casa: 3 series de 10 sentadillas, 10 flexiones de rodillas y 20 segundos de plancha.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 35,
                title = "Día 35: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 14:15",
                verseText = "El simple todo lo cree; Mas el avisado mira bien sus pasos.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Hidrátate con 500ml de agua antes de tu entrenamiento y toma un snack de fruta natural al terminar.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 36,
                title = "Día 36: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 15:19",
                verseText = "El camino del perezoso es como seto de espinos; Mas la vereda de los rectos, como una calzada.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Sal a entrenar o caminar en un parque o entorno natural bajo la luz del sol de la mañana.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 37,
                title = "Día 37: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 15:21",
                verseText = "La necedad es alegría al falto de entendimiento; Mas el hombre entendido endereza sus pasos.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Al terminar tu actividad física, siéntate 5 minutos a respirar profundo y sentir los latidos de tu corazón calmándose.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 38,
                title = "Día 38: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 16:9",
                verseText = "El corazón del hombre piensa su camino; Mas Jehová endereza sus pasos.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Dedica 10 minutos a estiramientos suaves de espalda y piernas antes de irte a dormir.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 39,
                title = "Día 39: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 17:2",
                verseText = "El siervo prudente se enseñoreará del hijo que deshonra, Y con los hermanos compartirá la herencia.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Agradece de corazón por la fuerza de tus piernas, tus pulmones y la capacidad de moverte libremente.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 40,
                title = "Día 40: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 17:23",
                verseText = "El impío toma soborno del seno Para pervertir las sendas de la justicia.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Pon música alegre o sal a moverte dejando el celular en silencio en el bolsillo.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 41,
                title = "Día 41: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 18:19",
                verseText = "El hermano ofendido es más tenaz que una ciudad fuerte, Y las contiendas de los hermanos son como cerrojos de alcázar.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: 25 minutos de caminata rápida o trote suave manteniendo un ritmo constante.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 42,
                title = "Día 42: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 19:1",
                verseText = "Mejor es el pobre que camina en integridad, Que el de perversos labios y fatuo.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Realiza una rutina de fuerza en casa: 3 series de 10 sentadillas, 10 flexiones de rodillas y 20 segundos de plancha.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 43,
                title = "Día 43: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 19:7",
                verseText = "Todos los hermanos del pobre le aborrecen; ¡Cuánto más sus amigos se alejarán de él! Buscará la palabra, y no la hallará.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Hidrátate con 500ml de agua antes de tu entrenamiento y toma un snack de fruta natural al terminar.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 44,
                title = "Día 44: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 19:24",
                verseText = "El perezoso mete su mano en el plato, Y ni aun a su boca la llevará.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Sal a entrenar o caminar en un parque o entorno natural bajo la luz del sol de la mañana.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 45,
                title = "Día 45: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 20:4",
                verseText = "El perezoso no ara a causa del invierno; pedirá, pues, en la siega, y no hallará.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Al terminar tu actividad física, siéntate 5 minutos a respirar profundo y sentir los latidos de tu corazón calmándose.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 46,
                title = "Día 46: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 20:7",
                verseText = "Camina en su integridad el justo; ¡cuán dichosos son sus hijos después de él!",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Dedica 10 minutos a estiramientos suaves de espalda y piernas antes de irte a dormir.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 47,
                title = "Día 47: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 20:24",
                verseText = "De Jehová son los pasos del hombre; ¿Cómo, pues, entenderá el hombre su camino?",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Agradece de corazón por la fuerza de tus piernas, tus pulmones y la capacidad de moverte libremente.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 48,
                title = "Día 48: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 20:29",
                verseText = "La gloria de los jóvenes es su fuerza, Y la hermosura de los ancianos es su vejez.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Pon música alegre o sal a moverte dejando el celular en silencio en el bolsillo.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 49,
                title = "Día 49: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 21:5",
                verseText = "Los pensamientos del diligente ciertamente tienden a la abundancia; mas todo el que se apresura alocadamente, de cierto va a la pobreza.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: 25 minutos de caminata rápida o trote suave manteniendo un ritmo constante.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 50,
                title = "Día 50: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 21:22",
                verseText = "Tomó el sabio la ciudad de los fuertes, Y derribó la fuerza en que ella confiaba.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Realiza una rutina de fuerza en casa: 3 series de 10 sentadillas, 10 flexiones de rodillas y 20 segundos de plancha.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 51,
                title = "Día 51: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 21:25",
                verseText = "El deseo del perezoso le mata, Porque sus manos no quieren trabajar.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Hidrátate con 500ml de agua antes de tu entrenamiento y toma un snack de fruta natural al terminar.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 52,
                title = "Día 52: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 22:13",
                verseText = "Dice el perezoso: El león está fuera; Seré muerto en la calle.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Sal a entrenar o caminar en un parque o entorno natural bajo la luz del sol de la mañana.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 53,
                title = "Día 53: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 24:5",
                verseText = "El hombre sabio es fuerte, Y de pujante vigor el hombre docto.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Al terminar tu actividad física, siéntate 5 minutos a respirar profundo y sentir los latidos de tu corazón calmándose.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 54,
                title = "Día 54: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 24:10",
                verseText = "Si eres débil en el día de aflicción, tu fuerza es reducida.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Dedica 10 minutos a estiramientos suaves de espalda y piernas antes de irte a dormir.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 55,
                title = "Día 55: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 24:30",
                verseText = "Pasé junto al campo del hombre perezoso, Y junto a la viña del hombre falto de entendimiento;",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Agradece de corazón por la fuerza de tus piernas, tus pulmones y la capacidad de moverte libremente.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 56,
                title = "Día 56: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 24:34",
                verseText = "Así vendrá como caminante tu necesidad, Y tu pobreza como hombre armado.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Pon música alegre o sal a moverte dejando el celular en silencio en el bolsillo.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 57,
                title = "Día 57: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 26:13",
                verseText = "Dice el perezoso: El león está en el camino; El león está en las calles.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: 25 minutos de caminata rápida o trote suave manteniendo un ritmo constante.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 58,
                title = "Día 58: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 26:14",
                verseText = "Como la puerta gira sobre sus quicios, Así el perezoso se vuelve en su cama.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Realiza una rutina de fuerza en casa: 3 series de 10 sentadillas, 10 flexiones de rodillas y 20 segundos de plancha.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 59,
                title = "Día 59: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 26:15",
                verseText = "Mete el perezoso su mano en el plato; Se cansa de llevarla a su boca.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Hidrátate con 500ml de agua antes de tu entrenamiento y toma un snack de fruta natural al terminar.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 60,
                title = "Día 60: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 26:16",
                verseText = "En su propia opinión el perezoso es más sabio Que siete que sepan aconsejar.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Sal a entrenar o caminar en un parque o entorno natural bajo la luz del sol de la mañana.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 61,
                title = "Día 61: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 27:1",
                verseText = "No te jactes del día de mañana; porque no sabes qué dará de sí el día.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Al terminar tu actividad física, siéntate 5 minutos a respirar profundo y sentir los latidos de tu corazón calmándose.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 62,
                title = "Día 62: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 27:14",
                verseText = "El que bendice a su amigo en alta voz, madrugando de mañana, Por maldición se le contará.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Dedica 10 minutos a estiramientos suaves de espalda y piernas antes de irte a dormir.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 63,
                title = "Día 63: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 27:23",
                verseText = "Sé diligente en conocer el estado de tus ovejas, Y mira con cuidado por tus rebaños;",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Agradece de corazón por la fuerza de tus piernas, tus pulmones y la capacidad de moverte libremente.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 64,
                title = "Día 64: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 28:6",
                verseText = "Mejor es el pobre que camina en su integridad, Que el de perversos caminos y rico.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Pon música alegre o sal a moverte dejando el celular en silencio en el bolsillo.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 65,
                title = "Día 65: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 28:18",
                verseText = "El que en integridad camina será salvo; Mas el de perversos caminos caerá en alguno.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: 25 minutos de caminata rápida o trote suave manteniendo un ritmo constante.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 66,
                title = "Día 66: Movimiento y Vitalidad Diaria",
                verseReference = "Proverbios 28:26",
                verseText = "El que confía en su propio corazón es necio; Mas el que camina en sabiduría será librado.",
                reflection = "El cuerpo humano fue diseñado para moverse. Cada paso que das hoy oxigena tu cerebro y vence el desánimo.",
                practicalTask = "Tu coach te reta hoy: Realiza una rutina de fuerza en casa: 3 series de 10 sentadillas, 10 flexiones de rodillas y 20 segundos de plancha.",
                activityType = CoachActivityType.EJERCICIO
            )
            )
        ),
        HabitChallenge(
            id = "bicicleta",
            title = "Aprender a manejar bicicleta con confianza",
            category = "Enfoque",
            iconKey = "pedal_bike",
            description = "¿Sientes temor al equilibrio o al tráfico? Vence el miedo y conquista las dos ruedas con seguridad progresiva: desde el balance inicial hasta rutas al aire libre, disfrutando de la naturaleza y tu libertad en 66 días.",
            days = listOf(
            HabitDay(
                dayNumber = 1,
                title = "Día 1: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 1:7",
                verseText = "El principio de la sabiduría es el temor del Señor; los necios desprecian la sabiduría y la disciplina.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Practica 20 minutos de pedaleo o balance en un lugar seguro y plano.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 2,
                title = "Día 2: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 1:13",
                verseText = "Hallaremos riquezas de toda clase, Llenaremos nuestras casas de despojos;",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Haz 15 sentadillas y estiramiento de cuádriceps para fortalecer tus piernas para el pedaleo.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 3,
                title = "Día 3: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 1:15",
                verseText = "Hijo mío, no andes en camino con ellos. Aparta tu pie de sus veredas,",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Lleva tu botella de agua en la bici e hidrátate cada 15 minutos de práctica.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 4,
                title = "Día 4: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 1:17",
                verseText = "Porque en vano se tenderá la red Ante los ojos de toda ave;",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Rueda o pasea por un camino con árboles sintiendo la brisa fresca en tu rostro.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 5,
                title = "Día 5: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 1:19",
                verseText = "Tales son las sendas de todo el que es dado a la codicia, La cual quita la vida de sus poseedores.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Antes de subirte a la bici, respira 3 veces profundamente y visualízate pedaleando con total calma y control.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 6,
                title = "Día 6: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 1:27",
                verseText = "Cuando viniere como una destrucción lo que teméis, Y vuestra calamidad llegare como un torbellino; Cuando sobre vosotros viniere tribulación y angustia.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Revisa la presión de los neumáticos y los frenos con paciencia para rodar seguro.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 7,
                title = "Día 7: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 1:29",
                verseText = "Por cuanto aborrecieron la sabiduría, Y no escogieron el temor de Jehová,",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Agradece por la sensación de libertad y logro que sientes al avanzar sobre ruedas.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 8,
                title = "Día 8: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 1:31",
                verseText = "Comerán del fruto de su camino, Y serán hastiados de sus propios consejos.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Concéntrate en la vista del camino sin mirar pantallas mientras montas en bicicleta.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 9,
                title = "Día 9: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 1:33",
                verseText = "Pero el que me escuche vivirá seguro y tranquilo, sin temor a ningún mal.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Practica 20 minutos de pedaleo o balance en un lugar seguro y plano.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 10,
                title = "Día 10: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 2:5",
                verseText = "Entonces entenderás el temor de Jehová, Y hallarás el conocimiento de Dios.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Haz 15 sentadillas y estiramiento de cuádriceps para fortalecer tus piernas para el pedaleo.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 11,
                title = "Día 11: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 2:8",
                verseText = "Es el que guarda las veredas del juicio, Y preserva el camino de sus santos.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Lleva tu botella de agua en la bici e hidrátate cada 15 minutos de práctica.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 12,
                title = "Día 12: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 2:9",
                verseText = "Entonces entenderás justicia, juicio Y equidad, y todo buen camino.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Rueda o pasea por un camino con árboles sintiendo la brisa fresca en tu rostro.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 13,
                title = "Día 13: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 2:12",
                verseText = "Para librarte del mal camino, De los hombres que hablan perversidades,",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Antes de subirte a la bici, respira 3 veces profundamente y visualízate pedaleando con total calma y control.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 14,
                title = "Día 14: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 2:13",
                verseText = "Que dejan los caminos derechos, Para andar por sendas tenebrosas;",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Revisa la presión de los neumáticos y los frenos con paciencia para rodar seguro.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 15,
                title = "Día 15: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 2:15",
                verseText = "Cuyas veredas son torcidas, Y torcidos sus caminos.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Agradece por la sensación de libertad y logro que sientes al avanzar sobre ruedas.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 16,
                title = "Día 16: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 2:20",
                verseText = "Así andarás por el camino de los buenos, Y seguirás las veredas de los justos;",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Concéntrate en la vista del camino sin mirar pantallas mientras montas en bicicleta.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 17,
                title = "Día 17: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 3:2",
                verseText = "Porque largura de días y años de vida Y paz te aumentarán.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Practica 20 minutos de pedaleo o balance en un lugar seguro y plano.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 18,
                title = "Día 18: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 3:4",
                verseText = "Y hallarás gracia y buena opinión Ante los ojos de Dios y de los hombres.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Haz 15 sentadillas y estiramiento de cuádriceps para fortalecer tus piernas para el pedaleo.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 19,
                title = "Día 19: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 3:5",
                verseText = "Confía en el Señor con todo tu corazón, y no te apoyes en tu propio entendimiento. Reconócelo en todos tus caminos, y él enderezará tus sendas.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Lleva tu botella de agua en la bici e hidrátate cada 15 minutos de práctica.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 20,
                title = "Día 20: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 3:6",
                verseText = "Reconócelo en todos tus caminos, Y él enderezará tus veredas.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Rueda o pasea por un camino con árboles sintiendo la brisa fresca en tu rostro.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 21,
                title = "Día 21: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 3:17",
                verseText = "Sus caminos son caminos deleitosos, Y todas sus veredas paz.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Antes de subirte a la bici, respira 3 veces profundamente y visualízate pedaleando con total calma y control.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 22,
                title = "Día 22: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 3:21",
                verseText = "Hijo mío, no se aparten estas cosas de tus ojos; Guarda la ley y el consejo,",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Revisa la presión de los neumáticos y los frenos con paciencia para rodar seguro.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 23,
                title = "Día 23: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 3:23",
                verseText = "Entonces andarás por tu camino confiadamente, Y tu pie no tropezará.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Agradece por la sensación de libertad y logro que sientes al avanzar sobre ruedas.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 24,
                title = "Día 24: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 3:24",
                verseText = "Cuando te acuestes, no tendrás temor, Sino que te acostarás, y tu sueño será grato.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Concéntrate en la vista del camino sin mirar pantallas mientras montas en bicicleta.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 25,
                title = "Día 25: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 3:25",
                verseText = "No tendrás temor de pavor repentino, Ni de la ruina de los impíos cuando viniere,",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Practica 20 minutos de pedaleo o balance en un lugar seguro y plano.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 26,
                title = "Día 26: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 3:26",
                verseText = "Porque Jehová será tu confianza, Y él preservará tu pie de quedar preso.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Haz 15 sentadillas y estiramiento de cuádriceps para fortalecer tus piernas para el pedaleo.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 27,
                title = "Día 27: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 3:30",
                verseText = "No tengas pleito con nadie sin razón, Si no te han hecho agravio.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Lleva tu botella de agua en la bici e hidrátate cada 15 minutos de práctica.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 28,
                title = "Día 28: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 3:31",
                verseText = "No envidies al hombre injusto, Ni escojas ninguno de sus caminos.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Rueda o pasea por un camino con árboles sintiendo la brisa fresca en tu rostro.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 29,
                title = "Día 29: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 4:11",
                verseText = "Por el camino de la sabiduría te he encaminado, Y por veredas derechas te he hecho andar.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Antes de subirte a la bici, respira 3 veces profundamente y visualízate pedaleando con total calma y control.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 30,
                title = "Día 30: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 4:12",
                verseText = "Cuando anduvieres, no se estrecharán tus pasos, Y si corrieres, no tropezarás.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Revisa la presión de los neumáticos y los frenos con paciencia para rodar seguro.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 31,
                title = "Día 31: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 4:14",
                verseText = "No entres por la vereda de los impíos, Ni vayas por el camino de los malos.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Agradece por la sensación de libertad y logro que sientes al avanzar sobre ruedas.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 32,
                title = "Día 32: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 4:16",
                verseText = "Porque no duermen ellos si no han hecho mal, Y pierden el sueño si no han hecho caer a alguno.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Concéntrate en la vista del camino sin mirar pantallas mientras montas en bicicleta.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 33,
                title = "Día 33: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 4:18",
                verseText = "Mas la senda de los justos es como la luz de la aurora, Que va en aumento hasta que el día es perfecto.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Practica 20 minutos de pedaleo o balance en un lugar seguro y plano.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 34,
                title = "Día 34: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 4:19",
                verseText = "El camino de los impíos es como la oscuridad; No saben en qué tropiezan.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Haz 15 sentadillas y estiramiento de cuádriceps para fortalecer tus piernas para el pedaleo.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 35,
                title = "Día 35: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 4:21",
                verseText = "No se aparten de tus ojos; Guárdalas en medio de tu corazón;",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Lleva tu botella de agua en la bici e hidrátate cada 15 minutos de práctica.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 36,
                title = "Día 36: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 4:25",
                verseText = "Tus ojos miren lo recto, Y diríjanse tus párpados hacia lo que tienes delante.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Rueda o pasea por un camino con árboles sintiendo la brisa fresca en tu rostro.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 37,
                title = "Día 37: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 4:26",
                verseText = "Examina la senda de tus pies, Y todos tus caminos sean rectos.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Antes de subirte a la bici, respira 3 veces profundamente y visualízate pedaleando con total calma y control.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 38,
                title = "Día 38: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 5:5",
                verseText = "Sus pies descienden a la muerte; Sus pasos conducen al Seol.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Revisa la presión de los neumáticos y los frenos con paciencia para rodar seguro.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 39,
                title = "Día 39: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 5:6",
                verseText = "Sus caminos son inestables; no los conocerás, Si no considerares el camino de vida.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Agradece por la sensación de libertad y logro que sientes al avanzar sobre ruedas.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 40,
                title = "Día 40: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 5:8",
                verseText = "Aleja de ella tu camino, Y no te acerques a la puerta de su casa;",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Concéntrate en la vista del camino sin mirar pantallas mientras montas en bicicleta.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 41,
                title = "Día 41: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 5:21",
                verseText = "Los caminos del hombre están ante los ojos del Señor, y él observa todas sus sendas.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Practica 20 minutos de pedaleo o balance en un lugar seguro y plano.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 42,
                title = "Día 42: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 6:4",
                verseText = "No des sueño a tus ojos, Ni a tus párpados adormecimiento;",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Haz 15 sentadillas y estiramiento de cuádriceps para fortalecer tus piernas para el pedaleo.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 43,
                title = "Día 43: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 6:6",
                verseText = "Ve a la hormiga, oh perezoso, mira sus caminos y sé sabio; la cual no teniendo capitán ni gobernador, prepara en el verano su comida.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Lleva tu botella de agua en la bici e hidrátate cada 15 minutos de práctica.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 44,
                title = "Día 44: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 6:13",
                verseText = "Que guiña los ojos, que habla con los pies, Que hace señas con los dedos.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Rueda o pasea por un camino con árboles sintiendo la brisa fresca en tu rostro.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 45,
                title = "Día 45: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 6:16",
                verseText = "Seis cosas aborrece el Señor... los ojos altivos, la lengua mentirosa, las manos que derraman sangre inocente y el que siembra discordia.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Antes de subirte a la bici, respira 3 veces profundamente y visualízate pedaleando con total calma y control.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 46,
                title = "Día 46: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 6:17",
                verseText = "Los ojos altivos, la lengua mentirosa, Las manos derramadoras de sangre inocente,",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Revisa la presión de los neumáticos y los frenos con paciencia para rodar seguro.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 47,
                title = "Día 47: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 6:19",
                verseText = "El testigo falso que habla mentiras, Y el que siembra discordia entre hermanos.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Agradece por la sensación de libertad y logro que sientes al avanzar sobre ruedas.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 48,
                title = "Día 48: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 6:23",
                verseText = "Porque el mandamiento es lámpara, y la enseñanza es luz, Y camino de vida las reprensiones que te instruyen,",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Concéntrate en la vista del camino sin mirar pantallas mientras montas en bicicleta.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 49,
                title = "Día 49: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 6:25",
                verseText = "No codicies su hermosura en tu corazón, Ni ella te prenda con sus ojos;",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Practica 20 minutos de pedaleo o balance en un lugar seguro y plano.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 50,
                title = "Día 50: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 6:34",
                verseText = "Porque los celos son el furor del hombre, Y no perdonará en el día de la venganza.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Haz 15 sentadillas y estiramiento de cuádriceps para fortalecer tus piernas para el pedaleo.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 51,
                title = "Día 51: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 7:2",
                verseText = "Guarda mis mandamientos y vivirás, y mi ley como la niña de tus ojos.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Lleva tu botella de agua en la bici e hidrátate cada 15 minutos de práctica.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 52,
                title = "Día 52: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 7:6",
                verseText = "Porque mirando yo por la ventana de mi casa, Por mi celosía,",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Rueda o pasea por un camino con árboles sintiendo la brisa fresca en tu rostro.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 53,
                title = "Día 53: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 7:8",
                verseText = "El cual pasaba por la calle, junto a la esquina, E iba camino a la casa de ella,",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Antes de subirte a la bici, respira 3 veces profundamente y visualízate pedaleando con total calma y control.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 54,
                title = "Día 54: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 7:14",
                verseText = "Sacrificios de paz había prometido, Hoy he pagado mis votos;",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Revisa la presión de los neumáticos y los frenos con paciencia para rodar seguro.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 55,
                title = "Día 55: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 7:25",
                verseText = "No se aparte tu corazón a sus caminos; No yerres en sus veredas.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Agradece por la sensación de libertad y logro que sientes al avanzar sobre ruedas.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 56,
                title = "Día 56: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 7:26",
                verseText = "Porque a muchos ha hecho caer heridos, Y aun los más fuertes han sido muertos por ella.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Concéntrate en la vista del camino sin mirar pantallas mientras montas en bicicleta.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 57,
                title = "Día 57: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 7:27",
                verseText = "Camino al Seol es su casa, Que conduce a las cámaras de la muerte.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Practica 20 minutos de pedaleo o balance en un lugar seguro y plano.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 58,
                title = "Día 58: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 8:2",
                verseText = "En las alturas junto al camino, A las encrucijadas de las veredas se para;",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Haz 15 sentadillas y estiramiento de cuádriceps para fortalecer tus piernas para el pedaleo.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 59,
                title = "Día 59: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 8:13",
                verseText = "El temor de Jehová es aborrecer el mal; La soberbia y la arrogancia, el mal camino, Y la boca perversa, aborrezco.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Lleva tu botella de agua en la bici e hidrátate cada 15 minutos de práctica.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 60,
                title = "Día 60: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 8:20",
                verseText = "Por vereda de justicia guiaré, Por en medio de sendas de juicio,",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Rueda o pasea por un camino con árboles sintiendo la brisa fresca en tu rostro.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 61,
                title = "Día 61: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 8:32",
                verseText = "Ahora, pues, hijos, oídme, Y bienaventurados los que guardan mis caminos.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Antes de subirte a la bici, respira 3 veces profundamente y visualízate pedaleando con total calma y control.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 62,
                title = "Día 62: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 9:6",
                verseText = "Dejad las simplezas, y vivid, Y andad por el camino de la inteligencia.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Revisa la presión de los neumáticos y los frenos con paciencia para rodar seguro.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 63,
                title = "Día 63: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 9:10",
                verseText = "El temor de Jehová es el principio de la sabiduría, Y el conocimiento del Santísimo es la inteligencia.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Agradece por la sensación de libertad y logro que sientes al avanzar sobre ruedas.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 64,
                title = "Día 64: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 9:15",
                verseText = "Para llamar a los que pasan por el camino, Que van por sus caminos derechos.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Concéntrate en la vista del camino sin mirar pantallas mientras montas en bicicleta.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 65,
                title = "Día 65: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 10:8",
                verseText = "El sabio de corazón recibirá los mandamientos; Mas el necio de labios caerá.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Practica 20 minutos de pedaleo o balance en un lugar seguro y plano.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 66,
                title = "Día 66: Confianza sobre Dos Ruedas",
                verseReference = "Proverbios 10:9",
                verseText = "El que camina en integridad anda confiado; Mas el que pervierte sus caminos será quebrantado.",
                reflection = "Aprender y dominar la bicicleta es una metáfora de la fe: mirar hacia adelante, mantener el impulso y no temer a las curvas.",
                practicalTask = "Tu coach te reta hoy: Haz 15 sentadillas y estiramiento de cuádriceps para fortalecer tus piernas para el pedaleo.",
                activityType = CoachActivityType.EJERCICIO
            )
            )
        ),
        HabitChallenge(
            id = "ansiedad",
            title = "Vencer la ansiedad y vivir en paz",
            category = "Ansiedad",
            iconKey = "spa",
            description = "¿Tu mente no se apaga y la incertidumbre te roba el sueño? Calma tus pensamientos acelerados, aprende respiración consciente, entrega el control a Dios y recupera la serenidad en 66 días.",
            days = listOf(
            HabitDay(
                dayNumber = 1,
                title = "Día 1: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 1:7",
                verseText = "El principio de la sabiduría es el temor del Señor; los necios desprecian la sabiduría y la disciplina.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Sal a caminar 20 minutos al aire libre sin música ni llamadas, solo escuchando tus pasos.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 2,
                title = "Día 2: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 1:27",
                verseText = "Cuando viniere como una destrucción lo que teméis, Y vuestra calamidad llegare como un torbellino; Cuando sobre vosotros viniere tribulación y angustia.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Realiza suaves estiramientos de cuello y hombros para liberar la tensión acumulada.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 3,
                title = "Día 3: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 1:28",
                verseText = "Entonces me llamarán, y no responderé; Me buscarán de mañana, y no me hallarán.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Reduce hoy la cafeína a la mitad y bebe infusiones de manzanilla o tilo.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 4,
                title = "Día 4: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 1:29",
                verseText = "Por cuanto aborrecieron la sabiduría, Y no escogieron el temor de Jehová,",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Siéntate junto a una planta o árbol durante 10 minutos sintiendo la calma de la creación.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 5,
                title = "Día 5: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 1:33",
                verseText = "Pero el que me escuche vivirá seguro y tranquilo, sin temor a ningún mal.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Aplica la respiración cuadrada: inhala en 4 segundos, mantén 4, exhala en 4 y mantén vacío en 4 (repite 5 veces).",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 6,
                title = "Día 6: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 2:5",
                verseText = "Entonces entenderás el temor de Jehová, Y hallarás el conocimiento de Dios.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Desconecta pantallas una hora antes de dormir y lee un salmo o proverbio de paz en tu cama.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 7,
                title = "Día 7: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 3:2",
                verseText = "Porque largura de días y años de vida Y paz te aumentarán.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Escribe 3 preocupaciones en un papel, entrégalas en oración y rompe el papel como símbolo de fe.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 8,
                title = "Día 8: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 3:5",
                verseText = "Confía en el Señor con todo tu corazón, y no te apoyes en tu propio entendimiento. Reconócelo en todos tus caminos, y él enderezará tus sendas.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Silencia grupos de WhatsApp o noticias alarmistas por las próximas 6 horas.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 9,
                title = "Día 9: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 3:17",
                verseText = "Sus caminos son caminos deleitosos, Y todas sus veredas paz.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Sal a caminar 20 minutos al aire libre sin música ni llamadas, solo escuchando tus pasos.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 10,
                title = "Día 10: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 3:24",
                verseText = "Cuando te acuestes, no tendrás temor, Sino que te acostarás, y tu sueño será grato.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Realiza suaves estiramientos de cuello y hombros para liberar la tensión acumulada.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 11,
                title = "Día 11: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 3:25",
                verseText = "No tendrás temor de pavor repentino, Ni de la ruina de los impíos cuando viniere,",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Reduce hoy la cafeína a la mitad y bebe infusiones de manzanilla o tilo.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 12,
                title = "Día 12: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 3:28",
                verseText = "No digas a tu prójimo: Anda, y vuelve, Y mañana te daré, Cuando tienes contigo qué darle.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Siéntate junto a una planta o árbol durante 10 minutos sintiendo la calma de la creación.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 13,
                title = "Día 13: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 3:30",
                verseText = "No tengas pleito con nadie sin razón, Si no te han hecho agravio.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Aplica la respiración cuadrada: inhala en 4 segundos, mantén 4, exhala en 4 y mantén vacío en 4 (repite 5 veces).",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 14,
                title = "Día 14: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 4:23",
                verseText = "Sobre toda cosa guardada, guarda tu corazón; porque de él mana la vida.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Desconecta pantallas una hora antes de dormir y lee un salmo o proverbio de paz en tu cama.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 15,
                title = "Día 15: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 6:10",
                verseText = "Un poco de sueño, un poco de dormitar, Y cruzar por un poco las manos para reposo;",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Escribe 3 preocupaciones en un papel, entrégalas en oración y rompe el papel como símbolo de fe.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 16,
                title = "Día 16: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 6:19",
                verseText = "El testigo falso que habla mentiras, Y el que siembra discordia entre hermanos.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Silencia grupos de WhatsApp o noticias alarmistas por las próximas 6 horas.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 17,
                title = "Día 17: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 6:34",
                verseText = "Porque los celos son el furor del hombre, Y no perdonará en el día de la venganza.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Sal a caminar 20 minutos al aire libre sin música ni llamadas, solo escuchando tus pasos.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 18,
                title = "Día 18: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 7:6",
                verseText = "Porque mirando yo por la ventana de mi casa, Por mi celosía,",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Realiza suaves estiramientos de cuello y hombros para liberar la tensión acumulada.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 19,
                title = "Día 19: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 7:14",
                verseText = "Sacrificios de paz había prometido, Hoy he pagado mis votos;",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Reduce hoy la cafeína a la mitad y bebe infusiones de manzanilla o tilo.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 20,
                title = "Día 20: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 7:18",
                verseText = "Ven, embriaguémonos de amores hasta la mañana; Alegrémonos en amores.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Siéntate junto a una planta o árbol durante 10 minutos sintiendo la calma de la creación.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 21,
                title = "Día 21: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 8:13",
                verseText = "El temor de Jehová es aborrecer el mal; La soberbia y la arrogancia, el mal camino, Y la boca perversa, aborrezco.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Aplica la respiración cuadrada: inhala en 4 segundos, mantén 4, exhala en 4 y mantén vacío en 4 (repite 5 veces).",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 22,
                title = "Día 22: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 9:10",
                verseText = "El temor de Jehová es el principio de la sabiduría, Y el conocimiento del Santísimo es la inteligencia.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Desconecta pantallas una hora antes de dormir y lee un salmo o proverbio de paz en tu cama.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 23,
                title = "Día 23: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 10:27",
                verseText = "El temor de Jehová aumentará los días; Mas los años de los impíos serán acortados.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Escribe 3 preocupaciones en un papel, entrégalas en oración y rompe el papel como símbolo de fe.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 24,
                title = "Día 24: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 10:28",
                verseText = "La esperanza de los justos es alegría; Mas la esperanza de los impíos perecerá.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Silencia grupos de WhatsApp o noticias alarmistas por las próximas 6 horas.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 25,
                title = "Día 25: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 11:7",
                verseText = "Cuando muere el hombre impío, perece su esperanza; Y la expectación de los malos perecerá.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Sal a caminar 20 minutos al aire libre sin música ni llamadas, solo escuchando tus pasos.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 26,
                title = "Día 26: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 11:15",
                verseText = "Con ansiedad será afligido el que sale por fiador de un extraño; Mas el que aborreciere las fianzas vivirá seguro.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Realiza suaves estiramientos de cuello y hombros para liberar la tensión acumulada.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 27,
                title = "Día 27: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 11:23",
                verseText = "El deseo de los justos es solamente el bien; Mas la esperanza de los impíos es el enojo.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Reduce hoy la cafeína a la mitad y bebe infusiones de manzanilla o tilo.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 28,
                title = "Día 28: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 12:16",
                verseText = "El necio al punto da a conocer su ira; Mas el que no hace caso de la injuria es prudente.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Siéntate junto a una planta o árbol durante 10 minutos sintiendo la calma de la creación.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 29,
                title = "Día 29: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 12:25",
                verseText = "La angustia en el corazón del hombre lo deprime; pero la buena palabra lo alegra.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Aplica la respiración cuadrada: inhala en 4 segundos, mantén 4, exhala en 4 y mantén vacío en 4 (repite 5 veces).",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 30,
                title = "Día 30: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 13:5",
                verseText = "El justo aborrece la palabra de mentira; Mas el impío se hace odioso e infame.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Desconecta pantallas una hora antes de dormir y lee un salmo o proverbio de paz en tu cama.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 31,
                title = "Día 31: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 13:10",
                verseText = "Ciertamente la soberbia concebirá contienda; Mas con los avisados está la sabiduría.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Escribe 3 preocupaciones en un papel, entrégalas en oración y rompe el papel como símbolo de fe.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 32,
                title = "Día 32: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 13:12",
                verseText = "La esperanza que se demora es tormento del corazón; Pero árbol de vida es el deseo cumplido.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Silencia grupos de WhatsApp o noticias alarmistas por las próximas 6 horas.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 33,
                title = "Día 33: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 14:5",
                verseText = "El testigo verdadero no mentirá; Mas el testigo falso hablará mentiras.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Sal a caminar 20 minutos al aire libre sin música ni llamadas, solo escuchando tus pasos.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 34,
                title = "Día 34: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 14:15",
                verseText = "El simple todo lo cree; Mas el avisado mira bien sus pasos.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Realiza suaves estiramientos de cuello y hombros para liberar la tensión acumulada.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 35,
                title = "Día 35: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 14:25",
                verseText = "El testigo verdadero libra las almas; Mas el engañoso hablará mentiras.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Reduce hoy la cafeína a la mitad y bebe infusiones de manzanilla o tilo.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 36,
                title = "Día 36: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 14:26",
                verseText = "En el temor de Jehová está la fuerte confianza; Y esperanza tendrán sus hijos.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Siéntate junto a una planta o árbol durante 10 minutos sintiendo la calma de la creación.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 37,
                title = "Día 37: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 14:27",
                verseText = "El temor de Jehová es manantial de vida Para apartarse de los lazos de la muerte.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Aplica la respiración cuadrada: inhala en 4 segundos, mantén 4, exhala en 4 y mantén vacío en 4 (repite 5 veces).",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 38,
                title = "Día 38: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 14:30",
                verseText = "El corazón apacible es vida de la carne; mas la envidia es carcoma de los huesos.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Desconecta pantallas una hora antes de dormir y lee un salmo o proverbio de paz en tu cama.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 39,
                title = "Día 39: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 14:32",
                verseText = "Por su maldad será lanzado el impío; Mas el justo en su muerte tiene esperanza.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Escribe 3 preocupaciones en un papel, entrégalas en oración y rompe el papel como símbolo de fe.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 40,
                title = "Día 40: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 14:35",
                verseText = "La benevolencia del rey es para con el servidor entendido; Mas su enojo contra el que lo avergüenza.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Silencia grupos de WhatsApp o noticias alarmistas por las próximas 6 horas.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 41,
                title = "Día 41: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 15:3",
                verseText = "Los ojos de Jehová están en todo lugar, Mirando a los malos y a los buenos.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Sal a caminar 20 minutos al aire libre sin música ni llamadas, solo escuchando tus pasos.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 42,
                title = "Día 42: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 15:4",
                verseText = "La lengua apacible es árbol de vida; Mas la perversidad de ella es quebrantamiento de espíritu.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Realiza suaves estiramientos de cuello y hombros para liberar la tensión acumulada.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 43,
                title = "Día 43: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 15:13",
                verseText = "El corazón alegre hermosea el rostro; Mas por el dolor del corazón el espíritu se abate.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Reduce hoy la cafeína a la mitad y bebe infusiones de manzanilla o tilo.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 44,
                title = "Día 44: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 15:16",
                verseText = "Mejor es lo poco con el temor del Señor, que el gran tesoro donde hay turbación.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Siéntate junto a una planta o árbol durante 10 minutos sintiendo la calma de la creación.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 45,
                title = "Día 45: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 15:18",
                verseText = "El hombre iracundo promueve contiendas; Mas el que tarda en airarse apacigua la rencilla.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Aplica la respiración cuadrada: inhala en 4 segundos, mantén 4, exhala en 4 y mantén vacío en 4 (repite 5 veces).",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 46,
                title = "Día 46: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 15:33",
                verseText = "El temor de Jehová es enseñanza de sabiduría; Y a la honra precede la humildad.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Desconecta pantallas una hora antes de dormir y lee un salmo o proverbio de paz en tu cama.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 47,
                title = "Día 47: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 16:6",
                verseText = "Con misericordia y verdad se corrige el pecado, Y con el temor de Jehová los hombres se apartan del mal.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Escribe 3 preocupaciones en un papel, entrégalas en oración y rompe el papel como símbolo de fe.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 48,
                title = "Día 48: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 16:7",
                verseText = "Cuando los caminos del hombre son agradables a Jehová, Aun a sus enemigos hace estar en paz con él.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Silencia grupos de WhatsApp o noticias alarmistas por las próximas 6 horas.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 49,
                title = "Día 49: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 16:14",
                verseText = "La ira del rey es mensajero de muerte; Mas el hombre sabio la evitará.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Sal a caminar 20 minutos al aire libre sin música ni llamadas, solo escuchando tus pasos.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 50,
                title = "Día 50: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 16:28",
                verseText = "El hombre perverso levanta contienda, Y el chismoso aparta a los mejores amigos.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Realiza suaves estiramientos de cuello y hombros para liberar la tensión acumulada.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 51,
                title = "Día 51: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 17:1",
                verseText = "Mejor es un bocado seco, y en paz, Que casa de contiendas llena de provisiones.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Reduce hoy la cafeína a la mitad y bebe infusiones de manzanilla o tilo.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 52,
                title = "Día 52: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 17:14",
                verseText = "El que comienza la discordia es como quien suelta las aguas; Deja, pues, la contienda, antes que se enrede.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Siéntate junto a una planta o árbol durante 10 minutos sintiendo la calma de la creación.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 53,
                title = "Día 53: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 17:17",
                verseText = "En todo tiempo ama el amigo, y es como un hermano en tiempo de angustia.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Aplica la respiración cuadrada: inhala en 4 segundos, mantén 4, exhala en 4 y mantén vacío en 4 (repite 5 veces).",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 54,
                title = "Día 54: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 17:22",
                verseText = "El corazón alegre constituye buen remedio; mas el espíritu triste seca los huesos.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Desconecta pantallas una hora antes de dormir y lee un salmo o proverbio de paz en tu cama.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 55,
                title = "Día 55: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 18:6",
                verseText = "Los labios del necio traen contienda; Y su boca los azotes llama.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Escribe 3 preocupaciones en un papel, entrégalas en oración y rompe el papel como símbolo de fe.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 56,
                title = "Día 56: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 18:10",
                verseText = "Torre fuerte es el nombre del Señor; a él correrá el justo, y será levantado.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Silencia grupos de WhatsApp o noticias alarmistas por las próximas 6 horas.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 57,
                title = "Día 57: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 18:14",
                verseText = "El ánimo del hombre soportará su enfermedad; Mas ¿quién soportará al ánimo angustiado?",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Sal a caminar 20 minutos al aire libre sin música ni llamadas, solo escuchando tus pasos.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 58,
                title = "Día 58: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 18:18",
                verseText = "La suerte pone fin a los pleitos, Y decide entre los poderosos.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Realiza suaves estiramientos de cuello y hombros para liberar la tensión acumulada.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 59,
                title = "Día 59: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 18:19",
                verseText = "El hermano ofendido es más tenaz que una ciudad fuerte, Y las contiendas de los hermanos son como cerrojos de alcázar.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Reduce hoy la cafeína a la mitad y bebe infusiones de manzanilla o tilo.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 60,
                title = "Día 60: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 19:5",
                verseText = "El testigo falso no quedará sin castigo, Y el que habla mentiras no escapará.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Siéntate junto a una planta o árbol durante 10 minutos sintiendo la calma de la creación.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 61,
                title = "Día 61: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 19:9",
                verseText = "El testigo falso no quedará sin castigo, Y el que habla mentiras perecerá.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Aplica la respiración cuadrada: inhala en 4 segundos, mantén 4, exhala en 4 y mantén vacío en 4 (repite 5 veces).",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 62,
                title = "Día 62: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 19:11",
                verseText = "La cordura del hombre detiene su furor, Y su honra es pasar por alto la ofensa.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Desconecta pantallas una hora antes de dormir y lee un salmo o proverbio de paz en tu cama.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 63,
                title = "Día 63: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 19:12",
                verseText = "Como rugido de cachorro de león es la ira del rey, Y su favor como el rocío sobre la hierba.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Escribe 3 preocupaciones en un papel, entrégalas en oración y rompe el papel como símbolo de fe.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 64,
                title = "Día 64: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 19:13",
                verseText = "Dolor es para su padre el hijo necio, Y gotera continua las contiendas de la mujer.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Silencia grupos de WhatsApp o noticias alarmistas por las próximas 6 horas.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 65,
                title = "Día 65: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 19:19",
                verseText = "El de grande ira llevará la pena; Y si usa de violencias, añadirá nuevos males.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Sal a caminar 20 minutos al aire libre sin música ni llamadas, solo escuchando tus pasos.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 66,
                title = "Día 66: Paz Interior y Descanso Mental",
                verseReference = "Proverbios 19:23",
                verseText = "El temor de Jehová es para vida, Y con él vivirá lleno de reposo el hombre; No será visitado de mal.",
                reflection = "La ansiedad viaja a un futuro catastrófico que no existe. La sabiduría de Dios te ancla con serenidad en el regalo de hoy.",
                practicalTask = "Tu coach te reta hoy: Realiza suaves estiramientos de cuello y hombros para liberar la tensión acumulada.",
                activityType = CoachActivityType.EJERCICIO
            )
            )
        ),
        HabitChallenge(
            id = "autoestima",
            title = "Mejorar mi autoestima e identidad",
            category = "Autoestima",
            iconKey = "sentiment_very_satisfied",
            description = "¿Te comparas con otros o dudas de tu propio valor? Descubre tu dignidad inalienable basada en la verdad bíblica, silencia al crítico interno y construye una seguridad inquebrantable en 66 días.",
            days = listOf(
            HabitDay(
                dayNumber = 1,
                title = "Día 1: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 1:9",
                verseText = "Porque adorno de gracia serán a tu cabeza, Y collares a tu cuello.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Camina erguido con los hombros relajados y la mirada al frente durante todo el día.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 2,
                title = "Día 2: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 1:10",
                verseText = "Hijo mío, si los pecadores quieren engañarte, no te dejes llevar por ellos.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Cuida de tu cuerpo hoy vistiéndote con ropa limpia que te haga sentir cómodo y seguro.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 3,
                title = "Día 3: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 3:4",
                verseText = "Y hallarás gracia y buena opinión Ante los ojos de Dios y de los hombres.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Come sentado y con respeto por ti mismo, sin prisas ni sobras.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 4,
                title = "Día 4: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 3:9",
                verseText = "Honra al Señor con tus bienes y con las primicias de todos tus frutos; así tus graneros se llenarán con abundancia.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Sal a contemplar la naturaleza y recuerda que quien viste los lirios también cuida de ti.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 5,
                title = "Día 5: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 3:16",
                verseText = "Largura de días está en su mano derecha; En su izquierda, riquezas y honra.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Cierra los ojos y repite: 'Mi valor viene del Creador, no de las opiniones humanas'.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 6,
                title = "Día 6: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 3:22",
                verseText = "Y serán vida a tu alma, Y gracia a tu cuello.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Regálate una noche de descanso temprano sin desvelarte mirando la vida de otros en redes.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 7,
                title = "Día 7: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 3:34",
                verseText = "Ciertamente él escarnecerá a los escarnecedores, Y a los humildes dará gracia.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Anota tres talentos o actos nobles que hayas hecho en tu vida y celébralos en gratitud.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 8,
                title = "Día 8: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 3:35",
                verseText = "Los sabios heredarán honra, Mas los necios llevarán ignominia.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Deja de seguir perfiles de redes sociales que te generen envidia o sensación de insuficiencia.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 9,
                title = "Día 9: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 4:7",
                verseText = "La sabiduría ante todo; adquiere sabiduría; y sobre todas tus posesiones adquiere inteligencia.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Camina erguido con los hombros relajados y la mirada al frente durante todo el día.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 10,
                title = "Día 10: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 4:8",
                verseText = "Engrandécela, y ella te engrandecerá; Ella te honrará, cuando tú la hayas abrazado.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Cuida de tu cuerpo hoy vistiéndote con ropa limpia que te haga sentir cómodo y seguro.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 11,
                title = "Día 11: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 4:9",
                verseText = "Adorno de gracia dará a tu cabeza; Corona de hermosura te entregará.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Come sentado y con respeto por ti mismo, sin prisas ni sobras.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 12,
                title = "Día 12: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 4:23",
                verseText = "Sobre toda cosa guardada, guarda tu corazón; porque de él mana la vida.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Sal a contemplar la naturaleza y recuerda que quien viste los lirios también cuida de ti.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 13,
                title = "Día 13: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 6:33",
                verseText = "Heridas y vergüenza hallará, Y su afrenta nunca será borrada.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Cierra los ojos y repite: 'Mi valor viene del Creador, no de las opiniones humanas'.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 14,
                title = "Día 14: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 8:11",
                verseText = "Porque mejor es la sabiduría que las piedras preciosas; y todo lo que se puede desear no es de comparar con ella.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Regálate una noche de descanso temprano sin desvelarte mirando la vida de otros en redes.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 15,
                title = "Día 15: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 8:18",
                verseText = "Las riquezas y la honra están conmigo; Riquezas duraderas, y justicia.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Anota tres talentos o actos nobles que hayas hecho en tu vida y celébralos en gratitud.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 16,
                title = "Día 16: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 9:9",
                verseText = "Instruye al sabio, y se hará más sabio; enseña al justo, y aumentará su saber.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Deja de seguir perfiles de redes sociales que te generen envidia o sensación de insuficiencia.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 17,
                title = "Día 17: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 11:2",
                verseText = "Cuando viene la soberbia, viene también la deshonra; Mas con los humildes está la sabiduría.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Camina erguido con los hombros relajados y la mirada al frente durante todo el día.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 18,
                title = "Día 18: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 11:16",
                verseText = "La mujer agraciada tendrá honra, Y los fuertes tendrán riquezas.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Cuida de tu cuerpo hoy vistiéndote con ropa limpia que te haga sentir cómodo y seguro.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 19,
                title = "Día 19: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 12:4",
                verseText = "La mujer virtuosa es corona de su marido; Mas la mala, como carcoma en sus huesos.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Come sentado y con respeto por ti mismo, sin prisas ni sobras.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 20,
                title = "Día 20: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 13:15",
                verseText = "El buen entendimiento da gracia; Mas el camino de los transgresores es duro.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Sal a contemplar la naturaleza y recuerda que quien viste los lirios también cuida de ti.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 21,
                title = "Día 21: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 13:17",
                verseText = "El mal mensajero acarrea desgracia; Mas el mensajero fiel acarrea salud.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Cierra los ojos y repite: 'Mi valor viene del Creador, no de las opiniones humanas'.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 22,
                title = "Día 22: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 13:18",
                verseText = "Pobreza y vergüenza tendrá el que menosprecia el consejo; Mas el que guarda la corrección recibirá honra.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Regálate una noche de descanso temprano sin desvelarte mirando la vida de otros en redes.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 23,
                title = "Día 23: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 14:18",
                verseText = "Los simples heredarán necedad; Mas los prudentes se coronarán de sabiduría.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Anota tres talentos o actos nobles que hayas hecho en tu vida y celébralos en gratitud.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 24,
                title = "Día 24: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 14:24",
                verseText = "Las riquezas de los sabios son su corona; Pero la insensatez de los necios es infatuación.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Deja de seguir perfiles de redes sociales que te generen envidia o sensación de insuficiencia.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 25,
                title = "Día 25: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 14:28",
                verseText = "En la multitud del pueblo está la gloria del rey; Y en la falta de pueblo la debilidad del príncipe.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Camina erguido con los hombros relajados y la mirada al frente durante todo el día.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 26,
                title = "Día 26: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 14:30",
                verseText = "El corazón apacible es vida de la carne; mas la envidia es carcoma de los huesos.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Cuida de tu cuerpo hoy vistiéndote con ropa limpia que te haga sentir cómodo y seguro.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 27,
                title = "Día 27: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 14:31",
                verseText = "El que oprime al pobre afrenta a su Hacedor; Mas el que tiene misericordia del pobre, lo honra.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Come sentado y con respeto por ti mismo, sin prisas ni sobras.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 28,
                title = "Día 28: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 15:33",
                verseText = "El temor de Jehová es enseñanza de sabiduría; Y a la honra precede la humildad.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Sal a contemplar la naturaleza y recuerda que quien viste los lirios también cuida de ti.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 29,
                title = "Día 29: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 16:18",
                verseText = "Antes del quebranto es la soberbia, y antes de la caída la altivez de espíritu.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Cierra los ojos y repite: 'Mi valor viene del Creador, no de las opiniones humanas'.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 30,
                title = "Día 30: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 16:19",
                verseText = "Mejor es humillar el espíritu con los humildes Que repartir despojos con los soberbios.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Regálate una noche de descanso temprano sin desvelarte mirando la vida de otros en redes.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 31,
                title = "Día 31: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 16:23",
                verseText = "El corazón del sabio hace prudente su boca, Y añade gracia a sus labios.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Anota tres talentos o actos nobles que hayas hecho en tu vida y celébralos en gratitud.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 32,
                title = "Día 32: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 16:31",
                verseText = "Corona de honra es la vejez Que se halla en el camino de justicia.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Deja de seguir perfiles de redes sociales que te generen envidia o sensación de insuficiencia.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 33,
                title = "Día 33: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 16:32",
                verseText = "Mejor es el que tarda en airarse que el fuerte; y el que se enseñorea de su espíritu, que el que toma una ciudad.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Camina erguido con los hombros relajados y la mirada al frente durante todo el día.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 34,
                title = "Día 34: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 17:2",
                verseText = "El siervo prudente se enseñoreará del hijo que deshonra, Y con los hermanos compartirá la herencia.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Cuida de tu cuerpo hoy vistiéndote con ropa limpia que te haga sentir cómodo y seguro.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 35,
                title = "Día 35: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 17:6",
                verseText = "Corona de los viejos son los nietos, Y la honra de los hijos, sus padres.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Come sentado y con respeto por ti mismo, sin prisas ni sobras.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 36,
                title = "Día 36: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 17:22",
                verseText = "El corazón alegre constituye buen remedio; mas el espíritu triste seca los huesos.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Sal a contemplar la naturaleza y recuerda que quien viste los lirios también cuida de ti.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 37,
                title = "Día 37: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 18:3",
                verseText = "Cuando viene el impío, viene también el menosprecio, Y con el deshonrador la afrenta.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Cierra los ojos y repite: 'Mi valor viene del Creador, no de las opiniones humanas'.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 38,
                title = "Día 38: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 18:10",
                verseText = "Torre fuerte es el nombre del Señor; a él correrá el justo, y será levantado.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Regálate una noche de descanso temprano sin desvelarte mirando la vida de otros en redes.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 39,
                title = "Día 39: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 18:12",
                verseText = "Antes del quebrantamiento se eleva el corazón del hombre, Y antes de la honra es el abatimiento.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Anota tres talentos o actos nobles que hayas hecho en tu vida y celébralos en gratitud.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 40,
                title = "Día 40: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 19:11",
                verseText = "La cordura del hombre detiene su furor, Y su honra es pasar por alto la ofensa.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Deja de seguir perfiles de redes sociales que te generen envidia o sensación de insuficiencia.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 41,
                title = "Día 41: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 20:3",
                verseText = "Honra es del hombre dejar la contienda; Mas todo insensato se envolverá en ella.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Camina erguido con los hombros relajados y la mirada al frente durante todo el día.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 42,
                title = "Día 42: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 20:7",
                verseText = "Camina en su integridad el justo; ¡cuán dichosos son sus hijos después de él!",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Cuida de tu cuerpo hoy vistiéndote con ropa limpia que te haga sentir cómodo y seguro.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 43,
                title = "Día 43: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 20:29",
                verseText = "La gloria de los jóvenes es su fuerza, Y la hermosura de los ancianos es su vejez.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Come sentado y con respeto por ti mismo, sin prisas ni sobras.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 44,
                title = "Día 44: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 21:4",
                verseText = "Altivez de ojos, y orgullo de corazón, Y pensamiento de impíos, son pecado.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Sal a contemplar la naturaleza y recuerda que quien viste los lirios también cuida de ti.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 45,
                title = "Día 45: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 21:21",
                verseText = "El que sigue la justicia y la misericordia Hallará la vida, la justicia y la honra.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Cierra los ojos y repite: 'Mi valor viene del Creador, no de las opiniones humanas'.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 46,
                title = "Día 46: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 22:1",
                verseText = "De más estima es el buen nombre que las muchas riquezas, y la buena fama más que la plata y el oro.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Regálate una noche de descanso temprano sin desvelarte mirando la vida de otros en redes.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 47,
                title = "Día 47: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 22:4",
                verseText = "Riquezas, honra y vida Son la remuneración de la humildad y del temor de Jehová.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Anota tres talentos o actos nobles que hayas hecho en tu vida y celébralos en gratitud.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 48,
                title = "Día 48: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 22:11",
                verseText = "El que ama la limpieza de corazón, Por la gracia de sus labios tendrá la amistad del rey.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Deja de seguir perfiles de redes sociales que te generen envidia o sensación de insuficiencia.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 49,
                title = "Día 49: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 23:23",
                verseText = "Compra la verdad, y no la vendas; la sabiduría, la enseñanza y la inteligencia.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Camina erguido con los hombros relajados y la mirada al frente durante todo el día.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 50,
                title = "Día 50: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 24:10",
                verseText = "Si eres débil en el día de aflicción, tu fuerza es reducida.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Cuida de tu cuerpo hoy vistiéndote con ropa limpia que te haga sentir cómodo y seguro.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 51,
                title = "Día 51: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 24:16",
                verseText = "Porque siete veces cae el justo, y vuelve a levantarse; mas los impíos caerán en el mal.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Come sentado y con respeto por ti mismo, sin prisas ni sobras.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 52,
                title = "Día 52: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 25:2",
                verseText = "Gloria de Dios es encubrir un asunto; Pero honra del rey es escudriñarlo.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Sal a contemplar la naturaleza y recuerda que quien viste los lirios también cuida de ti.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 53,
                title = "Día 53: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 25:27",
                verseText = "Comer mucha miel no es bueno, Ni el buscar la propia gloria es gloria.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Cierra los ojos y repite: 'Mi valor viene del Creador, no de las opiniones humanas'.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 54,
                title = "Día 54: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 26:1",
                verseText = "Como no conviene la nieve en el verano, ni la lluvia en la siega, Así no conviene al necio la honra.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Regálate una noche de descanso temprano sin desvelarte mirando la vida de otros en redes.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 55,
                title = "Día 55: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 26:8",
                verseText = "Como quien liga la piedra en la honda, Así hace el que da honra al necio.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Anota tres talentos o actos nobles que hayas hecho en tu vida y celébralos en gratitud.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 56,
                title = "Día 56: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 27:18",
                verseText = "Quien cuida la higuera comerá su fruto, Y el que mira por los intereses de su señor, tendrá honra.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Deja de seguir perfiles de redes sociales que te generen envidia o sensación de insuficiencia.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 57,
                title = "Día 57: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 27:24",
                verseText = "Porque las riquezas no duran para siempre; ¿Y será la corona para perpetuas generaciones?",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Camina erguido con los hombros relajados y la mirada al frente durante todo el día.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 58,
                title = "Día 58: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 28:12",
                verseText = "Cuando los justos se alegran, grande es la gloria; Mas cuando se levantan los impíos, tienen que esconderse los hombres.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Cuida de tu cuerpo hoy vistiéndote con ropa limpia que te haga sentir cómodo y seguro.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 59,
                title = "Día 59: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 28:13",
                verseText = "El que encubre sus pecados no prosperará; mas el que los confiesa y se aparta alcanzará misericordia.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Come sentado y con respeto por ti mismo, sin prisas ni sobras.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 60,
                title = "Día 60: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 28:23",
                verseText = "El que reprende al hombre, hallará después mayor gracia Que el que lisonjea con la lengua.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Sal a contemplar la naturaleza y recuerda que quien viste los lirios también cuida de ti.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 61,
                title = "Día 61: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 29:23",
                verseText = "La soberbia del hombre le abate; Pero al humilde de espíritu sustenta la honra.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Cierra los ojos y repite: 'Mi valor viene del Creador, no de las opiniones humanas'.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 62,
                title = "Día 62: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 30:8",
                verseText = "No me des pobreza ni riquezas; mantenme del pan necesario; no sea que me sacie y te niegue, o siendo pobre, hurte.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Regálate una noche de descanso temprano sin desvelarte mirando la vida de otros en redes.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 63,
                title = "Día 63: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 30:13",
                verseText = "Hay generación cuyos ojos son altivos Y cuyos párpados están levantados en alto.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Anota tres talentos o actos nobles que hayas hecho en tu vida y celébralos en gratitud.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 64,
                title = "Día 64: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 31:10",
                verseText = "Mujer virtuosa, ¿quién la hallará? Porque su estima sobrepasa largamente a la de las piedras preciosas.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Deja de seguir perfiles de redes sociales que te generen envidia o sensación de insuficiencia.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 65,
                title = "Día 65: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 31:25",
                verseText = "Fuerza y honor son su vestidura; y se ríe de lo por venir.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Camina erguido con los hombros relajados y la mirada al frente durante todo el día.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 66,
                title = "Día 66: Identidad Sólida y Dignidad",
                verseReference = "Proverbios 31:30",
                verseText = "Engañosa es la gracia, y vana la hermosura; la persona que teme al Señor, esa será alabada.",
                reflection = "Tu valor no se negocia ni depende de la aprobación ajena. Eres una creación valiosa y única con un propósito eterno.",
                practicalTask = "Tu coach te reta hoy: Cuida de tu cuerpo hoy vistiéndote con ropa limpia que te haga sentir cómodo y seguro.",
                activityType = CoachActivityType.EJERCICIO
            )
            )
        ),
        HabitChallenge(
            id = "procrastinacion",
            title = "Dejar de procrastinar y enfocarme",
            category = "Enfoque",
            iconKey = "track_changes",
            description = "¿Postergas tus proyectos y te distraes con pantallas? Desarrolla foco láser, disciplina de ejecución inmediata y la satisfacción de completar lo que comienzas durante 66 días.",
            days = listOf(
            HabitDay(
                dayNumber = 1,
                title = "Día 1: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 3:24",
                verseText = "Cuando te acuestes, no tendrás temor, Sino que te acostarás, y tu sueño será grato.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Aplica la regla de los 5 minutos: empieza esa tarea incómoda solo por 5 minutos de reloj ahora mismo.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 2,
                title = "Día 2: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 4:16",
                verseText = "Porque no duermen ellos si no han hecho mal, Y pierden el sueño si no han hecho caer a alguno.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Haz 15 saltos o camina enérgicamente 5 minutos para activar tu dopamina antes de trabajar.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 3,
                title = "Día 3: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 5:19",
                verseText = "Como cierva amada y graciosa gacela. Sus caricias te satisfagan en todo tiempo, Y en su amor recréate siempre.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Mantén agua fresca a mano para evitar levantarte continuamente con pretextos.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 4,
                title = "Día 4: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 6:4",
                verseText = "No des sueño a tus ojos, Ni a tus párpados adormecimiento;",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Mira por la ventana o sal a la luz natural 5 minutos para resetear tu fatiga visual.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 5,
                title = "Día 5: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 6:6",
                verseText = "Ve a la hormiga, oh perezoso, mira sus caminos y sé sabio; la cual no teniendo capitán ni gobernador, prepara en el verano su comida.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Si sientes ganas de distraerte, toma una respiración profunda y di: 'Solo esta tarea, solo ahora'.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 6,
                title = "Día 6: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 6:8",
                verseText = "Prepara en el verano su comida, Y recoge en el tiempo de la siega su mantenimiento.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Termina tu día laboral a una hora fija para descansar verdaderamente y recargar energía.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 7,
                title = "Día 7: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 6:9",
                verseText = "Perezoso, ¿hasta cuándo has de dormir? ¿Cuándo te levantarás de tu sueño?",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Felicítate por las 2 tareas más importantes que lograste completar hoy, por pequeñas que fueran.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 8,
                title = "Día 8: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 6:10",
                verseText = "Un poco de sueño, un poco de dormitar, Y cruzar por un poco las manos para reposo;",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Pon el teléfono en modo 'No Molestar' y colócalo en otra habitación durante tu bloque de trabajo.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 9,
                title = "Día 9: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 6:14",
                verseText = "Perversidades hay en su corazón; anda pensando el mal en todo tiempo; Siembra las discordias.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Aplica la regla de los 5 minutos: empieza esa tarea incómoda solo por 5 minutos de reloj ahora mismo.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 10,
                title = "Día 10: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 6:18",
                verseText = "El corazón que maquina pensamientos inicuos, Los pies presurosos para correr al mal,",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Haz 15 saltos o camina enérgicamente 5 minutos para activar tu dopamina antes de trabajar.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 11,
                title = "Día 11: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 7:15",
                verseText = "Por tanto, he salido a encontrarte, Buscando diligentemente tu rostro, y te he hallado.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Mantén agua fresca a mano para evitar levantarte continuamente con pretextos.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 12,
                title = "Día 12: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 8:30",
                verseText = "Con él estaba yo ordenándolo todo, Y era su delicia de día en día, Teniendo solaz delante de él en todo tiempo.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Mira por la ventana o sal a la luz natural 5 minutos para resetear tu fatiga visual.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 13,
                title = "Día 13: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 10:4",
                verseText = "Las manos ociosas conducen a la pobreza; las manos diligentes traen riqueza.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Si sientes ganas de distraerte, toma una respiración profunda y di: 'Solo esta tarea, solo ahora'.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 14,
                title = "Día 14: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 10:5",
                verseText = "El que recoge en el verano es hombre entendido; El que duerme en el tiempo de la siega es hijo que avergüenza.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Termina tu día laboral a una hora fija para descansar verdaderamente y recargar energía.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 15,
                title = "Día 15: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 10:26",
                verseText = "Como el vinagre a los dientes, y como el humo a los ojos, Así es el perezoso a los que lo envían.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Felicítate por las 2 tareas más importantes que lograste completar hoy, por pequeñas que fueran.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 16,
                title = "Día 16: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 12:2",
                verseText = "El bueno alcanzará favor de Jehová; Mas él condenará al hombre de malos pensamientos.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Pon el teléfono en modo 'No Molestar' y colócalo en otra habitación durante tu bloque de trabajo.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 17,
                title = "Día 17: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 12:5",
                verseText = "Los pensamientos de los justos son rectitud; Mas los consejos de los impíos, engaño.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Aplica la regla de los 5 minutos: empieza esa tarea incómoda solo por 5 minutos de reloj ahora mismo.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 18,
                title = "Día 18: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 12:24",
                verseText = "La mano de los diligentes señoreará; Mas la negligencia será tributaria.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Haz 15 saltos o camina enérgicamente 5 minutos para activar tu dopamina antes de trabajar.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 19,
                title = "Día 19: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 13:4",
                verseText = "El alma del perezoso desea, y nada alcanza; Mas el alma de los diligentes será prosperada.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Mantén agua fresca a mano para evitar levantarte continuamente con pretextos.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 20,
                title = "Día 20: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 15:6",
                verseText = "En la casa del justo hay gran provisión; Pero turbación en las ganancias del impío.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Mira por la ventana o sal a la luz natural 5 minutos para resetear tu fatiga visual.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 21,
                title = "Día 21: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 15:19",
                verseText = "El camino del perezoso es como seto de espinos; Mas la vereda de los rectos, como una calzada.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Si sientes ganas de distraerte, toma una respiración profunda y di: 'Solo esta tarea, solo ahora'.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 22,
                title = "Día 22: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 15:22",
                verseText = "Los pensamientos son frustrados donde no hay consejo; mas en la multitud de consejeros se afirman.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Termina tu día laboral a una hora fija para descansar verdaderamente y recargar energía.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 23,
                title = "Día 23: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 15:23",
                verseText = "El hombre se alegra con la respuesta de su boca; Y la palabra a su tiempo, ¡cuán buena es!",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Felicítate por las 2 tareas más importantes que lograste completar hoy, por pequeñas que fueran.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 24,
                title = "Día 24: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 15:26",
                verseText = "Abominación son a Jehová los pensamientos del malo; Mas las expresiones de los limpios son limpias.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Pon el teléfono en modo 'No Molestar' y colócalo en otra habitación durante tu bloque de trabajo.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 25,
                title = "Día 25: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 16:3",
                verseText = "Encomienda al Señor tus obras, y tus pensamientos serán afirmados.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Aplica la regla de los 5 minutos: empieza esa tarea incómoda solo por 5 minutos de reloj ahora mismo.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 26,
                title = "Día 26: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 17:17",
                verseText = "En todo tiempo ama el amigo, y es como un hermano en tiempo de angustia.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Haz 15 saltos o camina enérgicamente 5 minutos para activar tu dopamina antes de trabajar.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 27,
                title = "Día 27: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 19:15",
                verseText = "La pereza hace caer en profundo sueño, Y el alma negligente padecerá hambre.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Mantén agua fresca a mano para evitar levantarte continuamente con pretextos.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 28,
                title = "Día 28: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 19:21",
                verseText = "Muchos pensamientos hay en el corazón del hombre; mas el consejo del Señor permanecerá.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Mira por la ventana o sal a la luz natural 5 minutos para resetear tu fatiga visual.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 29,
                title = "Día 29: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 19:24",
                verseText = "El perezoso mete su mano en el plato, Y ni aun a su boca la llevará.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Si sientes ganas de distraerte, toma una respiración profunda y di: 'Solo esta tarea, solo ahora'.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 30,
                title = "Día 30: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 20:4",
                verseText = "El perezoso no ara a causa del invierno; pedirá, pues, en la siega, y no hallará.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Termina tu día laboral a una hora fija para descansar verdaderamente y recargar energía.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 31,
                title = "Día 31: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 20:13",
                verseText = "No ames el sueño, para que no te empobrezcas; Abre tus ojos, y te saciarás de pan.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Felicítate por las 2 tareas más importantes que lograste completar hoy, por pequeñas que fueran.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 32,
                title = "Día 32: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 20:18",
                verseText = "Los pensamientos con el consejo se ordenan; Y con dirección sabia se hace la guerra.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Pon el teléfono en modo 'No Molestar' y colócalo en otra habitación durante tu bloque de trabajo.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 33,
                title = "Día 33: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 20:19",
                verseText = "El que anda en chismes descubre el secreto; No te entremetas, pues, con el suelto de lengua.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Aplica la regla de los 5 minutos: empieza esa tarea incómoda solo por 5 minutos de reloj ahora mismo.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 34,
                title = "Día 34: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 21:4",
                verseText = "Altivez de ojos, y orgullo de corazón, Y pensamiento de impíos, son pecado.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Haz 15 saltos o camina enérgicamente 5 minutos para activar tu dopamina antes de trabajar.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 35,
                title = "Día 35: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 21:5",
                verseText = "Los pensamientos del diligente ciertamente tienden a la abundancia; mas todo el que se apresura alocadamente, de cierto va a la pobreza.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Mantén agua fresca a mano para evitar levantarte continuamente con pretextos.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 36,
                title = "Día 36: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 21:25",
                verseText = "El deseo del perezoso le mata, Porque sus manos no quieren trabajar.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Mira por la ventana o sal a la luz natural 5 minutos para resetear tu fatiga visual.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 37,
                title = "Día 37: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 22:13",
                verseText = "Dice el perezoso: El león está fuera; Seré muerto en la calle.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Si sientes ganas de distraerte, toma una respiración profunda y di: 'Solo esta tarea, solo ahora'.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 38,
                title = "Día 38: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 22:24",
                verseText = "No te entremetas con el iracundo, Ni te acompañes con el hombre de enojos,",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Termina tu día laboral a una hora fija para descansar verdaderamente y recargar energía.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 39,
                title = "Día 39: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 23:7",
                verseText = "Porque cual es su pensamiento en su corazón, tal es él. Come y bebe, te dirá; Mas su corazón no está contigo.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Felicítate por las 2 tareas más importantes que lograste completar hoy, por pequeñas que fueran.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 40,
                title = "Día 40: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 23:17",
                verseText = "No tenga tu corazón envidia de los pecadores, Antes persevera en el temor de Jehová todo el tiempo;",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Pon el teléfono en modo 'No Molestar' y colócalo en otra habitación durante tu bloque de trabajo.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 41,
                title = "Día 41: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 23:21",
                verseText = "Porque el bebedor y el comilón empobrecerán, Y el sueño hará vestir vestidos rotos.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Aplica la regla de los 5 minutos: empieza esa tarea incómoda solo por 5 minutos de reloj ahora mismo.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 42,
                title = "Día 42: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 24:8",
                verseText = "Al que piensa hacer el mal, Le llamarán hombre de malos pensamientos.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Haz 15 saltos o camina enérgicamente 5 minutos para activar tu dopamina antes de trabajar.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 43,
                title = "Día 43: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 24:9",
                verseText = "El pensamiento del necio es pecado, Y abominación a los hombres el escarnecedor.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Mantén agua fresca a mano para evitar levantarte continuamente con pretextos.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 44,
                title = "Día 44: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 24:19",
                verseText = "No te entremetas con los malignos, Ni tengas envidia de los impíos;",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Mira por la ventana o sal a la luz natural 5 minutos para resetear tu fatiga visual.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 45,
                title = "Día 45: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 24:21",
                verseText = "Teme a Jehová, hijo mío, y al rey; No te entremetas con los veleidosos;",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Si sientes ganas de distraerte, toma una respiración profunda y di: 'Solo esta tarea, solo ahora'.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 46,
                title = "Día 46: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 24:30",
                verseText = "Pasé junto al campo del hombre perezoso, Y junto a la viña del hombre falto de entendimiento;",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Termina tu día laboral a una hora fija para descansar verdaderamente y recargar energía.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 47,
                title = "Día 47: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 24:33",
                verseText = "Un poco de sueño, cabeceando otro poco, Poniendo mano sobre mano otro poco para dormir;",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Felicítate por las 2 tareas más importantes que lograste completar hoy, por pequeñas que fueran.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 48,
                title = "Día 48: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 25:13",
                verseText = "Como frío de nieve en tiempo de la siega, Así es el mensajero fiel a los que lo envían, Pues al alma de su señor da refrigerio.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Pon el teléfono en modo 'No Molestar' y colócalo en otra habitación durante tu bloque de trabajo.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 49,
                title = "Día 49: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 25:19",
                verseText = "Como diente roto y pie descoyuntado Es la confianza en el prevaricador en tiempo de angustia.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Aplica la regla de los 5 minutos: empieza esa tarea incómoda solo por 5 minutos de reloj ahora mismo.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 50,
                title = "Día 50: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 25:20",
                verseText = "El que canta canciones al corazón afligido Es como el que quita la ropa en tiempo de frío, o el que sobre el jabón echa vinagre.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Haz 15 saltos o camina enérgicamente 5 minutos para activar tu dopamina antes de trabajar.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 51,
                title = "Día 51: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 26:1",
                verseText = "Como no conviene la nieve en el verano, ni la lluvia en la siega, Así no conviene al necio la honra.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Mantén agua fresca a mano para evitar levantarte continuamente con pretextos.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 52,
                title = "Día 52: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 26:13",
                verseText = "Dice el perezoso: El león está en el camino; El león está en las calles.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Mira por la ventana o sal a la luz natural 5 minutos para resetear tu fatiga visual.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 53,
                title = "Día 53: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 26:14",
                verseText = "Como la puerta gira sobre sus quicios, Así el perezoso se vuelve en su cama.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Si sientes ganas de distraerte, toma una respiración profunda y di: 'Solo esta tarea, solo ahora'.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 54,
                title = "Día 54: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 26:15",
                verseText = "Mete el perezoso su mano en el plato; Se cansa de llevarla a su boca.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Termina tu día laboral a una hora fija para descansar verdaderamente y recargar energía.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 55,
                title = "Día 55: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 26:16",
                verseText = "En su propia opinión el perezoso es más sabio Que siete que sepan aconsejar.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Felicítate por las 2 tareas más importantes que lograste completar hoy, por pequeñas que fueran.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 56,
                title = "Día 56: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 27:15",
                verseText = "Gotera continua en tiempo de lluvia Y la mujer rencillosa, son semejantes;",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Pon el teléfono en modo 'No Molestar' y colócalo en otra habitación durante tu bloque de trabajo.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 57,
                title = "Día 57: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 27:23",
                verseText = "Sé diligente en conocer el estado de tus ovejas, Y mira con cuidado por tus rebaños;",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Aplica la regla de los 5 minutos: empieza esa tarea incómoda solo por 5 minutos de reloj ahora mismo.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 58,
                title = "Día 58: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 29:11",
                verseText = "El necio da rienda suelta a toda su ira, mas el sabio al fin la sosiega.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Haz 15 saltos o camina enérgicamente 5 minutos para activar tu dopamina antes de trabajar.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 59,
                title = "Día 59: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 29:18",
                verseText = "Donde no hay visión, el pueblo se extravía; pero dichoso el que guarda la ley.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Mantén agua fresca a mano para evitar levantarte continuamente con pretextos.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 60,
                title = "Día 60: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 30:25",
                verseText = "Las hormigas, pueblo no fuerte, Y en el verano preparan su comida;",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Mira por la ventana o sal a la luz natural 5 minutos para resetear tu fatiga visual.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 61,
                title = "Día 61: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 1:1",
                verseText = "Los proverbios de Salomón, hijo de David, rey de Israel.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Si sientes ganas de distraerte, toma una respiración profunda y di: 'Solo esta tarea, solo ahora'.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 62,
                title = "Día 62: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 1:2",
                verseText = "Para entender sabiduría y doctrina, Para conocer razones prudentes,",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Termina tu día laboral a una hora fija para descansar verdaderamente y recargar energía.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 63,
                title = "Día 63: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 1:3",
                verseText = "Para recibir el consejo de prudencia, Justicia, juicio y equidad;",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Felicítate por las 2 tareas más importantes que lograste completar hoy, por pequeñas que fueran.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 64,
                title = "Día 64: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 1:4",
                verseText = "Para dar sagacidad a los simples, Y a los jóvenes inteligencia y cordura.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Pon el teléfono en modo 'No Molestar' y colócalo en otra habitación durante tu bloque de trabajo.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 65,
                title = "Día 65: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 1:5",
                verseText = "Oirá el sabio, y aumentará el saber, Y el entendido adquirirá consejo,",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Aplica la regla de los 5 minutos: empieza esa tarea incómoda solo por 5 minutos de reloj ahora mismo.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 66,
                title = "Día 66: Foco Láser y Ejecución Inmediata",
                verseReference = "Proverbios 1:6",
                verseText = "Para entender proverbio y declaración, Palabras de sabios, y sus dichos profundos.",
                reflection = "Postergar roba más energía mental que hacer la tarea. Empezar con el paso más pequeño derrumba cualquier muro.",
                practicalTask = "Tu coach te reta hoy: Haz 15 saltos o camina enérgicamente 5 minutos para activar tu dopamina antes de trabajar.",
                activityType = CoachActivityType.EJERCICIO
            )
            )
        ),
        HabitChallenge(
            id = "familia",
            title = "Fortalecer mis relaciones familiares",
            category = "Familia",
            iconKey = "home",
            description = "¿Discusiones frecuentes o frialdad en casa? Siembra respuestas amables, perdón oportuno, tiempo de calidad sin pantallas y amor incondicional en tu hogar durante 66 días.",
            days = listOf(
            HabitDay(
                dayNumber = 1,
                title = "Día 1: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 1:1",
                verseText = "Los proverbios de Salomón, hijo de David, rey de Israel.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Abraza a un miembro de tu familia durante al menos 6 segundos con ternura sincera.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 2,
                title = "Día 2: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 1:8",
                verseText = "Oye, hijo mío, la instrucción de tu padre, Y no desprecies la dirección de tu madre;",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Propón una caminata familiar suave después de cenar para charlar sin prisas.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 3,
                title = "Día 3: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 1:10",
                verseText = "Hijo mío, si los pecadores quieren engañarte, no te dejes llevar por ellos.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Cocina o comparte un refrigerio especial preparado con cariño para tus seres queridos.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 4,
                title = "Día 4: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 1:13",
                verseText = "Hallaremos riquezas de toda clase, Llenaremos nuestras casas de despojos;",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Salgan juntos a un parque o patio a disfrutar de un momento bajo el cielo.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 5,
                title = "Día 5: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 1:15",
                verseText = "Hijo mío, no andes en camino con ellos. Aparta tu pie de sus veredas,",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Cuando sientas deseos de discutir, haz una pausa de 3 respiraciones profundas y responde con dulzura.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 6,
                title = "Día 6: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 1:27",
                verseText = "Cuando viniere como una destrucción lo que teméis, Y vuestra calamidad llegare como un torbellino; Cuando sobre vosotros viniere tribulación y angustia.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Asegura que el ambiente de la casa sea de paz y silencio suave antes de la hora de dormir.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 7,
                title = "Día 7: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 1:29",
                verseText = "Por cuanto aborrecieron la sabiduría, Y no escogieron el temor de Jehová,",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Expresa a cada miembro de tu hogar una cualidad específica que admires de él o ella.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 8,
                title = "Día 8: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 2:1",
                verseText = "Hijo mío, si recibieres mis palabras, Y mis mandamientos guardares dentro de ti,",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Mantengan la mesa de la comida 100% libre de pantallas y teléfonos móviles hoy.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 9,
                title = "Día 9: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 2:5",
                verseText = "Entonces entenderás el temor de Jehová, Y hallarás el conocimiento de Dios.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Abraza a un miembro de tu familia durante al menos 6 segundos con ternura sincera.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 10,
                title = "Día 10: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 2:18",
                verseText = "Por lo cual su casa está inclinada a la muerte, Y sus veredas hacia los muertos;",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Propón una caminata familiar suave después de cenar para charlar sin prisas.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 11,
                title = "Día 11: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 3:1",
                verseText = "Hijo mío, no te olvides de mi ley, Y tu corazón guarde mis mandamientos;",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Cocina o comparte un refrigerio especial preparado con cariño para tus seres queridos.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 12,
                title = "Día 12: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 3:2",
                verseText = "Porque largura de días y años de vida Y paz te aumentarán.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Salgan juntos a un parque o patio a disfrutar de un momento bajo el cielo.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 13,
                title = "Día 13: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 3:11",
                verseText = "No menosprecies, hijo mío, el castigo de Jehová, Ni te fatigues de su corrección;",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Cuando sientas deseos de discutir, haz una pausa de 3 respiraciones profundas y responde con dulzura.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 14,
                title = "Día 14: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 3:12",
                verseText = "Porque Jehová al que ama castiga, Como el padre al hijo a quien quiere.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Asegura que el ambiente de la casa sea de paz y silencio suave antes de la hora de dormir.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 15,
                title = "Día 15: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 3:17",
                verseText = "Sus caminos son caminos deleitosos, Y todas sus veredas paz.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Expresa a cada miembro de tu hogar una cualidad específica que admires de él o ella.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 16,
                title = "Día 16: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 3:21",
                verseText = "Hijo mío, no se aparten estas cosas de tus ojos; Guarda la ley y el consejo,",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Mantengan la mesa de la comida 100% libre de pantallas y teléfonos móviles hoy.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 17,
                title = "Día 17: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 3:25",
                verseText = "No tendrás temor de pavor repentino, Ni de la ruina de los impíos cuando viniere,",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Abraza a un miembro de tu familia durante al menos 6 segundos con ternura sincera.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 18,
                title = "Día 18: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 3:30",
                verseText = "No tengas pleito con nadie sin razón, Si no te han hecho agravio.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Propón una caminata familiar suave después de cenar para charlar sin prisas.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 19,
                title = "Día 19: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 3:33",
                verseText = "La maldición de Jehová está en la casa del impío, Pero bendecirá la morada de los justos.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Cocina o comparte un refrigerio especial preparado con cariño para tus seres queridos.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 20,
                title = "Día 20: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 4:1",
                verseText = "Oíd, hijos, la enseñanza de un padre, Y estad atentos, para que conozcáis cordura.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Salgan juntos a un parque o patio a disfrutar de un momento bajo el cielo.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 21,
                title = "Día 21: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 4:3",
                verseText = "Porque yo también fui hijo de mi padre, Delicado y único delante de mi madre.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Cuando sientas deseos de discutir, haz una pausa de 3 respiraciones profundas y responde con dulzura.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 22,
                title = "Día 22: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 4:10",
                verseText = "Oye, hijo mío, y recibe mis razones, Y se te multiplicarán años de vida.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Asegura que el ambiente de la casa sea de paz y silencio suave antes de la hora de dormir.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 23,
                title = "Día 23: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 4:20",
                verseText = "Hijo mío, está atento a mis palabras; Inclina tu oído a mis razones.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Expresa a cada miembro de tu hogar una cualidad específica que admires de él o ella.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 24,
                title = "Día 24: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 5:1",
                verseText = "Hijo mío, está atento a mi sabiduría, Y a mi inteligencia inclina tu oído,",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Mantengan la mesa de la comida 100% libre de pantallas y teléfonos móviles hoy.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 25,
                title = "Día 25: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 5:7",
                verseText = "Ahora pues, hijos, oídme, Y no os apartéis de las razones de mi boca.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Abraza a un miembro de tu familia durante al menos 6 segundos con ternura sincera.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 26,
                title = "Día 26: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 5:8",
                verseText = "Aleja de ella tu camino, Y no te acerques a la puerta de su casa;",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Propón una caminata familiar suave después de cenar para charlar sin prisas.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 27,
                title = "Día 27: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 5:10",
                verseText = "No sea que extraños se sacien de tu fuerza, Y tus trabajos estén en casa del extraño;",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Cocina o comparte un refrigerio especial preparado con cariño para tus seres queridos.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 28,
                title = "Día 28: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 5:18",
                verseText = "Sea bendito tu manantial, Y alégrate con la mujer de tu juventud,",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Salgan juntos a un parque o patio a disfrutar de un momento bajo el cielo.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 29,
                title = "Día 29: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 5:19",
                verseText = "Como cierva amada y graciosa gacela. Sus caricias te satisfagan en todo tiempo, Y en su amor recréate siempre.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Cuando sientas deseos de discutir, haz una pausa de 3 respiraciones profundas y responde con dulzura.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 30,
                title = "Día 30: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 5:20",
                verseText = "¿Y por qué, hijo mío, andarás ciego con la mujer ajena, Y abrazarás el seno de la extraña?",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Asegura que el ambiente de la casa sea de paz y silencio suave antes de la hora de dormir.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 31,
                title = "Día 31: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 6:1",
                verseText = "Hijo mío, si salieres fiador por tu amigo, Si has empeñado tu palabra a un extraño,",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Expresa a cada miembro de tu hogar una cualidad específica que admires de él o ella.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 32,
                title = "Día 32: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 6:3",
                verseText = "Haz esto ahora, hijo mío, y líbrate, Ya que has caído en la mano de tu prójimo; Ve, humíllate, y asegúrate de tu amigo.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Mantengan la mesa de la comida 100% libre de pantallas y teléfonos móviles hoy.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 33,
                title = "Día 33: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 6:19",
                verseText = "El testigo falso que habla mentiras, Y el que siembra discordia entre hermanos.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Abraza a un miembro de tu familia durante al menos 6 segundos con ternura sincera.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 34,
                title = "Día 34: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 6:20",
                verseText = "Guarda, hijo mío, el mandamiento de tu padre, Y no dejes la enseñanza de tu madre;",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Propón una caminata familiar suave después de cenar para charlar sin prisas.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 35,
                title = "Día 35: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 6:31",
                verseText = "Pero si es sorprendido, pagará siete veces; Entregará todo el haber de su casa.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Cocina o comparte un refrigerio especial preparado con cariño para tus seres queridos.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 36,
                title = "Día 36: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 6:34",
                verseText = "Porque los celos son el furor del hombre, Y no perdonará en el día de la venganza.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Salgan juntos a un parque o patio a disfrutar de un momento bajo el cielo.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 37,
                title = "Día 37: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 6:35",
                verseText = "No aceptará ningún rescate, Ni querrá perdonar, aunque multipliques los dones.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Cuando sientas deseos de discutir, haz una pausa de 3 respiraciones profundas y responde con dulzura.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 38,
                title = "Día 38: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 7:1",
                verseText = "Hijo mío, guarda mis razones, Y atesora contigo mis mandamientos.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Asegura que el ambiente de la casa sea de paz y silencio suave antes de la hora de dormir.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 39,
                title = "Día 39: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 7:6",
                verseText = "Porque mirando yo por la ventana de mi casa, Por mi celosía,",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Expresa a cada miembro de tu hogar una cualidad específica que admires de él o ella.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 40,
                title = "Día 40: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 7:8",
                verseText = "El cual pasaba por la calle, junto a la esquina, E iba camino a la casa de ella,",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Mantengan la mesa de la comida 100% libre de pantallas y teléfonos móviles hoy.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 41,
                title = "Día 41: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 7:10",
                verseText = "Cuando he aquí, una mujer le sale al encuentro, Con atavío de ramera y astuta de corazón.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Abraza a un miembro de tu familia durante al menos 6 segundos con ternura sincera.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 42,
                title = "Día 42: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 7:11",
                verseText = "Alborotadora y rencillosa, Sus pies no pueden estar en casa;",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Propón una caminata familiar suave después de cenar para charlar sin prisas.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 43,
                title = "Día 43: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 7:14",
                verseText = "Sacrificios de paz había prometido, Hoy he pagado mis votos;",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Cocina o comparte un refrigerio especial preparado con cariño para tus seres queridos.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 44,
                title = "Día 44: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 7:18",
                verseText = "Ven, embriaguémonos de amores hasta la mañana; Alegrémonos en amores.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Salgan juntos a un parque o patio a disfrutar de un momento bajo el cielo.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 45,
                title = "Día 45: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 7:19",
                verseText = "Porque el marido no está en casa; Se ha ido a un largo viaje.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Cuando sientas deseos de discutir, haz una pausa de 3 respiraciones profundas y responde con dulzura.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 46,
                title = "Día 46: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 7:20",
                verseText = "La bolsa de dinero llevó en su mano; El día señalado volverá a su casa.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Asegura que el ambiente de la casa sea de paz y silencio suave antes de la hora de dormir.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 47,
                title = "Día 47: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 7:24",
                verseText = "Ahora pues, hijos, oídme, Y estad atentos a las razones de mi boca.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Expresa a cada miembro de tu hogar una cualidad específica que admires de él o ella.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 48,
                title = "Día 48: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 7:27",
                verseText = "Camino al Seol es su casa, Que conduce a las cámaras de la muerte.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Mantengan la mesa de la comida 100% libre de pantallas y teléfonos móviles hoy.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 49,
                title = "Día 49: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 8:4",
                verseText = "Oh hombres, a vosotros clamo; Dirijo mi voz a los hijos de los hombres.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Abraza a un miembro de tu familia durante al menos 6 segundos con ternura sincera.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 50,
                title = "Día 50: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 8:31",
                verseText = "Me regocijo en la parte habitable de su tierra; Y mis delicias son con los hijos de los hombres.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Propón una caminata familiar suave después de cenar para charlar sin prisas.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 51,
                title = "Día 51: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 8:32",
                verseText = "Ahora, pues, hijos, oídme, Y bienaventurados los que guardan mis caminos.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Cocina o comparte un refrigerio especial preparado con cariño para tus seres queridos.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 52,
                title = "Día 52: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 9:1",
                verseText = "La sabiduría edificó su casa, Labró sus siete columnas.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Salgan juntos a un parque o patio a disfrutar de un momento bajo el cielo.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 53,
                title = "Día 53: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 9:10",
                verseText = "El temor de Jehová es el principio de la sabiduría, Y el conocimiento del Santísimo es la inteligencia.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Cuando sientas deseos de discutir, haz una pausa de 3 respiraciones profundas y responde con dulzura.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 54,
                title = "Día 54: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 9:14",
                verseText = "Se sienta en una silla a la puerta de su casa, En los lugares altos de la ciudad,",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Asegura que el ambiente de la casa sea de paz y silencio suave antes de la hora de dormir.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 55,
                title = "Día 55: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 10:1",
                verseText = "Los proverbios de Salomón. El hijo sabio alegra al padre, Pero el hijo necio es tristeza de su madre.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Expresa a cada miembro de tu hogar una cualidad específica que admires de él o ella.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 56,
                title = "Día 56: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 10:5",
                verseText = "El que recoge en el verano es hombre entendido; El que duerme en el tiempo de la siega es hijo que avergüenza.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Mantengan la mesa de la comida 100% libre de pantallas y teléfonos móviles hoy.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 57,
                title = "Día 57: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 10:12",
                verseText = "El odio despierta rencillas; pero el amor cubrirá todas las faltas.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Abraza a un miembro de tu familia durante al menos 6 segundos con ternura sincera.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 58,
                title = "Día 58: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 10:27",
                verseText = "El temor de Jehová aumentará los días; Mas los años de los impíos serán acortados.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Propón una caminata familiar suave después de cenar para charlar sin prisas.",
                activityType = CoachActivityType.EJERCICIO
            ),
            HabitDay(
                dayNumber = 59,
                title = "Día 59: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 10:28",
                verseText = "La esperanza de los justos es alegría; Mas la esperanza de los impíos perecerá.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Cocina o comparte un refrigerio especial preparado con cariño para tus seres queridos.",
                activityType = CoachActivityType.NUTRICION
            ),
            HabitDay(
                dayNumber = 60,
                title = "Día 60: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 11:7",
                verseText = "Cuando muere el hombre impío, perece su esperanza; Y la expectación de los malos perecerá.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Salgan juntos a un parque o patio a disfrutar de un momento bajo el cielo.",
                activityType = CoachActivityType.NATURALEZA
            ),
            HabitDay(
                dayNumber = 61,
                title = "Día 61: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 11:23",
                verseText = "El deseo de los justos es solamente el bien; Mas la esperanza de los impíos es el enojo.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Cuando sientas deseos de discutir, haz una pausa de 3 respiraciones profundas y responde con dulzura.",
                activityType = CoachActivityType.RESPIRACION
            ),
            HabitDay(
                dayNumber = 62,
                title = "Día 62: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 11:29",
                verseText = "El que turba su casa heredará viento; Y el necio será siervo del sabio de corazón.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Asegura que el ambiente de la casa sea de paz y silencio suave antes de la hora de dormir.",
                activityType = CoachActivityType.DESCANSO
            ),
            HabitDay(
                dayNumber = 63,
                title = "Día 63: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 12:7",
                verseText = "Dios trastornará a los impíos, y no serán más; Pero la casa de los justos permanecerá firme.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Expresa a cada miembro de tu hogar una cualidad específica que admires de él o ella.",
                activityType = CoachActivityType.GRATITUD
            ),
            HabitDay(
                dayNumber = 64,
                title = "Día 64: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 12:16",
                verseText = "El necio al punto da a conocer su ira; Mas el que no hace caso de la injuria es prudente.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Mantengan la mesa de la comida 100% libre de pantallas y teléfonos móviles hoy.",
                activityType = CoachActivityType.DESCONEXION
            ),
            HabitDay(
                dayNumber = 65,
                title = "Día 65: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 13:1",
                verseText = "El hijo sabio recibe el consejo del padre; Mas el burlador no escucha las reprensiones.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Abraza a un miembro de tu familia durante al menos 6 segundos con ternura sincera.",
                activityType = CoachActivityType.ACCION_PRACTICA
            ),
            HabitDay(
                dayNumber = 66,
                title = "Día 66: Armonía y Amor en el Hogar",
                verseReference = "Proverbios 13:5",
                verseText = "El justo aborrece la palabra de mentira; Mas el impío se hace odioso e infame.",
                reflection = "El amor en la familia se construye con paciencia diaria, palabras suaves y la decisión de perdonar primero.",
                practicalTask = "Tu coach te reta hoy: Propón una caminata familiar suave después de cenar para charlar sin prisas.",
                activityType = CoachActivityType.EJERCICIO
            )
            )
        )
    )
}
