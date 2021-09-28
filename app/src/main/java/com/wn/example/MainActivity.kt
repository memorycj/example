package com.wn.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wn.example.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import androidx.lifecycle.ViewModelProvider
import com.wn.example.home.viewmodel.HomePageViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    var binding:ActivityMainBinding? = null

    private lateinit var viewModel: HomePageViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this)[HomePageViewModel::class.java]
        initData()
    }

    private fun initData() {
        viewModel.liveHomeData.observe(this,{
            binding?.title = it
        })
        viewModel.getHomeData()
    }


    override fun onDestroy() {
        super.onDestroy()
        binding?.unbind()
    }

}