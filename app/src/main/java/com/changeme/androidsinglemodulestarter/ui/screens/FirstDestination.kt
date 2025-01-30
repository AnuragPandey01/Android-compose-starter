package com.changeme.androidsinglemodulestarter.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun FirstDestination(
    onNavigateToSecondDestination: () -> Unit
) {

    Scaffold { padding ->
        Column(
            modifier = Modifier.padding(padding).fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier.padding(padding),
                text = "Hello world, from FirstDestination!",
                fontSize = 22.sp
            )

            Button(
                onClick = {
                    onNavigateToSecondDestination()
                }
            ) {
                Text("Go to your aa")
            }
        }
    }
}