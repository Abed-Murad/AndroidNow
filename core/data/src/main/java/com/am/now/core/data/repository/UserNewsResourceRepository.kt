package com.am.now.core.data.repository

import com.am.now.model.data.UserNewsResource
import kotlinx.coroutines.flow.Flow

interface UserNewsResourceRepository {
    fun observeAll(
        query: NewsResourceQuery = NewsResourceQuery(
            filterTopicIds = null,
            filterNewsIds = null,
        ),
    ): Flow<List<UserNewsResource>>

    fun observeAllForFollowedTopics(): Flow<List<UserNewsResource>>

    fun observeAllBookmarked(): Flow<List<UserNewsResource>>
}
