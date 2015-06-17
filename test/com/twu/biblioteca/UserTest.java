package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void shouldReturnUserDetails() {
        User user = new User("Name", "email", "phone", "logid", "pwd");

        String userDetails = user.returnDetails();

        assertEquals("Name,email,phone", userDetails);
    }
}