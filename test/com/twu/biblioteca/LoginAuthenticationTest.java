package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class LoginAuthenticationTest {

    @Test
    public void shouldReturnAuthenticatedForCorrectUser() {
        BibliotecaAppView bibliotecaAppView=mock(BibliotecaAppView.class);
        ArrayList<User> user = new ArrayList<>();
        user.add(new User("xyz", "xyz@gmail.com", "999999", "xyz", "xyz123", "User"));
        LoginAuthentication loginAuthentication = new LoginAuthentication(user,bibliotecaAppView);

        String actualResult = loginAuthentication.authenticate("xyz", "xyz123");

        assertEquals("User", actualResult);
    }


    @Test
    public void shouldReturnAuthenticatedForLibrarian() {
        BibliotecaAppView bibliotecaAppView=mock(BibliotecaAppView.class);
        ArrayList<User> user = new ArrayList<>();
        user.add(new User("xyz", "xyz@gmail.com", "999999", "xyz", "xyz123", "Librarian"));
        LoginAuthentication loginAuthentication = new LoginAuthentication(user,bibliotecaAppView);

        String actualResult = loginAuthentication.authenticate("xyz", "xyz123");

        assertEquals("Librarian", actualResult);
    }

    @Test
    public void shouldReturnAuthenticatedForInvalidUser() {
        BibliotecaAppView bibliotecaAppView=mock(BibliotecaAppView.class);
        ArrayList<User> user = new ArrayList<>();
        user.add(new User("xyz", "xyz@gmail.com", "999999", "xyz", "xyz123", "User"));
        LoginAuthentication loginAuthentication = new LoginAuthentication(user,bibliotecaAppView);

        String actualResult = loginAuthentication.authenticate("xz", "xyz123");

        assertEquals("Invalid", actualResult);
    }
}