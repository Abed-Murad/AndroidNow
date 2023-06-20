package com.am.now.feature.search.navigation

import androidx.navigation.NavController
import androidx.navigation.NavOptions

const val searchRoute = "search_route"

fun NavController.navigateToSearch(navOptions: NavOptions? = null) {
    this.navigate(searchRoute, navOptions)
}
