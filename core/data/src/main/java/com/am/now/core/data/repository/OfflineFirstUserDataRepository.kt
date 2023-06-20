package com.am.now.core.data.repository

import com.am.now.model.data.DarkThemeConfig
import com.am.now.model.data.ThemeBrand
import com.am.now.model.data.UserData
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class OfflineFirstUserDataRepository @Inject constructor(

) :UserDataRepository {
    override val userData: Flow<UserData> = TODO()

    override suspend fun setFollowedTopicIds(followedTopicIds: Set<String>) {
        TODO("Not yet implemented")
    }

    override suspend fun toggleFollowedTopicId(followedTopicId: String, followed: Boolean) {
        TODO("Not yet implemented")
    }

    override suspend fun updateNewsResourceBookmark(newsResourceId: String, bookmarked: Boolean) {
        TODO("Not yet implemented")
    }

    override suspend fun setNewsResourceViewed(newsResourceId: String, viewed: Boolean) {
        TODO("Not yet implemented")
    }

    override suspend fun setThemeBrand(themeBrand: ThemeBrand) {
        TODO("Not yet implemented")
    }

    override suspend fun setDarkThemeConfig(darkThemeConfig: DarkThemeConfig) {
        TODO("Not yet implemented")
    }

    override suspend fun setDynamicColorPreference(useDynamicColor: Boolean) {
        TODO("Not yet implemented")
    }

    override suspend fun setShouldHideOnboarding(shouldHideOnboarding: Boolean) {
        TODO("Not yet implemented")
    }
}
