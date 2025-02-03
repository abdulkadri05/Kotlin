package com.example.groceryai.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.groceryai.ui.components.GroceryGrid
import com.example.groceryai.ui.components.GroceryItemCard

data class GroceryItem(val name: String, val price: Double)

@Composable
fun CategoryScreen(navController: NavHostController, categoryName: String) {
    val items = when (categoryName) {
        "Fruits" -> listOf(GroceryItem("Apple", 1.0), GroceryItem("Banana", 0.5))
        "Vegetables" -> listOf(GroceryItem("Carrot", 0.7), GroceryItem("Potato", 0.3))
        "Dairy" -> listOf(GroceryItem("Milk", 1.5), GroceryItem("Cheese", 3.0))
        "Snacks" -> listOf(GroceryItem("Chips", 2.0), GroceryItem("Chocolate", 1.5))
        else -> emptyList()
    }

    val cart = remember { mutableStateListOf<GroceryItem>() }

    Scaffold(
        bottomBar = {
            BottomAppBar {
                TextButton(onClick = { navController.navigate("cart") }) {
                    Text(text = "Go to Cart (${cart.size} items)")
                }
            }
        }
    ) { padding ->
        LazyColumn(modifier = Modifier.padding(padding)) {
            items(items.size) { index ->
                val item = items[index]
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { cart.add(item) }
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
