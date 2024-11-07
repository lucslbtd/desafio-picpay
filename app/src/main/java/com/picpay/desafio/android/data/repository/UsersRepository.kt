package com.picpay.desafio.android.data.repository

interface UsersRepository {
    suspend fun fetchData(): List<String>
}