package com.survivalcoding.simplememo.presentation

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun TestButton(
    onClick: () -> Unit = {}
) {
    Button(onClick = onClick) {
        Text(
            text = "확인",
            fontSize = 14.sp,
            color = Color.White
        )
    }
}

@Preview
@Composable
private fun TestButtonPreview() {
    TestButton()
}