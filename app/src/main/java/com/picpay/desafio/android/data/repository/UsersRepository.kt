package com.picpay.desafio.android.data.repository

import com.picpay.desafio.android.domain.model.User

interface UsersRepository {
    suspend fun fetchNetworkUsers(): List<User>
}
