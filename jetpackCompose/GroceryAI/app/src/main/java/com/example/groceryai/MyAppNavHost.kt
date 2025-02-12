package com.example.groceryai

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.yourpackage.ui.CartScreen
import com.yourpackage.ui.CartViewModel
import com.yourpackage.ui.HomeScreen

@Composable
fun MyAppNavHost(navController: NavHostController) {
    val cartViewModel: CartViewModel = viewModel()
    NavHost(
        navController = navController,
        startDestination = "homeScreen"
    ) {
        composable("homeScreen") {
            HomeScreen(
                navController = navController,
                cartViewModel = cartViewModel
            )
        }
        composable("cartScreen") {
            val cartItems = cartViewModel.cartItems
            CartScreen(
                cartItems = cartItems,
                navController = navController,
                cartViewModel = cartViewModel
            )
        }

    }
}