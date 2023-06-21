package com.am.now.core.common.network


import javax.inject.Qualifier
import kotlin.annotation.AnnotationRetention.RUNTIME

@Qualifier
@Retention(RUNTIME)
annotation class Dispatcher(val nowDispatcher: NowDispatchers)

enum class NowDispatchers {
    Default,
    IO,
}
