package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class BibliotecaAppTest {

    @Test
    public void shouldExitWhenUserEnterQutit() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        when(bibliotecaAppViewStub.readInput())
                .thenReturn("List Books,Quit", "Quit");
        MenuController menuControllerStub = mock(MenuController.class);
        User user = mock(User.class);
        LoginAuthentication loginAuthentication = mock(LoginAuthentication.class);
        CheckoutHistory checkoutHistory=mock(CheckoutHistory.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaAppViewStub, menuControllerStub, user, loginAuthentication,checkoutHistory);

        bibliotecaApp.start();

        verify(bibliotecaAppViewStub, times(2)).displayMessage(anyString());

    }
}