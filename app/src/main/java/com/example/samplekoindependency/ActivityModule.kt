package com.example.samplekoindependency

import org.koin.core.module.Module
import org.koin.dsl.module

class ActivityModule {

val activityModule = module {
    scope<MainActivity>{
        scoped { "Hello" }
    }
}


}