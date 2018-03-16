package com.marciofp.mylib;

import com.marciofp.mylib.models.Fine;
import com.marciofp.mylib.models.Student;

import org.junit.Before;
import org.junit.Test;

import java.sql.Struct;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class StudentTest {

    private Student student;

    @Before
    public void setUp() throws Exception {
        student = new Student();
    }

    @Test
    public void testEmailValid() throws Exception{
        String input = "marcioasdf.com";
        boolean output;
        boolean expected = false;

        output = student.isEmailValid(input);
        assertEquals(expected, output);
    }

    @Test
    public void testEmailValid2() throws Exception{
        String input = "marcioa@mfp.com";
        boolean output;
        boolean expected = true;

        output = student.isEmailValid(input);
        assertEquals(expected, output);
    }


    @Test
    public void testPasswordValid() throws Exception{
        String input = "123456";
        String input2 = "1234567";
        boolean output;
        boolean expected = false;

        output = student.isValidPassword(input,input2);
        assertEquals(expected, output);
    }




}