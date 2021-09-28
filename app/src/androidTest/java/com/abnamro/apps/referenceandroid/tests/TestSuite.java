package com.abnamro.apps.referenceandroid.tests;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.abnamro.apps.referenceandroid.MainActivity;
import com.abnamro.apps.referenceandroid.screens.MainScreen;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestSuite {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);

    private final MainScreen mainScreen = new MainScreen();

    @Test
    public void test() {
        mainScreen.checkBackgroundText("Hello World!")
                .clickKebabMenu();
    }

    @Test
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

    //Description: Click Kebab Menu
    //Description: Click Settings
    //Description: Check main screen background text
    //Description: Check Alignment?
    //Reporting
}
