package com.example.ui.screens

import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import coil.compose.AsyncImage
import com.example.data.model.*
import com.example.ui.viewmodel.ProverbsViewModel
import com.example.util.ShareHelper
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun HabitChallengesScreen(
    viewModel: ProverbsViewModel,
    onNavigateToChapter: ((chapter: Int, verseNumber: Int) -> Unit)? = null,
    modifier: Modifier = Modifier
) {
    val challenges = viewModel.habitChallenges
    val progressMap by viewModel.habitProgressMap.collectAsState()
    var selectedChallengeId by remember { mutableStateOf<String?>(null) }
    var viewingCertificate by remember { mutableStateOf<HabitCertificate?>(null) }
    val certificates by viewModel.allCertificates.collectAsState()

    if (viewingCertificate != null) {
        CertificateViewScreen(
            certificate = viewingCertificate!!,
            onBack = { viewingCertificate = null }
        )
        return
    }

    if (selectedChallengeId != null) {
        val selectedChallenge = challenges.find { it.id == selectedChallengeId }
        if (selectedChallenge != null) {
            ChallengeDetailView66(
                challenge = selectedChallenge,
                completedDays = progressMap[selectedChallenge.id] ?: emptySet(),
                viewModel = viewModel,
                onBack = { selectedChallengeId = null },
                onViewCertificate = { cert -> viewingCertificate = cert },
                onNavigateToChapter = onNavigateToChapter
            )
            return
        }
    }

    // Lista principal de los Retos de 66 Días
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .testTag("habit_challenges_list"),
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 12.dp, bottom = 88.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        // Cabecera explicativa del método científico de los 66 días
        item {
            Card(
                shape = RoundedCornerShape(22.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.5f)
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(20.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Surface(
                            shape = CircleShape,
                            color = MaterialTheme.colorScheme.primary,
                            modifier = Modifier.size(46.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.EmojiEvents,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(26.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(14.dp))
                        Column {
                            Text(
                                text = "Retos de Hábitos (66 Días)",
                                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
                            )
                            Text(
                                text = "Método científico de transformación personal",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "La neurociencia demuestra que se requieren en promedio 66 días para automatizar un hábito duradero en el cerebro (Lally, UCL). Con el acompañamiento de un coach personal, sabiduría bíblica y tu propia Bitácora, conquistarás el cambio definitivo.",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            lineHeight = 22.sp,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Fase 1: Ruptura (1-22)",
                            style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.secondary)
                        )
                        Text(
                            text = "Fase 2: Instalación (23-44)",
                            style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary)
                        )
                        Text(
                            text = "Fase 3: Integración (45-66)",
                            style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.tertiary)
                        )
                    }
                }
            }
        }

        item {
            Text(
                text = "Selecciona tu reto de 66 días:",
                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(top = 4.dp)
            )
        }

        items(challenges, key = { it.id }) { challenge ->
            val completedDays = progressMap[challenge.id] ?: emptySet()
            val totalCompleted = completedDays.size
            val progressPercent = (totalCompleted / 66f).coerceIn(0f, 1f)
            val categoryInfo = PredefinedCategories.list.find { it.id.equals(challenge.category, ignoreCase = true) }
            val themeColor = categoryInfo?.color ?: MaterialTheme.colorScheme.primary

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { selectedChallengeId = challenge.id }
                    .testTag("challenge_card_${challenge.id}"),
                shape = RoundedCornerShape(22.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(18.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Surface(
                                shape = RoundedCornerShape(10.dp),
                                color = themeColor.copy(alpha = 0.15f),
                                modifier = Modifier.size(36.dp)
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Icon(
                                        imageVector = getChallengeIcon(challenge.iconKey),
                                        contentDescription = null,
                                        tint = themeColor,
                                        modifier = Modifier.size(20.dp)
                                    )
                                }
                            }
                            Text(
                                text = challenge.category.uppercase(),
                                style = MaterialTheme.typography.labelSmall.copy(
                                    color = themeColor,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                        }

                        if (totalCompleted == 66) {
                            Surface(
                                shape = RoundedCornerShape(12.dp),
                                color = MaterialTheme.colorScheme.primary
                            ) {
                                Row(
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(Icons.Default.CheckCircle, contentDescription = null, tint = Color.White, modifier = Modifier.size(14.dp))
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text("¡Completado 66D!", style = MaterialTheme.typography.labelSmall.copy(color = Color.White))
                                }
                            }
                        } else {
                            Text(
                                text = "$totalCompleted de 66 días (${(progressPercent * 100).toInt()}%)",
                                style = MaterialTheme.typography.labelMedium.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = themeColor
                                )
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = challenge.title,
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = challenge.description,
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            lineHeight = 20.sp
                        )
                    )

                    Spacer(modifier = Modifier.height(14.dp))

                    LinearProgressIndicator(
                        progress = { progressPercent },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(8.dp)
                            .clip(RoundedCornerShape(4.dp)),
                        color = themeColor,
                        trackColor = themeColor.copy(alpha = 0.2f)
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    val cert = certificates.find { it.challengeId == challenge.id }
                    if (totalCompleted == 66) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Button(
                                onClick = {
                                    if (cert != null) {
                                        viewingCertificate = cert
                                    } else {
                                        selectedChallengeId = challenge.id
                                    }
                                },
                                modifier = Modifier.weight(1f),
                                shape = RoundedCornerShape(12.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFC5A059))
                            ) {
                                Icon(Icons.Default.WorkspacePremium, contentDescription = null, tint = Color.White, modifier = Modifier.size(16.dp))
                                Spacer(modifier = Modifier.width(6.dp))
                                Text("Ver Certificado 🏆", fontWeight = FontWeight.Bold, color = Color.White)
                            }

                            OutlinedButton(
                                onClick = { selectedChallengeId = challenge.id },
                                shape = RoundedCornerShape(12.dp)
                            ) {
                                Text("Ver Plan", style = MaterialTheme.typography.labelMedium)
                            }
                        }
                    } else {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = if (totalCompleted == 0) "Empezar Día 1" else "Continuar Día ${totalCompleted + 1}",
                                style = MaterialTheme.typography.labelMedium.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = themeColor
                                )
                            )
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                contentDescription = null,
                                tint = themeColor,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChallengeDetailView66(
    challenge: HabitChallenge,
    completedDays: Set<Int>,
    viewModel: ProverbsViewModel,
    onBack: () -> Unit,
    onViewCertificate: (HabitCertificate) -> Unit,
    onNavigateToChapter: ((chapter: Int, verseNumber: Int) -> Unit)? = null
) {
    BackHandler { onBack() }

    var selectedTabIndex by remember { mutableStateOf(0) }
    var selectedPhaseFilter by remember { mutableStateOf(0) } // 0 = Todos, 1 = Fase 1, 2 = Fase 2, 3 = Fase 3
    var showNewEntryDialog by remember { mutableStateOf(false) }
    var selectedDayForNewEntry by remember { mutableStateOf(1) }

    // Estados para la certificación
    var showCelebrationDialog by remember { mutableStateOf(false) }
    var showNameInputDialog by remember { mutableStateOf(false) }

    val totalCompleted = completedDays.size
    val progressPercent = (totalCompleted / 66f).coerceIn(0f, 1f)
    val categoryInfo = PredefinedCategories.list.find { it.id.equals(challenge.category, ignoreCase = true) }
    val themeColor = categoryInfo?.color ?: MaterialTheme.colorScheme.primary

    val journalEntries by viewModel.getJournalEntries(challenge.id).collectAsState(initial = emptyList())
    val existingCertificate by viewModel.observeCertificateForChallenge(challenge.id).collectAsState(initial = null)

    val filteredDays = remember(selectedPhaseFilter, challenge.days) {
        when (selectedPhaseFilter) {
            1 -> challenge.days.filter { it.phaseNumber == 1 }
            2 -> challenge.days.filter { it.phaseNumber == 2 }
            3 -> challenge.days.filter { it.phaseNumber == 3 }
            else -> challenge.days
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = challenge.title,
                        style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Volver")
                    }
                },
                actions = {
                    if (totalCompleted == 66) {
                        IconButton(
                            onClick = {
                                if (existingCertificate != null) {
                                    onViewCertificate(existingCertificate!!)
                                } else {
                                    showNameInputDialog = true
                                }
                            },
                            modifier = Modifier.testTag("top_bar_certificate_button")
                        ) {
                            Icon(
                                imageVector = Icons.Default.WorkspacePremium,
                                contentDescription = "Ver Certificado",
                                tint = Color(0xFFC5A059)
                            )
                        }
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            // Barra de progreso y estado superior
            Surface(
                color = themeColor.copy(alpha = 0.12f),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(horizontal = 18.dp, vertical = 14.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Progreso del Hábito",
                            style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
                        )
                        Text(
                            text = "$totalCompleted de 66 días • ${(progressPercent * 100).toInt()}%",
                            style = MaterialTheme.typography.labelMedium.copy(
                                fontWeight = FontWeight.Bold,
                                color = themeColor
                            )
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    LinearProgressIndicator(
                        progress = { progressPercent },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(10.dp)
                            .clip(RoundedCornerShape(5.dp)),
                        color = themeColor,
                        trackColor = themeColor.copy(alpha = 0.25f)
                    )

                    // Banner de certificación en la cabecera si completó los 66 días
                    if (totalCompleted == 66) {
                        Spacer(modifier = Modifier.height(12.dp))
                        Surface(
                            shape = RoundedCornerShape(14.dp),
                            color = Color(0xFFFAF5EA),
                            border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFC5A059)),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Row(
                                modifier = Modifier
                                    .padding(horizontal = 12.dp, vertical = 10.dp)
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.weight(1f)
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.WorkspacePremium,
                                        contentDescription = null,
                                        tint = Color(0xFF8C6228),
                                        modifier = Modifier.size(26.dp)
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Column {
                                        Text(
                                            text = "¡66 Días Completados!",
                                            style = MaterialTheme.typography.titleSmall.copy(
                                                fontWeight = FontWeight.Bold,
                                                color = Color(0xFF8C6228)
                                            )
                                        )
                                        Text(
                                            text = if (existingCertificate != null) "Certificado emitido y listo" else "Reclama tu diploma de honor",
                                            style = MaterialTheme.typography.bodySmall,
                                            color = MaterialTheme.colorScheme.onSurfaceVariant
                                        )
                                    }
                                }

                                Button(
                                    onClick = {
                                        if (existingCertificate != null) {
                                            onViewCertificate(existingCertificate!!)
                                        } else {
                                            showNameInputDialog = true
                                        }
                                    },
                                    shape = RoundedCornerShape(10.dp),
                                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFC5A059))
                                ) {
                                    Text(
                                        text = if (existingCertificate != null) "Ver Diploma" else "Obtener",
                                        style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold, color = Color.White)
                                    )
                                }
                            }
                        }
                    }
                }
            }

            // Pestañas principales: Plan de 66 Días vs. Mi Bitácora
            TabRow(
                selectedTabIndex = selectedTabIndex,
                containerColor = MaterialTheme.colorScheme.surface
            ) {
                Tab(
                    selected = selectedTabIndex == 0,
                    onClick = { selectedTabIndex = 0 },
                    text = { Text("Plan de 66 Días", style = MaterialTheme.typography.titleSmall) },
                    icon = { Icon(Icons.Default.FormatListNumbered, contentDescription = null) }
                )
                Tab(
                    selected = selectedTabIndex == 1,
                    onClick = { selectedTabIndex = 1 },
                    text = { Text("Mi Bitácora (${journalEntries.size})", style = MaterialTheme.typography.titleSmall) },
                    icon = { Icon(Icons.Default.Book, contentDescription = null) }
                )
            }

            if (selectedTabIndex == 0) {
                // PESTAÑA 1: PLAN DE 66 DÍAS
                Column(modifier = Modifier.fillMaxSize()) {
                    // Selector de fases del hábito
                    LazyRow(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        contentPadding = PaddingValues(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        item {
                            FilterChip(
                                selected = selectedPhaseFilter == 0,
                                onClick = { selectedPhaseFilter = 0 },
                                label = { Text("Todos (1-66)") }
                            )
                        }
                        item {
                            FilterChip(
                                selected = selectedPhaseFilter == 1,
                                onClick = { selectedPhaseFilter = 1 },
                                label = { Text("Fase 1: Ruptura (1-22)") }
                            )
                        }
                        item {
                            FilterChip(
                                selected = selectedPhaseFilter == 2,
                                onClick = { selectedPhaseFilter = 2 },
                                label = { Text("Fase 2: Instalación (23-44)") }
                            )
                        }
                        item {
                            FilterChip(
                                selected = selectedPhaseFilter == 3,
                                onClick = { selectedPhaseFilter = 3 },
                                label = { Text("Fase 3: Integración (45-66)") }
                            )
                        }
                    }

                    LazyColumn(
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 4.dp, bottom = 88.dp),
                        verticalArrangement = Arrangement.spacedBy(14.dp)
                    ) {
                        items(filteredDays, key = { it.dayNumber }) { day ->
                            val isCompleted = completedDays.contains(day.dayNumber)
                            HabitDayCard66(
                                day = day,
                                isCompleted = isCompleted,
                                themeColor = themeColor,
                                onToggleCompleted = {
                                    val willBeCompleted = !isCompleted
                                    viewModel.toggleHabitDay(challenge.id, day.dayNumber, isCompleted)

                                    // Si marca el día 66 como completado (o ya completó los 66), disparar celebración
                                    if (willBeCompleted && (day.dayNumber == 66 || totalCompleted >= 65)) {
                                        showCelebrationDialog = true
                                    }
                                },
                                onWriteJournal = {
                                    selectedDayForNewEntry = day.dayNumber
                                    showNewEntryDialog = true
                                },
                                onNavigateToChapter = onNavigateToChapter
                            )
                        }
                    }
                }
            } else {
                // PESTAÑA 2: MI BITÁCORA (DIARIO PERSONAL)
                BitacoraJournalTab(
                    challenge = challenge,
                    entries = journalEntries,
                    themeColor = themeColor,
                    onOpenNewEntry = {
                        selectedDayForNewEntry = (totalCompleted + 1).coerceIn(1, 66)
                        showNewEntryDialog = true
                    },
                    onDeleteEntry = { entry -> viewModel.deleteJournalEntry(entry) }
                )
            }
        }
    }

    // DIÁLOGO 1: CELEBRACIÓN AL COMPLETAR EL DÍA 66
    if (showCelebrationDialog) {
        ChallengeCelebrationDialog(
            challengeTitle = challenge.title,
            onDismiss = { showCelebrationDialog = false },
            onOpenCertificateForm = {
                showCelebrationDialog = false
                showNameInputDialog = true
            }
        )
    }

    // DIÁLOGO 2: FORMULARIO DE NOMBRE PARA EL CERTIFICADO
    if (showNameInputDialog) {
        CertificateNameInputDialog(
            challengeTitle = challenge.title,
            initialName = existingCertificate?.userName ?: "",
            onDismiss = { showNameInputDialog = false },
            onConfirmName = { confirmedName ->
                val newCert = HabitCertificate(
                    challengeId = challenge.id,
                    challengeTitle = challenge.title,
                    userName = confirmedName,
                    completionDate = System.currentTimeMillis(),
                    startDate = System.currentTimeMillis() - (66L * 24 * 60 * 60 * 1000),
                    featuredVerseRef = "Proverbios 4:13",
                    featuredVerseText = "Aférrate a la instrucción, no la dejes ir; cuídala bien, porque ella es tu vida.",
                    motivationalPhrase = "La constancia y la sabiduría forjan el destino. Has conquistado 66 días de transformación personal."
                )
                viewModel.saveCertificate(newCert)
                showNameInputDialog = false
                onViewCertificate(newCert)
            }
        )
    }

    // Diálogo para crear una nueva entrada en la Bitácora
    if (showNewEntryDialog) {
        val currentDayData = challenge.days.find { it.dayNumber == selectedDayForNewEntry }
        NewJournalEntryDialog(
            challengeId = challenge.id,
            challengeTitle = challenge.title,
            defaultDay = selectedDayForNewEntry,
            verseReference = currentDayData?.verseReference ?: "Proverbios",
            verseText = currentDayData?.verseText ?: "",
            themeColor = themeColor,
            onDismiss = { showNewEntryDialog = false },
            onSave = { feelings, achievements, photoUri, dayNumber ->
                viewModel.saveJournalEntry(
                    ChallengeJournalEntry(
                        challengeId = challenge.id,
                        dayNumber = dayNumber,
                        feelings = feelings,
                        achievements = achievements,
                        photoUri = photoUri,
                        verseReference = currentDayData?.verseReference ?: "",
                        verseText = currentDayData?.verseText ?: ""
                    )
                )
                showNewEntryDialog = false
            }
        )
    }
}

