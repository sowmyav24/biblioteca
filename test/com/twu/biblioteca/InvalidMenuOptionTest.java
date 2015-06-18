package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class InvalidMenuOptionTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldComputeInvalidOption() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        ItemsController itemsControllerStub = mock(ItemsController.class);
        LibrarySection librarySectionStub = mock(LibrarySection.class);
        InvalidMenuOption invalidMenuOption = new InvalidMenuOption(itemsControllerStub,librarySectionStub);

        invalidMenuOption.compute("abc");

        Mockito.verify(itemsControllerStub, times(1)).returnInvalidOption();
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}