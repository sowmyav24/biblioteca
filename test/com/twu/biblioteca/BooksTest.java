package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooksTest {

    @Test
    public void shouldReturnListOfBookDetails() {

        Books books = new Books();

        String actualList = books.toString();

        assertEquals("The Monk Who Sold His Ferrari, Robin Sharma, 2007\n", actualList);
    }
}
