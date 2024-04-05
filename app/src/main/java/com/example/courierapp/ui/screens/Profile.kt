package com.example.courierapp.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.courierapp.R
import com.example.courierapp.ui.elements.MyBottomBar
import com.example.courierapp.ui.elements.MyCheckbox
import com.example.courierapp.ui.elements.MyProfileCard
import com.example.courierapp.ui.theme.Black
import com.example.courierapp.ui.theme.BlueMain
import com.example.courierapp.ui.theme.Red

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Profile(navController: NavController) {
    Scaffold(
        bottomBar = {
            MyBottomBar(navController = navController)
        },
        containerColor = Color.White
    ) {
        prev(navController)
    }
}

@Composable
fun prev(navController: NavController) {

    var flag by remember{
        mutableStateOf(true)
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.TopCenter,
    ){

        Column(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Spacer(modifier = Modifier.height(50.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(painter = painterResource(id = R.drawable.moon), contentDescription = null, tint = Color.Black)
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Dark Mode",
                        color = Black,
                        fontWeight =  FontWeight.Medium,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                    )
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(painter = painterResource(id = R.drawable.logout), contentDescription = null, tint = Red)
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Log Out",
                        color = Black,
                        fontWeight =  FontWeight.Medium,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                    )
                }
            }

            Spacer(modifier = Modifier.height(40.dp))

            Image(painter = painterResource(id = R.drawable.avtr), contentDescription = null,
                modifier = Modifier.width(143.dp), contentScale = ContentScale.Crop)

            Text(
                text = "Hello Ken",
                color = Color.Black,
                fontWeight =  FontWeight.Black,
                fontSize = 30.sp,
                textAlign = TextAlign.Center
            )

            Row {
                Text(
                    text = "Current balance: ",
                    color = Black,
                    fontWeight =  FontWeight.Normal,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = if(flag) "N10,712:00" else "*".repeat("N10,712:00".length),
                    color = BlueMain,
                    fontWeight =  FontWeight.Normal,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.width(10.dp))
                IconButton(onClick = { flag = !flag }, modifier = Modifier
                    .height(14.dp)
                    .width(14.dp)) {
                    Icon(painter = painterResource(id = R.drawable.eyepassword), contentDescription = null)
                }

            }
            Spacer(modifier = Modifier.height(40.dp))


            MyProfileCard(icon = R.drawable.profilecard, label = "Edit Profile", text = "Name, phone no, address, email ...")
            Spacer(modifier = Modifier.height(10.dp))
            MyProfileCard(icon = R.drawable.profilecard, label = "Statements & Reports", text = "Download transaction deta...")
            Spacer(modifier = Modifier.height(10.dp))
            MyProfileCard(icon = R.drawable.profilecard, label = "Notification Settings", text = "mute, unmute, set location...")
            Spacer(modifier = Modifier.height(10.dp))
            MyProfileCard(icon = R.drawable.profilecard, label = "Card & Bank account settings", text = "change card, del...")
            Spacer(modifier = Modifier.height(10.dp))
            MyProfileCard(icon = R.drawable.profilecard, label = "Referrals", text = "check no of friends and earn")
            Spacer(modifier = Modifier.height(10.dp))
            MyProfileCard(icon = R.drawable.profilecard, label = "About Us", text = "know more about us, terms and conditions")
            Spacer(modifier = Modifier.height(200.dp))

            }

    }
}