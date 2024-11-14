package com.picpay.desafio.android.di

import com.picpay.desafio.android.data.remote.UserService
import com.picpay.desafio.android.data.repository.UsersRepository
import com.picpay.desafio.android.data.repository.UsersRepositoryImpl
import com.picpay.desafio.android.domain.usecase.GetUserDataUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    private const val BASE_URL = "https://609a908e0f5a13001721b74e.mockapi.io/picpay/api/"

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideUserService(retrofit: Retrofit): UserService {
        return retrofit.create(UserService::class.java)
    }

    @Provides
    @Singleton
    fun provideUsersRepository(userService: UserService): UsersRepository {
        return UsersRepositoryImpl(userService)
    }

    @Provides
    fun provideGetUserDataUseCase(
        repository: UsersRepository
    ): GetUserDataUseCase = GetUserDataUseCase(repository)
}
