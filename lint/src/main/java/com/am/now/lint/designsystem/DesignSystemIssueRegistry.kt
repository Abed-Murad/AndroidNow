package com.am.now.lint.designsystem

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.client.api.Vendor
import com.android.tools.lint.detector.api.CURRENT_API

/**
 * An issue registry that checks for incorrect usages of Compose Material APIs over equivalents in
 * the Now in Android design system module.
 */
class DesignSystemIssueRegistry : IssueRegistry() {
    override val issues = listOf(DesignSystemDetector.ISSUE)

    override val api: Int = CURRENT_API

    override val minApi: Int = 12

    override val vendor: Vendor = Vendor(
        vendorName = "Now App",
        feedbackUrl = "https://github.com/Abed-Murad/AndroidNow/issues",
        contact = "https://github.com/Abed-Murad/AndroidNow",
    )
}
