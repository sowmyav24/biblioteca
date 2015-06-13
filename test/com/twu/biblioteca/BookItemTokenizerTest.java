package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookItemTokenizerTest {

    @Test
    public void shouldReturnBookBasedOnTitle() {

        BookItemTokenizer bookItemTokenizer = new BookItemTokenizer();

        Book actualBook = bookItemTokenizer.getBook("The Monk Who Sold His Ferrari");
        Book expectedBook = new Book("The Monk Who Sold His Ferrari", "", "");

        assertEquals(expectedBook,actualBook);
    }
}