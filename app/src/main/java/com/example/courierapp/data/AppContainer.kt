package com.example.courierapp.data

import com.example.courierapp.network.UserService
import com.example.courierapp.network.model.users.User
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

interface AppContainer {
    val userService : UserService
}

class DefaultAppContainer(override val userService: UserService) : AppContainer{
    private val BASE_URL = "http://10.0.2.2:8080/users"

    private val retrofit : Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    private val retrofitService : UserService by lazy {
        retrofit.create(UserService::class.java)
    }

    private val userRepository : UserRepository by lazy {
        NetworkUserRepository(retrofitService)
    }
}
