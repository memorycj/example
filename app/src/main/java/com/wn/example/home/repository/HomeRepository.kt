package com.wn.example.home.repository

import com.wn.example.net.ApiService
import com.wn.framework.mvvm.base.BaseRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class HomeRepository @Inject constructor(private var service: ApiService): BaseRepository<String> {

    override val reqUrl: String = "HomeRepository"

    override suspend fun execute(): String {
        return withContext(Dispatchers.IO){
            service.getHomeData().await()
        }
    }

}