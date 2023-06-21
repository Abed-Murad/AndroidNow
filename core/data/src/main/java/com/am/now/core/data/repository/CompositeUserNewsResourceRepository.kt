package com.am.now.core.data.repository

import com.am.now.core.model.data.UserNewsResource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class CompositeUserNewsResourceRepository @Inject constructor(
    val newsRepository: NewsRepository,
    val userDataRepository: UserDataRepository,
) : UserNewsResourceRepository {
    override fun observeAll(query: NewsResourceQuery): Flow<List<UserNewsResource>> {
        return flow {  }
    }

    override fun observeAllForFollowedTopics(): Flow<List<UserNewsResource>> {
        return flow {  }
    }

    override fun observeAllBookmarked(): Flow<List<UserNewsResource>> {
        return flow {  }
    }
}
