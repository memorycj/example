package com.wn.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        GlobalScope.launch {
            test()
        }

    }

    fun flow(): Flow<String>{
        return kotlinx.coroutines.flow.flow {
            emit("sss")
        }
    }

    suspend fun test(){
        val str = withContext(Dispatchers.IO){

        }

        flow().collect {
           Log.d("sss", it)
        }

    }


}