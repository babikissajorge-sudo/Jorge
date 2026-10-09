package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ui.screens.*
import com.example.ui.theme.ProverbsTheme
import com.example.ui.viewmodel.ProverbsViewModel
import com.example.util.ShareHelper

sealed class AppDestination(val route: String, val title: String, val icon: ImageVector) {
    object Home : AppDestination("home", "Inicio", Icons.Default.Home)
    object Categories : AppDestination("categories", "Temas", Icons.Default.Category)
    object Reader : AppDestination("reader", "Lector", Icons.Default.MenuBook)
    object Challenges : AppDestination("challenges", "Retos", Icons.Default.EventAvailable)
    object Favorites : AppDestination("favorites", "Favoritos", Icons.Default.Bookmark)
}

sealed class SubScreen {
    object None : SubScreen()
    object Search : SubScreen()
    object Settings : SubScreen()
    object Achievements : SubScreen()
    data class CategoryDetail(val categoryName: String) : SubScreen()
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewModel: ProverbsViewModel = viewModel(
                factory = ProverbsViewModel.provideFactory(application)
            )

            val darkThemeMode by viewModel.darkThemeMode.collectAsState()
            val useDarkTheme = when (darkThemeMode) {
                true -> true
                false -> false
                null -> isSystemInDarkTheme()
            }

