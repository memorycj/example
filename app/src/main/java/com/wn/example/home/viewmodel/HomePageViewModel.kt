package com.wn.example.home.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.wn.example.home.repository.HomeRepository
import com.wn.framework.mvvm.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomePageViewModel @Inject constructor(var homeRepository: HomeRepository) : BaseViewModel() {

    private val serverData = MutableLiveData<String>()
    var liveHomeData: LiveData<String> = serverData

    fun getHomeData() {
        launch(homeRepository,success = {
            serverData.postValue(it)
        })
    }

}