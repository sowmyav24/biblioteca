package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListBooksTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintListOfAllBooks() {
        BooksView booksViewStub = mock(BooksView.class);
        when(booksViewStub.toString())
                .thenReturn("BookList");

        ListBooks listbooks = new ListBooks();
        listbooks.compute();

        assertEquals("The Monk Who Sold His Ferrari, Robin Sharma, 2007\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}