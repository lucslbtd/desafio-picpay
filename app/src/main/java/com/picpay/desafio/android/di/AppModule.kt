package com.picpay.desafio.android.di

import com.picpay.desafio.android.data.repository.UsersRepository
import com.picpay.desafio.android.data.repository.UsersRepositoryImpl
import com.picpay.desafio.android.domain.usecase.GetUserDataUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideUsersRepository(): UsersRepository = UsersRepositoryImpl()

    @Provides
    fun provideGetUserDataUseCase(
        repository: UsersRepository
    ): GetUserDataUseCase = GetUserDataUseCase(repository)
}
