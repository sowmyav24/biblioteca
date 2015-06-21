package com.twu.biblioteca;

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
