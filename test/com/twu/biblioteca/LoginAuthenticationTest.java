package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LoginAuthenticationTest {

    @Test
    public void shouldReturnAuthenticatedForCorrectUser() {
        ArrayList<User> user = new ArrayList<>();
        user.add(new User("xyz", "xyz@gmail.com", "999999", "xyz", "xyz123", "User"));
        LoginAuthentication loginAuthentication = new LoginAuthentication(user);

        String actualResult = loginAuthentication.authenticate("xyz", "xyz123");

        assertEquals("User", actualResult);
    }
}