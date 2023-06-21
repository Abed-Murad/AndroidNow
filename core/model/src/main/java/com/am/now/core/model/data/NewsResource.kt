package com.am.now.core.model.data

import kotlinx.datetime.Instant

data class NewsResource(
    val id: String,
    val title: String,
    val content: String,
    val url: String,
    val headerImageUrl: String?,
    val publishDate: Instant,
    val type: NewsResourceType,
    val topics: List<Topic>,
)
