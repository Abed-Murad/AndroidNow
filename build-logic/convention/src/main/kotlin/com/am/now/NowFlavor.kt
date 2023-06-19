package com.am.now

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.ApplicationProductFlavor
import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.ProductFlavor

@Suppress("EnumEntryName")
enum class FlavorDimension{
    contentType
}

@Suppress("EnumEntryName")
enum class NowFlavor (val dimension:FlavorDimension , val applicationIdSuffix:String? = null){
    demo(FlavorDimension.contentType, applicationIdSuffix = ".demo"),
    prod(FlavorDimension.contentType)
}


fun configureFlavors(
    commonExtension: CommonExtension<*,*,*,*>,
    flavorConfigurationBlock: ProductFlavor.(flavor:NowFlavor) -> Unit = {}
){
    commonExtension.apply {
        flavorDimensions += FlavorDimension.contentType.name
        productFlavors {
            NowFlavor.values().forEach {
                create(it.name){
                    dimension = it.dimension.name
                    flavorConfigurationBlock(this, it)
                    if (this@apply is ApplicationExtension && this is ApplicationProductFlavor){
                        if (it.applicationIdSuffix != null){
                            applicationIdSuffix = it. applicationIdSuffix
                        }
                    }
                }
            }
        }
    }
}
