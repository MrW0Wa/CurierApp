package com.example.courierapp

import android.app.Application
import com.example.courierapp.data.AppContainer
import com.example.courierapp.data.DefaultAppContainer

class App : Application {
    lateinit var container: AppContainer
    override fun onCreate(){
        super.onCreate()
        container = DefaultAppContainer()
    }
}