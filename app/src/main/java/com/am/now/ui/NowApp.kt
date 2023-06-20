package com.am.now.ui

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import com.am.now.core.data.repository.UserNewsResourceRepository
import com.am.now.core.data.util.NetworkMonitor
import com.am.now.core.designsystem.component.NowNavigationBar
import com.am.now.navigation.TopLevelDestination


@Composable
fun NowApp(
    windowSizeClass:WindowSizeClass,
    networkMonitor: NetworkMonitor,
    userNewsResourceRepository: UserNewsResourceRepository,
    appState: NowAppState = rememberNowAppState(
        networkMonitor = networkMonitor,
        windowSizeClass = windowSizeClass ,
        userNewsResourceRepository = userNewsResourceRepository
    ),
) {
}

@Composable
fun NowBottomBar(
    destinations: List<TopLevelDestination>,
    destinationsWithUnreadResources: Set<TopLevelDestination>,
    onNavigateToDestination: (TopLevelDestination) -> Unit,
    currentDestination: NavDestination?,
    modifier: Modifier = Modifier,
) {
    NowNavigationBar(modifier = modifier) {
    }
}


