package com.example.ui.components

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.EditNote
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.TrackChanges
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.PredefinedCategories
import com.example.data.model.Verse
import com.example.util.ShareHelper

@Composable
fun VerseCard(
    verse: Verse,
    onToggleFavorite: () -> Unit,
    onSaveNote: (String) -> Unit,
    onNavigateToChapter: ((chapter: Int, verseNumber: Int) -> Unit)? = null,
    modifier: Modifier = Modifier,
    isHighlighted: Boolean = false,
    fontSizeMultiplier: Float = 1.0f
) {
    val context = LocalContext.current
    var showShareMenu by remember { mutableStateOf(false) }
    var showNoteDialog by remember { mutableStateOf(false) }
    var noteText by remember(verse.personalNote) { mutableStateOf(verse.personalNote) }

    val defaultColor = MaterialTheme.colorScheme.primary
    val categoryColor = remember(verse.primaryCategory, defaultColor) {
        PredefinedCategories.list.find { it.id.equals(verse.primaryCategory, ignoreCase = true) }?.color
            ?: defaultColor
    }

    Card(
        modifier = modifier
            .fillMaxWidth()
            .testTag("verse_card_${verse.id}")
            .padding(vertical = 6.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (isHighlighted) {
                MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.45f)
            } else {
                MaterialTheme.colorScheme.surface
            }
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = if (isHighlighted) 3.dp else 1.5.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            // Fila superior: Cita, Categoría y Versión
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = verse.reference,
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.primary
                        )
                    )
                    Text(
                        text = "• NBV",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    )
                }

                // Insignia de categoría temática
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = categoryColor.copy(alpha = 0.14f)
                ) {
                    Text(
                        text = verse.primaryCategory,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
                        style = MaterialTheme.typography.labelMedium.copy(
                            color = categoryColor,
                            fontWeight = FontWeight.SemiBold
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Texto del Versículo con tipografía serif y comillas
            Text(
                text = "«${verse.text}»",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontFamily = FontFamily.Serif,
                    fontSize = (17 * fontSizeMultiplier).sp,
                    lineHeight = (26 * fontSizeMultiplier).sp,
                    color = MaterialTheme.colorScheme.onSurface,
                    fontStyle = FontStyle.Normal
                )
            )

            Spacer(modifier = Modifier.height(14.dp))

            // Caja de Aplicación Práctica
            Surface(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f)
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Lightbulb,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.secondary,
                            modifier = Modifier.size(18.dp)
                        )
                        Text(
                            text = "Consejo para tu día a día",
                            style = MaterialTheme.typography.labelMedium.copy(
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.secondary
                            )
                        )
                    }

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = verse.practicalAdvice,
                        style = MaterialTheme.typography.bodyMedium.copy(
                            fontSize = (14 * fontSizeMultiplier).sp,
                            lineHeight = (20 * fontSizeMultiplier).sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    )

                    if (verse.actionPrompt.isNotBlank()) {
                        Spacer(modifier = Modifier.height(8.dp))
                        Row(
                            verticalAlignment = Alignment.Top,
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.TrackChanges,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.primary,
                                modifier = Modifier.size(16.dp).padding(top = 2.dp)
                            )
                            Text(
                                text = "Paso de acción: ${verse.actionPrompt}",
                                style = MaterialTheme.typography.bodySmall.copy(
                                    fontWeight = FontWeight.Medium,
                                    color = MaterialTheme.colorScheme.primary
                                )
                            )
                        }
                    }
                }
            }

            // Nota personal si existe
            if (verse.personalNote.isNotBlank()) {
                Spacer(modifier = Modifier.height(10.dp))
                Surface(
                    shape = RoundedCornerShape(10.dp),
                    color = MaterialTheme.colorScheme.tertiaryContainer.copy(alpha = 0.4f),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.EditNote,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.tertiary,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "Nota: ${verse.personalNote}",
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = MaterialTheme.colorScheme.onTertiaryContainer
                            )
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Fila de acciones (Favorito, Compartir, Copiar, Nota, Capítulo)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                    // Botón de Favorito
                    IconButton(
                        onClick = onToggleFavorite,
                        modifier = Modifier.testTag("favorite_button_${verse.id}")
                    ) {
                        Icon(
                            imageVector = if (verse.isFavorite) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                            contentDescription = if (verse.isFavorite) "Quitar de favoritos" else "Guardar en favoritos",
                            tint = if (verse.isFavorite) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }

                    // Botón de Nota
                    IconButton(
                        onClick = { showNoteDialog = true },
                        modifier = Modifier.testTag("note_button_${verse.id}")
                    ) {
                        Icon(
                            imageVector = Icons.Default.EditNote,
                            contentDescription = "Añadir o editar nota personal",
                            tint = if (verse.personalNote.isNotBlank()) MaterialTheme.colorScheme.tertiary else MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }

                    // Botón Copiar Texto
                    IconButton(
                        onClick = {
                            val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                            val clip = ClipData.newPlainText("Proverbio", "«${verse.text}» — ${verse.reference} (NBV)")
                            clipboard.setPrimaryClip(clip)
                            Toast.makeText(context, "Versículo copiado al portapapeles", Toast.LENGTH_SHORT).show()
                        },
                        modifier = Modifier.testTag("copy_button_${verse.id}")
                    ) {
                        Icon(
                            imageVector = Icons.Default.ContentCopy,
                            contentDescription = "Copiar versículo",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }

                // Botón Compartir con menú desplegable (Texto o Imagen)
                Box {
                    FilledTonalButton(
                        onClick = { showShareMenu = true },
                        shape = RoundedCornerShape(12.dp),
                        contentPadding = PaddingValues(horizontal = 14.dp, vertical = 6.dp),
                        modifier = Modifier.testTag("share_button_${verse.id}")
                    ) {
                        Icon(
                            imageVector = Icons.Default.Share,
                            contentDescription = null,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("Compartir", style = MaterialTheme.typography.labelMedium)
                    }

                    DropdownMenu(
                        expanded = showShareMenu,
                        onDismissRequest = { showShareMenu = false }
                    ) {
                        DropdownMenuItem(
                            text = { Text("Compartir como texto") },
                            leadingIcon = {
                                Icon(Icons.Default.Share, contentDescription = null)
                            },
                            onClick = {
                                showShareMenu = false
                                ShareHelper.shareVerseAsText(context, verse)
                            }
                        )
                        DropdownMenuItem(
                            text = { Text("Compartir como tarjeta (imagen)") },
                            leadingIcon = {
                                Icon(Icons.Default.Image, contentDescription = null)
                            },
                            onClick = {
                                showShareMenu = false
                                ShareHelper.shareVerseAsImage(context, verse)
                            }
                        )
                        if (onNavigateToChapter != null) {
                            DropdownMenuItem(
                                text = { Text("Leer en capítulo ${verse.chapter} completo") },
                                leadingIcon = {
                                    Icon(Icons.Default.MenuBook, contentDescription = null)
                                },
                                onClick = {
                                    showShareMenu = false
                                    onNavigateToChapter(verse.chapter, verse.verseNumber)
                                }
                            )
                        }
                    }
                }
            }
        }
    }

    // Diálogo para notas personales
    if (showNoteDialog) {
        AlertDialog(
            onDismissRequest = { showNoteDialog = false },
            title = { Text("Nota personal", style = MaterialTheme.typography.titleMedium) },
            text = {
                Column {
                    Text(
                        text = "${verse.reference}: «${verse.text.take(80)}...»",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    OutlinedTextField(
                        value = noteText,
                        onValueChange = { noteText = it },
                        label = { Text("Escribe tu reflexión o motivo de oración") },
                        modifier = Modifier.fillMaxWidth(),
                        maxLines = 4,
                        shape = RoundedCornerShape(12.dp)
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        onSaveNote(noteText)
                        showNoteDialog = false
                    }
                ) {
                    Text("Guardar")
                }
            },
            dismissButton = {
                TextButton(onClick = { showNoteDialog = false }) {
                    Text("Cancelar")
                }
            }
        )
    }
}
