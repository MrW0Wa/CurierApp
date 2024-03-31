package com.example.courierapp.network

import com.example.courierapp.network.model.users.User
import retrofit2.http.GET
import retrofit2.http.Query

interface UserService {
    @GET("")
    suspend fun getUser(@Query("email") email : String) : User
}