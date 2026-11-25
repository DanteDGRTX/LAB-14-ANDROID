package com.example.lab14_android

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
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
    val context = LocalContext.current
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
            text = "El widget ofrece accesos directos a la pantalla principal y a una vista de trabajo independiente.",
            style = MaterialTheme.typography.bodyMedium,
            color = Color(0xFF65758C),
        )
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                Text(
                    text = "Vista previa del widget",
                    style = MaterialTheme.typography.titleMedium,
                    color = Color(0xFF315B91),
                    fontWeight = FontWeight.SemiBold,
                )
                Text(
                    text = "¿A dónde quieres dirigirte?",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color(0xFF183153),
                )
                Text(
                    text = "Dante Gonzales",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color(0xFF65758C),
                    fontWeight = FontWeight.Medium,
                )
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Button(
                        onClick = {
                            Toast.makeText(context, "Ya estás en la página principal", Toast.LENGTH_SHORT).show()
                        },
                    ) {
                        Text("Inicio")
                    }
                    Button(
                        onClick = {
                            context.startActivity(Intent(context, WorkActivity::class.java))
                        },
                    ) {
                        Text("Trabajo")
                    }
                }
            }
        }
    }
}
