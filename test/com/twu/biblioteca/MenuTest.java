package com.twu.biblioteca;

import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class MenuTest {
    @Test
    public void shouldCallTheAppropriateListBooksAction() {
        HashMap<Integer,MenuActionPerformed> menuActionPerformed =new HashMap<>();
        ListBooks listBooks = mock(ListBooks.class);
        menuActionPerformed.put(1,listBooks);
        Menu menu=new Menu(menuActionPerformed);

        menu.compute(1);

        verify(listBooks,times(1)).compute();
    }
}