package com.am.now.core.data.repository

import com.am.now.model.data.UserNewsResource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CompositeUserNewsResourceRepository @Inject constructor(
    val newsRepository: NewsRepository,
    val userDataRepository: UserDataRepository,
) : UserNewsResourceRepository {
    override fun observeAll(query: NewsResourceQuery): Flow<List<UserNewsResource>> {
        TODO("Not yet implemented")
    }

    override fun observeAllForFollowedTopics(): Flow<List<UserNewsResource>> {
        TODO("Not yet implemented")
    }

    override fun observeAllBookmarked(): Flow<List<UserNewsResource>> {
        TODO("Not yet implemented")
    }
}
