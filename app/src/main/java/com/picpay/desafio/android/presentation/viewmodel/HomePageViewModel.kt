package com.picpay.desafio.android.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.picpay.desafio.android.domain.usecase.GetUserDataUseCase
import com.picpay.desafio.android.domain.model.User
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomePageViewModel @Inject constructor(
    private val getUserDataUseCase: GetUserDataUseCase
) : ViewModel() {

    private val _users = MutableStateFlow<List<User>>(emptyList())
    val users: StateFlow<List<User>> = _users

    init {
        loadUsers()
    }

    private fun loadUsers() {
        viewModelScope.launch {
            _users.value = getUserDataUseCase()
        }
    }
}
