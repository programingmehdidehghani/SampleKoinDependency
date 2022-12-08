package com.example.samplekoindependency

import androidx.lifecycle.viewmodel.compose.viewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


val appModule = module {
    single {
        Retrofit.Builder()
            .baseUrl("https:google.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MyApi::class.java)
    }
    single<MainRepository> {
        MainRepositoryImpl(get())
    }
    viewModel {
        MainViewModel(get())
    }
}