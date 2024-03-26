package com.example.courierapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.courierapp.R
import com.example.courierapp.ui.theme.BlueMain

@Preview
@Composable
fun MySplashScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(BlueMain),
        contentAlignment = Alignment.Center){
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = null,
            modifier = Modifier.height(78.dp),
            contentScale = ContentScale.Crop)

    }
}