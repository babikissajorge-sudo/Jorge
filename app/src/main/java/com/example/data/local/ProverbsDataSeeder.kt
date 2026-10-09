package com.example.data.local

import android.content.Context
import com.example.data.model.HabitChallenge
import com.example.data.model.HabitDay
import com.example.data.model.Verse
import org.json.JSONArray

/**
 * Proveedor de datos bíblicos precargados para los 31 capítulos del libro de Proverbios
 * en la versión Nueva Biblia Viva (NBV).
 *
 * Atribución requerida por licencia Creative Commons CC BY-SA:
 * "Texto bíblico tomado de la Nueva Biblia Viva (NBV), © Sociedad Bíblica Internacional. Usado bajo licencia Creative Commons CC BY-SA."
 */
object ProverbsDataSeeder {

    fun loadAllVerses(context: Context): List<Verse> {
        return try {
            val jsonString = context.assets.open("proverbs_all.json").bufferedReader().use { it.readText() }
            val jsonArray = JSONArray(jsonString)
            val list = ArrayList<Verse>(jsonArray.length())
            for (i in 0 until jsonArray.length()) {
                val obj = jsonArray.getJSONObject(i)
                list.add(
                    Verse(
                        id = obj.getInt("id"),
                        chapter = obj.getInt("chapter"),
                        verseNumber = obj.getInt("verseNumber"),
                        verseEndNumber = obj.optInt("verseEndNumber", obj.getInt("verseNumber")),
                        reference = obj.getString("reference"),
                        text = obj.getString("text"),
                        primaryCategory = obj.getString("primaryCategory"),
                        tags = obj.optString("tags", "Sabiduría"),
                        practicalAdvice = obj.optString("practicalAdvice", ""),
                        actionPrompt = obj.optString("actionPrompt", ""),
                        isFavorite = obj.optBoolean("isFavorite", false),
                        personalNote = obj.optString("personalNote", ""),
                        favoriteTimestamp = obj.optLong("favoriteTimestamp", 0L)
                    )
                )
            }
            if (list.isNotEmpty()) list else getInitialVerses()
        } catch (e: Exception) {
            getInitialVerses()
        }
    }

