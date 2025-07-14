package com.example.creed_employee_app.screens

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.creed_employee_app.R
import com.example.creed_employee_app.ui.theme.Black
import com.example.creed_employee_app.ui.theme.OffWhite
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    onNavigateToLogin: () -> Unit
) {
    val alpha = remember { Animatable(0f) }
    
    LaunchedEffect(Unit) {
        // Fade in animation
        alpha.animateTo(
            targetValue = 1f,
            animationSpec = tween(
                durationMillis = 800,
                easing = LinearEasing
            )
        )
        
        // Wait for 2 seconds total (including fade in time)
        delay(1200)
        
        // Navigate to login
        onNavigateToLogin()
    }
    
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(OffWhite),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.alpha(alpha.value)
        ) {
            // Company Logo
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Company Logo",
                modifier = Modifier.size(120.dp),
                contentScale = ContentScale.Fit
            )
            
            // App Title
            Text(
                text = "CREED",
                style = MaterialTheme.typography.headlineLarge.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 32.sp,
                    color = Black
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.alpha(alpha.value)
            )
            
            Text(
                text = "Employee App",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontSize = 16.sp,
                    color = Black.copy(alpha = 0.7f)
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.alpha(alpha.value)
            )
        }
    }
} 