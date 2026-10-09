package com.example.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.PredefinedCategories
import com.example.ui.components.VerseCard
import com.example.ui.viewmodel.ProverbsViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryVersesScreen(
    categoryName: String,
    viewModel: ProverbsViewModel,
    onBack: () -> Unit,
    onNavigateToChapter: (chapter: Int, verseNumber: Int) -> Unit,
    modifier: Modifier = Modifier
) {
    BackHandler { onBack() }

    LaunchedEffect(categoryName) {
        viewModel.selectCategory(categoryName)
    }

    val verses by viewModel.categoryVerses.collectAsState()
    val fontSizeMultiplier by viewModel.fontSizeFactor.collectAsState()

    val categoryInfo = remember(categoryName) {
        PredefinedCategories.list.find { it.id.equals(categoryName, ignoreCase = true) }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = categoryName,
                            style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
                        )
                        Text(
                            text = "${verses.size} proverbios encontrados",
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Volver"
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
                .testTag("category_verses_list"),
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 80.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // Cabecera descriptiva de la categoría
            item {
                categoryInfo?.let { cat ->
                    Surface(
                        shape = RoundedCornerShape(18.dp),
                        color = cat.color.copy(alpha = 0.12f),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 8.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = getCategoryIcon(cat.id),
                                contentDescription = null,
                                tint = cat.color,
                                modifier = Modifier.size(36.dp)
                            )
                            Spacer(modifier = Modifier.width(14.dp))
                            Text(
                                text = cat.description,
                                style = MaterialTheme.typography.bodyMedium.copy(
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                            )
                        }
                    }
                }
            }

            if (verses.isEmpty()) {
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 40.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "No se encontraron versículos para este tema.",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            } else {
                items(verses, key = { it.id }) { verse ->
                    VerseCard(
                        verse = verse,
                        onToggleFavorite = { viewModel.toggleFavorite(verse) },
                        onSaveNote = { note -> viewModel.saveNote(verse.id, note) },
                        onNavigateToChapter = onNavigateToChapter,
                        fontSizeMultiplier = fontSizeMultiplier
                    )
                }
            }
        }
    }
}
