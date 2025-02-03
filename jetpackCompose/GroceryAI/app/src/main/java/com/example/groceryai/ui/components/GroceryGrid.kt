package com.example.groceryai.ui.components

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.groceryai.model.GroceryItem
import com.example.groceryai.model.groceryItems
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.ui.res.painterResource

@Composable
fun GroceryGrid(
    groceryItems: List<GroceryItem>,
    modifier: Modifier = Modifier,
    onItemClick: (GroceryItem) -> Unit
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(1),
        modifier = modifier
            .background(Color.Black)
    ) {
        items(groceryItems.size) { index ->
            GroceryItemCard(
                groceryItem = groceryItems[index],
                onItemClick = onItemClick
            )
        }
    }
}

@SuppressLint("AutoboxingStateCreation")
@Composable
fun GroceryItemCard(groceryItem: GroceryItem, onItemClick: (GroceryItem) -> Unit) {
    var quantity by remember { mutableIntStateOf(0) }

    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .clickable { onItemClick(groceryItem) }
            .background(Color.Black) // Set card background to black
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(Color.Black)
        ) {
            // Image Box
            val painter = rememberAsyncImagePainter(groceryItem.imageUrl)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp) // Fixed image height
            ) {
                Image(
                    painter = painter,
                    contentDescription = groceryItem.name,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black),
                    contentScale = ContentScale.Crop
                )
            }

            // Text and Buttons Box
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
                    .background(Color.Gray)

            ) {
                // Name of the item
                Text(
                    text = groceryItem.name,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Bold,
                    color = Color.White, // Set text color to white
                    fontSize = 20.sp
                )

                // Price of the item
                    Text(
                    text = "Price:  ${groceryItem.price}kr",
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.Green,
                    modifier = Modifier.padding(top = 4.dp)
                )

                // Quantity control and Cart icon
                Row(
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Decrease button
                    Button(
                        onClick = { if (quantity > 0) quantity-- },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
                    ) {
                        BasicText("-")
                    }

                    // Cart icon button
                    IconButton(onClick = { /* Handle cart click */ }) {
                        Icon(
                            imageVector = Icons.Filled.ShoppingCart, // Use Material Icons for the shopping cart
                            contentDescription = "Cart Icon",
                            modifier = Modifier.size(30.dp),
                            tint = Color.Black
                        )
                    }

                    // Increase button
                    Button(
                        onClick = { quantity++ },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Green)
                    ) {
                        BasicText("+")
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun GroceryGridPreview() {
    GroceryGrid(groceryItems = groceryItems, onItemClick = {})
}
