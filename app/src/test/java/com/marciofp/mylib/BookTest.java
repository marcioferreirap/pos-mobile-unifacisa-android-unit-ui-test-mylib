package com.marciofp.mylib;

import com.marciofp.mylib.models.Book;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BookTest {

    private Book book;

    @Before
    public void setUp() throws Exception {
        book = new Book();
    }

    @Test
    public void testISBNValid() throws Exception{
        String input = "978-8575224632";
        boolean output;
        boolean expected = true;

        output = book.IsValidISBN13(input);
        assertEquals(expected, output);
    }

    @Test
    public void testISBNValid2() throws Exception{
        String input = "978-85423423423432";
        boolean output;
        boolean expected = false;

        output = book.IsValidISBN13(input);
        assertEquals(expected, output);
    }


    @Test
    public void testISBNValid3() throws Exception{
        String input = "";
        boolean output;
        boolean expected = false;

        output = book.IsValidISBN13(input);
        assertEquals(expected, output);
    }


}