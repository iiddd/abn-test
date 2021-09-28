package com.abnamro.apps.referenceandroid.tests

import androidx.test.ext.junit.rules.activityScenarioRule
import com.abnamro.apps.referenceandroid.MainActivity
import com.abnamro.apps.referenceandroid.screens.MainScreenKt
import io.qameta.allure.android.rules.LogcatRule
import io.qameta.allure.android.rules.ScreenshotRule
import io.qameta.allure.android.rules.WindowHierarchyRule
import io.qameta.allure.android.runners.AllureAndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.rules.RuleChain
import org.junit.runner.RunWith

@RunWith(AllureAndroidJUnit4::class)
class TestSuiteKt {

    @get:Rule
    val ruleChain: RuleChain = RuleChain.outerRule(activityScenarioRule<MainActivity>())
        .around(LogcatRule())
        .around(
            ScreenshotRule(
                mode = ScreenshotRule.Mode.FAILURE,
                screenshotName = "screenshot-failure"
            )
        )
        .around(WindowHierarchyRule())

    private val mainScreen = MainScreenKt()

    @Test
    fun backgroundTextTest() {
        mainScreen.checkBackgroundText("Hello World!")
    }

    @Test
    fun screenHeaderTest() {
        mainScreen.checkScreenHeader()
    }

    @Test
    fun settingsMenuTest() {
        mainScreen.clickKebabMenu()
            .clickSettingsMenu()
    }

    @Test
    fun envelopTest() {
        mainScreen.clickEnvelopIcon()
            .checkPopUpIsDisplayed()
    }
}