package com.wn.example.net

import com.wn.example.home.bean.BannerBean
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface ApiService {

    @GET("banner/json")
    fun getHomeData(): Deferred<String>
}