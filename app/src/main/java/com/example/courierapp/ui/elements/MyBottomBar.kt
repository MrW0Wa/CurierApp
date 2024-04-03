package com.example.courierapp.ui.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.courierapp.R
import com.example.courierapp.data.BottomData
import com.example.courierapp.ui.theme.BlueMain


@Composable
fun MyBottomBar(navController: NavController) {

    val items = listOf(
        BottomData.Home,
        BottomData.Wallet,
        BottomData.Track,
        BottomData.Profile
    )

    val current = navController.currentBackStackEntryAsState()
    val route = current.value?.destination?.route

    BottomAppBar(modifier = Modifier.height(74.dp),
        backgroundColor = BlueMain) {

        items.forEach{ item ->

            BottomNavigationItem(
                selected = route == item.route,
                onClick = { navController.navigate(item.route) },
                icon = {
                    Column {
                        Image(
                            imageVector = ImageVector.vectorResource(id = item.image),
                            contentDescription = null
                        )
                        Spacer(modifier = Modifier.height(3.dp))

                    }
                },
                label = {
                    Text(
                        text = item.label,
                        color = Color.White,
                        fontWeight = if (route == item.route) FontWeight.Medium else FontWeight.Normal,
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center,
                    )
                })

        }

    }
}