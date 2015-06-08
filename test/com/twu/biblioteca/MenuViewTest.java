package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MenuViewTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintMenu() {
        Menu menuStub = mock(Menu.class);
        when(menuStub.returnMenu())
                .thenReturn("Menu");

        MenuView menuview = new MenuView(menuStub);
        menuview.displayMenu();

        assertEquals("Menu", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}
