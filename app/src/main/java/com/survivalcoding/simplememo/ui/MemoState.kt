package com.survivalcoding.simplememo.ui

data class MemoState(
    val isLoading: Boolean = false,
    val memos: List<String> = emptyList()
)