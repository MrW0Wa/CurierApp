package com.example.courierapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.courierapp.ui.elements.CreateButton
import com.example.courierapp.ui.elements.MyButton
import com.example.courierapp.ui.elements.MyCheckbox
import com.example.courierapp.ui.elements.MyCodeTextField
import com.example.courierapp.ui.elements.MyGoogleButton
import com.example.courierapp.ui.elements.MyPassTextField
import com.example.courierapp.ui.elements.MyTextField
import com.example.courierapp.ui.elements.OR
import com.example.courierapp.ui.theme.BlueMain
import com.example.courierapp.ui.theme.GrayMain
import com.example.courierapp.ui.theme.Yellow
import kotlinx.coroutines.delay

@Composable
fun NewPass(navController: NavController) {
    var values = ArrayList<String>()
    var flag by remember{
        mutableStateOf(false)
    }
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        contentAlignment = Alignment.TopCenter){
        Column(
            modifier = Modifier
                .fillMaxWidth(0.85f)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.height(150.dp))
            Text(
                text = "New Password",
                color = BlueMain,
                fontWeight = FontWeight.Black,
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                maxLines = 2,
                lineHeight = 28.sp
            )
            Text(
                text = "Ente new password",
                color = GrayMain,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                maxLines = 2,
                lineHeight = 20.sp
            )
            Spacer(modifier = Modifier.height(40.dp))
            values.add(MyPassTextField(text = "**********"))
            Spacer(modifier = Modifier.height(25.dp))
            values.add(MyPassTextField(text = "**********"))
            Spacer(modifier = Modifier.height(25.dp))

            for (i in values){
                if (i.equals("")){
                    flag = false
                    break
                }
                else flag = true
            }
            MyButton(text = "Sign Up", flag = flag, navController = navController, route = "login")
            Spacer(modifier = Modifier.height(200.dp))



        }
    }
}