package com.survivalcoding.simplememo.presentation

import androidx.lifecycle.ViewModel
import com.survivalcoding.simplememo.presentation.state.MemoState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class TestViewModel: ViewModel() {

    private val _memoState = MutableStateFlow(MemoState())
    val memoState = _memoState.asStateFlow()

    override fun onCleared() {
        super.onCleared()
    }
}