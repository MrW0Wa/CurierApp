package com.example.courierapp.ui.elements

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import com.example.courierapp.ui.theme.Black
import com.example.courierapp.ui.theme.GrayMain

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
        .clickable {  },
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