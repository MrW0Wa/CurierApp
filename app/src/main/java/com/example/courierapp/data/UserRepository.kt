package com.example.courierapp.data

import com.example.courierapp.network.UserService
import com.example.courierapp.network.model.users.User

interface UserRepository {
    suspend fun getUser(email : String) : User
}

class NetworkUserRepository(
    private val userService : UserService
) : UserRepository {
    override suspend fun getUser(email: String): User = userService.getUser(email)
}