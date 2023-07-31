package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.littlelemon.ui.theme.LittleLemonTheme


@Composable
fun Home() {
    Text(
        text = "Home",
    )
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    LittleLemonTheme {
        Home()

    }
}