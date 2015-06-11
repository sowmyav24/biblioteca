package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintWelcomeMessage() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        bibliotecaApp.displayMessage(Message.WELCOME_MESSAGE);

        assertEquals("Welcome to BIBLIOTECA\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}