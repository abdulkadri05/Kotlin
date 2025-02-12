package com.yourpackage.ui

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.groceryai.categories


@Composable
fun CategoryScreen(navController: NavHostController, categoryId: String, cartViewModel: CartViewModel) {
    val filteredCategory = categories.find { it.id.toString() == categoryId }

    Log.d("CategoryScreen", "Selected category ID: $categoryId")

    if (filteredCategory == null) {
        Text(text = "Category not found")
    } else {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Category: ${filteredCategory.name}", style = MaterialTheme.typography.headlineMedium)

            if (filteredCategory.items.isEmpty()) {
                Text(text = "No items available in this category.")
            } else {
                LazyColumn {
                    items(filteredCategory.items) { item ->
                        ItemCard(
                            item = item,
                            onAdd = { /* Handle add action */ },
                            onRemove = { /* Handle remove action */ },
                            onAddToCart = { cartViewModel.addToCart(item) },
                            navController = navController
                        )
                    }
                }
            }
        }
    }
}

