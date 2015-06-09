package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MenuTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldReturnMenuString(){
        Menu menu = new Menu();

        String actualMessage = menu.returnMenu();

        assertThat(actualMessage, is(equalTo("Menu\n" +"1.List Books")));
    }

    @Test
    public void shouldDispalyListOfBooksWhenListAllBooksIsSelected() {
        Menu menu = new Menu();
        MenuView menuViewStub = mock(MenuView.class);
        when(menuViewStub.readMenuOption())
                .thenReturn(1);
        menu.selectOption(menuViewStub);

        assertEquals("The Monk Who Sold His Ferrari, Robin Sharma, 2007\n", outContent.toString());

    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}