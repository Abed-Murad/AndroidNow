package com.am.now.ui

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.am.now.data.repository.UserNewsResourceRepository
import com.am.now.data.util.NetworkMonitor
import kotlinx.coroutines.CoroutineScope

@Stable
class NowAppState(
    val navController: NavHostController,
    val coroutineScope:CoroutineScope,
    val windowSizeClass: WindowSizeClass,
    networkMonitor: NetworkMonitor,
    userNewsResourceRepository: UserNewsResourceRepository,
    ){
    val currentDestination:NavDestination?
        @Composable get() = navController.currentBackStackEntryAsState().value?.destination

}
