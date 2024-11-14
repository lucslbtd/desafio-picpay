package com.picpay.desafio.android.data.repository

import com.picpay.desafio.android.data.remote.UserService
import com.picpay.desafio.android.domain.model.User
import javax.inject.Inject

class UsersRepositoryImpl @Inject constructor(
    private val userService: UserService
) : UsersRepository {

    override suspend fun fetchNetworkUsers(): List<User> {
        return try {
            val response = userService.getUsers()
            if (response.isSuccessful) {
                response.body() ?: emptyList()
            } else {
                throw Exception("API Error: ${response.code()} ${response.message()}")
            }
        } catch (e: Exception) {
            emptyList()
        }
    }
}
