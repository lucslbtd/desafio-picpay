package com.picpay.desafio.android.presentation.ui.molecule

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.picpay.desafio.android.presentation.ui.atom.AvatarImageAtom
import com.picpay.desafio.android.presentation.ui.atom.UserTextAtom

@Composable
fun UserCardMolecule(imageUrl: String, username: String, fullName: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color.Black)
            .clickable { /**/ },
        verticalAlignment = Alignment.CenterVertically
    ) {
        AvatarImageAtom(imageUrl = imageUrl, modifier = Modifier.padding(8.dp))
        UserTextAtom(username = username, fullName = fullName, modifier = Modifier.padding(start = 8.dp))
    }
}