/**
 * Tarjeta interactiva de un día específico en el reto de 66 días con enfoque de coach.
 */
@Composable
fun HabitDayCard66(
    day: HabitDay,
    isCompleted: Boolean,
    themeColor: Color,
    onToggleCompleted: () -> Unit,
    onWriteJournal: () -> Unit,
    onNavigateToChapter: ((chapter: Int, verseNumber: Int) -> Unit)? = null
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .testTag("habit_day_card_${day.dayNumber}"),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (isCompleted) {
                MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.45f)
            } else {
                MaterialTheme.colorScheme.surface
            }
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = if (isCompleted) 1.dp else 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp)
        ) {
            // Encabezado del día: Fase, número y estado
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Surface(
                        shape = CircleShape,
                        color = if (isCompleted) themeColor else themeColor.copy(alpha = 0.15f),
                        modifier = Modifier.size(36.dp)
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            if (isCompleted) {
                                Icon(Icons.Default.Check, contentDescription = null, tint = Color.White, modifier = Modifier.size(20.dp))
                            } else {
                                Text(
                                    text = "${day.dayNumber}",
                                    style = MaterialTheme.typography.titleSmall.copy(
                                        color = themeColor,
                                        fontWeight = FontWeight.Bold
                                    )
                                )
                            }
                        }
                    }

                    Column {
                        Text(
                            text = "DÍA ${day.dayNumber} • FASE ${day.phaseNumber}",
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = themeColor,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(
                            text = day.title,
                            style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                        )
                    }
                }

                Surface(
                    shape = RoundedCornerShape(10.dp),
                    color = if (isCompleted) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.surfaceVariant
                ) {
                    Text(
                        text = if (isCompleted) "✓ Completado" else "Pendiente",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = if (isCompleted) MaterialTheme.colorScheme.onPrimaryContainer else MaterialTheme.colorScheme.onSurfaceVariant,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Badge con la categoría de actividad del coach
            Surface(
                shape = RoundedCornerShape(8.dp),
                color = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.6f)
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = getCoachIcon(day.activityType),
                        contentDescription = null,
                        modifier = Modifier.size(14.dp),
                        tint = MaterialTheme.colorScheme.onSecondaryContainer
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = day.activityType.label,
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Versículo del día (NBV)
            Surface(
                shape = RoundedCornerShape(14.dp),
                color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Text(
                        text = "«${day.verseText}»",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            fontFamily = FontFamily.Serif,
                            lineHeight = 22.sp
                        )
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "— ${day.verseReference} (NBV)",
                            style = MaterialTheme.typography.labelSmall.copy(
                                fontWeight = FontWeight.Bold,
                                color = themeColor
                            )
                        )
                        if (onNavigateToChapter != null) {
                            val parsed = remember(day.verseReference) {
                                val regex = Regex("""(\d+)\s*:\s*(\d+)""")
                                val match = regex.find(day.verseReference)
                                if (match != null) {
                                    Pair(match.groupValues[1].toInt(), match.groupValues[2].toInt())
                                } else null
                            }
                            if (parsed != null) {
                                TextButton(
                                    onClick = { onNavigateToChapter(parsed.first, parsed.second) },
                                    contentPadding = PaddingValues(horizontal = 6.dp, vertical = 2.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.MenuBook,
                                        contentDescription = null,
                                        modifier = Modifier.size(14.dp),
                                        tint = themeColor
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text(
                                        text = "Ver en capítulo",
                                        style = MaterialTheme.typography.labelSmall.copy(
                                            fontWeight = FontWeight.Bold,
                                            color = themeColor
                                        )
                                    )
                                }
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Consejo breve para tu día a día
            Text(
                text = day.reflection,
                style = MaterialTheme.typography.bodyMedium.copy(
                    lineHeight = 20.sp,
                    color = MaterialTheme.colorScheme.onSurface
                )
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Paso de acción con enfoque de coach
            Surface(
                shape = RoundedCornerShape(12.dp),
                color = themeColor.copy(alpha = 0.08f),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    verticalAlignment = Alignment.Top
                ) {
                    Icon(
                        imageVector = Icons.Default.DirectionsRun,
                        contentDescription = null,
                        tint = themeColor,
                        modifier = Modifier.size(20.dp).padding(top = 2.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Text(
                            text = "Paso de acción con tu Coach:",
                            style = MaterialTheme.typography.labelSmall.copy(
                                fontWeight = FontWeight.Bold,
                                color = themeColor
                            )
                        )
                        Text(
                            text = day.practicalTask,
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = MaterialTheme.colorScheme.onSurface,
                                lineHeight = 18.sp
                            )
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Botones interactivos: Marcar completado y Escribir en Bitácora
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = onToggleCompleted,
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(14.dp),
                    colors = if (isCompleted) {
                        ButtonDefaults.outlinedButtonColors(contentColor = MaterialTheme.colorScheme.onSurfaceVariant)
                    } else {
                        ButtonDefaults.buttonColors(containerColor = themeColor)
                    }
                ) {
                    Icon(
                        imageVector = if (isCompleted) Icons.Default.CheckCircle else Icons.Default.RadioButtonUnchecked,
                        contentDescription = null,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = if (isCompleted) "Desmarcar" else "✓ Marcar Día",
                        style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold)
                    )
                }

                OutlinedButton(
                    onClick = onWriteJournal,
                    shape = RoundedCornerShape(14.dp)
                ) {
                    Icon(Icons.Default.Edit, contentDescription = null, modifier = Modifier.size(16.dp))
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("Bitácora", style = MaterialTheme.typography.labelMedium)
                }
            }
        }
    }
}

/**
 * Pestaña de Bitácora personal: lista cronológica de entradas y opción de compartir.
 */
@Composable
fun BitacoraJournalTab(
    challenge: HabitChallenge,
    entries: List<ChallengeJournalEntry>,
    themeColor: Color,
    onOpenNewEntry: () -> Unit,
    onDeleteEntry: (ChallengeJournalEntry) -> Unit
) {
    val context = LocalContext.current

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 12.dp, bottom = 88.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            Button(
                onClick = onOpenNewEntry,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = themeColor)
            ) {
                Icon(Icons.Default.Add, contentDescription = null)
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Nueva Entrada en Mi Bitácora",
                    style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
                )
            }
        }

        if (entries.isEmpty()) {
            item {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(28.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = Icons.Default.Book,
                            contentDescription = null,
                            modifier = Modifier.size(48.dp),
                            tint = themeColor.copy(alpha = 0.5f)
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = "Tu diario de transformación está vacío",
                            style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            text = "Registra tus emociones, logros y fotos de cada día para ver tu evolución a lo largo de los 66 días y compartir tus victorias.",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center
                        )
                    }
                }
            }
        } else {
            items(entries, key = { it.id }) { entry ->
                JournalEntryCard(
                    entry = entry,
                    challengeTitle = challenge.title,
                    themeColor = themeColor,
                    onShare = {
                        ShareHelper.shareJournalEntryAsImage(context, entry, challenge.title)
                    },
                    onDelete = { onDeleteEntry(entry) }
                )
            }
        }
    }
}

