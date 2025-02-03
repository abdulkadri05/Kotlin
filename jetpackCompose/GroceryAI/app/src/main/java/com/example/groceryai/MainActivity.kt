package com.example.groceryai.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.groceryai.ui.theme.GroceryAITheme
import com.example.groceryai.navigation.NavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GroceryAITheme {
                val navController = rememberNavController()

                NavGraph(navController = navController)
            }
        }
    }
}
