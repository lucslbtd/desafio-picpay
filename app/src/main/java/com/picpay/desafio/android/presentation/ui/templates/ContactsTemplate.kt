package com.picpay.desafio.android.presentation.ui.templates

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.picpay.desafio.android.domain.model.User
import com.picpay.desafio.android.presentation.ui.organism.ContactListOrganism

@Composable
fun ContactsTemplate(users: List<User>, modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize().background(Color.Black)) {
        Text(
            text = "Contatos",
            style = MaterialTheme.typography.h4,
            color = Color.White,
            modifier = Modifier.padding(16.dp)
        )
        ContactListOrganism(users = users, modifier = Modifier.padding(horizontal = 16.dp))
    }
}
