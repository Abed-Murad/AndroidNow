

package com.am.now

import android.app.backup.BackupAgentHelper
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.metrics.performance.JankStats
import com.am.now.core.analytics.AnalyticsHelper
import com.am.now.core.designsystem.theme.NowTheme
import com.am.now.core.data.repository.UserNewsResourceRepository
import com.am.now.core.data.util.NetworkMonitor
import com.am.now.ui.NowApp
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var lazyStats: dagger.Lazy<JankStats>

    @Inject
    lateinit var networkMonitor: NetworkMonitor

    @Inject
    lateinit var analyticsHelper: AnalyticsHelper

    @Inject
    lateinit var userNewsResourceRepository: UserNewsResourceRepository

    val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NowTheme {
                NowApp()
            }
        }
    }
}
