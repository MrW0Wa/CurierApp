package com.example.courierapp.ui.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.courierapp.R
import com.example.courierapp.ui.theme.Black
import com.example.courierapp.ui.theme.BlueMain
import com.example.courierapp.ui.theme.CardGray
import com.example.courierapp.ui.theme.GrayLight
import com.example.courierapp.ui.theme.GrayMain
import com.example.courierapp.ui.theme.Red

@Composable
fun MyProfileCard(icon: Int ,label : String, text: String, navController: NavController, route : String) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(58.dp)
        .shadow(
            elevation = 6.dp,
            ambientColor = Black,
            spotColor = Black,
            shape = RoundedCornerShape(22.dp)
        )
        .clickable { navController.navigate(route) },
        colors = CardDefaults.cardColors(
            containerColor = Color.White,

            ),
        shape = RoundedCornerShape(22.dp),
        content = {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                Row(modifier = Modifier.fillMaxWidth(0.98f), horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Spacer(modifier = Modifier.width(20.dp))
                        Icon(painter = painterResource(id = icon), contentDescription = null)
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = label,
                            color = Color.Black,
                            fontWeight =  FontWeight.ExtraBold,
                            fontSize = 12.sp,
                            textAlign = TextAlign.Center,
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = text,
                            color = GrayMain,
                            fontWeight =  FontWeight.Normal,
                            fontSize = 10.sp,
                            textAlign = TextAlign.Center,
                            maxLines = 1
                        )
                    }
                    IconButton(onClick = { navController.navigate(route) }) {
                        Icon(painter = painterResource(id = R.drawable.strelkacard), contentDescription =null )
                    }
                }
            }
        }
    )
}
@Composable
fun MyProfileCard(icon: Int ,label : String, text: String) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(58.dp)
        .shadow(
            elevation = 6.dp,
            ambientColor = Black,
            spotColor = Black,
            shape = RoundedCornerShape(22.dp)
        )
        .clickable { },
        colors = CardDefaults.cardColors(
            containerColor = Color.White,

            ),
        shape = RoundedCornerShape(22.dp),
        content = {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                Row(modifier = Modifier.fillMaxWidth(0.98f), horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Spacer(modifier = Modifier.width(20.dp))
                        Icon(painter = painterResource(id = icon), contentDescription = null)
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = label,
                            color = Color.Black,
                            fontWeight =  FontWeight.ExtraBold,
                            fontSize = 12.sp,
                            textAlign = TextAlign.Center,
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = text,
                            color = GrayMain,
                            fontWeight =  FontWeight.Normal,
                            fontSize = 10.sp,
                            textAlign = TextAlign.Center,
                            maxLines = 1
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(painter = painterResource(id = R.drawable.strelkacard), contentDescription =null )
                    }
                }
            }
        }
    )
}


@Composable
fun MyTransactCard(sum : String, text : String, date : String, col : Color) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(44.dp)
        .shadow(
            elevation = 3.dp,
            ambientColor = Black,
            spotColor = Black,
            shape = RoundedCornerShape(10.dp)
        )
        .clickable { },
        colors = CardDefaults.cardColors(
            containerColor = Color.White,

            ),
        shape = RoundedCornerShape(10.dp),
        content = {
            Box(modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center) {
                Row(
                    modifier = Modifier.fillMaxWidth(0.9f),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Column {
                        Text(
                            text = sum,
                            color = col,
                            fontWeight = FontWeight.Medium,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center
                        )
                        Text(
                            text = text,
                            color = Black,
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp,
                            textAlign = TextAlign.Center
                        )
                    }
                    Text(
                        text = date,
                        color = GrayMain,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    )
}


@Preview
@Composable
fun MyHomeAvtrCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(91.dp),
        colors = CardDefaults.cardColors(
            containerColor = BlueMain
        )
    ) {
        Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center){
            Row(modifier = Modifier.fillMaxWidth(0.92f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.avtr),
                        contentDescription = null,
                        modifier = Modifier
                            .height(60.dp)
                            .border(1.dp, Color.White, RoundedCornerShape(60.dp)),
                        contentScale = ContentScale.Crop,
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Text(
                            text = "Hello Ken!",
                            color = Color.White,
                            fontWeight =  FontWeight.Medium,
                            fontSize = 24.sp,
                            textAlign = TextAlign.Center,
                            maxLines = 1
                        )
                        Text(
                            text = "We trust you are having a great time",
                            color = GrayLight,
                            fontWeight =  FontWeight.Normal,
                            fontSize = 12.sp,
                            textAlign = TextAlign.Center,
                            maxLines = 1
                        )
                    }
                }
                IconButton(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(24.dp)
                        .width(24.dp)) {
                    Icon(
                        painter = painterResource(id = R.drawable.bellhomecard),
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            }
        }
    }
}

@Composable
fun MyHomeCard(icon : Int, label : String, text : String) {
    var flag by remember{
        mutableStateOf(false)
    }
    Card(
        modifier = Modifier
            .height(159.dp)
            .width(159.dp)
            .clickable { flag = !flag },
        shape = RoundedCornerShape(28.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (flag) BlueMain else CardGray,
        )
    ) {
        Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center){
            Column(modifier = Modifier.fillMaxWidth(0.75f)) {
                Icon(painter = painterResource(id = icon), contentDescription =null, tint = if (flag) Color.White else BlueMain )
                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = label,
                    color = if (flag) Color.White else BlueMain,
                    fontWeight =  FontWeight.Medium,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = text,
                    color = if (flag) Color.White else Black,
                    fontWeight =  FontWeight.Normal,
                    fontSize = 8.sp,
                    textAlign = TextAlign.Start,
                    maxLines = 3,
                    lineHeight = 10.sp
                )
            }
        }
    }
}