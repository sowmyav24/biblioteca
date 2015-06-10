package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MessagesTest {

    @Test
    public void shouldReturnWelcomeString(){
        Messages message = new Messages();

        String actualMessage = message.greetUser();

        assertThat(actualMessage, is(equalTo("Welcome")));
    }

//    @Test
//    public void shouldReturnMenuString(){
//        Messages message = new Messages();
//
//        String actualMessage = message.displayMenu();
//
//        assertThat(actualMessage, is(equalTo("Menu\n" +"1.List Books")));
//    }
}
