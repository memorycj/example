package com.wn.framework.mvvm.base

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import java.lang.Exception

open class BaseViewModel : ViewModel() {

    fun <T> launch(repository: BaseRepository<T>, success: (data: String) -> Unit) {
        viewModelScope.launch {
            try {
                val data = repository.execute()
                success(data)
            }catch (e: Exception){
                Log.d("wangneng",e.toString())
            }

        }
    }
}