package com.wn.framework.net

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.wn.framework.net.converter.StringConverterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HttpClientFactory {


    companion object {

        fun getRetrofitClient(baseUrl: String): Retrofit {
            val okhttpClient = OkHttpClient.Builder().build()
            val retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(StringConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(okhttpClient)
            return retrofit.build()
        }
    }

}