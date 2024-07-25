// File: Screen.kt
package com.example.loginflow.screens

sealed class Screen(val route: String) {
    object SignIn : Screen("signIn")
    object SignUp : Screen("signUp")
}
