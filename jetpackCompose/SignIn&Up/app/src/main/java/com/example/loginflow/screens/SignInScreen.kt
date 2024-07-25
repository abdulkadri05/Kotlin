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
fun SignInScreen(navController: NavController) {
    Surface(color = Color.White, modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            // Header Text Component
            NormalTextComponent(
                topText = "Welcome Back!",
                bottomText = "Please sign in to continue."
            )

            // Authentication Form
            AuthScreen(
                title = "Sign In",
                buttonText = "Sign In",
                secondaryActionText = "or Sign Up",
                onAuthAction = { /* Handle sign in action */ },
                onSecondaryAction = { navController.navigate(Screen.SignUp.route) } // Navigate to Sign Up screen
            )
        }
    }
}

@Preview
@Composable
fun SignInScreenPreview() {
    SignInScreen(navController = rememberNavController()) // Pass a dummy NavController for preview
}
