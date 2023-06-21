package com.am.now.core.data.repository

import com.am.now.core.model.data.NewsResource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class OfflineFirstNewsRepository @Inject constructor() : NewsRepository {
    override fun getNewsResources(): Flow<List<NewsResource>> {
        TODO("Not yet implemented")
    }
}
