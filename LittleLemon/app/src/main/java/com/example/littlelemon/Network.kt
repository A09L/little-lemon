package com.example.littlelemon

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.littlelemon.ui.theme.LittleLemonColor
import com.example.littlelemon.ui.theme.LittleLemonTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(context: Context, navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        HomeHeader(onProfileClick = {
            // Navigate to the Profile screen
            navController.navigate(Profile.route)
        })

        // Static text
        Box(
            modifier = Modifier.height(250.dp).fillMaxWidth().background(LittleLemonColor.green), contentAlignment = Alignment.Center
        )
        {
            Column(
                modifier = Modifier.fillMaxSize(),
            ) {
                Text(
                    text = "Let's get to know you",
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.White
                )
            }
        }

    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeHeader(onProfileClick: () -> Unit) {
    CenterAlignedTopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center

            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Little Lemon Logo",
                    modifier = Modifier
                        .padding(end = 12.dp)
                        .height(30.dp),
                    alignment = Alignment.Center
                )
            }
        },
        actions = {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "Profile",
                modifier = Modifier
                    .padding(end = 12.dp)
                    .height(40.dp)
                    .clickable { onProfileClick() }
            )
        }
    )
}

@Composable
fun HomeContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Static text
        Box(
            modifier = Modifier.height(120.dp).fillMaxWidth().background(LittleLemonColor.green), contentAlignment = Alignment.Center
        )
        {
            Text(
                text = "Let's get to know you",
                style = MaterialTheme.typography.titleLarge,
                color = Color.White
            )
        }
    }
}



