package com.yourpackage.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.yourpackage.ui.CartScreen
import com.yourpackage.ui.CartViewModel
import com.yourpackage.ui.HomeScreen
import com.yourpackage.ui.CategoryScreen

@Composable
fun NavGraph(navController: NavHostController) {
    val cartViewModel: CartViewModel = viewModel()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(
                navController = navController,
                cartViewModel = cartViewModel
            )
        }
        composable("category/{categoryId}") { backStackEntry ->
            val categoryId = backStackEntry.arguments?.getString("categoryId") ?: ""
            CategoryScreen(
                navController = navController,
                categoryId = categoryId,
                cartViewModel = cartViewModel
            )
        }
        composable("cart") {
            CartScreen(
                cartItems = cartViewModel.cartItems,
                navController = navController,
                cartViewModel = cartViewModel
            )
        }
    }
}


