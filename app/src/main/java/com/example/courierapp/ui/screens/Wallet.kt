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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import com.example.courierapp.ui.elements.MyBottomBar
import com.example.courierapp.ui.elements.MyCheckbox
import com.example.courierapp.ui.elements.MySimpleTopBar
import com.example.courierapp.ui.elements.MyTransactCard
import com.example.courierapp.ui.theme.Black
import com.example.courierapp.ui.theme.BlueMain
import com.example.courierapp.ui.theme.GrayCard
import com.example.courierapp.ui.theme.GrayLight
import com.example.courierapp.ui.theme.GrayMain
import com.example.courierapp.ui.theme.GrayText
import com.example.courierapp.ui.theme.Green
import com.example.courierapp.ui.theme.Red

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@Composable
fun Wallet(/*navController: NavController*/) {
    Scaffold(
        bottomBar = {
            //MyBottomBar(navController = navController)
        },
        containerColor = Color.White,
        topBar = {
            MySimpleTopBar(text = "Wallet")
        }
    ) { innerPadding ->
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(innerPadding),
            contentAlignment = Alignment.TopCenter){
            Column(modifier = Modifier
                .fillMaxWidth(0.85f)
                .verticalScroll(rememberScrollState())
            ) {
                Spacer(modifier = Modifier.height(40.dp))

                Row(modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(painter = painterResource(id = R.drawable.avtr), contentDescription = null,
                            modifier = Modifier.height(59.dp))
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Text(
                                text = "Hello Ken",
                                color = Black,
                                fontWeight =  FontWeight.Medium,
                                fontSize = 16.sp,
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
                                    text = "N10,712:00",
                                    color = BlueMain,
                                    fontWeight =  FontWeight.Normal,
                                    fontSize = 12.sp,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }

                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(painter = painterResource(id = R.drawable.eyepassword), contentDescription = null,
                            tint = Color.Black, modifier = Modifier.height(14.dp))
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(129.dp)
                    .background(
                        GrayCard,
                        RoundedCornerShape(32.dp)
                    ),
                    contentAlignment = Alignment.Center){
                    Column(modifier = Modifier.fillMaxWidth(0.8f),
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "Top Up",
                            color = Black,
                            fontWeight =  FontWeight.Bold,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Row(modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Box(modifier = Modifier
                                    .height(48.dp)
                                    .width(48.dp)
                                    .background(
                                        BlueMain, RoundedCornerShape(49.dp)
                                    ),
                                    contentAlignment = Alignment.Center){
                                    Icon(painter = painterResource(id = R.drawable.bankwallet), contentDescription = null, tint = Color.White)
                                }
                                Text(
                                    text = "Bank",
                                    color = Black,
                                    fontWeight =  FontWeight.Normal,
                                    fontSize = 12.sp,
                                    textAlign = TextAlign.Center
                                )
                            }
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Box(modifier = Modifier
                                    .height(48.dp)
                                    .width(48.dp)
                                    .background(
                                        BlueMain, RoundedCornerShape(49.dp)
                                    ),
                                    contentAlignment = Alignment.Center){
                                    Icon(painter = painterResource(id = R.drawable.transferwallet), contentDescription = null, tint = Color.White)
                                }
                                Text(
                                    text = "Transfer",
                                    color = Black,
                                    fontWeight =  FontWeight.Normal,
                                    fontSize = 12.sp,
                                    textAlign = TextAlign.Center
                                )
                            }
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Box(modifier = Modifier
                                    .height(48.dp)
                                    .width(48.dp)
                                    .background(
                                        BlueMain, RoundedCornerShape(49.dp)
                                    ),
                                    contentAlignment = Alignment.Center){
                                    Icon(painter = painterResource(id = R.drawable.cardwallet), contentDescription = null, tint = Color.White)
                                }
                                Text(
                                    text = "Card",
                                    color = Black,
                                    fontWeight =  FontWeight.Normal,
                                    fontSize = 12.sp,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Transaction History",
                    color = Black,
                    fontWeight =  FontWeight.Medium,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(20.dp))
                MyTransactCard(sum = "-N3,000.00", text = "Delivery fee", date = "July 7, 2022", col = Red)
                Spacer(modifier = Modifier.height(10.dp))
                MyTransactCard(sum = "N2,000.00", text = "Delivery fee", date = "July 4, 2022", col = Green)
                Spacer(modifier = Modifier.height(10.dp))
                MyTransactCard(sum = "-N3,000.00", text = "Delivery fee", date = "July 1, 2022", col = Red)
                Spacer(modifier = Modifier.height(10.dp))
                MyTransactCard(sum = "N1,000.00", text = "Delivery fee", date = "June 27, 2022", col = Green)
                Spacer(modifier = Modifier.height(10.dp))
                MyTransactCard(sum = "N2,500.00", text = "Delivery fee", date = "June 23, 2022", col = Green)
                Spacer(modifier = Modifier.height(10.dp))
                MyTransactCard(sum = "-N3,000.00", text = "Delivery fee", date = "June 17, 2022", col = Red)
                Spacer(modifier = Modifier.height(200.dp))
            }
        }

    }
}