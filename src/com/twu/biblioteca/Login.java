package com.twu.biblioteca;

public class Login implements MenuActionPerformed {

    private BibliotecaAppView bibliotecaAppView;
    private LoginAuthentication loginAuthentication;
    private BibliotecaApp bibliotecaApp;
    private MenuController menuController;
    private String userId;

    public Login(BibliotecaAppView bibliotecaAppView, LoginAuthentication loginAuthentication, BibliotecaApp bibliotecaApp) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.loginAuthentication = loginAuthentication;
        this.bibliotecaApp = bibliotecaApp;
    }

    @Override
    public void compute(String userId) {
        bibliotecaAppView.displayMessage(Message.LOGIN_PASSWORD);
        String result = loginAuthentication.authenticate(this.userId = bibliotecaAppView.readInput(), bibliotecaAppView.readInput());
        if (result != "Invalid")
            if (result == "User")
                bibliotecaAppView.displayMessage(Message.USER_MENU_LIST);
            else if (result == "Librarian")
                bibliotecaAppView.displayMessage(Message.LIBRARIAN_MENU_LIST);
    }
}