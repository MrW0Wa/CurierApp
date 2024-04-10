package com.example.courierapp.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.courierapp.R
import com.example.courierapp.ui.elements.MyBottomBar
import com.example.courierapp.ui.elements.MyCheckbox
import com.example.courierapp.ui.elements.MyHomeAvtrCard
import com.example.courierapp.ui.elements.MyHomeCard
import com.example.courierapp.ui.elements.MySearchTextField
import com.example.courierapp.ui.elements.SpecialForYou
import com.example.courierapp.ui.theme.BlueMain
import com.example.courierapp.ui.theme.GrayMain

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Home(navController: NavController) {
    Scaffold(
        bottomBar = {
            MyBottomBar(navController = navController)
        },
        containerColor = Color.White
    ) {
        HomePrev()
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
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "What would you like to do",
                color = BlueMain,
                fontWeight =  FontWeight.Medium,
                fontSize = 14.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(10.dp))
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround) {
                MyHomeCard(icon = R.drawable.customercard, label = "Customer Care", text ="Our customer care service line is available from 8 -9pm week days and 9 - 5 weekends - tap to call us today")

                MyHomeCard(icon = R.drawable.sendpackcard, label = "Send a package", text ="Request for a driver to pick up or deliver your package for you")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround) {
                MyHomeCard(icon = R.drawable.findwalletcard, label = "Fund your wallet", text ="To fund your wallet is as easy as ABC, make use of our fast technology and top-up your wallet today")
                MyHomeCard(icon = R.drawable.chatcard, label = "Chats", text = "Search for available rider within your area")
            }

        }
    }
}