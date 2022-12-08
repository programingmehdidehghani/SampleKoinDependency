package com.example.samplekoindependency

class MainRepositoryImpl constructor(private val api: MyApi)
  : MainRepository {
    override fun doNetworkCall() {
        api.callApi()
    }
}