            ProverbsTheme(darkTheme = useDarkTheme) {
                ProverbsMainScreen(viewModel = viewModel)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProverbsMainScreen(viewModel: ProverbsViewModel) {
    val context = LocalContext.current
    var currentDestination by remember { mutableStateOf<AppDestination>(AppDestination.Home) }
    var currentSubScreen by remember { mutableStateOf<SubScreen>(SubScreen.None) }

    // Manejo de botón atrás de Android
    BackHandler(enabled = currentSubScreen !is SubScreen.None || currentDestination != AppDestination.Home) {
        if (currentSubScreen !is SubScreen.None) {
            currentSubScreen = SubScreen.None
        } else if (currentDestination != AppDestination.Home) {
            currentDestination = AppDestination.Home
        }
    }

    val destinations = listOf(
        AppDestination.Home,
        AppDestination.Categories,
        AppDestination.Reader,
        AppDestination.Challenges,
        AppDestination.Favorites
    )

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = when (currentSubScreen) {
                            is SubScreen.Search -> "Buscador de Proverbios"
                            is SubScreen.Settings -> "Ajustes y Créditos"
                            is SubScreen.Achievements -> "Mis Logros"
                            is SubScreen.CategoryDetail -> (currentSubScreen as SubScreen.CategoryDetail).categoryName
                            SubScreen.None -> when (currentDestination) {
                                AppDestination.Home -> "Guía de Proverbios"
                                AppDestination.Categories -> "Temas y Categorías"
                                AppDestination.Reader -> "Lector Bíblico (NBV)"
                                AppDestination.Challenges -> "Retos de Hábitos (66 Días)"
                                AppDestination.Favorites -> "Proverbios Guardados"
                            }
                        },
                        style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
                    )
                },
                navigationIcon = {
                    if (currentSubScreen !is SubScreen.None) {
                        IconButton(onClick = { currentSubScreen = SubScreen.None }) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Volver"
                            )
                        }
                    }
                },
                actions = {
                    if (currentSubScreen is SubScreen.None) {
                        IconButton(
                            onClick = { currentSubScreen = SubScreen.Achievements },
                            modifier = Modifier.testTag("top_achievements_button")
                        ) {
                            Icon(
                                imageVector = Icons.Default.WorkspacePremium,
                                contentDescription = "Mis Logros y Certificados",
                                tint = Color(0xFFC5A059)
                            )
                        }
                        IconButton(
                            onClick = { currentSubScreen = SubScreen.Search },
                            modifier = Modifier.testTag("top_search_button")
                        ) {
                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = "Buscar proverbios"
                            )
                        }
                        IconButton(
                            onClick = { ShareHelper.shareApp(context) },
                            modifier = Modifier.testTag("top_share_app_button")
                        ) {
                            Icon(
                                imageVector = Icons.Default.Share,
                                contentDescription = "Compartir aplicación con amigos o familia",
                                tint = MaterialTheme.colorScheme.primary
                            )
                        }
                        IconButton(
                            onClick = { currentSubScreen = SubScreen.Settings },
                            modifier = Modifier.testTag("top_settings_button")
                        ) {
                            Icon(
                                imageVector = Icons.Default.Settings,
                                contentDescription = "Ajustes"
                            )
                        }
                    } else {
                        IconButton(
                            onClick = { ShareHelper.shareApp(context) },
                            modifier = Modifier.testTag("top_share_app_button")
                        ) {
                            Icon(
                                imageVector = Icons.Default.Share,
                                contentDescription = "Compartir aplicación"
                            )
                        }
                    }
                }
            )
        },
        bottomBar = {
            if (currentSubScreen is SubScreen.None) {
                NavigationBar(
                    modifier = Modifier.testTag("bottom_nav_bar")
                ) {
                    destinations.forEach { dest ->
                        val selected = currentDestination == dest
                        NavigationBarItem(
                            selected = selected,
                            onClick = { currentDestination = dest },
                            icon = {
                                Icon(
                                    imageVector = dest.icon,
                                    contentDescription = dest.title
                                )
                            },
                            label = { Text(dest.title) },
                            modifier = Modifier.testTag("nav_item_${dest.route}")
                        )
                    }
                }
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            when (val sub = currentSubScreen) {
                is SubScreen.Search -> {
                    SearchScreen(
                        viewModel = viewModel,
                        onNavigateToChapter = { chapter, verseNumber ->
                            viewModel.navigateToChapterAndVerse(chapter, verseNumber)
                            currentSubScreen = SubScreen.None
                            currentDestination = AppDestination.Reader
                        }
                    )
                }
                is SubScreen.Settings -> {
                    SettingsScreen(viewModel = viewModel)
                }
                is SubScreen.Achievements -> {
                    MyAchievementsScreen(
                        viewModel = viewModel,
                        onNavigateToChallenges = {
                            currentSubScreen = SubScreen.None
                            currentDestination = AppDestination.Challenges
                        }
                    )
                }
                is SubScreen.CategoryDetail -> {
                    CategoryVersesScreen(
                        categoryName = sub.categoryName,
                        viewModel = viewModel,
                        onBack = { currentSubScreen = SubScreen.None },
                        onNavigateToChapter = { chapter, verseNumber ->
                            viewModel.navigateToChapterAndVerse(chapter, verseNumber)
                            currentSubScreen = SubScreen.None
                            currentDestination = AppDestination.Reader
                        }
                    )
                }
                SubScreen.None -> {
                    when (currentDestination) {
                        AppDestination.Home -> {
                            HomeScreen(
                                viewModel = viewModel,
                                onNavigateToCategory = { categoryName ->
                                    currentSubScreen = SubScreen.CategoryDetail(categoryName)
                                },
                                onNavigateToSearch = { currentSubScreen = SubScreen.Search },
                                onNavigateToReader = { chapter, verseNumber ->
                                    viewModel.navigateToChapterAndVerse(chapter, verseNumber)
                                    currentDestination = AppDestination.Reader
                                },
                                onNavigateToChallenges = { currentDestination = AppDestination.Challenges },
                                onNavigateToSettings = { currentSubScreen = SubScreen.Settings },
                                onNavigateToAchievements = { currentSubScreen = SubScreen.Achievements }
                            )
                        }
                        AppDestination.Categories -> {
                            CategoriesScreen(
                                viewModel = viewModel,
                                onSelectCategory = { categoryName ->
                                    currentSubScreen = SubScreen.CategoryDetail(categoryName)
                                }
                            )
                        }
                        AppDestination.Reader -> {
                            ReaderScreen(viewModel = viewModel)
                        }
                        AppDestination.Challenges -> {
                            HabitChallengesScreen(
                                viewModel = viewModel,
                                onNavigateToChapter = { chapter, verseNumber ->
                                    viewModel.navigateToChapterAndVerse(chapter, verseNumber)
                                    currentDestination = AppDestination.Reader
                                }
                            )
                        }
                        AppDestination.Favorites -> {
                            FavoritesScreen(
                                viewModel = viewModel,
                                onNavigateToChapter = { chapter, verseNumber ->
                                    viewModel.navigateToChapterAndVerse(chapter, verseNumber)
                                    currentDestination = AppDestination.Reader
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}
