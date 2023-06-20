package com.am.now.core.data.di

import com.am.now.core.data.repository.CompositeUserNewsResourceRepository
import com.am.now.core.data.repository.UserNewsResourceRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
interface UserNewsResourceRepositoryModule {
    @Binds
    fun bindsUserNewsResourceRepository(
        userDataRepository: CompositeUserNewsResourceRepository,
    ): UserNewsResourceRepository
}
