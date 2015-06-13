package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class MenuControllerTest {

    @Test
    public void shouldCallAppropriateMenuOption() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        Menu menuStub = mock(Menu.class);
        MenuController menuController = new MenuController(bibliotecaAppViewStub, menuStub);

        menuController.selectOption("1");

        verify(menuStub, times(1)).compute(anyInt());
    }
}