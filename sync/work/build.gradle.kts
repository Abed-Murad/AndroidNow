plugins {
    id("now.android.library")
    id("now.android.library.jacoco")
    id("now.android.hilt")
}

android {
    defaultConfig {
        testInstrumentationRunner = "com.am.now.core.testing.NiaTestRunner"
    }
    namespace = "com.am.now.sync"
}
