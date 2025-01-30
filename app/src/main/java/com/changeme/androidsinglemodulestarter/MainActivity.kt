package com.changeme.androidsinglemodulestarter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.changeme.androidsinglemodulestarter.ui.navigation.AppNavHost
import com.changeme.androidsinglemodulestarter.ui.theme.AppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            AppContent()
        }
    }
}

@Composable
private fun AppContent() {
    val navController = rememberNavController()

    AppTheme {
        AppNavHost(
            navController = navController
        )
    }
}