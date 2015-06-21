package com.twu.biblioteca;

public class Login implements MenuActionPerformed {

    private BibliotecaAppView bibliotecaAppView;
    private LoginAuthentication loginAuthentication;
    private MenuController menuController;
    private String userId;

    public Login(BibliotecaAppView bibliotecaAppView, LoginAuthentication loginAuthentication,MenuController menuController) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.loginAuthentication = loginAuthentication;
        this.menuController = menuController;
    }

    @Override
    public void compute(String userId) {
        String input;
        bibliotecaAppView.displayMessage(Message.LOGIN_PASSWORD);
        String result = loginAuthentication.authenticate(this.userId = bibliotecaAppView.readInput(), bibliotecaAppView.readInput());
        do {
            if (result != "Invalid")
                if (result == "User")
                    bibliotecaAppView.displayMessage(Message.USER_MENU_LIST);
                else if (result == "Librarian")
                    bibliotecaAppView.displayMessage(Message.LIBRARIAN_MENU_LIST);
            input = bibliotecaAppView.readInput();
            menuController.selectOption(input, userId);
        } while (input != "Logout");
    }
}