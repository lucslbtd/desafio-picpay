package com.picpay.desafio.android.data.repository

class UsersRepositoryImpl : UsersRepository {
    override suspend fun fetchData(): List<String> {
        return listOf("id", "name")
    }
}