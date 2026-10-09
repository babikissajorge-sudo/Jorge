package com.example.ui.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

private data class ConfettiParticle(
    val initialX: Float,
    val initialY: Float,
    val speedY: Float,
    val speedX: Float,
    val size: Float,
    val color: Color
)

@Composable
fun CelebrationConfettiEffect(
    modifier: Modifier = Modifier
) {
    val confettiColors = listOf(
        Color(0xFFC5A059), // Dorado
        Color(0xFF2C553E), // Verde sabio
        Color(0xFF8C7248), // Ocre suave
        Color(0xFF4A7C59), // Verde hoja
        Color(0xFFD4AF37), // Oro brillante
        Color(0xFF5B8266)  // Verde oliva
    )

    val particles = remember {
        List(70) {
            ConfettiParticle(
                initialX = Random.nextFloat(),
                initialY = Random.nextFloat() * -0.5f,
                speedY = 0.25f + Random.nextFloat() * 0.45f,
                speedX = (Random.nextFloat() - 0.5f) * 0.15f,
                size = 10f + Random.nextFloat() * 16f,
                color = confettiColors.random()
            )
        }
    }

    val transition = rememberInfiniteTransition(label = "confetti_anim")
    val progress by transition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 3500, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "confetti_progress"
    )

    Canvas(modifier = modifier.fillMaxSize()) {
        val w = size.width
        val h = size.height

        particles.forEach { p ->
            val curY = ((p.initialY + progress * p.speedY) % 1.2f) * h
            val curX = (p.initialX + progress * p.speedX) * w
            drawCircle(
                color = p.color,
                radius = p.size,
                center = Offset(curX % w, curY)
            )
        }
    }
}
