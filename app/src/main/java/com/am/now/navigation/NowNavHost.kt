package com.am.now.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.am.now.foryou.navigation.forYouNavigationRoute
import com.am.now.ui.NowAppState

@Composable
fun NowNavHost(
    appState: NowAppState,
    onShowSnackbar: suspend (String, String?) -> Boolean,
    modifier: Modifier = Modifier,
    startDestination: String = forYouNavigationRoute,
) {
    val navController = appState.navController
//    NavHost(navController = navController,
//        startDestination = startDestination,
//        modifier = Modifier){
//    }
}
