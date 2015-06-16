package com.twu.biblioteca;

public class BibliotecaApp {

    private BibliotecaAppView bibliotecaAppView;
    private MenuController menuController;
    private BooksController booksController;

    public BibliotecaApp(BibliotecaAppView bibliotecaAppView, MenuController menuController, BooksController booksController) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.menuController = menuController;
        this.booksController = booksController;
    }

    public void start() {
        String input;
        bibliotecaAppView.displayMessage(Message.WELCOME_MESSAGE);
        bibliotecaAppView.displayMessage(Message.MENU_LIST);
        input = bibliotecaAppView.readInput();
        menuController.selectOption(input);
    }
}
