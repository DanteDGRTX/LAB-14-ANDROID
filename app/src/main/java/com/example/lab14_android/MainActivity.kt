package com.example.lab14_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFF3F6FB),
                ) {
                    WidgetSetupScreen()
                }
            }
        }
    }
}

@Composable
private fun WidgetSetupScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(
            text = "Laboratorio 14 · Jetpack Glance",
            style = MaterialTheme.typography.headlineMedium,
            color = Color(0xFF183153),
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = "Widget de accesos rápidos",
            style = MaterialTheme.typography.titleLarge,
            color = Color(0xFF315B91),
            fontWeight = FontWeight.SemiBold,
        )
        Text(
            text = "Este proyecto integra un App Widget con Jetpack Glance. Para probarlo, regresa a la pantalla de inicio, mantén presionado un espacio vacío, abre Widgets y agrega el widget de Lab 14.",
            style = MaterialTheme.typography.bodyLarge,
            color = Color(0xFF42536B),
        )
        Text(
            text = "El botón del widget abre esta aplicación mediante una acción de Glance.",
            style = MaterialTheme.typography.bodyMedium,
            color = Color(0xFF65758C),
        )
    }
}
