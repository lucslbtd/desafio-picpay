package com.picpay.desafio.android.domain.usecase

import com.picpay.desafio.android.data.repository.UsersRepository
import com.picpay.desafio.android.domain.model.User
import javax.inject.Inject

class GetUserDataUseCase @Inject constructor(
    private val repository: UsersRepository
) {
    suspend operator fun invoke(): List<User> {
        val data = repository.fetchData()
        return data.mapIndexed { index, name -> User(index, name) }
    }
}
