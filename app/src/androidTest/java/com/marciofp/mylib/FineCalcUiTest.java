package com.marciofp.mylib;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

/**
 * Created by Marcio Ferreira on 16/03/2018.
 */

public class FineCalcUiTest extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    public FineCalcUiTest() {
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


    public void testPositiveNumbers() throws Exception{
        solo.clickOnButton("Fine Calculate");
        solo.enterText(0, "1");
        solo.enterText(1, "0.50");
        solo.clickOnButton("Calculate");
    }

    public void testNegativeNumbers() throws Exception{
        solo.clickOnButton("Fine Calculate");
        solo.enterText(0, "5");
        solo.enterText(1, "-0.50");
        solo.clickOnButton("Calculate");
    }


}
