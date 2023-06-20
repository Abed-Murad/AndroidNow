package com.am.now.core.data.di

import com.am.now.core.data.repository.NewsRepository
import com.am.now.core.data.repository.OfflineFirstNewsRepository
import com.am.now.core.data.repository.OfflineFirstUserDataRepository
import com.am.now.core.data.repository.UserDataRepository
import com.am.now.core.data.util.ConnectivityManagerNetworkMonitor
import com.am.now.core.data.util.NetworkMonitor
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule{

    @Binds
    fun bindsUserDataRepository(
        userDataRepository: OfflineFirstUserDataRepository,
    ):UserDataRepository
    @Binds
    fun bindsNewsResourcesRepository(
        newsRepository: OfflineFirstNewsRepository
    ):NewsRepository
    @Binds
    fun bindsNetworkMonitor(
        networkMonitor: ConnectivityManagerNetworkMonitor
    ):NetworkMonitor
}
