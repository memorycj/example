package com.wn.framework.mvvm.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

open class BaseViewModel : ViewModel() {

    fun <T> launch(repository: BaseRepository<T>, success: (data: String) -> Unit) {
        viewModelScope.launch {
            val data = repository.execute()
            success(data)
        }
    }
}