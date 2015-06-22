package com.twu.menuoptions;

import com.twu.biblioteca.BibliotecaApp;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class LogoutTest {

    @Test
    public void shouldCallStart() {
        BibliotecaApp bibliotecaApp = mock(BibliotecaApp.class);
        Logout logout = new Logout(bibliotecaApp);

        logout.compute("abc");

        verify(bibliotecaApp, times(1)).start("abc");
    }
}