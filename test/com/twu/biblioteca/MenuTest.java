package com.twu.biblioteca;

import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class MenuTest {

    @Test
    public void shouldReturnMenuString() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        HashMap<String, MenuActionPerformed> menuItems = new HashMap<>();
        Menu menu = new Menu(menuItems,bibliotecaAppViewStub);

        menu.returnMenu();

        verify(bibliotecaAppViewStub, times(1)).displayMessage(anyString());
    }
}