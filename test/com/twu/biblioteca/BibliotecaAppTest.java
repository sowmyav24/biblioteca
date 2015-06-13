package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class BibliotecaAppTest {

    @Test
    public void shouldCallDisplayToDisplayWelcomeMessage() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        MenuController menuController = mock(MenuController.class);
        BooksController booksController = mock(BooksController.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaAppViewStub,menuController,booksController);

        bibliotecaApp.start();

        verify(bibliotecaAppViewStub, times(1)).displayMessage(Message.WELCOME_MESSAGE);
    }

    @Test
    public void shouldCallDisplayToDisplayMenu() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        MenuController menuController = mock(MenuController.class);
        BooksController booksController = mock(BooksController.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaAppViewStub,menuController,booksController);

        bibliotecaApp.start();

        verify(bibliotecaAppViewStub, times(1)).displayMessage(Message.MENU_LIST);
    }

    @Test
    public void shouldCallDisplayListOfBooks() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        MenuController menuControllerStub = mock(MenuController.class);
        BooksController booksController = mock(BooksController.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaAppViewStub,menuControllerStub,booksController);

        bibliotecaApp.start();

        verify(menuControllerStub, times(1)).selectOption(anyString());
    }
}