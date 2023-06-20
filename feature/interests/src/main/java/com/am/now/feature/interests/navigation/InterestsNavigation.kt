package com.am.now.feature.interests.navigation

import androidx.navigation.NavController
import androidx.navigation.NavOptions

const val interestsRoute = "interests_route"

fun NavController.navigateToInterestsGraph(navOptions: NavOptions? = null) {
    this.navigate(interestsRoute, navOptions)
}
