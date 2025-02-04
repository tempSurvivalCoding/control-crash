package com.survivalcoding.simplememo.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.survivalcoding.simplememo.ui.theme.SimpleMemoTheme

@Composable
fun SettingButton(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        horizontalArrangement = Arrangement.End
    ) {
        IconButton(
            onClick = { /*TODO*/ },
            modifier = modifier
        ) {
            Icon(
                imageVector = Icons.Default.Settings,
                contentDescription = "Setting"
            )
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun SettingButtonPreview() {
    SimpleMemoTheme {
        SettingButton()
    }
}