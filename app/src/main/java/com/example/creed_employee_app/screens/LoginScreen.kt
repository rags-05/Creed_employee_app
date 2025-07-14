package com.example.creed_employee_app.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.creed_employee_app.ui.theme.Black
import com.example.creed_employee_app.ui.theme.OffWhite

@Composable
fun LoginScreen(
    onNavigateToHome: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(OffWhite),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(32.dp)
        ) {
            Text(
                text = "Login Screen",
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp,
                    color = Black
                ),
                textAlign = TextAlign.Center
            )
            
            Text(
                text = "Coming in Phase 2",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontSize = 16.sp,
                    color = Black.copy(alpha = 0.7f)
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 16.dp)
            )
            
            Text(
                text = "• Email text field\n• Password text field with visibility toggle\n• Login button\n• Form validation\n• Firebase Authentication\n• Remember Me functionality",
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontSize = 14.sp,
                    color = Black.copy(alpha = 0.6f)
                ),
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(top = 24.dp)
            )
        }
    }
} 