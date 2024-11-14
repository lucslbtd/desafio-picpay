package com.picpay.desafio.android.presentation.ui.atom

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun UserTextAtom(username: String, fullName: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = username, style = MaterialTheme.typography.subtitle2, color = Color.Gray)
        Text(text = fullName, style = MaterialTheme.typography.body1, color = Color.White)
    }
}
