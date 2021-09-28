package com.abnamro.apps.referenceandroid.tests;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.abnamro.apps.referenceandroid.MainActivity;
import com.abnamro.apps.referenceandroid.screens.MainScreen;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import io.qameta.allure.kotlin.Description;

@RunWith(AllureAndroidJUnit4.class)
public class TestSuite {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule
            = new ActivityScenarioRule<>(MainActivity.class);

    private final MainScreen mainScreen = new MainScreen();

    @Test
    @Description("My test")
    public void test() {
        mainScreen.checkBackgroundText("Hello World!")
                .clickKebabMenu();
    }

    @Test
    @Description("My test 2")
    public void test1() {
        mainScreen.checkScreenHeader();
    }

    @Test
    public void test2() {
        mainScreen.clickKebabMenu()
                .clickSettingsMenu();
    }

    @Test
    public void test3() {
        mainScreen.clickEnvelopIcon()
                .checkPopUpIsDisplayed();
    }
}
