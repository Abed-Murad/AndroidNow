plugins {
    id("now.android.library")
    id("now.android.library.compose")
    id("now.android.hilt")
}

android {
    namespace = "com.am.now.core.analytics"
}

dependencies {
    implementation(platform(libs.firebase.bom))
    implementation(libs.androidx.compose.runtime)
    implementation(libs.androidx.core.ktx)
    implementation(libs.firebase.analytics)
    implementation(libs.kotlinx.coroutines.android)
}
