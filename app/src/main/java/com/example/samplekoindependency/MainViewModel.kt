package com.example.samplekoindependency

import androidx.lifecycle.ViewModel

class MainViewModel constructor(private val repository: MainRepositoryImpl) :
    ViewModel() {

    fun doNetworkCall(){
        println("something")
    }
}