package com.survivalcoding.simplememo.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainMenuScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.Center)
                .size(100.dp)
                .background(color = Color.Blue, shape = RoundedCornerShape(10.dp))
                .clickable {
                    // 클릭 기능
                },
            text = "buttton",
            textAlign = TextAlign.Center,
        )
    }
}

@Preview
@Composable
private fun MainMenuScreenPreview() {
    MainMenuScreen()
}