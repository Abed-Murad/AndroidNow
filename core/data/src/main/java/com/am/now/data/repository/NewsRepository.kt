package com.am.now.data.repository

import com.am.now.model.data.NewsResource
import kotlinx.coroutines.flow.Flow

data class NewsResourceQuery(
    val filterTopicIds: Set<String>? = null,
    val filterNewsIds: Set<String>? = null,
)

interface NewsRepository {
    fun getNewsResources(): Flow<List<NewsResource>>
}
