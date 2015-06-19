package com.twu.biblioteca;

public class BibliotecaApp {

    private BibliotecaAppView bibliotecaAppView;
    private MenuController menuController;
    private LoginAuthentication loginAuthentication;
    private String userId;

    public BibliotecaApp(BibliotecaAppView bibliotecaAppView, MenuController menuController,LoginAuthentication loginAuthentication) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.menuController = menuController;
        this.loginAuthentication = loginAuthentication;
        this.userId = "";
    }

    public void start() {
        String input;
        bibliotecaAppView.displayMessage(Message.WELCOME_MESSAGE);
        bibliotecaAppView.displayMessage(Message.LOGIN_PASSWORD);
        String result = loginAuthentication.authenticate(this.userId = bibliotecaAppView.readInput(), bibliotecaAppView.readInput());
        if (result != "Invalid") {
            do {
                if (result == "User")
                    bibliotecaAppView.displayMessage(Message.USER_MENU_LIST);
                else if(result == "Librarian")
                    bibliotecaAppView.displayMessage(Message.LIBRARIAN_MENU_LIST);
                input = bibliotecaAppView.readInput();
                    menuController.selectOption(input, userId);
            } while (input != "Quit");
        }
    }
}



