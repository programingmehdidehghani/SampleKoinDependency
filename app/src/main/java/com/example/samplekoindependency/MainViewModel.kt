package com.example.samplekoindependency

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val repositoryImpl = MainRepositoryImpl()

    fun doNetworkCall(){
        
    }
}