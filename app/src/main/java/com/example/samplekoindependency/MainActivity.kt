package com.example.samplekoindependency

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import com.example.samplekoindependency.ui.theme.SampleKoinDependencyTheme
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.androidx.compose.getViewModel
import org.koin.androidx.compose.viewModel

class MainActivity : ComponentActivity() {

    //private val viewModel by viewModels<MainViewModel>()

    private val api by inject<MyApi>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleKoinDependencyTheme {
                val viewModel = getViewModel<MainViewModel>()
                viewModel.doNetworkCall()
            }
        }
    }
}

