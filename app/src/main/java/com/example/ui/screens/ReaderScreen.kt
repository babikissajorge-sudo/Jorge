package com.example.ui.screens

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.FormatSize
import androidx.compose.material.icons.filled.NavigateBefore
import androidx.compose.material.icons.filled.NavigateNext
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.local.ProverbsSectionHeadings
import com.example.data.model.Verse
import com.example.ui.components.VerseDetailDialog
import com.example.ui.viewmodel.ProverbsViewModel
import kotlinx.coroutines.delay

@Composable
fun ReaderScreen(
    viewModel: ProverbsViewModel,
    modifier: Modifier = Modifier
) {
    val selectedChapter by viewModel.selectedChapter.collectAsState()
    val chapterVerses by viewModel.chapterVerses.collectAsState()
    val fontSizeMultiplier by viewModel.fontSizeFactor.collectAsState()
    val targetVerseNav by viewModel.targetVerseNav.collectAsState()

    var highlightedVerseNumber by remember { mutableStateOf<Int?>(null) }

    // Versículo seleccionado para ver en la ventana emergente detallada
    var selectedVerseId by remember { mutableStateOf<Int?>(null) }
    val selectedVerse = remember(chapterVerses, selectedVerseId) {
        chapterVerses.find { it.id == selectedVerseId }
    }

    val listState = rememberLazyListState()

    // Manejo de navegación al capítulo y desplazamiento al versículo objetivo
    LaunchedEffect(targetVerseNav, chapterVerses) {
        val nav = targetVerseNav ?: return@LaunchedEffect
        if (nav.chapter == selectedChapter && chapterVerses.isNotEmpty()) {
            val targetVerse = nav.verseNumber
            if (targetVerse != null) {
                val targetIndex = chapterVerses.indexOfFirst { it.verseNumber == targetVerse }
                if (targetIndex >= 0) {
                    highlightedVerseNumber = targetVerse
                    // Desplazarse de forma suave directamente al versículo exacto
                    listState.animateScrollToItem(targetIndex)
                    // Limpiar el evento de navegación en ViewModel para permitir scroll manual libre
                    viewModel.clearTargetVerseNav()
                    // Mantener el versículo resaltado durante 4 segundos o hasta interacción
                    delay(4000)
                    if (highlightedVerseNumber == targetVerse) {
                        highlightedVerseNumber = null
                    }
                }
            } else {
                listState.scrollToItem(0)
                viewModel.clearTargetVerseNav()
            }
        }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .testTag("reader_screen")
    ) {
        // Selector superior de Capítulos (1 al 31)
        Surface(
            tonalElevation = 2.dp,
            color = MaterialTheme.colorScheme.surface
        ) {
            Column(modifier = Modifier.padding(vertical = 8.dp)) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = { if (selectedChapter > 1) viewModel.selectChapter(selectedChapter - 1) },
                            enabled = selectedChapter > 1,
                            modifier = Modifier.testTag("prev_chapter_button")
                        ) {
                            Icon(Icons.Default.NavigateBefore, contentDescription = "Capítulo anterior")
                        }

                        Text(
                            text = "Capítulo $selectedChapter de 31",
                            style = MaterialTheme.typography.titleMedium.copy(
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.primary
                            )
                        )

                        IconButton(
                            onClick = { if (selectedChapter < 31) viewModel.selectChapter(selectedChapter + 1) },
                            enabled = selectedChapter < 31,
                            modifier = Modifier.testTag("next_chapter_button")
                        ) {
                            Icon(Icons.Default.NavigateNext, contentDescription = "Capítulo siguiente")
                        }
                    }

                    // Controles de tamaño de letra
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        TextButton(
                            onClick = {
                                val nextSize = when {
                                    fontSizeMultiplier < 1.0f -> 1.0f
                                    fontSizeMultiplier < 1.25f -> 1.25f
                                    else -> 0.9f
                                }
                                viewModel.setFontSize(nextSize)
                            },
                            modifier = Modifier.testTag("font_size_toggle_button")
                        ) {
                            Icon(
                                imageVector = Icons.Default.FormatSize,
                                contentDescription = "Ajustar tamaño de fuente",
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = when {
                                    fontSizeMultiplier > 1.2f -> "A++"
                                    fontSizeMultiplier > 1.0f -> "A+"
                                    else -> "A"
                                },
                                style = MaterialTheme.typography.labelMedium
                            )
                        }
                    }
                }

                // Carrusel horizontal de chips para los 31 capítulos
                LazyRow(
                    modifier = Modifier.fillMaxWidth(),
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    items(31) { index ->
                        val ch = index + 1
                        val isSelected = ch == selectedChapter
                        FilterChip(
                            selected = isSelected,
                            onClick = { viewModel.selectChapter(ch) },
                            label = { Text("Cap. $ch") },
                            shape = RoundedCornerShape(12.dp),
                            colors = FilterChipDefaults.filterChipColors(
                                selectedContainerColor = MaterialTheme.colorScheme.primary,
                                selectedLabelColor = MaterialTheme.colorScheme.onPrimary
                            ),
                            modifier = Modifier.testTag("chip_chapter_$ch")
                        )
                    }
                }
            }
        }

        // Encabezado del capítulo con tipografía editorial
        Surface(
            color = MaterialTheme.colorScheme.background,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 12.dp)
            ) {
                Text(
                    text = "Proverbios $selectedChapter",
                    style = MaterialTheme.typography.headlineMedium.copy(
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                )
                Text(
                    text = "${chapterVerses.size} versículos • Toca cualquier versículo para ver su consejo y paso práctico",
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                )
            }
        }

        // Lista limpia, aireada y organizada de todos los versículos del capítulo
        LazyColumn(
            state = listState,
            modifier = Modifier
                .fillMaxSize()
                .testTag("chapter_verses_clean_list"),
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 4.dp, bottom = 88.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            if (chapterVerses.isEmpty()) {
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 40.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        CircularProgressIndicator(color = MaterialTheme.colorScheme.primary)
                    }
                }
            } else {
                items(chapterVerses, key = { it.id }) { verse ->
                    val sectionHeading = ProverbsSectionHeadings.getSectionHeading(verse.chapter, verse.verseNumber)
                    if (sectionHeading != null) {
                        SectionHeadingItem(
                            title = sectionHeading,
                            fontSizeMultiplier = fontSizeMultiplier
                        )
                    }
                    val isHighlighted = verse.verseNumber == highlightedVerseNumber
                    CleanVerseItem(
                        verse = verse,
                        fontSizeMultiplier = fontSizeMultiplier,
                        isTargetHighlighted = isHighlighted,
                        onClick = {
                            highlightedVerseNumber = null
                            selectedVerseId = verse.id
                        }
                    )
                }
            }
        }
    }

    // Ventana modal con detalle completo al tocar un versículo
    selectedVerse?.let { verse ->
        VerseDetailDialog(
            verse = verse,
            onDismiss = { selectedVerseId = null },
            onToggleFavorite = { viewModel.toggleFavorite(verse) },
            onSaveNote = { note -> viewModel.saveNote(verse.id, note) },
            fontSizeMultiplier = fontSizeMultiplier
        )
    }
}

