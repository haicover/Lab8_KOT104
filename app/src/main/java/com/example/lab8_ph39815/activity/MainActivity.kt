package com.example.lab8_ph39815.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab8_ph39815.ui.screens.ScreenNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScreenNavigation()
        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ScreenNavigation()
}