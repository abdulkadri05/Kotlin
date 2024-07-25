package com.example.loginflow.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.loginflow.components.AuthScreen
import com.example.loginflow.components.NormalTextComponent


@Composable
fun SignUpScreen(navController: NavController) {
    Surface(color = Color.White, modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            // Header Text Component
            NormalTextComponent(
                topText = "Join Us!",
                bottomText = "Create an account to get started."
            )

            // Authentication Form
            AuthScreen(
                title = "Sign Up",
                buttonText = "Sign Up",
                secondaryActionText = "or Sign In",
                onAuthAction = { /* Handle sign up action */ },
                onSecondaryAction = { navController.navigate(Screen.SignIn.route) } // Navigate to Sign In screen
            )
        }
    }
}

@Preview
@Composable
fun SignUpScreenPreview() {
    SignUpScreen(navController = rememberNavController()) // Pass a dummy NavController for preview
}
