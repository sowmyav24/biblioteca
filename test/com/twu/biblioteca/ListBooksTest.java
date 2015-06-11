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
        BooksController booksControllerStub = mock(BooksController.class);
        ListBooks listbooks = new ListBooks(booksControllerStub);

        listbooks.compute();

        Mockito.verify(booksControllerStub, times(1)).returnListOfAllBooks();
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}