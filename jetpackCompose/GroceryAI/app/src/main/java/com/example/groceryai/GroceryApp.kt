package com.example.groceryai.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.groceryai.navigation.NavGraph

@Composable
fun GroceryApp() {
    val navController = rememberNavController() // Create a NavHostController

    // Call NavGraph to handle navigation between screens
    NavGraph(navController = navController)
}
