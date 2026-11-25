package com.example.lab14_android

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

class WorkActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFF3F6FB),
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Text(
                            text = "Vista de trabajo",
                            style = MaterialTheme.typography.headlineMedium,
                            color = Color(0xFF183153),
                            fontWeight = FontWeight.Bold,
                        )
                        Text(
                            text = "Dante Gonzales · Laboratorio 14",
                            modifier = Modifier.padding(top = 12.dp),
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color(0xFF42536B),
                        )
                        Text(
                            text = "Llegaste a esta pantalla desde el botón Trabajo del widget Glance.",
                            modifier = Modifier.padding(top = 8.dp),
                            style = MaterialTheme.typography.bodyMedium,
                            color = Color(0xFF65758C),
                        )
                        Button(
                            modifier = Modifier.padding(top = 20.dp),
                            onClick = {
                                startActivity(Intent(this@WorkActivity, MainActivity::class.java))
                                finish()
                            },
                        ) {
                            Text("Volver al inicio")
                        }
                    }
                }
            }
        }
    }
}
