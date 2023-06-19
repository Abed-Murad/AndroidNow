plugins {
    id("now.android.library")
    id("now.android.library.jacoco")
    id("now.android.hilt")
}

android {
    namespace = "com.am.now.core.common"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
    testImplementation(project(":core:testing"))
}
