package com.wn.framework.mvvm.base

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

interface BaseRepository<T> {
    val reqUrl: String

    suspend fun execute(): String
}