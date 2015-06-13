package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BibliotecaAppViewTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private ByteArrayInputStream byteArrayInputStream;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintWelcomeMessage() {
        BibliotecaAppView bibliotecaAppView = new BibliotecaAppView(new Scanner(System.in));

        bibliotecaAppView.displayMessage(Message.WELCOME_MESSAGE);

        assertEquals("Welcome to BIBLIOTECA\n", outContent.toString());
    }

    @Test
    public void shouldAcceptInputFromUser() {
        String inputData = "1";
        BibliotecaAppView bibliotecaAppView = mock(BibliotecaAppView.class);
        when(bibliotecaAppView.readInput())
                .thenReturn("1");
        byteArrayInputStream = new ByteArrayInputStream(inputData.getBytes());
        System.setIn(byteArrayInputStream);

        String actualOption=bibliotecaAppView.readInput();

        assertEquals(inputData, actualOption);
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}