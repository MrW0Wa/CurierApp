package com.example.courierapp.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.courierapp.ui.elements.MyBottomBar
import com.example.courierapp.ui.elements.MyCheckbox
import com.example.courierapp.ui.elements.MyHomeAvtrCard
import com.example.courierapp.ui.elements.MySearchTextField
import com.example.courierapp.ui.elements.SpecialForYou
import com.example.courierapp.ui.theme.BlueMain

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Home(navController: NavController) {
    Scaffold(
        bottomBar = {
            MyBottomBar(navController = navController)
        },
        containerColor = Color.White
    ) {

    }
}

@Preview
@Composable
fun HomePrev() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        contentAlignment = Alignment.TopCenter){
        Column(modifier = Modifier.fillMaxWidth(0.9f)) {
            Spacer(modifier = Modifier.height(20.dp))
            MySearchTextField()
            Spacer(modifier = Modifier.height(20.dp))
            MyHomeAvtrCard()
            Spacer(modifier = Modifier.height(20.dp))
            SpecialForYou()
        }
    }
}