package com.example.courierapp.ui.elements

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBar(text : String) {
    TopAppBar(title = {
        Box(modifier = Modifier.fillMaxSize().padding(top = 45.dp), contentAlignment = Alignment.Center){
            Text(
                text = text,
                color = GrayMain,
                fontWeight =  FontWeight.Medium,
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
        }
    },
        modifier = Modifier
            .height(108.dp)
            .shadow(elevation = 10.dp,
                spotColor = Black,
                ambientColor = Black),
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.White
        ),
        navigationIcon = {
            Box(modifier = Modifier.fillMaxHeight().padding(top = 45.dp), contentAlignment = Alignment.Center){
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(painter = painterResource(id = R.drawable.strelkatop), contentDescription = null)
                }
            }
        })
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBar(text : String, navController: NavController, route : String) {
    TopAppBar(title = {
        Box(modifier = Modifier.fillMaxSize().padding(top = 45.dp), contentAlignment = Alignment.Center){
            Text(
                text = text,
                color = GrayMain,
                fontWeight =  FontWeight.Medium,
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
        }
    },
        modifier = Modifier
            .height(108.dp)
            .shadow(elevation = 10.dp,
                spotColor = Black,
                ambientColor = Black),
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.White
        ),
        navigationIcon = {
            Box(modifier = Modifier.fillMaxHeight().padding(top = 45.dp), contentAlignment = Alignment.Center){
                IconButton(onClick = { navController.navigate(route) }) {
                    Icon(painter = painterResource(id = R.drawable.strelkatop), contentDescription = null)
                }
            }
        })
}