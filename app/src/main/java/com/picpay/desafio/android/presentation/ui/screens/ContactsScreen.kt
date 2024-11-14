package com.picpay.desafio.android.presentation.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.picpay.desafio.android.presentation.state.HomePageUiState
import com.picpay.desafio.android.presentation.ui.templates.ContactsTemplate
import com.picpay.desafio.android.presentation.viewmodel.HomePageViewModel

@Composable
fun ContactsScreen(viewModel: HomePageViewModel) {
    val uiState by viewModel.uiState.collectAsState()

    when (uiState) {
        is HomePageUiState.Loading -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator(color = Color.White)
            }
        }
        is HomePageUiState.Success -> {
            ContactsTemplate(users = (uiState as HomePageUiState.Success).users)
        }
        is HomePageUiState.Error -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(
                    text = (uiState as HomePageUiState.Error).message,
                    color = Color.Red,
                    style = MaterialTheme.typography.h6
                )
            }
        }
    }
}
