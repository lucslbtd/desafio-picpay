package com.picpay.desafio.android.presentation.ui.organism

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.picpay.desafio.android.domain.model.User
import com.picpay.desafio.android.presentation.ui.molecule.UserCardMolecule

@Composable
fun ContactListOrganism(users: List<User>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(users) { user ->
            UserCardMolecule(
                imageUrl = user.img,
                username = "@${user.name}",
                fullName = user.name
            )
        }
    }
}
