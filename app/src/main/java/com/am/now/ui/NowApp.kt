package com.am.now.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import com.am.now.navigation.TopLevelDestination
import component.NowNavigationBar


@Composable
fun NowApp(){
//    NowBottomBar()
}

@Composable
fun NowBottomBar(
    destinations:List<TopLevelDestination>,
    destinationsWithUnreadResources:Set<TopLevelDestination>,
    onNavigateToDestination:(TopLevelDestination) -> Unit,
    currentDestination: NavDestination?,
    modifier: Modifier = Modifier
) {
    NowNavigationBar(modifier = modifier){

    }
}
