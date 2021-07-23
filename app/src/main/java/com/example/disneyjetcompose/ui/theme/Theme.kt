package com.example.disneyjetcompose.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
  background = background,
  onBackground = background800,
  primary = purple200,
  primaryVariant = purple500,
  secondary = purple500,
  onPrimary = Color.White,
  onSecondary = Color.White
)

@SuppressLint("ConflictingOnColor")
private val LightColorPalette = lightColors(
  background = Color.White,
  onBackground = Color.White,
  surface = Color.White,
  primary = purple200,
  primaryVariant = purple500,
  secondary = purple500,
  onPrimary = Color.White,
  onSecondary = Color.White
)

@Composable
fun DisneyComposeTheme(
  darkTheme: Boolean = isSystemInDarkTheme(),
  content: @Composable () -> Unit
) {
  val colors = if (darkTheme) {
    DarkColorPalette
  } else {
    LightColorPalette
  }

  val typography = if (darkTheme) {
    DarkTypography
  } else {
    LightTypography
  }

  MaterialTheme(
    colors = colors,
    typography = typography,
    shapes = shapes,
    content = content
  )
}
