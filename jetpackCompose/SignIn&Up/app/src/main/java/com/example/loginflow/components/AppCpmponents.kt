package com.example.loginflow.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp




@Composable
fun NormalTextComponent(topText: String, bottomText: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp), // Padding from the top
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = topText,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFFA500) // Orange color
            ),
            textAlign = androidx.compose.ui.text.style.TextAlign.Center
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = bottomText,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Normal
            ),
            textAlign = androidx.compose.ui.text.style.TextAlign.Center
        )
    }
}

@Composable
fun AuthScreen(
    title: String,
    buttonText: String,
    secondaryActionText: String,
    onAuthAction: () -> Unit,
    onSecondaryAction: () -> Unit // Add this parameter
) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.padding(bottom = 16.dp)
        )
        TextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("USERNAME") },
            placeholder = { Text("Enter username") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("PASSWORD") },
            placeholder = { Text("Enter password") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        CustomButton(
            onAuthAction = onAuthAction,
            buttonText = buttonText
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = secondaryActionText,
            style = TextStyle(
                fontSize = 14.sp,
                color = Color.Gray
            ),
            modifier = Modifier.clickable { onSecondaryAction() } // Make text clickable
        )
    }
}



@Composable
fun CustomButton(onAuthAction: () -> Unit, buttonText: String) {
    Button(
        onClick = onAuthAction,
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF03A9F4), // Light blue background color
            contentColor = Color.White // White text color
        ),
        shape = RoundedCornerShape(8.dp) // Rounded corners with 8.dp radius
    ) {
        Text(buttonText)
    }
}

