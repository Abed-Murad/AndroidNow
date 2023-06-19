

package com.am.now

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.am.now.designsystem.theme.NowTheme
import com.am.now.ui.NowApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NowTheme {
                NowApp()
            }
        }
    }
}
