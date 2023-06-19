package com.am.now.data.repository

data class NewsResourceQuery(
    val filterTopicIds: Set<String>? = null,
    val filterNewsIds: Set<String>? = null,
)
