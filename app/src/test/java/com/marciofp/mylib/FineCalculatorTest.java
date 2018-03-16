package com.marciofp.mylib;

import com.marciofp.mylib.models.Fine;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class FineCalculatorTest {

    private Fine fine;

    @Before
    public void setUp() throws Exception {
        fine = new Fine();
    }

    @Test
    public void testCalcFineTax() throws Exception{
        double input = 0.50;
        int input2 = 100;
        double output;
        double expected = 50;
        double delta = 0.01;

        output = fine.calcFineTax(input, input2);
        assertEquals(expected, output, delta);
    }


}