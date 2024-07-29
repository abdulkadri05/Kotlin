import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TopText() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 39.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "ZHIKR COUNTER",
            textAlign = androidx.compose.ui.text.style.TextAlign.Center,
            style = TextStyle(color = Color.LightGray, fontSize = 28.sp, fontWeight = FontWeight.Bold)
        )
    }
}


@Composable
fun MainZhikrButton() {
    val words = listOf("Subhanallah", "Alhamdulillah", "Allahu Akbar", "Subhan Allahi Wa bi Hamdihi", "La ilaha illa'lah", "Astaghfurllah", "La Hawla Wala Quwwata ila Billah", "Subhan Allahi Wa Bi Hamdihi, Subhan Allahi Adhim")
    var count by remember { mutableIntStateOf(33) }
    var currentIndex by remember { mutableIntStateOf(0) }
    val currentWord = words.getOrNull(currentIndex)

    Column(
        modifier = Modifier
            .fillMaxSize(), // Ensure the column fills the maximum size of the screen
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center // Center the content vertically
    ) {


        Text(
            text = "$currentWord: $count",
            style = TextStyle(color = Color.White, fontSize = 34.sp, fontWeight = FontWeight.Bold) // Increase text size
        )
        Spacer(modifier = Modifier.height(28.dp)) // Increase space between button and text
        Button(
            onClick = {
                if (count > 0) {
                    count--
                } else {
                    count = 33
                    currentIndex = (currentIndex + 1) % words.size
                }
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF006400), // Button background color
                contentColor = Color.White // Button text color
            ),
            shape = RectangleShape, // Use RectangleShape to have sharp corners
            modifier = Modifier
                .size(width = 180.dp, height = 70.dp) // Make the button larger
                //.border(6.dp, Color.White, shape = RectangleShape) // Add a border with 6.dp thickness and white color
        ) {
            Text(
                text = "Zhikr",
                style = TextStyle(color = Color.White, fontSize = 24.sp) // Increase text size
            )
        }
    }
}
