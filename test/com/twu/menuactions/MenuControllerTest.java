package com.twu.menuactions;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class MenuControllerTest {

    @Test
    public void shouldCallAppropriateMenuOption() {
        Menu menuStub = mock(Menu.class);
        MenuController menuController = new MenuController(menuStub);

        menuController.selectOption("List LibrarySection", "abc");

        verify(menuStub, times(1)).compute("List LibrarySection", "abc");
    }
}