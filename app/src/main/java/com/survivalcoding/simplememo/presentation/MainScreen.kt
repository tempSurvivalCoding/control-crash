package com.survivalcoding.simplememo.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.survivalcoding.simplememo.ui.theme.SimpleMemoTheme

@Composable
fun MainScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = "Test",
            fontSize = 16.sp
        )
    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    SimpleMemoTheme {
        MainScreen()
    }
}