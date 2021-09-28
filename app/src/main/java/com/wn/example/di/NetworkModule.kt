package com.wn.example.di

import com.wn.example.net.ApiService
import com.wn.framework.net.HttpClientFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun providerNetworkService(): ApiService{
        return HttpClientFactory.getRetrofitClient("https://www.wanandroid.com/").create(ApiService::class.java)
    }
}