/**
 * Tarjeta individual de una entrada en la Bitácora.
 */
@Composable
fun JournalEntryCard(
    entry: ChallengeJournalEntry,
    challengeTitle: String,
    themeColor: Color,
    onShare: () -> Unit,
    onDelete: () -> Unit
) {
    val dateFormat = remember { SimpleDateFormat("d 'de' MMMM, yyyy", Locale("es", "ES")) }
    val formattedDate = remember(entry.dateTimestamp) { dateFormat.format(Date(entry.dateTimestamp)) }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Surface(
                        shape = RoundedCornerShape(8.dp),
                        color = themeColor.copy(alpha = 0.15f)
                    ) {
                        Text(
                            text = "DÍA ${entry.dayNumber}",
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = themeColor,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                    Text(
                        text = formattedDate,
                        style = MaterialTheme.typography.labelMedium.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
                    )
                }

                IconButton(onClick = onDelete) {
                    Icon(
                        imageVector = Icons.Default.DeleteOutline,
                        contentDescription = "Eliminar entrada",
                        tint = MaterialTheme.colorScheme.error
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Foto si existe
            if (!entry.photoUri.isNullOrBlank()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(RoundedCornerShape(14.dp))
                        .background(MaterialTheme.colorScheme.surfaceVariant)
                ) {
                    AsyncImage(
                        model = Uri.parse(entry.photoUri),
                        contentDescription = "Foto de la bitácora",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
                Spacer(modifier = Modifier.height(12.dp))
            }

            // ¿Cómo me sentí hoy?
            Text(
                text = "💭 ¿Cómo me sentí hoy?",
                style = MaterialTheme.typography.labelMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.secondary
                )
            )
            Text(
                text = entry.feelings.ifBlank { "Sin comentarios registrados." },
                style = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.onSurface)
            )

            Spacer(modifier = Modifier.height(8.dp))

            // ¿Qué logros obtuve hoy?
            Text(
                text = "🏆 Logros de hoy:",
                style = MaterialTheme.typography.labelMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
            )
            Text(
                text = entry.achievements.ifBlank { "Paso del día completado con éxito." },
                style = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.onSurface)
            )

            if (entry.verseText.isNotBlank()) {
                Spacer(modifier = Modifier.height(10.dp))
                Surface(
                    shape = RoundedCornerShape(10.dp),
                    color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "«${entry.verseText}» (${entry.verseReference})",
                        modifier = Modifier.padding(10.dp),
                        style = MaterialTheme.typography.bodySmall.copy(
                            fontFamily = FontFamily.Serif,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Botón para compartir en redes sociales con tarjeta motivacional
            FilledTonalButton(
                onClick = onShare,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp)
            ) {
                Icon(Icons.Default.Share, contentDescription = null, modifier = Modifier.size(18.dp))
                Spacer(modifier = Modifier.width(8.dp))
                Text("Compartir tarjeta en redes sociales", style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold))
            }
        }
    }
}

