package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class ListLibraryTest {
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

        verify(booksControllerStub, times(1)).returnListOfAllBooks();
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}