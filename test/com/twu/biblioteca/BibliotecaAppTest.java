package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class BibliotecaAppTest {

    @Test
    public void shouldExitWhenUserEnterQuit() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        when(bibliotecaAppViewStub.readInput())
                .thenReturn("List Books,Quit", "Quit");
        MenuController menuControllerStub = mock(MenuController.class);
        LoginAuthentication loginAuthentication = mock(LoginAuthentication.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaAppViewStub, menuControllerStub,loginAuthentication);

        bibliotecaApp.start();

        verify(bibliotecaAppViewStub, times(2)).displayMessage(anyString());
    }
}