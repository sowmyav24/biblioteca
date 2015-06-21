package com.twu.biblioteca;

public class BibliotecaApp {

    private BibliotecaAppView bibliotecaAppView;
    private MenuController menuController;
    private LoginAuthentication loginAuthentication;
    private String userId;

    public BibliotecaApp(BibliotecaAppView bibliotecaAppView, MenuController menuController, LoginAuthentication loginAuthentication) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.menuController = menuController;
        this.loginAuthentication = loginAuthentication;
        this.userId = "";
    }

    public void start(String userId) {
        String input;
        bibliotecaAppView.displayMessage(Message.WELCOME_MESSAGE);
        bibliotecaAppView.displayMessage(Message.MAIN_MENU_LIST);
        do{
            bibliotecaAppView.displayMessage(Message.MENU_INPUT);
            input = bibliotecaAppView.readInput();
            menuController.selectOption(input, userId);
        } while (input != "Quit");
    }
}



