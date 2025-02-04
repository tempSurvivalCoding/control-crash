package com.survivalcoding.simplememo.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class TestViewModel: ViewModel() {
    val _state = MutableStateFlow(TestViewModelState())
    var state = _state.asStateFlow()

    override fun onCleared() {
        super.onCleared()
    }
}