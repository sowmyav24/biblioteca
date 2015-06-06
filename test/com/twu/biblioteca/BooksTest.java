package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BooksTest {

    @Test
    public void shouldReturnBookList() {
        ArrayList<Book> booksList = new ArrayList<Book>();

        Book firstBookstub = mock(Book.class);
        when(firstBookstub.toString())
                .thenReturn("Books");

        Book secondBookstub = mock(Book.class);
        when(secondBookstub.toString())
                .thenReturn("Books");

        booksList.add(firstBookstub);
        booksList.add(secondBookstub);
        Books books = new Books(booksList);

        String actualList = books.toString();

        assertEquals("Books\nBooks\n", actualList);
    }
}
