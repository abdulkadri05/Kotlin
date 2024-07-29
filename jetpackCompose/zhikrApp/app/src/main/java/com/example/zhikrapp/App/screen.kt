package com.example.zhikrapp.App

import MainZhikrButton
import TopText
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray) // Set the background color here
            .padding(16.dp), // Add some padding to the main layout
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopText()
        Spacer(modifier = Modifier.height(108.dp))
       // Spacer(modifier = Modifier.weight(1f)) // Flexible spacer to push content down
        MainZhikrButton()
        //Spacer(modifier = Modifier.height(50.dp)) // Spacer for additional padding from the bottom
    }
}




@Preview(showBackground = true)
@Composable
fun PreviewZhikrApp() {
    MainScreen()
}