    fun getInitialVerses(): List<Verse> = listOf(
        // CAPÍTULO 1
        Verse(
            chapter = 1, verseNumber = 7,
            reference = "Proverbios 1:7",
            text = "El principio de la sabiduría es el temor del Señor; los necios desprecian la sabiduría y la disciplina.",
            primaryCategory = "Sabiduría",
            tags = "Sabiduría, Fe, Disciplina",
            practicalAdvice = "Reconocer a Dios y respetar sus principios es el punto de partida para tomar decisiones inteligentes y con propósito.",
            actionPrompt = "Antes de tomar una decisión importante hoy, haz una pausa de un minuto para pedir dirección y discernimiento."
        ),
        Verse(
            chapter = 1, verseNumber = 10,
            reference = "Proverbios 1:10",
            text = "Hijo mío, si los pecadores quieren engañarte, no te dejes llevar por ellos.",
            primaryCategory = "Tentación",
            tags = "Tentación, Relaciones, Autoestima",
            practicalAdvice = "Aprender a decir 'no' a tiempo con firmeza y amabilidad te librará de problemas que tardan años en resolverse.",
            actionPrompt = "Identifica una situación o propuesta reciente donde debas establecer un límite saludable."
        ),
        Verse(
            chapter = 1, verseNumber = 33,
            reference = "Proverbios 1:33",
            text = "Pero el que me escuche vivirá seguro y tranquilo, sin temor a ningún mal.",
            primaryCategory = "Ansiedad",
            tags = "Ansiedad, Fe, Sabiduría",
            practicalAdvice = "La obediencia a principios sabios produce una paz interior inquebrantable frente a las turbulencias externas.",
            actionPrompt = "Respira hondo y entrega esa preocupación financiera o familiar que te quita el sueño a la providencia divina."
        ),

        // CAPÍTULO 2
        Verse(
            chapter = 2, verseNumber = 6,
            reference = "Proverbios 2:6",
            text = "Porque el Señor es el que da la sabiduría; de su boca brotan el conocimiento y la inteligencia.",
            primaryCategory = "Sabiduría",
            tags = "Sabiduría, Fe, Enfoque",
            practicalAdvice = "La verdadera inteligencia no es acumular datos, sino entender cómo actuar con justicia y bondad en cada momento.",
            actionPrompt = "Dedica 10 minutos hoy a una lectura que edifique tu mente en lugar de mirar redes sin rumbo."
        ),
        Verse(
            chapter = 2, verseNumber = 11,
            reference = "Proverbios 2:11",
            text = "El buen juicio te protegerá, y la prudencia cuidará de ti.",
            primaryCategory = "Disciplina",
            tags = "Disciplina, Sabiduría, Enfoque",
            practicalAdvice = "Pensar antes de actuar o hablar es el escudo más eficaz contra remordimientos y pérdidas.",
            actionPrompt = "Aplica la regla de esperar 24 horas antes de hacer una compra no planificada."
        ),

        // CAPÍTULO 3
        Verse(
            chapter = 3, verseNumber = 5, verseEndNumber = 6,
            reference = "Proverbios 3:5-6",
            text = "Confía en el Señor con todo tu corazón, y no te apoyes en tu propio entendimiento. Reconócelo en todos tus caminos, y él enderezará tus sendas.",
            primaryCategory = "Fe",
            tags = "Fe, Ansiedad, Enfoque, Sabiduría",
            practicalAdvice = "Cuando las cosas no salgan como planeaste, recuerda que tu perspectiva es limitada; descansar en Dios disipa la angustia.",
            actionPrompt = "Escribe la situación que más incertidumbre te genera hoy y declara en oración tu confianza en que Dios tiene el control."
        ),
        Verse(
            chapter = 3, verseNumber = 9, verseEndNumber = 10,
            reference = "Proverbios 3:9-10",
            text = "Honra al Señor con tus bienes y con las primicias de todos tus frutos; así tus graneros se llenarán con abundancia.",
            primaryCategory = "Finanzas",
            tags = "Finanzas, Generosidad, Fe",
            practicalAdvice = "La prosperidad con paz comienza cuando ponemos el dinero en su debido lugar como recurso y no como ídolo.",
            actionPrompt = "Separa hoy un monto, por pequeño que sea, para bendecir a alguien en necesidad o apoyar una causa noble."
        ),
        Verse(
            chapter = 3, verseNumber = 27,
            reference = "Proverbios 3:27",
            text = "No te nieges a hacer el bien a quien es debido, cuando esté en tu poder el hacerlo.",
            primaryCategory = "Generosidad",
            tags = "Generosidad, Relaciones, Finanzas",
            practicalAdvice = "Si tienes la oportunidad y la capacidad de aliviar la carga de alguien hoy, no lo postergues.",
            actionPrompt = "Haz una llamada de aliento o envía un mensaje con un gesto generoso a un amigo que pasa dificultades."
        ),

        // CAPÍTULO 4
        Verse(
            chapter = 4, verseNumber = 7,
            reference = "Proverbios 4:7",
            text = "La sabiduría ante todo; adquiere sabiduría; y sobre todas tus posesiones adquiere inteligencia.",
            primaryCategory = "Sabiduría",
            tags = "Sabiduría, Autoestima, Enfoque",
            practicalAdvice = "Las cosas materiales se desgastan o se pueden perder, pero la sabiduría y el carácter permanecen para siempre.",
            actionPrompt = "Elige aprender una habilidad nueva o escuchar un podcast edificante durante tu trayecto hoy."
        ),
        Verse(
            chapter = 4, verseNumber = 23,
            reference = "Proverbios 4:23",
            text = "Sobre toda cosa guardada, guarda tu corazón; porque de él mana la vida.",
            primaryCategory = "Salud",
            tags = "Salud, Ansiedad, Autoestima, Tentación",
            practicalAdvice = "Lo que dejas entrar a tu mente y emociones determina tu salud integral. Cuida lo que miras, escuchas y rumias.",
            actionPrompt = "Haz una desintoxicación de noticias o quejas por las próximas 3 horas para cuidar tu paz emocional."
        ),

        // CAPÍTULO 5
        Verse(
            chapter = 5, verseNumber = 21,
            reference = "Proverbios 5:21",
            text = "Los caminos del hombre están ante los ojos del Señor, y él observa todas sus sendas.",
            primaryCategory = "Tentación",
            tags = "Tentación, Fe, Disciplina",
            practicalAdvice = "La integridad es hacer lo correcto incluso cuando nadie nos está mirando.",
            actionPrompt = "Cumple hoy esa promesa pequeña que hiciste y que nadie recordaría si no la hicieras."
        ),

        // CAPÍTULO 6
        Verse(
            chapter = 6, verseNumber = 6, verseEndNumber = 8,
            reference = "Proverbios 6:6-8",
            text = "Ve a la hormiga, oh perezoso, mira sus caminos y sé sabio; la cual no teniendo capitán ni gobernador, prepara en el verano su comida.",
            primaryCategory = "Pereza",
            tags = "Pereza, Trabajo, Finanzas, Disciplina",
            practicalAdvice = "La iniciativa personal y el trabajo constante sin necesidad de supervisión son la clave del éxito duradero.",
            actionPrompt = "Completa esa tarea incómoda que has estado posponiendo antes de las 12 del mediodía."
        ),
        Verse(
            chapter = 6, verseNumber = 16, verseEndNumber = 19,
            reference = "Proverbios 6:16-19",
            text = "Seis cosas aborrece el Señor... los ojos altivos, la lengua mentirosa, las manos que derraman sangre inocente y el que siembra discordia.",
            primaryCategory = "Relaciones",
            tags = "Relaciones, Palabras, Enojo",
            practicalAdvice = "Ser constructor de paz en lugar de propagar chismes o rencores te convierte en un refugio para tu comunidad.",
            actionPrompt = "Si alguien empieza a hablar mal de un ausente hoy, cambia amablemente el tema o resalta algo positivo."
        ),

        // CAPÍTULO 7
        Verse(
            chapter = 7, verseNumber = 2,
            reference = "Proverbios 7:2",
            text = "Guarda mis mandamientos y vivirás, y mi ley como la niña de tus ojos.",
            primaryCategory = "Disciplina",
            tags = "Disciplina, Fe, Enfoque",
            practicalAdvice = "Proteger tus principios con el mismo cuidado que proteges tus ojos evitará tropiezos dolorosos.",
            actionPrompt = "Define una regla no negociable para tu día: no usar el teléfono en la mesa durante la comida familiar."
        ),

        // CAPÍTULO 8
        Verse(
            chapter = 8, verseNumber = 11,
            reference = "Proverbios 8:11",
            text = "Porque mejor es la sabiduría que las piedras preciosas; y todo lo que se puede desear no es de comparar con ella.",
            primaryCategory = "Sabiduría",
            tags = "Sabiduría, Finanzas, Autoestima",
            practicalAdvice = "Tu mayor activo no está en tu cuenta bancaria sino en tu capacidad de discernir con sensatez y rectitud.",
            actionPrompt = "Agradece a una persona sabia que haya sido mentora o consejera en tu vida enviándole un breve saludo."
        ),

        // CAPÍTULO 9
        Verse(
            chapter = 9, verseNumber = 9,
            reference = "Proverbios 9:9",
            text = "Instruye al sabio, y se hará más sabio; enseña al justo, y aumentará su saber.",
            primaryCategory = "Autoestima",
            tags = "Autoestima, Disciplina, Sabiduría",
            practicalAdvice = "Las personas seguras de sí mismas no se ofenden cuando reciben una corrección constructiva; la aprovechan para crecer.",
            actionPrompt = "Pide retroalimentación honesta a un colega o familiar sobre un área en la que puedas mejorar."
        ),

        // CAPÍTULO 10
        Verse(
            chapter = 10, verseNumber = 4,
            reference = "Proverbios 10:4",
            text = "Las manos ociosas conducen a la pobreza; las manos diligentes traen riqueza.",
            primaryCategory = "Trabajo",
            tags = "Trabajo, Finanzas, Pereza, Disciplina",
            practicalAdvice = "El trabajo honesto y con entrega diaria es el camino más sólido hacia la estabilidad y el fruto.",
            actionPrompt = "Realiza tu labor hoy con esmero de excelencia, como si fuera para Dios y no solo para un jefe."
        ),
        Verse(
            chapter = 10, verseNumber = 12,
            reference = "Proverbios 10:12",
            text = "El odio despierta rencillas; pero el amor cubrirá todas las faltas.",
            primaryCategory = "Relaciones",
            tags = "Relaciones, Enojo, Familia",
            practicalAdvice = "Perdonar los errores ajenos no minimiza el daño, pero libera tu corazón del veneno de la amargura.",
            actionPrompt = "Decide perdonar conscientemente a quien te haya incomodado hoy en el tráfico o en el trabajo."
        ),
        Verse(
            chapter = 10, verseNumber = 19,
            reference = "Proverbios 10:19",
            text = "En las muchas palabras no falta el pecado; pero el que refrena sus labios es prudente.",
            primaryCategory = "Palabras",
            tags = "Palabras, Enojo, Sabiduría",
            practicalAdvice = "Hablar menos y escuchar más te otorga autoridad moral y evita malos entendidos innecesarios.",
            actionPrompt = "Practica la escucha activa hoy: deja que los demás terminen de hablar antes de intervenir."
        ),

        // CAPÍTULO 11
        Verse(
            chapter = 11, verseNumber = 1,
            reference = "Proverbios 11:1",
            text = "El Señor aborrece las balanzas falsas, pero le agradan las pesas exactas.",
            primaryCategory = "Finanzas",
            tags = "Finanzas, Trabajo, Fe",
            practicalAdvice = "La honestidad radical en tus negocios y tratos diarios construye una reputación intachable a largo plazo.",
            actionPrompt = "Revisa que en tus cuentas o compromisos laborales todo esté claro, transparente y al día."
        ),
        Verse(
            chapter = 11, verseNumber = 24, verseEndNumber = 25,
            reference = "Proverbios 11:24-25",
            text = "Hay quienes reparten, y les es añadido más; y hay quienes retienen más de lo que es justo, pero vienen a pobreza. El alma generosa será prosperada.",
            primaryCategory = "Generosidad",
            tags = "Generosidad, Finanzas, Fe",
            practicalAdvice = "La tacañería contrae la vida; la generosidad ensancha el corazón y abre puertas de bendición insospechadas.",
            actionPrompt = "Invita a un café o ayuda con el pasaje a una persona que notes cansada o necesitada."
        ),

        // CAPÍTULO 12
        Verse(
            chapter = 12, verseNumber = 18,
            reference = "Proverbios 12:18",
            text = "Hay hombres cuyas palabras son como golpes de espada; mas la lengua de los sabios es medicina.",
            primaryCategory = "Palabras",
            tags = "Palabras, Relaciones, Salud",
            practicalAdvice = "Tus palabras tienen el poder de sanar o herir profundamente. Usa tu voz como un bálsamo de esperanza.",
            actionPrompt = "Expresa una palabra sincera de aprecio y gratitud a tu cónyuge, hijo, padre o compañero de trabajo."
        ),
        Verse(
            chapter = 12, verseNumber = 25,
            reference = "Proverbios 12:25",
            text = "La angustia en el corazón del hombre lo deprime; pero la buena palabra lo alegra.",
            primaryCategory = "Ansiedad",
            tags = "Ansiedad, Palabras, Salud",
            practicalAdvice = "Una palabra amable en el momento oportuno puede levantar a alguien que está a punto de rendirse.",
            actionPrompt = "Envía un mensaje edificante a esa persona de tu lista de contactos que sabes que atraviesa un duelo o crisis."
        ),

        // CAPÍTULO 13
        Verse(
            chapter = 13, verseNumber = 11,
            reference = "Proverbios 13:11",
            text = "Las riquezas de vanidad disminuirán; pero el que recoge con mano laboriosa las aumentará.",
            primaryCategory = "Finanzas",
            tags = "Finanzas, Trabajo, Disciplina",
            practicalAdvice = "El dinero que llega por atajos rápidos suele esfumarse; el fruto del ahorro y esfuerzo constante edifica futuro.",
            actionPrompt = "Evita cualquier propuesta de ganancias 'fáciles o milagrosas' y enfócate en tu presupuesto semanal."
        ),
        Verse(
            chapter = 13, verseNumber = 20,
            reference = "Proverbios 13:20",
            text = "El que anda con sabios, sabio será; mas el que se junta con necios será quebrantado.",
            primaryCategory = "Relaciones",
            tags = "Relaciones, Enfoque, Sabiduría",
            practicalAdvice = "Te conviertes en el promedio de las personas con quienes más tiempo pasas. Elige círculos que te inspiren a ser mejor.",
            actionPrompt = "Busca la compañía de personas con hábitos nobles y valores que admires."
        ),

        // CAPÍTULO 14
        Verse(
            chapter = 14, verseNumber = 29,
            reference = "Proverbios 14:29",
            text = "El que tarda en airarse es grande de entendimiento; mas el que es impaciente de espíritu enaltece la necedad.",
            primaryCategory = "Enojo",
            tags = "Enojo, Disciplina, Sabiduría",
            practicalAdvice = "La calma no es debilidad sino dominio propio superior. Contar hasta diez salva amistades y matrimonios.",
            actionPrompt = "Si sientes que la ira sube hoy, sal a caminar unos minutos antes de responder cualquier mensaje o reclamo."
        ),
        Verse(
            chapter = 14, verseNumber = 30,
            reference = "Proverbios 14:30",
            text = "El corazón apacible es vida de la carne; mas la envidia es carcoma de los huesos.",
            primaryCategory = "Salud",
            tags = "Salud, Ansiedad, Autoestima",
            practicalAdvice = "Compararte con otros enferma tu cuerpo y desgasta tu paz. Celebra los logros ajenos y agradece los tuyos.",
            actionPrompt = "Anota tres bendiciones o dones que posees hoy y agradece de corazón por tu propio proceso de vida."
        ),

        // CAPÍTULO 15
        Verse(
            chapter = 15, verseNumber = 1,
            reference = "Proverbios 15:1",
            text = "La blanda respuesta quita la ira; mas la palabra áspera hace subir el furor.",
            primaryCategory = "Enojo",
            tags = "Enojo, Palabras, Relaciones",
            practicalAdvice = "Bajar el tono de voz ante una discusión desarma cualquier conflicto y abre espacio a la reconciliación.",
            actionPrompt = "Cuando alguien te hable con dureza hoy, responde con serenidad y tono suave. Observa el cambio inmediato."
        ),
        Verse(
            chapter = 15, verseNumber = 16,
            reference = "Proverbios 15:16",
            text = "Mejor es lo poco con el temor del Señor, que el gran tesoro donde hay turbación.",
            primaryCategory = "Finanzas",
            tags = "Finanzas, Ansiedad, Fe",
            practicalAdvice = "Tener tranquilidad en el hogar vale más que cualquier lujo obtenido al costo de estrés y pleitos continuos.",
            actionPrompt = "Aprecia la sencillez de una comida en familia sin pantallas encendidas."
        ),
        Verse(
            chapter = 15, verseNumber = 22,
            reference = "Proverbios 15:22",
            text = "Los pensamientos son frustrados donde no hay consejo; mas en la multitud de consejeros se afirman.",
            primaryCategory = "Enfoque",
            tags = "Enfoque, Sabiduría, Relaciones",
            practicalAdvice = "No tomes decisiones cruciales en soledad; busca la perspectiva de personas con experiencia y principios firmes.",
            actionPrompt = "Antes de emprender un cambio relevante, consúltalo con una persona sabia y objetiva."
        ),

        // CAPÍTULO 16
        Verse(
            chapter = 16, verseNumber = 3,
            reference = "Proverbios 16:3",
            text = "Encomienda al Señor tus obras, y tus pensamientos serán afirmados.",
            primaryCategory = "Enfoque",
            tags = "Enfoque, Fe, Trabajo",
            practicalAdvice = "Cuando consagras tus proyectos con un propósito de servicio a Dios y al prójimo, tus metas cobran claridad.",
            actionPrompt = "Pon en oración los proyectos de esta semana, pidiendo que tu trabajo sea de beneficio para otros."
        ),
        Verse(
            chapter = 16, verseNumber = 18,
            reference = "Proverbios 16:18",
            text = "Antes del quebranto es la soberbia, y antes de la caída la altivez de espíritu.",
            primaryCategory = "Autoestima",
            tags = "Autoestima, Sabiduría, Disciplina",
            practicalAdvice = "El orgullo ciega ante los peligros evidentes. Mantener una actitud humilde y enseñable es tu mejor salvaguarda.",
            actionPrompt = "Reconoce abiertamente un error si te equivocaste hoy y pide disculpas sin excusas."
        ),
        Verse(
            chapter = 16, verseNumber = 32,
            reference = "Proverbios 16:32",
            text = "Mejor es el que tarda en airarse que el fuerte; y el que se enseñorea de su espíritu, que el que toma una ciudad.",
            primaryCategory = "Disciplina",
            tags = "Disciplina, Enojo, Autoestima",
            practicalAdvice = "La mayor victoria no es vencer a rivales externos sino conquistarte a ti mismo y a tus impulsos.",
            actionPrompt = "Vence un impulso de gratificación inmediata (un dulce extra, una respuesta impulsiva) con autodominio."
        ),

        // CAPÍTULO 17
        Verse(
            chapter = 17, verseNumber = 17,
            reference = "Proverbios 17:17",
            text = "En todo tiempo ama el amigo, y es como un hermano en tiempo de angustia.",
            primaryCategory = "Relaciones",
            tags = "Relaciones, Familia, Fe",
            practicalAdvice = "La verdadera amistad se prueba en las tormentas de la vida, no solo en las fiestas y celebraciones.",
            actionPrompt = "Ponte a disposición de ese amigo que sabes que está atravesando un momento de dolor o enfermedad."
        ),
        Verse(
            chapter = 17, verseNumber = 22,
            reference = "Proverbios 17:22",
            text = "El corazón alegre constituye buen remedio; mas el espíritu triste seca los huesos.",
            primaryCategory = "Salud",
            tags = "Salud, Ansiedad, Autoestima",
            practicalAdvice = "El buen humor y el agradecimiento fortalecen tu sistema inmunológico y renuevan tus fuerzas vitales.",
            actionPrompt = "Sonríe deliberadamente, ríe con tus seres queridos y encuentra motivos de dicha en las cosas cotidianas."
        ),

        // CAPÍTULO 18
        Verse(
            chapter = 18, verseNumber = 10,
            reference = "Proverbios 18:10",
            text = "Torre fuerte es el nombre del Señor; a él correrá el justo, y será levantado.",
            primaryCategory = "Ansiedad",
            tags = "Ansiedad, Fe, Autoestima",
            practicalAdvice = "Cuando las noticias alarmen tu entorno, recuerda cuál es tu refugio inamovible de seguridad espiritual.",
            actionPrompt = "Repite este versículo en tu mente cada vez que sientas que la incertidumbre quiere robarte el aliento."
        ),
        Verse(
            chapter = 18, verseNumber = 21,
            reference = "Proverbios 18:21",
            text = "La muerte y la vida están en poder de la lengua, y el que la ama comerá de sus frutos.",
            primaryCategory = "Palabras",
            tags = "Palabras, Salud, Relaciones",
            practicalAdvice = "Lo que declaras sobre tus hijos, tu salud y tu futuro tiene un impacto real. Habla vida, no maldición ni derrota.",
            actionPrompt = "Cancela cualquier frase de autorreproche ('no sirvo para esto') y reemplázala por palabras de fe y avance."
        ),

        // CAPÍTULO 19
        Verse(
            chapter = 19, verseNumber = 17,
            reference = "Proverbios 19:17",
            text = "A Dios presta el que da al pobre, y el bien que ha hecho, se lo volverá a pagar.",
            primaryCategory = "Generosidad",
            tags = "Generosidad, Finanzas, Fe",
            practicalAdvice = "Invertir en ayudar a los más necesitados es el acto financiero de mayor rendimiento para el alma.",
            actionPrompt = "Comparte una porción de tu alimento o un abrigo con una persona en situación vulnerable."
        ),
        Verse(
            chapter = 19, verseNumber = 21,
            reference = "Proverbios 19:21",
            text = "Muchos pensamientos hay en el corazón del hombre; mas el consejo del Señor permanecerá.",
            primaryCategory = "Enfoque",
            tags = "Enfoque, Fe, Sabiduría",
            practicalAdvice = "Podemos trazar cientos de planes, pero estar alineados con la voluntad de Dios es lo único que garantiza permanencia.",
            actionPrompt = "Revisa si tus metas actuales honran a tu familia y tus principios más profundos."
        ),

        // CAPÍTULO 20
        Verse(
            chapter = 20, verseNumber = 4,
            reference = "Proverbios 20:4",
            text = "El perezoso no ara a causa del invierno; pedirá, pues, en la siega, y no hallará.",
            primaryCategory = "Pereza",
            tags = "Pereza, Trabajo, Finanzas",
            practicalAdvice = "Esperar las 'condiciones perfectas' para actuar es solo una excusa sofisticada para la inacción.",
            actionPrompt = "Empieza hoy mismo ese proyecto o rutina física, sin esperar al próximo lunes ni a un clima ideal."
        ),
        Verse(
            chapter = 20, verseNumber = 7,
            reference = "Proverbios 20:7",
            text = "Camina en su integridad el justo; ¡cuán dichosos son sus hijos después de él!",
            primaryCategory = "Familia",
            tags = "Familia, Autoestima, Fe",
            practicalAdvice = "La mejor herencia que puedes dejar a tus hijos no es dinero, sino el ejemplo de una vida íntegra y transparente.",
            actionPrompt = "Dedica tiempo exclusivo y de calidad a tus hijos o familiares cercanos hoy, escuchando sus anhelos."
        ),

        // CAPÍTULO 21
        Verse(
            chapter = 21, verseNumber = 5,
            reference = "Proverbios 21:5",
            text = "Los pensamientos del diligente ciertamente tienden a la abundancia; mas todo el que se apresura alocadamente, de cierto va a la pobreza.",
            primaryCategory = "Finanzas",
            tags = "Finanzas, Enfoque, Trabajo",
            practicalAdvice = "La planificación paciente y ordenada vence a la prisa impulsiva en cualquier aspecto de la vida.",
            actionPrompt = "Elabora una lista con tus gastos fijos del mes y busca un rubro prescindible para empezar a ahorrar."
        ),
        Verse(
            chapter = 21, verseNumber = 23,
            reference = "Proverbios 21:23",
            text = "El que guarda su boca y su lengua, su alma guarda de angustias.",
            primaryCategory = "Palabras",
            tags = "Palabras, Ansiedad, Disciplina",
            practicalAdvice = "Gran parte de nuestras angustias nacen de opiniones innecesarias expresadas sin medir consecuencias.",
            actionPrompt = "Guarda silencio si no tienes algo constructivo que aportar en una conversación tensa."
        ),

        // CAPÍTULO 22
        Verse(
            chapter = 22, verseNumber = 1,
            reference = "Proverbios 22:1",
            text = "De más estima es el buen nombre que las muchas riquezas, y la buena fama más que la plata y el oro.",
            primaryCategory = "Autoestima",
            tags = "Autoestima, Finanzas, Fe",
            practicalAdvice = "Tu reputación de honradez vale mucho más que cualquier ganancia rápida obtenida con trampas.",
            actionPrompt = "Cumple puntualmente tu palabra en el horario y condiciones acordadas con clientes o amigos."
        ),
        Verse(
            chapter = 22, verseNumber = 6,
            reference = "Proverbios 22:6",
            text = "Instruye al niño en su camino, y aun cuando fuere viejo no se apartará de él.",
            primaryCategory = "Familia",
            tags = "Familia, Disciplina, Sabiduría",
            practicalAdvice = "Los valores inculcados con amor y coherencia en la infancia son cimientos que resisten toda tormenta futura.",
            actionPrompt = "Enseña a un niño cercano una lección práctica sobre compartir o decir la verdad con amabilidad."
        ),
        Verse(
            chapter = 22, verseNumber = 7,
            reference = "Proverbios 22:7",
            text = "El rico se enseñorea de los pobres, y el que toma prestado es siervo del que presta.",
            primaryCategory = "Finanzas",
            tags = "Finanzas, Disciplina, Enfoque",
            practicalAdvice = "Las deudas innecesarias de consumo te atan. La libertad financiera es fruto de vivir dentro de tus posibilidades.",
            actionPrompt = "Traza un plan agresivo para pagar tu deuda con el interés más alto primero."
        ),

        // CAPÍTULO 23
        Verse(
            chapter = 23, verseNumber = 4, verseEndNumber = 5,
            reference = "Proverbios 23:4-5",
            text = "No te afanes por hacerte rico; sé prudente, y desiste. ¿Has de poner tus ojos en las riquezas, siendo ningunas?",
            primaryCategory = "Finanzas",
            tags = "Finanzas, Ansiedad, Enfoque",
            practicalAdvice = "No sacrifiques tu salud ni a tu familia en la carrera desesperada por amasar bienes efímeros.",
            actionPrompt = "Establece un límite de hora para desconectarte del trabajo y disfrutar de tu hogar hoy."
        ),
        Verse(
            chapter = 23, verseNumber = 23,
            reference = "Proverbios 23:23",
            text = "Compra la verdad, y no la vendas; la sabiduría, la enseñanza y la inteligencia.",
            primaryCategory = "Sabiduría",
            tags = "Sabiduría, Enfoque, Autoestima",
            practicalAdvice = "Invierte tiempo y recursos en tu formación ética y espiritual; es el único tesoro inagotable.",
            actionPrompt = "Lee un capítulo de Proverbios completo y anota una frase que guíe tu conducta hoy."
        ),

        // CAPÍTULO 24
        Verse(
            chapter = 24, verseNumber = 10,
            reference = "Proverbios 24:10",
            text = "Si eres débil en el día de aflicción, tu fuerza es reducida.",
            primaryCategory = "Disciplina",
            tags = "Disciplina, Autoestima, Ansiedad",
            practicalAdvice = "La fortaleza interior se entrena en los días normales para que en la adversidad no te desplomes.",
            actionPrompt = "Frente a un tropiezo hoy, sacúdete el desánimo, levanta la cabeza y sigue adelante con fe renovada."
        ),
        Verse(
            chapter = 24, verseNumber = 16,
            reference = "Proverbios 24:16",
            text = "Porque siete veces cae el justo, y vuelve a levantarse; mas los impíos caerán en el mal.",
            primaryCategory = "Autoestima",
            tags = "Autoestima, Fe, Disciplina",
            practicalAdvice = "Caer no te hace un fracasado; lo que define tu destino es tu determinación de levantarte una vez más.",
            actionPrompt = "Si fallaste en un buen propósito esta semana, perdónate y reinicia hoy con humildad."
        ),

        // CAPÍTULO 25
        Verse(
            chapter = 25, verseNumber = 11,
            reference = "Proverbios 25:11",
            text = "Manzana de oro con figuras de plata es la palabra dicha como conviene.",
            primaryCategory = "Palabras",
            tags = "Palabras, Relaciones, Sabiduría",
            practicalAdvice = "Decir lo correcto en el momento exacto y con el tono adecuado es una obra de arte en la convivencia.",
            actionPrompt = "Espera el momento oportuno para dar esa sugerencia importante a tu compañero o pareja."
        ),
        Verse(
            chapter = 25, verseNumber = 28,
            reference = "Proverbios 25:28",
            text = "Como ciudad derribada y sin muro es el hombre cuyo espíritu no tiene rienda.",
            primaryCategory = "Disciplina",
            tags = "Disciplina, Tentación, Enojo",
            practicalAdvice = "Quien carece de dominio propio está a merced de cualquier tentación o provocación externa.",
            actionPrompt = "Mantén la serenidad y no te dejes arrastrar por provocaciones en discusiones de internet o tráfico."
        ),

        // CAPÍTULO 26
        Verse(
            chapter = 26, verseNumber = 20,
            reference = "Proverbios 26:20",
            text = "Sin leña se apaga el fuego, y donde no hay chismoso, cesa la contienda.",
            primaryCategory = "Relaciones",
            tags = "Relaciones, Palabras, Enojo",
            practicalAdvice = "Los pleitos solo crecen si alguien sigue arrojando leña. Si tú decides no repetir rumores, el fuego se apaga.",
            actionPrompt = "Sé la tumba de los rumores que lleguen a tus oídos hoy; no reenvíes cadenas ni chismes."
        ),

        // CAPÍTULO 27
        Verse(
            chapter = 27, verseNumber = 1,
            reference = "Proverbios 27:1",
            text = "No te jactes del día de mañana; porque no sabes qué dará de sí el día.",
            primaryCategory = "Ansiedad",
            tags = "Ansiedad, Enfoque, Humildad",
            practicalAdvice = "Vive el presente con agradecimiento y diligencia. No sufras por el futuro que aún no ha llegado.",
            actionPrompt = "Enfócate con plenitud en cumplir los deberes de este día, confiando el mañana a Dios."
        ),
        Verse(
            chapter = 27, verseNumber = 17,
            reference = "Proverbios 27:17",
            text = "Hierro con hierro se aguza; y así el hombre aguza el rostro de su amigo.",
            primaryCategory = "Relaciones",
            tags = "Relaciones, Sabiduría, Crecimiento",
            practicalAdvice = "Las conversaciones profundas y sinceras con verdaderos amigos pulen tu carácter y amplían tu entendimiento.",
            actionPrompt = "Agenda un café o charla con un amigo leal para conversar sobre metas y crecimiento personal."
        ),

        // CAPÍTULO 28
        Verse(
            chapter = 28, verseNumber = 13,
            reference = "Proverbios 28:13",
            text = "El que encubre sus pecados no prosperará; mas el que los confiesa y se aparta alcanzará misericordia.",
            primaryCategory = "Tentación",
            tags = "Tentación, Autoestima, Fe",
            practicalAdvice = "Ocultar tus fallas solo prolonga la culpa. La transparencia y el cambio genuino traen alivio profundo.",
            actionPrompt = "Sé honesto contigo mismo y con Dios sobre una debilidad recurrente y pide ayuda para superarla."
        ),
        Verse(
            chapter = 28, verseNumber = 27,
            reference = "Proverbios 28:27",
            text = "El que da al pobre no tendrá pobreza; mas el que aparta sus ojos tendrá muchas maldiciones.",
            primaryCategory = "Generosidad",
            tags = "Generosidad, Finanzas, Fe",
            practicalAdvice = "No cierres los ojos ante el dolor ajeno. La generosidad activa es un imán de bendiciones.",
            actionPrompt = "Lleva contigo una merienda extra para entregar a alguien que esté trabajando en la calle."
        ),

        // CAPÍTULO 29
        Verse(
            chapter = 29, verseNumber = 11,
            reference = "Proverbios 29:11",
            text = "El necio da rienda suelta a toda su ira, mas el sabio al fin la sosiega.",
            primaryCategory = "Enojo",
            tags = "Enojo, Disciplina, Sabiduría",
            practicalAdvice = "Expresar la furia sin filtro no es ser 'auténtico', es ser destructivo. El sabio canaliza sus emociones con cordura.",
            actionPrompt = "Si te enojas hoy, no envíes ese correo ni ese audio; espera que baje la adrenalina."
        ),
        Verse(
            chapter = 29, verseNumber = 18,
            reference = "Proverbios 29:18",
            text = "Donde no hay visión, el pueblo se extravía; pero dichoso el que guarda la ley.",
            primaryCategory = "Enfoque",
            tags = "Enfoque, Sabiduría, Disciplina",
            practicalAdvice = "Tener una visión clara de quién quieres ser y qué valores defiendes te protege de desviarte en el camino.",
            actionPrompt = "Escribe tu propósito principal para este año en una sola frase y colócala a la vista."
        ),

        // CAPÍTULO 30
        Verse(
            chapter = 30, verseNumber = 5,
            reference = "Proverbios 30:5",
            text = "Toda palabra de Dios es limpia; él es escudo a los que en él esperan.",
            primaryCategory = "Fe",
            tags = "Fe, Ansiedad, Sabiduría",
            practicalAdvice = "Las promesas divinas son sólidas como la roca. Aférrate a ellas cuando las circunstancias parezcan vacilantes.",
            actionPrompt = "Memoriza esta frase: 'Dios es mi escudo y mi refugio hoy'."
        ),
        Verse(
            chapter = 30, verseNumber = 8, verseEndNumber = 9,
            reference = "Proverbios 30:8-9",
            text = "No me des pobreza ni riquezas; mantenme del pan necesario; no sea que me sacie y te niegue, o siendo pobre, hurte.",
            primaryCategory = "Finanzas",
            tags = "Finanzas, Autoestima, Fe",
            practicalAdvice = "El contentamiento con lo suficiente es la mayor fuente de felicidad y equilibrio espiritual.",
            actionPrompt = "Aprecia hoy todo lo que ya tienes antes de desear lo que crees que te falta."
        ),

        // CAPÍTULO 31
        Verse(
            chapter = 31, verseNumber = 8, verseEndNumber = 9,
            reference = "Proverbios 31:8-9",
            text = "Abre tu boca por el mudo en el juicio de todos los desvalidos. Abre tu boca, juzga con justicia, y defiende la causa del pobre y del menesteroso.",
            primaryCategory = "Generosidad",
            tags = "Generosidad, Relaciones, Fe",
            practicalAdvice = "El liderazgo genuino se ejerce defendiendo a los que no tienen voz y promoviendo la equidad.",
            actionPrompt = "Usa tu influencia para apoyar a un compañero que esté siendo tratado injustamente."
        ),
        Verse(
            chapter = 31, verseNumber = 25,
            reference = "Proverbios 31:25",
            text = "Fuerza y honor son su vestidura; y se ríe de lo por venir.",
            primaryCategory = "Autoestima",
            tags = "Autoestima, Ansiedad, Disciplina",
            practicalAdvice = "Cuando cultivas fortaleza de carácter e integridad, puedes mirar el futuro con confianza serena y sin terror.",
            actionPrompt = "Mírate al espejo con aprecio y recuerda que tu valor descansa en tu dignidad como criatura de Dios."
        ),
        Verse(
            chapter = 31, verseNumber = 30,
            reference = "Proverbios 31:30",
            text = "Engañosa es la gracia, y vana la hermosura; la persona que teme al Señor, esa será alabada.",
            primaryCategory = "Autoestima",
            tags = "Autoestima, Familia, Sabiduría",
            practicalAdvice = "La belleza física cambia con los años, pero un corazón bondadoso y reverente brilla con luz inextinguible.",
            actionPrompt = "Elogia hoy a alguien por su gentileza, paciencia o sabiduría, más allá de su apariencia exterior."
        )
    )

