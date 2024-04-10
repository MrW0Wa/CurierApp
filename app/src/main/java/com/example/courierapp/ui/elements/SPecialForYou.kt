package com.example.courierapp.ui.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.example.courierapp.R
import com.example.courierapp.ui.theme.Red

@Preview
@Composable
fun SpecialForYou() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(Color.White)) {
        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(
                text = "Special for you",
                color = Red,
                fontWeight =  FontWeight.Medium,
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                maxLines = 1
            )
            IconButton(onClick = { /*TODO*/ },
                modifier = Modifier.width(14.dp)) {
                Icon(painter = painterResource(id = R.drawable.strelkaad), contentDescription = null,
                    tint = Red)
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
        ) {
            Image(painter = painterResource(id = R.drawable.adbaner1), contentDescription = null,
                modifier = Modifier.height(64.dp), contentScale = ContentScale.Crop)
            Spacer(modifier = Modifier.width(10.dp))
            Image(painter = painterResource(id = R.drawable.adbaner1), contentDescription = null,
                modifier = Modifier.height(64.dp), contentScale = ContentScale.Crop)
            Spacer(modifier = Modifier.width(10.dp))
            Image(painter = painterResource(id = R.drawable.adbaner1), contentDescription = null,
                modifier = Modifier.height(64.dp), contentScale = ContentScale.Crop)
            Spacer(modifier = Modifier.width(10.dp))
            Image(painter = painterResource(id = R.drawable.adbaner1), contentDescription = null,
                modifier = Modifier.height(64.dp), contentScale = ContentScale.Crop)
            Spacer(modifier = Modifier.width(10.dp))

        }
    }
}