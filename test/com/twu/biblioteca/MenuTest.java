package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MenuTest {
    @Test
    public void shouldReturnMenuString(){
        Menu menu = new Menu();

        String actualMessage = menu.displayMenu();

        assertThat(actualMessage, is(equalTo("Menu\n" +"1.List Books")));
    }

}