package com.picpay.desafio.android.domain.usecase

import com.picpay.desafio.android.data.repository.UsersRepository
import com.picpay.desafio.android.domain.model.User
import javax.inject.Inject

class GetUserDataUseCase @Inject constructor(
    private val repository: UsersRepository
) {
    suspend operator fun invoke(): List<User> {
        val data = repository.fetchNetworkUsers()

        return data.map { user ->
            User(
                id = user.id,
                name = user.name,
                username = user.username,
                img = user.img
            )
        }
    }
}
