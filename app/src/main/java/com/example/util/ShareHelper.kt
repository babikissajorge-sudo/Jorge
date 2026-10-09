package com.example.util

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.RectF
import android.graphics.Shader
import android.graphics.Typeface
import android.text.Layout
import android.text.StaticLayout
import android.text.TextPaint
import androidx.core.content.FileProvider
import com.example.data.model.ChallengeJournalEntry
import com.example.data.model.HabitCertificate
import com.example.data.model.Verse
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStream
import android.content.ContentValues
import android.os.Build
import android.provider.MediaStore
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object ShareHelper {

    // =========================================================================
    // ENLACE DE DESCARGA DE LA APLICACIÓN
    // Aquí se debe pegar el enlace de descarga cuando la app esté publicada
    // =========================================================================
    const val APP_DOWNLOAD_LINK = "Próximamente disponible. Escríbeme para más información."

    /**
     * Retorna el mensaje formateado para compartir la aplicación.
     */
    fun getShareAppMessage(): String {
        return buildString {
            append("¡Hola! Te comparto esta app que está transformando mi vida: *Guía de Proverbios*.\n")
            append("Descárgala aquí: $APP_DOWNLOAD_LINK\n")
            append("¡Espero que te bendiga!")
        }
    }

    /**
     * Copia el enlace de descarga directamente al portapapeles del dispositivo.
     */
    fun copyDownloadLink(context: Context) {
        val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText("Enlace de descarga", APP_DOWNLOAD_LINK)
        clipboard.setPrimaryClip(clip)
        Toast.makeText(context, "Enlace copiado al portapapeles", Toast.LENGTH_SHORT).show()
    }

    fun shareApp(context: Context) {
        val shareBody = getShareAppMessage()

        val sendIntent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_SUBJECT, "Guía de Proverbios")
            putExtra(Intent.EXTRA_TEXT, shareBody)
        }
        val chooser = Intent.createChooser(sendIntent, "Compartir Guía de Proverbios")
        chooser.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(chooser)
    }

    fun shareVerseAsText(context: Context, verse: Verse) {
        val shareBody = buildString {
            append("✨ GUÍA DE PROVERBIOS ✨\n\n")
            append("«${verse.text}»\n\n")
            append("📖 ${verse.reference} (Nueva Biblia Viva - NBV)\n\n")
            append("💡 Aplicación práctica:\n")
            append("${verse.practicalAdvice}\n\n")
            append("🎯 Paso para hoy: ${verse.actionPrompt}\n\n")
            append("🌿 Descubre más en la app Guía de Proverbios")
        }

        val sendIntent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_SUBJECT, "Versículo de Proverbios - ${verse.reference}")
            putExtra(Intent.EXTRA_TEXT, shareBody)
        }
        val chooser = Intent.createChooser(sendIntent, "Compartir Proverbio")
        chooser.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(chooser)
    }

    fun shareVerseAsImage(context: Context, verse: Verse) {
        try {
            val bitmap = createVerseImageBitmap(verse)
            val cachePath = File(context.cacheDir, "shared_images")
            cachePath.mkdirs()
            val file = File(cachePath, "proverbio_${verse.chapter}_${verse.verseNumber}.png")
            FileOutputStream(file).use { out ->
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, out)
            }

            val contentUri = FileProvider.getUriForFile(
                context,
                "${context.packageName}.fileprovider",
                file
            )

            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                type = "image/png"
                putExtra(Intent.EXTRA_STREAM, contentUri)
                putExtra(
                    Intent.EXTRA_TEXT,
                    "«${verse.text}» — ${verse.reference} (NBV)\nCompartido desde Guía de Proverbios"
                )
                addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }

            val chooser = Intent.createChooser(shareIntent, "Compartir Imagen")
            chooser.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(chooser)
        } catch (e: Exception) {
            // Fallback to text if image rendering or sharing fails
            shareVerseAsText(context, verse)
        }
    }

    private fun createVerseImageBitmap(verse: Verse): Bitmap {
        val width = 1080
        val height = 1350
        val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)

        // Fondo con degradado cálido crema / lino
        val bgPaint = Paint().apply {
            shader = LinearGradient(
                0f, 0f, width.toFloat(), height.toFloat(),
                Color.parseColor("#FAF7F0"),
                Color.parseColor("#EFE9DC"),
                Shader.TileMode.CLAMP
            )
        }
        canvas.drawRect(0f, 0f, width.toFloat(), height.toFloat(), bgPaint)

        // Marco interior decorativo sutil
        val borderPaint = Paint().apply {
            style = Paint.Style.STROKE
            strokeWidth = 4f
            color = Color.parseColor("#D4C7B4")
            isAntiAlias = true
        }
        val innerMargin = 48f
        canvas.drawRoundRect(
            RectF(innerMargin, innerMargin, width - innerMargin, height - innerMargin),
            32f, 32f, borderPaint
        )

        // Cabecera: Categoría y App
        val headerPaint = TextPaint().apply {
            color = Color.parseColor("#2C553E")
            textSize = 34f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("✦ PROVERBIOS PARA LA VIDA ✦", width / 2f, 150f, headerPaint)

        val categoryPaint = TextPaint().apply {
            color = Color.parseColor("#8B5E28")
            textSize = 28f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.NORMAL)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("Tema: ${verse.primaryCategory.uppercase()}", width / 2f, 205f, categoryPaint)

        // Comilla ornamental
        val quoteMarkPaint = TextPaint().apply {
            color = Color.parseColor("#D9CEBE")
            textSize = 140f
            typeface = Typeface.create(Typeface.SERIF, Typeface.BOLD)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("“", width / 2f, 340f, quoteMarkPaint)

        // Texto del Versículo con StaticLayout para salto de línea
        val textPaint = TextPaint().apply {
            color = Color.parseColor("#1E221E")
            textSize = 46f
            typeface = Typeface.create(Typeface.SERIF, Typeface.NORMAL)
            isAntiAlias = true
        }

        val textWidth = width - 200
        val textLayout = StaticLayout.Builder
            .obtain(verse.text, 0, verse.text.length, textPaint, textWidth)
            .setAlignment(Layout.Alignment.ALIGN_CENTER)
            .setLineSpacing(14f, 1.25f)
            .build()

        canvas.save()
        val textStartY = 380f
        canvas.translate(100f, textStartY)
        textLayout.draw(canvas)
        canvas.restore()

        val textEndY = textStartY + textLayout.height

        // Cita Bíblica
        val refPaint = TextPaint().apply {
            color = Color.parseColor("#2C553E")
            textSize = 38f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText(verse.reference, width / 2f, textEndY + 70f, refPaint)

        val versionPaint = TextPaint().apply {
            color = Color.parseColor("#666D64")
            textSize = 24f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.ITALIC)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("Nueva Biblia Viva (NBV)", width / 2f, textEndY + 115f, versionPaint)

        // Tarjeta de consejo práctico abajo
        val cardTop = (textEndY + 170f).coerceAtMost(height - 350f)
        val cardRect = RectF(90f, cardTop, width - 90f, cardTop + 180f)
        val cardBgPaint = Paint().apply {
            color = Color.parseColor("#FFFFFF")
            style = Paint.Style.FILL
            isAntiAlias = true
            setShadowLayer(16f, 0f, 6f, Color.parseColor("#15000000"))
        }
        canvas.drawRoundRect(cardRect, 24f, 24f, cardBgPaint)

        val adviceHeaderPaint = TextPaint().apply {
            color = Color.parseColor("#8B5E28")
            textSize = 24f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
            isAntiAlias = true
        }
        canvas.drawText("💡 CONSEJO PARA HOY:", 120f, cardTop + 50f, adviceHeaderPaint)

        val adviceBodyPaint = TextPaint().apply {
            color = Color.parseColor("#373E35")
            textSize = 26f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.NORMAL)
            isAntiAlias = true
        }
        val adviceLayout = StaticLayout.Builder
            .obtain(verse.practicalAdvice, 0, verse.practicalAdvice.length, adviceBodyPaint, width - 240)
            .setAlignment(Layout.Alignment.ALIGN_NORMAL)
            .setMaxLines(3)
            .build()

        canvas.save()
        canvas.translate(120f, cardTop + 75f)
        adviceLayout.draw(canvas)
        canvas.restore()

        // Pie de página
        val footerPaint = TextPaint().apply {
            color = Color.parseColor("#7A8478")
            textSize = 22f
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("Sabiduría diaria para una vida plena • App gratuita y sin conexión", width / 2f, height - 80f, footerPaint)

        return bitmap
    }

    fun shareJournalEntryAsImage(
        context: Context,
        entry: ChallengeJournalEntry,
        challengeTitle: String
    ) {
        try {
            val bitmap = createJournalImageBitmap(entry, challengeTitle)
            val cachePath = File(context.cacheDir, "shared_images")
            cachePath.mkdirs()
            val file = File(cachePath, "bitacora_${entry.challengeId}_dia_${entry.dayNumber}.png")
            FileOutputStream(file).use { out ->
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, out)
            }

            val contentUri = FileProvider.getUriForFile(
                context,
                "${context.packageName}.fileprovider",
                file
            )

            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                type = "image/png"
                putExtra(Intent.EXTRA_STREAM, contentUri)
                putExtra(
                    Intent.EXTRA_TEXT,
                    "✨ Mi Bitácora del Reto: $challengeTitle (Día ${entry.dayNumber} de 66)\n" +
                    "Logros: ${entry.achievements}\n" +
                    (if (entry.verseText.isNotBlank()) "«${entry.verseText}» — ${entry.verseReference}\n\n" else "") +
                    "Compartido desde Guía de Proverbios"
                )
                addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }

            val chooser = Intent.createChooser(shareIntent, "Compartir Bitácora en Redes Sociales")
            chooser.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(chooser)
        } catch (e: Exception) {
            // Fallback en texto
            val textBody = "🌿 MI BITÁCORA — RETO DE 66 DÍAS: $challengeTitle\n" +
                    "📅 Día ${entry.dayNumber} de 66\n\n" +
                    "💭 ¿Cómo me sentí hoy?\n${entry.feelings}\n\n" +
                    "🏆 ¿Qué logros obtuve hoy?\n${entry.achievements}\n\n" +
                    (if (entry.verseText.isNotBlank()) "📖 Versículo del día:\n«${entry.verseText}» (${entry.verseReference})\n\n" else "") +
                    "— App Guía de Proverbios"
            val sendIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_SUBJECT, "Mi avance en $challengeTitle")
                putExtra(Intent.EXTRA_TEXT, textBody)
            }
            context.startActivity(Intent.createChooser(sendIntent, "Compartir Bitácora"))
        }
    }

    private fun createJournalImageBitmap(entry: ChallengeJournalEntry, challengeTitle: String): Bitmap {
        val width = 1080
        val height = 1350
        val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)

        // Fondo con degradado cálido crema / lino
        val bgPaint = Paint().apply {
            shader = LinearGradient(
                0f, 0f, width.toFloat(), height.toFloat(),
                Color.parseColor("#FAF7F0"),
                Color.parseColor("#EDE4D3"),
                Shader.TileMode.CLAMP
            )
        }
        canvas.drawRect(0f, 0f, width.toFloat(), height.toFloat(), bgPaint)

        // Borde interior elegante
        val borderPaint = Paint().apply {
            style = Paint.Style.STROKE
            strokeWidth = 3f
            color = Color.parseColor("#C8BCAB")
            isAntiAlias = true
        }
        val innerMargin = 40f
        canvas.drawRoundRect(
            RectF(innerMargin, innerMargin, width - innerMargin, height - innerMargin),
            28f, 28f, borderPaint
        )

        // Encabezado
        val appHeaderPaint = TextPaint().apply {
            color = Color.parseColor("#2C553E")
            textSize = 30f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("✦ PROVERBIOS PARA LA VIDA ✦", width / 2f, 120f, appHeaderPaint)

        val subHeaderPaint = TextPaint().apply {
            color = Color.parseColor("#8B5E28")
            textSize = 24f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.NORMAL)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("MI BITÁCORA DE TRANSFORMACIÓN • 66 DÍAS", width / 2f, 160f, subHeaderPaint)

        // Tarjeta con información del reto y día
        val badgeTop = 200f
        val badgeRect = RectF(80f, badgeTop, width - 80f, badgeTop + 140f)
        val badgeBgPaint = Paint().apply {
            color = Color.parseColor("#2C553E")
            style = Paint.Style.FILL
            isAntiAlias = true
        }
        canvas.drawRoundRect(badgeRect, 20f, 20f, badgeBgPaint)

        val titlePaint = TextPaint().apply {
            color = Color.WHITE
            textSize = 34f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText(challengeTitle, width / 2f, badgeTop + 60f, titlePaint)

        val dateFormat = SimpleDateFormat("d 'de' MMMM, yyyy", Locale("es", "ES"))
        val dateStr = dateFormat.format(Date(entry.dateTimestamp))

        val dayBadgePaint = TextPaint().apply {
            color = Color.parseColor("#E5BD7E")
            textSize = 26f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("DÍA ${entry.dayNumber} DE 66 • $dateStr", width / 2f, badgeTop + 105f, dayBadgePaint)

        // Tarjeta "¿Cómo me sentí hoy?"
        var curY = 380f
        val feelingBox = RectF(80f, curY, width - 80f, curY + 230f)
        val cardPaint = Paint().apply {
            color = Color.WHITE
            style = Paint.Style.FILL
            isAntiAlias = true
            setShadowLayer(10f, 0f, 4f, Color.parseColor("#12000000"))
        }
        canvas.drawRoundRect(feelingBox, 18f, 18f, cardPaint)

        val sectionTitlePaint = TextPaint().apply {
            color = Color.parseColor("#8B5E28")
            textSize = 26f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
            isAntiAlias = true
        }
        canvas.drawText("💭 ¿Cómo me sentí hoy?", 110f, curY + 45f, sectionTitlePaint)

        val bodyTextPaint = TextPaint().apply {
            color = Color.parseColor("#28302A")
            textSize = 28f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.NORMAL)
            isAntiAlias = true
        }
        val feelingLayout = StaticLayout.Builder
            .obtain(entry.feelings.ifBlank { "Reflexión del día completada con enfoque y gratitud." }, 0, entry.feelings.ifBlank { "Reflexión del día completada con enfoque y gratitud." }.length, bodyTextPaint, width - 220)
            .setAlignment(Layout.Alignment.ALIGN_NORMAL)
            .setMaxLines(4)
            .build()
        canvas.save()
        canvas.translate(110f, curY + 70f)
        feelingLayout.draw(canvas)
        canvas.restore()

        // Tarjeta "¿Qué logros obtuve hoy?"
        curY += 260f
        val achieveBox = RectF(80f, curY, width - 80f, curY + 230f)
        canvas.drawRoundRect(achieveBox, 18f, 18f, cardPaint)

        canvas.drawText("🏆 ¿Qué logros obtuve hoy?", 110f, curY + 45f, sectionTitlePaint)

        val achieveLayout = StaticLayout.Builder
            .obtain(entry.achievements.ifBlank { "Cumplí con el paso de acción y di un paso firme hacia adelante." }, 0, entry.achievements.ifBlank { "Cumplí con el paso de acción y di un paso firme hacia adelante." }.length, bodyTextPaint, width - 220)
            .setAlignment(Layout.Alignment.ALIGN_NORMAL)
            .setMaxLines(4)
            .build()
        canvas.save()
        canvas.translate(110f, curY + 70f)
        achieveLayout.draw(canvas)
        canvas.restore()

        // Caja de Versículo Bíblico del día
        curY += 260f
        if (entry.verseText.isNotBlank()) {
            val verseBox = RectF(80f, curY, width - 80f, curY + 240f)
            val verseBgPaint = Paint().apply {
                color = Color.parseColor("#EBF3ED")
                style = Paint.Style.FILL
                isAntiAlias = true
            }
            canvas.drawRoundRect(verseBox, 18f, 18f, verseBgPaint)

            val vTitlePaint = TextPaint().apply {
                color = Color.parseColor("#2C553E")
                textSize = 24f
                typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
                isAntiAlias = true
            }
            canvas.drawText("📖 Versículo del Día (${entry.verseReference}):", 110f, curY + 45f, vTitlePaint)

            val vTextPaint = TextPaint().apply {
                color = Color.parseColor("#1E2B22")
                textSize = 26f
                typeface = Typeface.create(Typeface.SERIF, Typeface.ITALIC)
                isAntiAlias = true
            }
            val vLayout = StaticLayout.Builder
                .obtain("«${entry.verseText}»", 0, entry.verseText.length + 2, vTextPaint, width - 220)
                .setAlignment(Layout.Alignment.ALIGN_NORMAL)
                .setMaxLines(4)
                .build()
            canvas.save()
            canvas.translate(110f, curY + 70f)
            vLayout.draw(canvas)
            canvas.restore()
        }

        // Pie de página motivacional
        val footerPaint = TextPaint().apply {
            color = Color.parseColor("#7A8478")
            textSize = 22f
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("66 días para consolidar hábitos duraderos con sabiduría bíblica", width / 2f, height - 70f, footerPaint)

        return bitmap
    }

    /**
     * Comparte el certificado en redes sociales (Instagram, WhatsApp, Facebook, etc.) como imagen en alta resolución.
     */
    fun shareCertificateAsImage(context: Context, certificate: HabitCertificate) {
        try {
            val bitmap = createCertificateBitmap(certificate)
            val cachePath = File(context.cacheDir, "shared_certificates")
            cachePath.mkdirs()
            val file = File(cachePath, "certificado_${certificate.challengeId}.png")
            FileOutputStream(file).use { out ->
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, out)
            }

            val contentUri = FileProvider.getUriForFile(
                context,
                "${context.packageName}.fileprovider",
                file
            )

            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                type = "image/png"
                putExtra(Intent.EXTRA_STREAM, contentUri)
                putExtra(
                    Intent.EXTRA_TEXT,
                    "🏆 ¡He completado los 66 días del reto «${certificate.challengeTitle}»!\n\n" +
                    "«${certificate.featuredVerseText}» — ${certificate.featuredVerseRef} (NBV)\n\n" +
                    "Certificado de Logro de Guía de Proverbios 🌿"
                )
                addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }

            val chooser = Intent.createChooser(shareIntent, "Compartir Certificado de Logro")
            chooser.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(chooser)
        } catch (e: Exception) {
            shareCertificateAsText(context, certificate)
        }
    }

    /**
     * Comparte el logro como texto motivador predefinido.
     */
    fun shareCertificateAsText(context: Context, certificate: HabitCertificate) {
        val dateFormat = SimpleDateFormat("dd 'de' MMMM, yyyy", Locale("es", "ES"))
        val completionDateStr = dateFormat.format(Date(certificate.completionDate))

        val shareBody = buildString {
            append("🏆 CERTIFICADO DE LOGRO - 66 DÍAS DE TRANSFORMACIÓN 🏆\n\n")
            append("Otorgado a: ${certificate.userName}\n")
            append("Por haber culminado con éxito: «${certificate.challengeTitle}»\n")
            append("Fecha de culminación: $completionDateStr\n\n")
            append("📖 «${certificate.featuredVerseText}» — ${certificate.featuredVerseRef} (NBV)\n\n")
            append("✨ ${certificate.motivationalPhrase}\n\n")
            append("🌿 Transformando hábitos con la sabiduría de Guía de Proverbios.")
        }

        val sendIntent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_SUBJECT, "Mi Certificado de Logro - 66 Días")
            putExtra(Intent.EXTRA_TEXT, shareBody)
        }
        val chooser = Intent.createChooser(sendIntent, "Compartir Certificado")
        chooser.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(chooser)
    }

    /**
     * Guarda el certificado como imagen PNG directamente en la galería de fotos del usuario (Pictures/Guía de Proverbios).
     */
    fun saveCertificateToGallery(context: Context, certificate: HabitCertificate): Boolean {
        return try {
            val bitmap = createCertificateBitmap(certificate)
            val filename = "Certificado_${certificate.challengeId}_${System.currentTimeMillis()}.png"
            var outputStream: OutputStream? = null

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                val contentValues = ContentValues().apply {
                    put(MediaStore.MediaColumns.DISPLAY_NAME, filename)
                    put(MediaStore.MediaColumns.MIME_TYPE, "image/png")
                    put(MediaStore.MediaColumns.RELATIVE_PATH, "Pictures/Guía de Proverbios")
                }
                val uri = context.contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues)
                if (uri != null) {
                    outputStream = context.contentResolver.openOutputStream(uri)
                }
            } else {
                val imagesDir = File(context.getExternalFilesDir(null), "Certificados")
                if (!imagesDir.exists()) imagesDir.mkdirs()
                val image = File(imagesDir, filename)
                outputStream = FileOutputStream(image)
            }

            outputStream?.use { out ->
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, out)
            }
            Toast.makeText(context, "Certificado guardado en la galería con éxito ✨", Toast.LENGTH_LONG).show()
            true
        } catch (e: Exception) {
            Toast.makeText(context, "No se pudo guardar la imagen: ${e.localizedMessage}", Toast.LENGTH_SHORT).show()
            false
        }
    }

    /**
     * Genera un diseño de diploma/certificado en alta resolución (1200 x 1600 px)
     * con tonos crema, detalles dorados y azul profundo, sellos de honor y bordes ornamentales.
     */
    fun createCertificateBitmap(certificate: HabitCertificate): Bitmap {
        val width = 1200
        val height = 1600
        val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)

        // 1. Fondo elegante crema pergamino
        val bgPaint = Paint().apply {
            shader = LinearGradient(
                0f, 0f, width.toFloat(), height.toFloat(),
                Color.parseColor("#FFFDF7"),
                Color.parseColor("#F7F0E1"),
                Shader.TileMode.CLAMP
            )
        }
        canvas.drawRect(0f, 0f, width.toFloat(), height.toFloat(), bgPaint)

        // 2. Borde exterior ornamental dorado
        val outerBorderPaint = Paint().apply {
            style = Paint.Style.STROKE
            strokeWidth = 10f
            color = Color.parseColor("#C5A059") // Oro suave
            isAntiAlias = true
        }
        canvas.drawRoundRect(RectF(40f, 40f, width - 40f, height - 40f), 24f, 24f, outerBorderPaint)

        // Borde interior fino
        val innerBorderPaint = Paint().apply {
            style = Paint.Style.STROKE
            strokeWidth = 2.5f
            color = Color.parseColor("#D8BE8A")
            isAntiAlias = true
        }
        canvas.drawRoundRect(RectF(58f, 58f, width - 58f, height - 58f), 18f, 18f, innerBorderPaint)

        // Borde interior en azul profundo
        val navyBorderPaint = Paint().apply {
            style = Paint.Style.STROKE
            strokeWidth = 1.5f
            color = Color.parseColor("#1B3022")
            isAntiAlias = true
        }
        canvas.drawRoundRect(RectF(66f, 66f, width - 66f, height - 66f), 14f, 14f, navyBorderPaint)

        // Esquinas ornamentales con cruces de laureles o florones
        val cornerPaint = Paint().apply {
            color = Color.parseColor("#C5A059")
            style = Paint.Style.FILL
            isAntiAlias = true
        }
        val cornerSize = 20f
        canvas.drawCircle(80f, 80f, 10f, cornerPaint)
        canvas.drawCircle(width - 80f, 80f, 10f, cornerPaint)
        canvas.drawCircle(80f, height - 80f, 10f, cornerPaint)
        canvas.drawCircle(width - 80f, height - 80f, 10f, cornerPaint)

        // 3. Encabezado de la App
        val appTitlePaint = TextPaint().apply {
            color = Color.parseColor("#1E3F20") // Verde bosque profundo
            textSize = 34f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
            letterSpacing = 0.12f
        }
        canvas.drawText("PROVERBIOS PARA LA VIDA", width / 2f, 140f, appTitlePaint)

        val subAppPaint = TextPaint().apply {
            color = Color.parseColor("#8C7248")
            textSize = 22f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.NORMAL)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
            letterSpacing = 0.08f
        }
        canvas.drawText("PROGRAMA DE TRANSFORMACIÓN PERSONAL Y ESPIRITUAL", width / 2f, 180f, subAppPaint)

        // Línea divisoria dorada ornamental con estrella
        val divPaint = Paint().apply {
            color = Color.parseColor("#C5A059")
            strokeWidth = 2.5f
            style = Paint.Style.STROKE
        }
        canvas.drawLine(250f, 215f, width - 250f, 215f, divPaint)
        canvas.drawCircle(width / 2f, 215f, 6f, cornerPaint)

        // 4. Título Principal: CERTIFICADO DE LOGRO
        val certTitlePaint = TextPaint().apply {
            color = Color.parseColor("#1B2E3C") // Azul profundo
            textSize = 62f
            typeface = Typeface.create(Typeface.SERIF, Typeface.BOLD)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
            letterSpacing = 0.05f
        }
        canvas.drawText("CERTIFICADO DE LOGRO", width / 2f, 310f, certTitlePaint)

        val certSubtitlePaint = TextPaint().apply {
            color = Color.parseColor("#A3702C") // Dorado cálido
            textSize = 28f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
            letterSpacing = 0.15f
        }
        canvas.drawText("66 DÍAS DE TRANSFORMACIÓN CONSOLIDADA", width / 2f, 360f, certSubtitlePaint)

        // 5. Texto de otorgamiento
        val grantPaint = TextPaint().apply {
            color = Color.parseColor("#4A4E48")
            textSize = 26f
            typeface = Typeface.create(Typeface.SERIF, Typeface.ITALIC)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("Este certificado se otorga con honor y reconocimiento a:", width / 2f, 440f, grantPaint)

        // 6. Nombre del usuario en grande y elegante
        val namePaint = TextPaint().apply {
            color = Color.parseColor("#14281D")
            textSize = 58f
            typeface = Typeface.create(Typeface.SERIF, Typeface.BOLD)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        val displayName = if (certificate.userName.isNotBlank()) certificate.userName else "Héroe de la Constancia"
        canvas.drawText(displayName, width / 2f, 525f, namePaint)

        // Línea decorativa bajo el nombre
        val nameLinePaint = Paint().apply {
            color = Color.parseColor("#C5A059")
            strokeWidth = 3f
        }
        canvas.drawLine(200f, 555f, width - 200f, 555f, nameLinePaint)

        // 7. Texto del reto completado
        val textBodyPaint = TextPaint().apply {
            color = Color.parseColor("#3D423C")
            textSize = 28f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.NORMAL)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("Por haber concluido con disciplina, fe y perseverancia el reto:", width / 2f, 620f, textBodyPaint)

        val challengeNamePaint = TextPaint().apply {
            color = Color.parseColor("#1E3F20")
            textSize = 42f
            typeface = Typeface.create(Typeface.SERIF, Typeface.BOLD)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("«${certificate.challengeTitle}»", width / 2f, 685f, challengeNamePaint)

        // 8. Fechas de inicio y finalización
        val dateFormat = SimpleDateFormat("dd 'de' MMMM, yyyy", Locale("es", "ES"))
        val startStr = dateFormat.format(Date(certificate.startDate))
        val endStr = dateFormat.format(Date(certificate.completionDate))

        val datesBox = RectF(160f, 735f, width - 160f, 815f)
        val datesBg = Paint().apply {
            color = Color.parseColor("#FFFFFF")
            style = Paint.Style.FILL
            isAntiAlias = true
        }
        canvas.drawRoundRect(datesBox, 16f, 16f, datesBg)
        val datesBorder = Paint().apply {
            color = Color.parseColor("#E0D5C1")
            style = Paint.Style.STROKE
            strokeWidth = 2f
            isAntiAlias = true
        }
        canvas.drawRoundRect(datesBox, 16f, 16f, datesBorder)

        val datesTextPaint = TextPaint().apply {
            color = Color.parseColor("#5A6258")
            textSize = 24f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("Iniciado: $startStr   •   Culminado: $endStr", width / 2f, 785f, datesTextPaint)

        // 9. Versículo bíblico destacado de perseverancia
        val verseBox = RectF(120f, 850f, width - 120f, 1070f)
        val verseBg = Paint().apply {
            color = Color.parseColor("#F4EFE6")
            style = Paint.Style.FILL
            isAntiAlias = true
        }
        canvas.drawRoundRect(verseBox, 20f, 20f, verseBg)
        val verseBorder = Paint().apply {
            color = Color.parseColor("#C5A059")
            style = Paint.Style.STROKE
            strokeWidth = 2.5f
            isAntiAlias = true
        }
        canvas.drawRoundRect(verseBox, 20f, 20f, verseBorder)

        val verseRefPaint = TextPaint().apply {
            color = Color.parseColor("#8C6228")
            textSize = 26f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("PALABRA DE SABIDURÍA — ${certificate.featuredVerseRef.uppercase()} (NBV)", width / 2f, 895f, verseRefPaint)

        val verseTextPaint = TextPaint().apply {
            color = Color.parseColor("#1F2821")
            textSize = 30f
            typeface = Typeface.create(Typeface.SERIF, Typeface.ITALIC)
            isAntiAlias = true
        }
        val verseLayout = StaticLayout.Builder
            .obtain("«${certificate.featuredVerseText}»", 0, certificate.featuredVerseText.length + 2, verseTextPaint, width - 300)
            .setAlignment(Layout.Alignment.ALIGN_CENTER)
            .setMaxLines(3)
            .build()
        canvas.save()
        canvas.translate(150f, 925f)
        verseLayout.draw(canvas)
        canvas.restore()

        // 10. Frase motivacional
        val phrasePaint = TextPaint().apply {
            color = Color.parseColor("#2F4336")
            textSize = 28f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        val phraseLayout = StaticLayout.Builder
            .obtain("✨ ${certificate.motivationalPhrase} ✨", 0, certificate.motivationalPhrase.length + 4, phrasePaint, width - 260)
            .setAlignment(Layout.Alignment.ALIGN_CENTER)
            .setMaxLines(2)
            .build()
        canvas.save()
        canvas.translate(130f, 1110f)
        phraseLayout.draw(canvas)
        canvas.restore()

        // 11. Sello Oficial "Certificado de Logro - 66 Días de Transformación"
        val sealCenterX = width / 2f
        val sealCenterY = 1290f
        val sealRadius = 78f

        // Borde dentado exterior
        val sealBg = Paint().apply {
            color = Color.parseColor("#C5A059")
            style = Paint.Style.FILL
            isAntiAlias = true
        }
        canvas.drawCircle(sealCenterX, sealCenterY, sealRadius, sealBg)

        val sealInnerBg = Paint().apply {
            color = Color.parseColor("#FAF5EA")
            style = Paint.Style.FILL
            isAntiAlias = true
        }
        canvas.drawCircle(sealCenterX, sealCenterY, sealRadius - 7f, sealInnerBg)

        val sealBorder = Paint().apply {
            color = Color.parseColor("#8C6228")
            style = Paint.Style.STROKE
            strokeWidth = 2.5f
            isAntiAlias = true
        }
        canvas.drawCircle(sealCenterX, sealCenterY, sealRadius - 12f, sealBorder)

        val sealTextTop = TextPaint().apply {
            color = Color.parseColor("#1B2E3C")
            textSize = 17f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("CERTIFICADO", sealCenterX, sealCenterY - 32f, sealTextTop)

        val sealTextCenter = TextPaint().apply {
            color = Color.parseColor("#8C6228")
            textSize = 34f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("66", sealCenterX, sealCenterY + 4f, sealTextCenter)

        val sealTextBottom = TextPaint().apply {
            color = Color.parseColor("#1E3F20")
            textSize = 16f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("DÍAS LOGRADOS", sealCenterX, sealCenterY + 28f, sealTextBottom)
        canvas.drawText("TRANSFORMACIÓN", sealCenterX, sealCenterY + 48f, sealTextTop)

        // 12. Firmas / Atribuciones inferiores
        val signLinePaint = Paint().apply {
            color = Color.parseColor("#9EA59A")
            strokeWidth = 2f
        }
        canvas.drawLine(160f, 1470f, 460f, 1470f, signLinePaint)
        canvas.drawLine(740f, 1470f, 1040f, 1470f, signLinePaint)

        val signLabelPaint = TextPaint().apply {
            color = Color.parseColor("#4E554C")
            textSize = 21f
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("Coach & Mentor de Hábitos", 310f, 1500f, signLabelPaint)
        canvas.drawText("Guía de Proverbios", 890f, 1500f, signLabelPaint)

        val certFooter = TextPaint().apply {
            color = Color.parseColor("#848D82")
            textSize = 19f
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
        }
        canvas.drawText("Certificado verificable emitido por Guía de Proverbios • Basado en la Nueva Biblia Viva (NBV)", width / 2f, 1555f, certFooter)

        return bitmap
    }
}


