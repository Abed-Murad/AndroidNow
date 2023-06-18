package com.am.now.foryou.navigation

import androidx.navigation.NavController
import androidx.navigation.NavOptions


const val LINKED_NEWS_RESOURCE_ID = "linkedNewsResourceId"
const val forYouNavigationRoute = "for_you_route/{$LINKED_NEWS_RESOURCE_ID}"
private const val DEEP_LINK_URI_PATTERN = "https://www.am.com/foryou/{$LINKED_NEWS_RESOURCE_ID}"



fun NavController.navigateToForYou(navOptions: NavOptions? = null){
    this.navigate(forYouNavigationRoute ,navOptions)
}

