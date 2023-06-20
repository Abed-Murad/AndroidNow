package com.am.now.core.data.repository

import com.am.now.model.data.DarkThemeConfig
import com.am.now.model.data.ThemeBrand
import com.am.now.model.data.UserData
import kotlinx.coroutines.flow.Flow

interface UserDataRepository {

    val userData: Flow<UserData>

    suspend fun setFollowedTopicIds(followedTopicIds: Set<String>)

    suspend fun toggleFollowedTopicId(followedTopicId: String, followed: Boolean)

    suspend fun updateNewsResourceBookmark(newsResourceId: String, bookmarked: Boolean)

    suspend fun setNewsResourceViewed(newsResourceId: String, viewed: Boolean)

    suspend fun setThemeBrand(themeBrand: ThemeBrand)

    suspend fun setDarkThemeConfig(darkThemeConfig: DarkThemeConfig)

    suspend fun setDynamicColorPreference(useDynamicColor: Boolean)

    suspend fun setShouldHideOnboarding(shouldHideOnboarding: Boolean)
}

