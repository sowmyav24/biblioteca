package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class InvalidMenuOptionTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintMessageForInvalidOption() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        InvalidMenuOption invalidMenuOption = new InvalidMenuOption(bibliotecaAppViewStub);

        invalidMenuOption.compute("abc");

        Mockito.verify(bibliotecaAppViewStub, times(1)).displayMessage(anyString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}