package com.example.samplekoindependency

import org.koin.dsl.module

val activityModule = module {
    scope<MainActivity>{
        scoped { "Hello" }
    }
}