package com.abnamro.apps.referenceandroid.screens;

import android.view.View;
import android.widget.ActionMenuView;

import androidx.appcompat.widget.AppCompatTextView;

import com.abnamro.apps.referenceandroid.R;

import org.hamcrest.Matchers;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;

public class MainScreen {

    public static final String SCREEN_HEADER_TEXT = "ReferenceAndroid";
    public static final String POPUP_TEXT = "Replace with your own action";
    public static final String SETTINGS_MENU_TITLE = "Settings";

    public MainScreen checkMainScreenIsDisplayed() {
        return this;
    }

    public MainScreen checkScreenHeader() {
        onView(allOf(Matchers.<View>instanceOf(AppCompatTextView.class), withParent(withId(R.id.toolbar)))).check(matches(withText(SCREEN_HEADER_TEXT)));
        return this;
    }

    public MainScreen checkBackgroundText(String text) {
        onView(allOf(Matchers.<View>instanceOf(AppCompatTextView.class), withParent(withId(R.id.fragment)))).check(matches(withText(text)));
        return this;
    }

    public MainScreen clickKebabMenu() {
        onView(allOf(withClassName(containsString(ActionMenuView.class.getSimpleName())))).perform(click());
        return this;
    }

    public MainScreen clickEnvelopIcon() {
        onView(withId(R.id.fab)).perform(click());
        return this;
    }

    public MainScreen checkPopUpIsDisplayed() {
        onView(withId(R.id.snackbar_text)).check(matches(withText(POPUP_TEXT)));
        return this;
    }

    public MainScreen clickSettingsMenu() {
        onView(allOf(withId(R.id.title), withText(SETTINGS_MENU_TITLE))).perform(click());
        return this;
    }
}
