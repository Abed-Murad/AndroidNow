package com.am.now.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import com.am.now.core.designsystem.icon.NowIcons
import com.am.now.feature.foryou.R as forYouR

// TODO: Update Both BookMarks and Interests details once implemented.
enum class TopLevelDestination(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconTextId: Int,
    val titleTextId: Int,
) {
    FOR_YOU(
        selectedIcon = NowIcons.Upcoming,
        unselectedIcon = NowIcons.UpcomingBorder,
        iconTextId = forYouR.string.for_you,
        titleTextId = com.am.now.R.string.app_name,
    ),
    BOOKMARKS(
        selectedIcon = NowIcons.Bookmarks,
        unselectedIcon = NowIcons.BookmarksBorder,
        iconTextId = forYouR.string.for_you,
        titleTextId = com.am.now.R.string.app_name,
    ),
    INTERESTS(
        selectedIcon = NowIcons.Grid3x3,
        unselectedIcon = NowIcons.Grid3x3,
        iconTextId = forYouR.string.for_you,
        titleTextId = com.am.now.R.string.app_name,
    ),
}
