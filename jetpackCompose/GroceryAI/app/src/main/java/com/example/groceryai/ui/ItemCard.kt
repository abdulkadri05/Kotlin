package com.yourpackage.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.*
import com.yourpackage.model.Item
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Clear
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter



@Composable
fun ItemCard(
    item: Item,
    onAdd: () -> Unit,
    onRemove: () -> Unit,
    onAddToCart: () -> Unit,
    navController: NavHostController
) {
    var quantity by remember { mutableStateOf(0) }


    fun increaseQuantity() {
        quantity += 1
        onAddToCart()
    }

    fun decreaseQuantity() {
        if (quantity > 0) {
            quantity -= 1
            onRemove()
        }
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            if (item.imageUrl.isNotEmpty()) {
                Image(
                    painter = rememberAsyncImagePainter(item.imageUrl),
                    contentDescription = item.name,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                )
            }

            Text(
                text = item.name,
                style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Text(
                text = "\$${item.price}",
                style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                IconButton(onClick = { decreaseQuantity() }) {
                    Icon(
                        imageVector = Icons.Default.Clear,
                        contentDescription = "Remove",
                        modifier = Modifier.size(32.dp),
                        tint = Color.Red
                    )
                }

                Text(
                    text = "$quantity",
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(horizontal = 16.dp)
                )

                IconButton(onClick = { increaseQuantity() }) {
                    Icon(
                        imageVector = Icons.Default.AddCircle,
                        contentDescription = "Add",
                        modifier = Modifier.size(32.dp),
                        tint = Color.Green
                    )
                }
            }


            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = {
                    onAddToCart()
                    navController.navigate("cart")
                },
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "Add to Cart")
            }
        }
    }
}

