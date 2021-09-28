package com.wn.example.home.repository

import com.wn.framework.mvvm.base.BaseRepository
import javax.inject.Inject

class HomeRepository @Inject constructor(): BaseRepository<String> {
    override val reqUrl: String = "HomeRepository"
}