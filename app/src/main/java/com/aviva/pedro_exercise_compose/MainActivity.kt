package com.aviva.pedro_exercise_compose

import Spinner
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.aviva.pedro_exercise_compose.ui.theme.PedroExerciseComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YourApp()
        }
    }
}

@Composable
fun YourApp() {
    PedroExerciseComposeTheme {
        SurfaceComponent()
    }
}

@Composable
fun SurfaceComponent() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF161616)
    ) {
        Spinner()
    }
}