/**
 * Diálogo para redactar una nueva entrada de la Bitácora con soporte para Photo Picker.
 */
@Composable
fun NewJournalEntryDialog(
    challengeId: String,
    challengeTitle: String,
    defaultDay: Int,
    verseReference: String,
    verseText: String,
    themeColor: Color,
    onDismiss: () -> Unit,
    onSave: (feelings: String, achievements: String, photoUri: String?, dayNumber: Int) -> Unit
) {
    var dayNumber by remember { mutableStateOf(defaultDay) }
    var feelings by remember { mutableStateOf("") }
    var achievements by remember { mutableStateOf("") }
    var selectedPhotoUri by remember { mutableStateOf<Uri?>(null) }

    val photoPickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.PickVisualMedia()
    ) { uri: Uri? ->
        selectedPhotoUri = uri
    }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth(0.94f)
                .fillMaxHeight(0.90f)
                .clip(RoundedCornerShape(26.dp)),
            shape = RoundedCornerShape(26.dp),
            color = MaterialTheme.colorScheme.surface,
            tonalElevation = 6.dp
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "Mi Bitácora de Hoy",
                            style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
                        )
                        Text(
                            text = "$challengeTitle • Día $dayNumber de 66",
                            style = MaterialTheme.typography.labelMedium.copy(color = themeColor)
                        )
                    }
                    IconButton(onClick = onDismiss) {
                        Icon(Icons.Default.Close, contentDescription = "Cerrar")
                    }
                }

                HorizontalDivider(modifier = Modifier.padding(vertical = 12.dp))

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(14.dp)
                ) {
                    // Selector de día (1 a 66)
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text("Día del reto:", style = MaterialTheme.typography.titleSmall)
                        IconButton(onClick = { if (dayNumber > 1) dayNumber-- }) {
                            Icon(Icons.Default.Remove, contentDescription = null)
                        }
                        Surface(
                            shape = RoundedCornerShape(8.dp),
                            color = themeColor.copy(alpha = 0.15f)
                        ) {
                            Text(
                                text = "Día $dayNumber",
                                modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                                style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold, color = themeColor)
                            )
                        }
                        IconButton(onClick = { if (dayNumber < 66) dayNumber++ }) {
                            Icon(Icons.Default.Add, contentDescription = null)
                        }
                    }

                    // Pregunta 1: ¿Cómo me sentí hoy?
                    OutlinedTextField(
                        value = feelings,
                        onValueChange = { feelings = it },
                        label = { Text("¿Cómo me sentí hoy? (energía, ánimo, reflexiones)") },
                        modifier = Modifier.fillMaxWidth(),
                        minLines = 3,
                        maxLines = 5,
                        shape = RoundedCornerShape(14.dp)
                    )

                    // Pregunta 2: ¿Qué logros obtuve hoy?
                    OutlinedTextField(
                        value = achievements,
                        onValueChange = { achievements = it },
                        label = { Text("¿Qué logros obtuve hoy? (paso completado, victorias)") },
                        modifier = Modifier.fillMaxWidth(),
                        minLines = 3,
                        maxLines = 5,
                        shape = RoundedCornerShape(14.dp)
                    )

                    // Foto opcional
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(14.dp),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
                    ) {
                        Column(modifier = Modifier.padding(14.dp)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text("Foto del momento (opcional):", style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Bold))
                                Button(
                                    onClick = {
                                        photoPickerLauncher.launch(
                                            PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly)
                                        )
                                    },
                                    shape = RoundedCornerShape(10.dp)
                                ) {
                                    Icon(Icons.Default.PhotoCamera, contentDescription = null, modifier = Modifier.size(16.dp))
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Text("Elegir foto")
                                }
                            }

                            if (selectedPhotoUri != null) {
                                Spacer(modifier = Modifier.height(10.dp))
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(150.dp)
                                        .clip(RoundedCornerShape(10.dp))
                                ) {
                                    AsyncImage(
                                        model = selectedPhotoUri,
                                        contentDescription = "Foto elegida",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop
                                    )
                                    IconButton(
                                        onClick = { selectedPhotoUri = null },
                                        modifier = Modifier.align(Alignment.TopEnd)
                                    ) {
                                        Icon(Icons.Default.Cancel, contentDescription = "Quitar foto", tint = Color.White)
                                    }
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                Button(
                    onClick = {
                        onSave(feelings, achievements, selectedPhotoUri?.toString(), dayNumber)
                    },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = themeColor)
                ) {
                    Text(
                        text = "Guardar en Mi Bitácora",
                        style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
                    )
                }
            }
        }
    }
}

