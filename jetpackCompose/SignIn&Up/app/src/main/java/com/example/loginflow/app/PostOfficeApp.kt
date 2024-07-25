// File: PostOfficeApp.kt
package com.example.loginflow.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginflow.screens.Screen
import com.example.loginflow.screens.SignInScreen
import com.example.loginflow.screens.SignUpScreen

@Composable
fun PostOfficeApp() {
    // Create a NavController
    val navController = rememberNavController()

    // Set up the navigation host
    NavHost(navController = navController, startDestination = Screen.SignIn.route) {
        composable(Screen.SignIn.route) {
            SignInScreen(navController = navController)
        }
        composable(Screen.SignUp.route) {
            SignUpScreen(navController = navController)
        }
    }
}
