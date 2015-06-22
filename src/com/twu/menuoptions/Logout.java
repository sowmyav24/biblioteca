package com.twu.menuoptions;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.menuactions.MenuActionPerformed;

public class Logout implements MenuActionPerformed {

    private BibliotecaApp bibliotecaApp;

    public Logout(BibliotecaApp bibliotecaApp) {
        this.bibliotecaApp = bibliotecaApp;
    }

    @Override
    public void compute(String userId) {
        bibliotecaApp.start(userId);
    }
}
