package com.picpay.desafio.android.presentation.state

import com.picpay.desafio.android.domain.model.User

sealed class HomePageUiState {
    data object Loading : HomePageUiState()
    data class Success(val users: List<User>) : HomePageUiState()
    data class Error(val message: String) : HomePageUiState()
}
