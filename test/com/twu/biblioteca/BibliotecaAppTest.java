package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BibliotecaAppTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintWelcomeMessage() {
        Messages messageStub = mock(Messages.class);
        when(messageStub.greetUser())
                .thenReturn("Welcome !");

        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.displayWelcomeMessage(messageStub);

        assertEquals("Welcome !\n", outContent.toString());
    }

    @Test
    public void shouldPrintMenu() {
        Messages messageStub = mock(Messages.class);
        when(messageStub.greetUser())
                .thenReturn("Menu");

        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.displayWelcomeMessage(messageStub);

        assertEquals("Menu\n", outContent.toString());
    }

    @Test
    public void shouldPrintListOfBooks() {
        Books books = mock(Books.class);
        when(books.toString())
                .thenReturn("Book List");

        BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.displayBookListDetails(books);

        assertEquals("Book List\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}