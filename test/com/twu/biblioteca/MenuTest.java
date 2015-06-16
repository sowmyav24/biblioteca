package com.twu.biblioteca;

import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class MenuTest {
    @Test
    public void shouldCallTheAppropriateAction() {
        HashMap<String, MenuActionPerformed> menuActionPerformed = new HashMap<>();
        ListBooks listBooks = mock(ListBooks.class);
        menuActionPerformed.put("List Library", listBooks);
        Menu menu = new Menu(menuActionPerformed);

        menu.compute("List Library");

        verify(listBooks, times(1)).compute();
    }

    @Test
    public void shouldCallTheInvalidOption() {
        HashMap<String, MenuActionPerformed> menuActionPerformed = new HashMap<>();
        ListBooks listBooks = mock(ListBooks.class);
        InvalidMenuOption invalidMenuOption = mock(InvalidMenuOption.class);

        menuActionPerformed.put("List Library", listBooks);
        menuActionPerformed.put("Invalid", invalidMenuOption);

        Menu menu = new Menu(menuActionPerformed);

        menu.compute("abc");

        verify(invalidMenuOption, times(1)).compute();
    }
}