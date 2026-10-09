package com.example.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = OliveGreenDarkPrimary,
    onPrimary = Color(0xFF032B14),
    primaryContainer = OliveGreenDarkContainer,
    onPrimaryContainer = OnOliveDarkContainer,
    secondary = WarmWoodDarkSecondary,
    onSecondary = Color(0xFF382305),
    secondaryContainer = WarmWoodDarkContainer,
    onSecondaryContainer = OnWarmWoodDarkContainer,
    tertiary = SereneBlueDarkTertiary,
    onTertiary = Color(0xFF04273A),
    tertiaryContainer = SereneBlueDarkContainer,
    onTertiaryContainer = OnSereneBlueDarkContainer,
    background = DarkBackground,
    onBackground = TextPrimaryDark,
    surface = DarkSurface,
    onSurface = TextPrimaryDark,
    surfaceVariant = DarkSurfaceVariant,
    onSurfaceVariant = TextSecondaryDark,
    outline = Color(0xFF4C574F)
)

private val LightColorScheme = lightColorScheme(
    primary = OliveGreenPrimary,
    onPrimary = Color.White,
    primaryContainer = OliveGreenContainer,
    onPrimaryContainer = OnOliveContainer,
    secondary = WarmWoodGold,
    onSecondary = Color.White,
    secondaryContainer = WarmWoodContainer,
    onSecondaryContainer = OnWarmWoodContainer,
    tertiary = SereneBlueTertiary,
    onTertiary = Color.White,
    tertiaryContainer = SereneBlueContainer,
    onTertiaryContainer = OnSereneBlueContainer,
    background = CreamBackgroundLight,
    onBackground = TextPrimaryLight,
    surface = CreamSurfaceLight,
    onSurface = TextPrimaryLight,
    surfaceVariant = CreamSurfaceVariantLight,
    onSurfaceVariant = TextSecondaryLight,
    outline = Color(0xFF828C84)
)

@Composable
fun ProverbsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