    fun getHabitChallenges(): List<HabitChallenge> = listOf(
        HabitChallenge(
            id = "finanzas",
            title = "Finanzas en Paz y Mayordomía",
            category = "Finanzas",
            description = "Aprende a gestionar tus recursos con sabiduría bíblica, orden y generosidad en 7 días.",
            days = listOf(
                HabitDay(
                    dayNumber = 1,
                    title = "El Origen de los Recursos",
                    verseReference = "Proverbios 3:9-10",
                    verseText = "Honra al Señor con tus bienes y con las primicias de todos tus frutos; así tus graneros se llenarán con abundancia.",
                    reflection = "El dinero es una herramienta para servir y prosperar, no un amo al cual rendirle nuestra paz.",
                    practicalTask = "Registra hoy todos los gastos que realices, sin omitir los gastos pequeños o cafés."
                ),
                HabitDay(
                    dayNumber = 2,
                    title = "Trabajo Diligente y Constante",
                    verseReference = "Proverbios 10:4",
                    verseText = "Las manos ociosas conducen a la pobreza; las manos diligentes traen riqueza.",
                    reflection = "La verdadera prosperidad se construye día a día con esfuerzo honesto y perseverancia.",
                    practicalTask = "Da un 10% más de esmero y dedicación en tu trabajo hoy, sin quejarte."
                ),
                HabitDay(
                    dayNumber = 3,
                    title = "Cero Negocios Ilusorios",
                    verseReference = "Proverbios 13:11",
                    verseText = "Las riquezas de vanidad disminuirán; pero el que recoge con mano laboriosa las aumentará.",
                    reflection = "Huye de las promesas de dinero fácil. El patrimonio sólido se acumula paso a paso.",
                    practicalTask = "Revisa suscripciones o compras impulsivas y cancela al menos un servicio innecesario."
                ),
                HabitDay(
                    dayNumber = 4,
                    title = "Planificación vs. Prisa",
                    verseReference = "Proverbios 21:5",
                    verseText = "Los pensamientos del diligente ciertamente tienden a la abundancia; mas el que se apresura alocadamente, va a la pobreza.",
                    reflection = "Un presupuesto no te quita libertad; al contrario, te da control y paz mental.",
                    practicalTask = "Elabora tu presupuesto estimado para la semana entrante con categorías claras."
                ),
                HabitDay(
                    dayNumber = 5,
                    title = "Libertad de Deudas",
                    verseReference = "Proverbios 22:7",
                    verseText = "El que toma prestado es siervo del que presta.",
                    reflection = "Estar endeudado limita tus decisiones y genera estrés continuo. La sobriedad trae tranquilidad.",
                    practicalTask = "Haz una lista de cualquier dinero que debas y fija un plan para cancelarlo cuanto antes."
                ),
                HabitDay(
                    dayNumber = 6,
                    title = "El Gozo de Dar",
                    verseReference = "Proverbios 11:24-25",
                    verseText = "Hay quienes reparten, y les es añadido más... El alma generosa será prosperada.",
                    reflection = "La generosidad rompe el espíritu de escasez y egoísmo en nuestro corazón.",
                    practicalTask = "Dona o regala algo de valor que no uses a alguien que realmente lo necesite."
                ),
                HabitDay(
                    dayNumber = 7,
                    title = "Contentamiento Sabio",
                    verseReference = "Proverbios 30:8-9",
                    verseText = "No me des pobreza ni riquezas; mantenme del pan necesario.",
                    reflection = "La persona más rica no es la que más tiene, sino la que sabe disfrutar lo suficiente con gratitud.",
                    practicalTask = "Agradece por tu hogar, comida y abrigo actuales antes de pensar en nuevas compras."
                )
            )
        ),

        HabitChallenge(
            id = "autoestima",
            title = "Autoestima e Identidad Sólida",
            category = "Autoestima",
            description = "Descubre tu verdadero valor ante Dios, libre de comparaciones y ataduras en 7 días.",
            days = listOf(
                HabitDay(
                    dayNumber = 1,
                    title = "Tu Valor Inalienable",
                    verseReference = "Proverbios 31:25",
                    verseText = "Fuerza y honor son su vestidura; y se ríe de lo por venir.",
                    reflection = "Tu dignidad no depende de las modas, las opiniones ajenas ni tu cuenta bancaria.",
                    practicalTask = "Escribe 3 cualidades de carácter que Dios te ha concedido y agradécelas."
                ),
                HabitDay(
                    dayNumber = 2,
                    title = "Vencer la Trampa de la Comparación",
                    verseReference = "Proverbios 14:30",
                    verseText = "El corazón apacible es vida de la carne; mas la envidia es carcoma de los huesos.",
                    reflection = "Medir tu proceso con el de otros te roba la alegría. Cada flor florece en su tiempo.",
                    practicalTask = "No mires perfiles de redes sociales que te generen envidia o sensación de inferioridad hoy."
                ),
                HabitDay(
                    dayNumber = 3,
                    title = "Aprender de las Correcciones",
                    verseReference = "Proverbios 9:9",
                    verseText = "Instruye al sabio, y se hará más sabio; enseña al justo, y aumentará su saber.",
                    reflection = "Una crítica no define quién eres; es solo una oportunidad para perfeccionar tu camino.",
                    practicalTask = "Agradece a alguien que te haya señalado un punto de mejora recientemente."
                ),
                HabitDay(
                    dayNumber = 4,
                    title = "Ponerse de Pie con Esperanza",
                    verseReference = "Proverbios 24:16",
                    verseText = "Porque siete veces cae el justo, y vuelve a levantarse.",
                    reflection = "Tus caídas pasadas no son tu destino final; son el entrenamiento de tu carácter.",
                    practicalTask = "Declara en voz alta que dejas ir los errores del pasado y comienzas con ánimo nuevo."
                ),
                HabitDay(
                    dayNumber = 5,
                    title = "Cuidar la Esencia Interior",
                    verseReference = "Proverbios 31:30",
                    verseText = "Engañosa es la gracia, y vana la hermosura; la persona que teme al Señor, esa será alabada.",
                    reflection = "Invierte más energía en embellecer tu alma y virtudes que en la aprobación superficial.",
                    practicalTask = "Haz un acto de bondad en secreto sin buscar reconocimiento alguno."
                ),
                HabitDay(
                    dayNumber = 6,
                    title = "Integridad como Escudo",
                    verseReference = "Proverbios 22:1",
                    verseText = "De más estima es el buen nombre que las muchas riquezas.",
                    reflection = "Dormir con la conciencia limpia da una seguridad que ningún lujo puede comprar.",
                    practicalTask = "Cumple puntualmente una promesa que diste por sentada."
                ),
                HabitDay(
                    dayNumber = 7,
                    title = "Mirar al Futuro con Fe",
                    verseReference = "Proverbios 3:26",
                    verseText = "Porque el Señor será tu confianza, y él preservará tu pie de quedar preso.",
                    reflection = "Con Dios a tu lado, nada de lo que venga podrá arrebatar tu propósito de vida.",
                    practicalTask = "Inicia el día con una afirmación de fe y da un abrazo sincero a un ser querido."
                )
            )
        ),

        HabitChallenge(
            id = "enfoque",
            title = "Enfoque, Propósito y Disciplina",
            category = "Enfoque",
            description = "Elimina la dispersión mental y avanza con determinación hacia tus metas prioritarias.",
            days = listOf(
                HabitDay(
                    dayNumber = 1,
                    title = "Claridad de Metas",
                    verseReference = "Proverbios 29:18",
                    verseText = "Donde no hay visión, el pueblo se extravía.",
                    reflection = "Sin un norte definido, cualquier viento nos arrastra. Define tus prioridades fundamentales.",
                    practicalTask = "Escribe tus 3 metas principales para este mes y ponlas como fondo de pantalla."
                ),
                HabitDay(
                    dayNumber = 2,
                    title = "Consagrar los Planes",
                    verseReference = "Proverbios 16:3",
                    verseText = "Encomienda al Señor tus obras, y tus pensamientos serán afirmados.",
                    reflection = "Poner tus proyectos en manos de Dios alinea tus motivaciones con el bien común.",
                    practicalTask = "Dedica 5 minutos a orar pidiendo sabiduría antes de empezar tu jornada."
                ),
                HabitDay(
                    dayNumber = 3,
                    title = "Buscar Consejo Oportuno",
                    verseReference = "Proverbios 15:22",
                    verseText = "Los pensamientos son frustrados donde no hay consejo; mas en la multitud de consejeros se afirman.",
                    reflection = "Los ojos externos detectan los puntos ciegos que nosotros pasamos por alto.",
                    practicalTask = "Consulta una decisión laboral o personal con una persona con experiencia y madurez."
                ),
                HabitDay(
                    dayNumber = 4,
                    title = "Vencer la Postergación",
                    verseReference = "Proverbios 6:6-8",
                    verseText = "Ve a la hormiga, oh perezoso, mira sus caminos y sé sabio.",
                    reflection = "Hacer las cosas difíciles primero libera energía mental para el resto de la jornada.",
                    practicalTask = "Aplica la técnica Pomodoro (25 minutos de enfoque total sin teléfono) en tu tarea más difícil."
                ),
                HabitDay(
                    dayNumber = 5,
                    title = "Cuidar las Avenidas de la Mente",
                    verseReference = "Proverbios 4:23",
                    verseText = "Sobre toda cosa guardada, guarda tu corazón; porque de él mana la vida.",
                    reflection = "El exceso de información irrelevante agota tu capacidad de concentración.",
                    practicalTask = "Silencia las notificaciones no esenciales de tu teléfono durante todo el día."
                ),
                HabitDay(
                    dayNumber = 6,
                    title = "Dominio del Impulso",
                    verseReference = "Proverbios 25:28",
                    verseText = "Como ciudad derribada y sin muro es el hombre cuyo espíritu no tiene rienda.",
                    reflection = "Aprender a decirte 'no' a ti mismo construye músculo de voluntad para resistir tentaciones.",
                    practicalTask = "Renuncia hoy a una distracción habitual para dedicar ese tiempo a tu lectura o familia."
                ),
                HabitDay(
                    dayNumber = 7,
                    title = "Perseverancia Inquebrantable",
                    verseReference = "Proverbios 24:10",
                    verseText = "Si eres débil en el día de aflicción, tu fuerza es reducida.",
                    reflection = "Los hábitos diarios sencillos son los que sostienen grandes obras a lo largo de los años.",
                    practicalTask = "Revisa los 7 días completados y celebra tu avance con determinación de seguir creciendo."
                )
            )
        ),

        HabitChallenge(
            id = "ansiedad",
            title = "Paz Interior contra la Ansiedad",
            category = "Ansiedad",
            description = "Cultiva serenidad, descanso mental y confianza en medio de las presiones cotidianas.",
            days = listOf(
                HabitDay(
                    dayNumber = 1,
                    title = "Soltar el Control Excesivo",
                    verseReference = "Proverbios 3:5-6",
                    verseText = "Confía en el Señor con todo tu corazón, y no te apoyes en tu propio entendimiento.",
                    reflection = "Gran parte de la angustia nace de intentar controlar lo que solo Dios puede guiar.",
                    practicalTask = "Haz una lista de lo que está fuera de tu control hoy y entrégalo en oración."
                ),
                HabitDay(
                    dayNumber = 2,
                    title = "Palabras que Sanan el Alma",
                    verseReference = "Proverbios 12:25",
                    verseText = "La angustia en el corazón del hombre lo deprime; pero la buena palabra lo alegra.",
                    reflection = "Alimentar tu mente con promesas y verdades reconfortantes cambia tu química cerebral.",
                    practicalTask = "Repite un versículo de paz cada vez que sientas taquicardia o inquietud."
                ),
                HabitDay(
                    dayNumber = 3,
                    title = "El Refugio Inconmovible",
                    verseReference = "Proverbios 18:10",
                    verseText = "Torre fuerte es el nombre del Señor; a él correrá el justo, y será levantado.",
                    reflection = "No estás desamparado. En medio de la tormenta existe una fortaleza para tu espíritu.",
                    practicalTask = "Sal a caminar 15 minutos al aire libre respirando profundamente y observando la naturaleza."
                ),
                HabitDay(
                    dayNumber = 4,
                    title = "La Alegría como Medicina",
                    verseReference = "Proverbios 17:22",
                    verseText = "El corazón alegre constituye buen remedio; mas el espíritu triste seca los huesos.",
                    reflection = "La risa sana y la ligereza de corazón son antídotos comprobados contra el agotamiento.",
                    practicalTask = "Escucha música que edifique tu ánimo y comparte un momento divertido con alguien."
                ),
                HabitDay(
                    dayNumber = 5,
                    title = "No Vivir en el Mañana",
                    verseReference = "Proverbios 27:1",
                    verseText = "No te jactes del día de mañana; porque no sabes qué dará de sí el día.",
                    reflection = "La mente ansiosa viaja al futuro catastrófico. La fe te ancla en el presente de Dios.",
                    practicalTask = "Concéntrate exclusivamente en lo que debes resolver hoy, hora por hora."
                ),
                HabitDay(
                    dayNumber = 6,
                    title = "Paz en la Convivencia",
                    verseReference = "Proverbios 15:16",
                    verseText = "Mejor es lo poco con el temor del Señor, que el gran tesoro donde hay turbación.",
                    reflection = "Prioriza la armonía en tu hogar por encima de cualquier afán de acumulación.",
                    practicalTask = "Cena en paz con tu familia o disfruta de un momento de silencio sin pantallas."
                ),
                HabitDay(
                    dayNumber = 7,
                    title = "Vivir en Seguridad Plena",
                    verseReference = "Proverbios 1:33",
                    verseText = "Pero el que me escuche vivirá seguro y tranquilo, sin temor a ningún mal.",
                    reflection = "La sabiduría bíblica produce raíces firmes que ninguna crisis puede arrancar.",
                    practicalTask = "Escribe una carta de gratitud a Dios por haberte sostenido hasta este día."
                )
            )
        ),

        HabitChallenge(
            id = "relaciones",
            title = "Relaciones Sabias y Saludables",
            category = "Relaciones",
            description = "Aprende a comunicarte, perdonar y construir amistades leales para toda la vida.",
            days = listOf(
                HabitDay(
                    dayNumber = 1,
                    title = "La Lealtad en la Adversidad",
                    verseReference = "Proverbios 17:17",
                    verseText = "En todo tiempo ama el amigo, y es como un hermano en tiempo de angustia.",
                    reflection = "Los amigos de verdad están en las malas, no solo cuando hay fiesta y provecho.",
                    practicalTask = "Envía un mensaje sincero a un amigo que no ves hace tiempo para saber cómo está."
                ),
                HabitDay(
                    dayNumber = 2,
                    title = "El Poder de la Respuesta Suave",
                    verseReference = "Proverbios 15:1",
                    verseText = "La blanda respuesta quita la ira; mas la palabra áspera hace subir el furor.",
                    reflection = "Responder con calma a un reclamo desactiva la bomba de la discordia.",
                    practicalTask = "Cuando sientas deseos de discutir hoy, haz una pausa y responde con serenidad."
                ),
                HabitDay(
                    dayNumber = 3,
                    title = "Elegir Sabias Compañías",
                    verseReference = "Proverbios 13:20",
                    verseText = "El que anda con sabios, sabio será; mas el que se junta con necios será quebrantado.",
                    reflection = "Tus amistades moldean tu carácter y tu futuro. Elige personas que te acerquen a tus valores.",
                    practicalTask = "Identifica qué relaciones suman paz a tu vida y procúralas más seguido."
                ),
                HabitDay(
                    dayNumber = 4,
                    title = "El Amor que Perdona y Cubre",
                    verseReference = "Proverbios 10:12",
                    verseText = "El odio despierta rencillas; pero el amor cubrirá todas las faltas.",
                    reflection = "Guardar rencor es tomar veneno esperando que el otro se muera. El perdón te hace libre.",
                    practicalTask = "Toma la decisión interior de perdonar una ofensa reciente y no recordarla más."
                ),
                HabitDay(
                    dayNumber = 5,
                    title = "Apagar el Fuego del Chisme",
                    verseReference = "Proverbios 26:20",
                    verseText = "Sin leña se apaga el fuego, y donde no hay chismoso, cesa la contienda.",
                    reflection = "Negarte a participar en murmuraciones salva hogares y ambientes laborales.",
                    practicalTask = "No repitas ningún rumor ni comentario despectivo sobre nadie durante este día."
                ),
                HabitDay(
                    dayNumber = 6,
                    title = "El Valor de la Corrección Leal",
                    verseReference = "Proverbios 27:17",
                    verseText = "Hierro con hierro se aguza; y así el hombre aguza el rostro de su amigo.",
                    reflection = "Un buen amigo te dice la verdad con amor aunque a veces duela.",
                    practicalTask = "Agradece a esa persona que te habló con honestidad para ayudarte a no errar."
                ),
                HabitDay(
                    dayNumber = 7,
                    title = "La Dulzura de las Palabras Médicas",
                    verseReference = "Proverbios 16:24",
                    verseText = "Panal de miel son los dichos suaves; suavidad al alma y medicina para los huesos.",
                    reflection = "Tus elogios y bendiciones son medicina para las heridas de quienes te rodean.",
                    practicalTask = "Expresa al menos tres cumplidos o palabras de aliento genuinas a familiares hoy."
                )
            )
        )
    )
}
