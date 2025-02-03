package com.example.groceryai.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.groceryai.ui.screens.HomeScreen
import com.example.groceryai.ui.screens.CategoryScreen
import com.example.groceryai.ui.screens.CartScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController = navController)
        }
        composable("category/{categoryName}") { backStackEntry ->
            val categoryName = backStackEntry.arguments?.getString("categoryName") ?: ""
            CategoryScreen(navController = navController, categoryName = categoryName)
        }
        composable("cart") {
            CartScreen(navController = navController)
        }
    }
}
