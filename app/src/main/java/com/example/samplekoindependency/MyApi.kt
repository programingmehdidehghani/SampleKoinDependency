package com.example.samplekoindependency

import retrofit2.http.GET

interface MyApi {

    @GET("my/api")
    fun callApi()
}