package com.example.courierapp.ui.screens

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.courierapp.data.BottomData
import com.example.courierapp.ui.elements.MyTopBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AddPay(navController: NavController) {
    Scaffold(
        topBar = {
            MyTopBar("Add Payment method", navController, BottomData.Profile.route)
        },
        containerColor = Color.White
    ) {

    }
}