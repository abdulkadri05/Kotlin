package com.yourpackage.ui

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.yourpackage.model.CartItem
import com.yourpackage.model.Item

class CartViewModel : ViewModel() {
    private val _cartItems = mutableStateListOf<CartItem>()
    val cartItems: List<CartItem> get() = _cartItems


    fun addToCart(item: Item) {
        val index = _cartItems.indexOfFirst { it.item.id == item.id }
        if (index == -1) {
            _cartItems.add(CartItem(item = item, quantity = 0))
        } else {
            val existingItem = _cartItems[index]
            _cartItems[index] = existingItem.copy(quantity = existingItem.quantity + 1)
        }
    }


    fun removeFromCart(item: Item) {
        val index = _cartItems.indexOfFirst { it.item.id == item.id }
        if (index != -1) {
            val existingItem = _cartItems[index]
            if (existingItem.quantity > 0) {
                _cartItems[index] = existingItem.copy(quantity = existingItem.quantity - 1)
            } else {
                _cartItems.removeAt(index)
            }
        }
    }


    fun getQuantity(item: Item): Int {
        val cartItem = _cartItems.find { it.item.id == item.id }
        return cartItem?.quantity ?: 0
    }
}

