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
        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaAppViewStub, menuControllerStub);

        bibliotecaApp.start();

        verify(bibliotecaAppViewStub,times(3)).displayMessage(anyString());

    }
}