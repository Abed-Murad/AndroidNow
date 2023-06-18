
plugins {
    id("now.android.library")
    id("now.android.library.compose")
}


android {

    namespace = "com.am.now.core.designsystem"
}

dependencies {
    api(libs.androidx.compose.foundation)
    api(libs.androidx.compose.material3)
    api(libs.androidx.compose.material.iconsExtended)
}
