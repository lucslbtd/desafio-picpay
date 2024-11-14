package com.picpay.desafio.android.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.picpay.desafio.android.domain.usecase.GetUserDataUseCase
import com.picpay.desafio.android.presentation.state.HomePageUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomePageViewModel @Inject constructor(
    private val getUserDataUseCase: GetUserDataUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow<HomePageUiState>(HomePageUiState.Loading)
    val uiState: StateFlow<HomePageUiState> = _uiState

    init {
        loadUsers()
    }

    private fun loadUsers() {
        viewModelScope.launch {
            _uiState.value = HomePageUiState.Loading
            try {
                val users = getUserDataUseCase()
                _uiState.value = HomePageUiState.Success(users)
            } catch (e: Exception) {
                _uiState.value = HomePageUiState.Error(e.message ?: "Unknown error")
            }
        }
    }
}
