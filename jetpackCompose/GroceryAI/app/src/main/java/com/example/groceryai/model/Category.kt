package com.example.groceryai.model

import com.yourpackage.model.Item

data class Category(
    val id: Int,
    val imageUrl: String,
    val name: String,
    val items: List<Item> = emptyList()
)
