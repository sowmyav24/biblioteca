package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MessagesTest {

    @Test
    public void shouldReturnWelcomeString(){
        Messages biblioteca = new Messages();

        String actualMessage = biblioteca.greetUser();

        assertThat(actualMessage, is(equalTo("Welcome")));
    }
}
