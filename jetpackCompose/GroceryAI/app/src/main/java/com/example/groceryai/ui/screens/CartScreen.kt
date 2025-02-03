package com.example.groceryai.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun CartScreen(navController: NavHostController) {
    val cart = remember { mutableStateListOf<GroceryItem>() } // Replace with shared cart in ViewModel
    val totalPrice = cart.sumOf { it.price }

    Scaffold(
        bottomBar = {
            BottomAppBar {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Total: $${String.format("%.2f", totalPrice)}")
                    Button(onClick = { /* Checkout */ }) {
                        Text(text = "Checkout")
                    }
                }
            }
        }
    ) { padding ->
        LazyColumn(modifier = Modifier.padding(padding)) {
            items(cart.size) { index ->
                val item = cart[index]
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = item.name)
                        Text(text = "$${item.price}")
                    }
                }
            }
        }
    }
}
