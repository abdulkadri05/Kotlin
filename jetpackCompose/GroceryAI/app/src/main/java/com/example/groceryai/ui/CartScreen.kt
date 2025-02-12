package com.yourpackage.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.yourpackage.model.CartItem
import com.yourpackage.model.Item

@Composable
fun CartScreen(
    cartItems: List<CartItem>,
    navController: NavHostController,
    cartViewModel: CartViewModel
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Your Cart",
            style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        if (cartItems.isEmpty()) {
            Text(
                text = "Your cart is empty!",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        } else {
            LazyColumn(
                modifier = Modifier.fillMaxSize()
            ) {
                items(cartItems, key = { it.item.id }) { cartItem ->
                    CartItemCard(cartItem = cartItem)
                }
            }
        }

        Spacer(modifier = Modifier.weight(1f))


        val totalPrice = cartItems.sumOf { it.item.price * it.quantity }
        Text(
            text = "Total: \$${"%.2f".format(totalPrice)}",
            style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
            modifier = Modifier.align(Alignment.End).padding(top = 16.dp)
        )


        Button(
            onClick = { /* Navigate to checkout */ },
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
        ) {
            Text(text = "Proceed to Checkout")
        }
    }
}




@Composable
fun CartItemRow(cartItem: CartItem) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = cartItem.item.name)
        Text(text = "Quantity: ${cartItem.quantity}")
        Text(text = "$${cartItem.item.price * cartItem.quantity}")
    }
}



@Composable
fun CartItemCard(cartItem: CartItem) {
    val itemPrice = remember(cartItem) { cartItem.item.price * cartItem.quantity }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(
                text = cartItem.item.name,
                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "\$${itemPrice}",
                style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Quantity: ${cartItem.quantity}",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}
