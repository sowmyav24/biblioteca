package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class LoginTest {

    @Test
    public void shouldAuthenticateLogin() {
        BibliotecaAppView bibliotecaAppView = mock(BibliotecaAppView.class);
        when(bibliotecaAppView.readInput())
                .thenReturn("List Books,Logout", "Logout");
        MenuController menuController = mock(MenuController.class);
        LoginAuthentication loginAuthentication = mock(LoginAuthentication.class);
        when(loginAuthentication.authenticate("abc","abc123"))
                .thenReturn("Librarian");
        Login login =  new Login(bibliotecaAppView,loginAuthentication,menuController);

        login.compute("xyz");

        verify(bibliotecaAppView,times(1)).displayMessage(Message.LOGIN_PASSWORD);
    }
}