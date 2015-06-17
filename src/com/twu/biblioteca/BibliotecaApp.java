package com.twu.biblioteca;

public class BibliotecaApp {

    private BibliotecaAppView bibliotecaAppView;
    private MenuController menuController;

    public BibliotecaApp(BibliotecaAppView bibliotecaAppView, MenuController menuController) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.menuController = menuController;
    }

    public void start() {
        String input;
        bibliotecaAppView.displayMessage(Message.WELCOME_MESSAGE);
        do {
            bibliotecaAppView.displayMessage(Message.MENU_LIST);
            input = bibliotecaAppView.readInput();
            menuController.selectOption(input);
        } while (input != "Quit");
    }
}

