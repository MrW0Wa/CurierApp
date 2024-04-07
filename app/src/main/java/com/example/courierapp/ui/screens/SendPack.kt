package com.example.courierapp.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
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
import com.example.courierapp.ui.elements.MySendTextField
import com.example.courierapp.ui.elements.MyTopBar
import com.example.courierapp.ui.theme.Black
import com.example.courierapp.ui.theme.BlueMain
import com.example.courierapp.ui.theme.GrayLight
import com.example.courierapp.ui.theme.GrayMain

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@Composable
fun SendPack() {
    var count by remember {
        mutableStateOf(1)
    }

    Scaffold(
        topBar = {
            MyTopBar("Send a package")
        },
        containerColor = Color.White
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(innerPadding),
            contentAlignment = Alignment.TopCenter,
        ){
            Column(modifier = Modifier
                .fillMaxWidth(0.85f)
                .verticalScroll(rememberScrollState())) {
                Spacer(modifier = Modifier.height(20.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(contentDescription = null, painter = painterResource(id = R.drawable.origindetails), tint = BlueMain)
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Origin Details",
                        color = Black,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center,
                        maxLines = 1,
                        lineHeight = 16.sp
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                MySendTextField(text = "Address")
                Spacer(modifier = Modifier.height(6.dp))
                MySendTextField(text = "State,Country")
                Spacer(modifier = Modifier.height(6.dp))
                MySendTextField(text = "Phone number")
                Spacer(modifier = Modifier.height(6.dp))
                MySendTextField(text = "Others")


                for (i in 1..count){
                    Spacer(modifier = Modifier.height(40.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(contentDescription = null, painter = painterResource(id = R.drawable.destinationdetails), tint = BlueMain)
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "Destination Details",
                            color = Black,
                            fontWeight = FontWeight.Medium,
                            fontSize = 14.sp,
                            textAlign = TextAlign.Center,
                            maxLines = 1,
                            lineHeight = 16.sp
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    MySendTextField(text = "Address")
                    Spacer(modifier = Modifier.height(6.dp))
                    MySendTextField(text = "State,Country")
                    Spacer(modifier = Modifier.height(6.dp))
                    MySendTextField(text = "Phone number")
                    Spacer(modifier = Modifier.height(6.dp))
                    MySendTextField(text = "Others")
                    Spacer(modifier = Modifier.height(10.dp))
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(contentDescription = null, painter = painterResource(id = R.drawable.adddestination), tint = BlueMain, modifier = Modifier.clickable { count += 1 })
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Add destination",
                        color = GrayMain,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center,
                        maxLines = 1,
                        lineHeight = 16.sp
                    )
                }

                Spacer(modifier = Modifier.height(30.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Package Details",
                        color = Black,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center,
                        maxLines = 1,
                        lineHeight = 16.sp
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                MySendTextField(text = "package items")
                Spacer(modifier = Modifier.height(6.dp))
                MySendTextField(text = "Weight of item(kg)")
                Spacer(modifier = Modifier.height(6.dp))
                MySendTextField(text = "Worth of Items")
                Spacer(modifier = Modifier.height(40.dp))

                Text(
                    text = "Select delivery type",
                    color = Black,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                    maxLines = 1,
                    lineHeight = 16.sp
                )
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Box(modifier = Modifier
                        .height(75.dp)
                        .width(159.dp)
                        .background(BlueMain, RoundedCornerShape(23.dp)),
                        contentAlignment = Alignment.Center){
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(painter = painterResource(id = R.drawable.clocksendpack), contentDescription = null, tint = Color.White)
                            Text(
                                text = "Instant delivery",
                                color = Color.White,
                                fontWeight = FontWeight.Medium,
                                fontSize = 14.sp,
                                textAlign = TextAlign.Center,
                                maxLines = 1,
                                lineHeight = 16.sp
                            )
                        }
                    }
                    Box(modifier = Modifier
                        .height(75.dp)
                        .width(159.dp)
                        .shadow(
                            elevation = 5.dp,
                            spotColor = Black,
                            ambientColor = Black,
                            shape = RoundedCornerShape(23.dp)
                        )
                        .background(Color.White, RoundedCornerShape(23.dp)),
                        contentAlignment = Alignment.Center){
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(painter = painterResource(id = R.drawable.sheduledsendpack), contentDescription = null, tint = GrayMain)
                            Text(
                                text = "Scheduled delivery",
                                color = GrayMain,
                                fontWeight = FontWeight.Medium,
                                fontSize = 14.sp,
                                textAlign = TextAlign.Center,
                                maxLines = 1,
                                lineHeight = 16.sp
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(200.dp))
            }
        }
    }
}