package com.example.samplekoindependency

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import com.example.samplekoindependency.ui.theme.SampleKoinDependencyTheme
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.compose.getViewModel
import org.koin.androidx.compose.viewModel
import org.koin.androidx.scope.activityScope
import org.koin.core.scope.Scope

class MainActivity : ComponentActivity(),AndroidScopeComponent {

    //private val viewModel by viewModels<MainViewModel>()

    override val scope: Scope by activityScope()


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

