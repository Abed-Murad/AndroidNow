
plugins {
    id("now.android.library")
    id("now.android.library.compose")
}


android {
    namespace = "com.am.now.core.designsystem"

    lint {
        checkDependencies = true
    }
}

dependencies {
    lintPublish(project(":lint"))

    api(libs.androidx.compose.foundation)
    api(libs.androidx.compose.foundation.layout)
    api(libs.androidx.compose.material.iconsExtended)
    api(libs.androidx.compose.material3)
    api(libs.androidx.compose.runtime)
    api(libs.androidx.compose.ui.tooling.preview)
    api(libs.androidx.compose.ui.util)

    debugApi(libs.androidx.compose.ui.tooling)

    implementation(libs.androidx.core.ktx)
    implementation(libs.coil.kt.compose)


}
