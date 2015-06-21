package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class LogoutTest {

    @Test
    public void shouldCallStart() {
        BibliotecaApp bibliotecaApp = mock(BibliotecaApp.class);
        Logout logout = new Logout(bibliotecaApp);

        logout.compute("abc");

        verify(bibliotecaApp, times(1)).start("abc");
    }
}