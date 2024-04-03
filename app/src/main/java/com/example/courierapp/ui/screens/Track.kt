package com.example.courierapp.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.courierapp.ui.elements.MyBottomBar
import com.example.courierapp.ui.elements.MyCheckbox
import com.example.courierapp.ui.theme.BlueMain

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Track(navController: NavController) {
    Scaffold(
        bottomBar = {
            MyBottomBar(navController = navController)
        },
        containerColor = Color.White
    ) {

    }
}