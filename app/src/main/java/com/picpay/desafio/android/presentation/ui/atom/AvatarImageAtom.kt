package com.picpay.desafio.android.presentation.ui.atom

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

@Composable
fun AvatarImageAtom(imageUrl: String, modifier: Modifier = Modifier) {
    Image(
        painter = rememberAsyncImagePainter(model = imageUrl),
        contentDescription = "Avatar",
        modifier = modifier
            .size(56.dp)
            .clip(CircleShape)
            .border(1.dp, Color.Gray, CircleShape)
    )
}
