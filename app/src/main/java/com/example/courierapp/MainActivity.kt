package com.example.courierapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.courierapp.ui.screens.Forgot
import com.example.courierapp.ui.screens.Home
import com.example.courierapp.ui.screens.LogIn
import com.example.courierapp.ui.screens.MySplashScreen
import com.example.courierapp.ui.screens.SignUp
import com.example.courierapp.ui.theme.CourierAppTheme
import xml.Onboarding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CourierAppTheme {
               Prev()
            }
        }
    }
}

@Preview
@Composable
fun Prev() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash"){
        composable("splash"){
            MySplashScreen(navController)
        }
        composable("onboarding"){
            Onboarding(navController)
        }
        composable("home"){
            Home()
        }
        composable("signup"){
            SignUp(navController)
        }
        composable("login"){
            LogIn(navController)
        }
        composable("forgot"){
            Forgot(navController)
        }
        composable("OTP"){
            Home()
        }

    }
}