/**
 * Subtítulo de sección oficial de la NBV:
 * Se muestra en negrita, con tamaño mayor y separado con espacio arriba y abajo.
 */
@Composable
fun SectionHeadingItem(
    title: String,
    fontSizeMultiplier: Float,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 18.dp, bottom = 8.dp)
            .testTag("section_heading_${title.hashCode()}")
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Surface(
                modifier = Modifier
                    .width(4.dp)
                    .height(22.dp),
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(2.dp)
            ) {}
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium.copy(
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    fontSize = (18.5f * fontSizeMultiplier).sp,
                    lineHeight = (26f * fontSizeMultiplier).sp,
                    color = MaterialTheme.colorScheme.primary
                )
            )
        }
        Spacer(modifier = Modifier.height(6.dp))
        HorizontalDivider(
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.2f),
            thickness = 1.dp
        )
    }
}

/**
 * Fila limpia y aireada para la lectura del capítulo:
 * Muestra ÚNICAMENTE el número del versículo y el texto bíblico.
 * Al tocar abre la ventana detallada con consejos y pasos prácticos.
 */
@Composable
fun CleanVerseItem(
    verse: Verse,
    fontSizeMultiplier: Float,
    onClick: () -> Unit,
    isTargetHighlighted: Boolean = false,
    modifier: Modifier = Modifier
) {
    val animatedBorderColor by animateColorAsState(
        targetValue = if (isTargetHighlighted) MaterialTheme.colorScheme.primary else Color.Transparent,
        label = "verse_border_color"
    )
    val animatedBgColor by animateColorAsState(
        targetValue = if (isTargetHighlighted) {
            MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.45f)
        } else {
            MaterialTheme.colorScheme.surface
        },
        label = "verse_bg_color"
    )

    Card(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .clickable(onClick = onClick)
            .testTag("clean_verse_item_${verse.verseNumber}"),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = animatedBgColor
        ),
        border = if (isTargetHighlighted) BorderStroke(2.dp, animatedBorderColor) else null,
        elevation = CardDefaults.cardElevation(defaultElevation = if (isTargetHighlighted) 4.dp else 1.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 14.dp)
        ) {
            if (isTargetHighlighted) {
                Surface(
                    shape = RoundedCornerShape(6.dp),
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.padding(bottom = 8.dp)
                ) {
                    Text(
                        text = "📍 Versículo seleccionado",
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimary
                        ),
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
                    )
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Top
            ) {
                // Número del versículo con fondo suave y negrita distintiva
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = if (isTargetHighlighted) {
                        MaterialTheme.colorScheme.primary
                    } else {
                        MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.55f)
                    },
                    modifier = Modifier.padding(top = 2.dp)
                ) {
                    Text(
                        text = "${verse.verseNumber}",
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = if (isTargetHighlighted) Color.White else MaterialTheme.colorScheme.primary,
                            fontSize = (13 * fontSizeMultiplier).sp
                        ),
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }

                Spacer(modifier = Modifier.width(14.dp))

                // Texto bíblico puro, legible y aireado
                Text(
                    text = verse.text,
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontFamily = FontFamily.Serif,
                        fontSize = (16.5f * fontSizeMultiplier).sp,
                        lineHeight = (26f * fontSizeMultiplier).sp,
                        color = MaterialTheme.colorScheme.onSurface,
                        fontWeight = if (isTargetHighlighted) FontWeight.SemiBold else FontWeight.Normal
                    ),
                    modifier = Modifier.weight(1f)
                )

                // Indicador sutil de acción
                Icon(
                    imageVector = Icons.Default.ChevronRight,
                    contentDescription = "Ver consejo y acción para Proverbios ${verse.chapter}:${verse.verseNumber}",
                    tint = if (isTargetHighlighted) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.35f),
                    modifier = Modifier
                        .size(20.dp)
                        .padding(top = 4.dp)
                )
            }
        }
    }
}
