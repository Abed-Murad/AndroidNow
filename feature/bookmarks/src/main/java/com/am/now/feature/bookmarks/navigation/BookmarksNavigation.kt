package com.am.now.feature.bookmarks.navigation

import androidx.navigation.NavController
import androidx.navigation.NavOptions

const val bookmarksRoute = "bookmarks_route"

fun NavController.navigateToBookmarks(navOptions: NavOptions? = null) {
    this.navigate(bookmarksRoute, navOptions)
}
