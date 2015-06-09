package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class ListBooksTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintListOfAllBooks() {
        BooksView booksViewStub = mock(BooksView.class);
        ListBooks listbooks = new ListBooks(booksViewStub);
        listbooks.compute();

        Mockito.verify(booksViewStub,times(1)).displayBooks();
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}