fun getChallengeIcon(key: String): ImageVector {
    return when (key) {
        "account_balance_wallet" -> Icons.Default.AccountBalanceWallet
        "monitor_weight" -> Icons.Default.FitnessCenter
        "fitness_center" -> Icons.Default.FitnessCenter
        "pedal_bike" -> Icons.Default.DirectionsBike
        "spa" -> Icons.Default.Spa
        "sentiment_very_satisfied" -> Icons.Default.SentimentVerySatisfied
        "track_changes" -> Icons.Default.TrackChanges
        "home" -> Icons.Default.Home
        else -> Icons.Default.Flag
    }
}

fun getCoachIcon(type: CoachActivityType): ImageVector {
    return when (type) {
        CoachActivityType.EJERCICIO -> Icons.Default.FitnessCenter
        CoachActivityType.NUTRICION -> Icons.Default.Restaurant
        CoachActivityType.NATURALEZA -> Icons.Default.Park
        CoachActivityType.RESPIRACION -> Icons.Default.Air
        CoachActivityType.DESCANSO -> Icons.Default.Bedtime
        CoachActivityType.GRATITUD -> Icons.Default.Favorite
        CoachActivityType.DESCONEXION -> Icons.Default.PhonelinkErase
        CoachActivityType.ACCION_PRACTICA -> Icons.Default.TrackChanges
    }
}
