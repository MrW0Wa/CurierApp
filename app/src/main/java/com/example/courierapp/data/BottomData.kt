package com.example.courierapp.data

import com.example.courierapp.R

sealed class BottomData(val image : Int, val label : String, val route : String) {
    object Home : BottomData(R.drawable.home,"Home","home")
    object Wallet : BottomData(R.drawable.wallet,"Wallet","wallet")
    object Track : BottomData(R.drawable.track,"Track","track")
    object Profile : BottomData(R.drawable.profile,"Profile","profile")
}