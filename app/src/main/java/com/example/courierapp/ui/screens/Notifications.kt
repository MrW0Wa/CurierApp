package com.example.courierapp.ui.screens

import android.annotation.SuppressLint
import android.app.Notification
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.courierapp.R
import com.example.courierapp.data.BottomData
import com.example.courierapp.ui.elements.MyTopBar
import com.example.courierapp.ui.theme.Black
import com.example.courierapp.ui.theme.GrayMain

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Notif(navController: NavController) {
    Scaffold(
        topBar = {
            MyTopBar("Notification", navController, BottomData.Profile.route)
        },
        containerColor = Color.White
    ) {paddingValues ->
        Box(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .background(Color.White),
            contentAlignment = Alignment.Center,
        ) {
            Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(painter = painterResource(id = R.drawable.bellnotification), contentDescription = null,
                    tint = GrayMain)
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "You have no notifications",
                    color = Black,
                    fontWeight =  FontWeight.Medium,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                )
            }
        }

    }
}