package com.marciofp.mylib;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

/**
 * Created by Marcio Ferreira on 16/03/2018.
 */

public class RegisterStudentUiTest extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    public RegisterStudentUiTest() {
        super(MainActivity.class);
    }
    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }
    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    public void testNameOk() throws Exception{
        solo.clickOnButton("Register Student");
        solo.enterText(0, "Marcio");
        solo.enterText(1, "08/07/1993");
        solo.enterText(2, "teste@teste.com");
        solo.enterText(3, "12345");
        solo.enterText(4, "12345");
        solo.clickOnButton("Save");
    }

    public void testEmailWrong() throws Exception{
        solo.clickOnButton("Register Student");
        solo.enterText(0, "Marcio");
        solo.enterText(1, "08/07/1993");
        solo.enterText(2, "testessss");
        solo.enterText(3, "12345");
        solo.enterText(4, "12345");
        solo.clickOnButton("Save");
    }

    public void testWithoutText() throws Exception{
        solo.clickOnButton("Register Student");
        solo.enterText(0, "");
        solo.enterText(1, "");
        solo.enterText(2, "");
        solo.enterText(3, "");
        solo.enterText(4, "");
        solo.clickOnButton("Save");
    }

}
