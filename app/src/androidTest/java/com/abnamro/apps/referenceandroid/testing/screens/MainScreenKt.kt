package com.abnamro.apps.referenceandroid.testing.screens

import android.widget.ActionMenuView
import androidx.appcompat.widget.AppCompatTextView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.abnamro.apps.referenceandroid.R
import io.qameta.allure.kotlin.Allure.step
import org.hamcrest.Matchers
import org.hamcrest.Matchers.allOf
import org.junit.Assert.assertTrue

class MainScreenKt {

    fun checkMainScreenIsLoaded(): MainScreenKt {
        step("Specifically Failed test") {
            assertTrue(false)
        }
        return this
    }

    fun checkScreenHeader(): MainScreenKt {
        step("Check Screen Header") {
            onView(
                allOf(
                    Matchers.instanceOf(
                        AppCompatTextView::class.java
                    ), ViewMatchers.withParent(withId(R.id.toolbar))
                )
            ).check(ViewAssertions.matches(ViewMatchers.withText(SCREEN_HEADER_TEXT)))
        }
        return this
    }

    fun checkBackgroundText(text: String?): MainScreenKt {
        step("Check Background text") {
            onView(
                allOf(
                    Matchers.instanceOf(
                        AppCompatTextView::class.java
                    ), ViewMatchers.withParent(withId(R.id.fragment))
                )
            ).check(ViewAssertions.matches(ViewMatchers.withText(text)))
        }
        return this
    }

    fun clickKebabMenu(): MainScreenKt {
        step("Click Kebab menu") {
            onView(
                allOf(
                    ViewMatchers.withClassName(
                        Matchers.containsString(
                            ActionMenuView::class.java.simpleName
                        )
                    )
                )
            ).perform(ViewActions.click())
        }
        return this
    }

    fun clickEnvelopIcon(): MainScreenKt {
        step("Click Envelop Icon") {
            onView(withId(R.id.fab)).perform(ViewActions.click())
        }
        return this
    }

    fun checkPopUpIsDisplayed(): MainScreenKt {
        step("Check Pop-up is Displayed") {
            onView(withId(R.id.snackbar_text))
                .check(ViewAssertions.matches(ViewMatchers.withText(POPUP_TEXT)))
        }
        return this
    }

    fun clickSettingsMenu(): MainScreenKt {
        step("Click Settings Menu") {
            onView(allOf(withId(R.id.title), ViewMatchers.withText(SETTINGS_MENU_TITLE)))
                .perform(ViewActions.click())
        }
        return this
    }

    companion object {
        const val SCREEN_HEADER_TEXT = "ReferenceAndroid"
        const val POPUP_TEXT = "Replace with your own action"
        const val SETTINGS_MENU_TITLE = "Settings"
    }
}