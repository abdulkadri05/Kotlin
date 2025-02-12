package com.yourpackage.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun YourAppTheme(content: @Composable () -> Unit) {
    val colorScheme = lightColorScheme(
        primary = Color(0xFF6200EE),
        primaryContainer = Color(0xFF3700B3),
        onPrimary = Color.White,
        secondary = Color(0xFF03DAC6),
        secondaryContainer = Color(0xFF018786),
        onSecondary = Color.Black,
        background = Color.White,
        onBackground = Color.Black
    )

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}
