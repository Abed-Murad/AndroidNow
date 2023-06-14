package com.am.now.ui

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Stable
import androidx.navigation.NavController
import com.am.now.data.util.NetworkMonitor
import kotlinx.coroutines.CoroutineScope

@Stable
class NowAppState(
    val navController: NavController,
    val coroutineScope:CoroutineScope,
    val windowSizeClass: WindowSizeClass,
    networkMonitor: NetworkMonitor,
    userNewsResourceRepository: UserNewsResourceRepository,
    )
