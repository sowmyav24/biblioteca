package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooksTest {

    @Test
    public void shouldReturnBookList() {
        Books books = new Books();

        String bookList = books.toString();

        assertEquals("Kite Runner\nJava\n",bookList);
    }
}
