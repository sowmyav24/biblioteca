package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BooksViewTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintMenu() {
        Books booksStub = mock(Books.class);
        when(booksStub.toString())
                .thenReturn("BookList");

        BooksView booksView = new BooksView(booksStub);
        booksView.displayBooks();

        assertEquals("BookList", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}