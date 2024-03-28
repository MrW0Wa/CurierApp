package com.example.courierapp.ui.elements

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.courierapp.R
import com.example.courierapp.ui.theme.BlueMain

@Composable
fun MyCheckbox(color: Color): Boolean {
    var flag by remember {
        mutableStateOf(false)
    }
    if (flag == false ) {
        Box(
            modifier = Modifier
                .width(14.dp)
                .height(14.dp)
                .border(1.dp, color, RoundedCornerShape(2.dp))
        ) { }
    }
    else {
        Box(
            modifier = Modifier
                .width(14.dp)
                .height(14.dp)
                .background(BlueMain, RoundedCornerShape(2.dp))
                .clickable { flag = !flag },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.galkacheckbox), contentDescription = null,
                tint = Color.White
            )
        }
    }
    return flag
    
}