package com.aviva.pedro_exercise_compose

import com.aviva.pedro_exercise_compose.ui.Spinner
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.saveable.rememberSaveable
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
    var darkTheme by rememberSaveable { mutableStateOf(false) }
    PedroExerciseComposeTheme(darkTheme = darkTheme) {
        SurfaceComponent(darkTheme) { darkTheme = !darkTheme }
    }
}

@Composable
fun SurfaceComponent(darkTheme: Boolean, onToggleTheme: () -> Unit) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Spinner()
            Switch(
                checked = darkTheme,
                onCheckedChange = { onToggleTheme() },
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(16.dp)
            )
        }
    }
}