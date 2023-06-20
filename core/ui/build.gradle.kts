plugins {
    id("now.android.library")
    id("now.android.library.compose")
    id("now.android.library.jacoco")
}

android {
    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    namespace = "com.am.now.core.ui"
}


dependencies{
    api(libs.androidx.metrics)
}
