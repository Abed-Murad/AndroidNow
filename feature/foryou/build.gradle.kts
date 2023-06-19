plugins {
    id("now.android.feature")
    id("now.android.library.compose")
}

android{
    namespace = "com.am.now.feature.foryou"
}

dependencies{
    implementation(libs.kotlinx.datetime)
    implementation(libs.androidx.activity.compose)
    implementation(libs.accompanist.permissions)
}
