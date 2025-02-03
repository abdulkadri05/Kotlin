package com.example.groceryai.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.groceryai.R
import com.example.groceryai.model.GroceryItem
import com.example.groceryai.ui.screens.HomeScreen

@Composable
fun NavigationBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth() // Use fillMaxWidth if you want the navigation bar to stretch
            .height(86.dp) // Define height explicitly
            .padding(start = 16.dp, end = 16.dp, bottom = 34.dp) // Adjust padding
            .background(Color.Black),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { /* Navigate to Home Screen */ }) {
            Icon(
                Icons.Default.Home,
                contentDescription = "Home Icon",
                tint = Color.White
            )
        }
        IconButton(onClick = { /* Navigate to Cart Screen */ }) {
            Icon(
                Icons.Default.ShoppingCart,
                contentDescription = "Cart Icon",
                tint = Color.White
            )
        }
        IconButton(onClick = { /* Navigate to AI/Settings */ }) {
            Icon(
                Icons.Default.Search,
                contentDescription = "AI",
                tint = Color.White
            )
        }
    }

}

@Preview
@Composable
fun NavigationBarPreview() {
    NavigationBar()
}