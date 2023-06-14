package com.am.now.data.repository

import kotlinx.coroutines.flow.Flow

interface UserNewsResourceRepository {
    fun observeAll(
        query:NewsResourceQuery = NewsResourceQuery(
            filterTopicsIds = null,
            filterNewsIds = null
        ): Flow<List<UserNewsResource>>
    )

    fun observeAllForFollowedTopics(): Flow<List<UserNewsResource>>

    fun observeAllBookmarked():Flow<List<userNewsResource>>
}
