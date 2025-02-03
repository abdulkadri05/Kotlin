package com.example.groceryai.model

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

data class GroceryItem(
    val name: String,
    val price: Double,
    val imageUrl: String,
)

val groceryItems = listOf(
    GroceryItem(
        name = "Tomatoes",
        price = 3.99,
        imageUrl = "https://www.kingsseeds.co.nz/cdn/shop/products/V8332-1.png?v=1688022712"
    ),
    GroceryItem(
        name = "Bananas",
        price = 1.49,
        imageUrl = "https://www.rainforest-alliance.org/wp-content/uploads/2021/06/bananas-1-e1624909301641.jpg.optimal.jpg"
    ),
    GroceryItem(
        name = "Milk",
        price = 2.99,
        imageUrl = "https://images.milkandmore.co.uk/image/upload/f_auto,q_auto:eco/w_iw/f_auto/w_800,d_back_up_image.jpg,c_scale/v1727954044/Blog/Lifestyle/milk-shelf-life.jpg"
    ),
    GroceryItem(
        name = "Eggs",
        price = 4.50,
        imageUrl = "https://cdn.britannica.com/94/151894-050-F72A5317/Brown-eggs.jpg"
    ),
    GroceryItem(
        name = "Bread",
        price = 2.79,
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRgkeYnkvGnkSzX16RireD06ZhVdjT1EZ6FUg&s"
    ),
)