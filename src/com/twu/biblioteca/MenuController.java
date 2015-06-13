package com.twu.biblioteca;

public class MenuController {
    private BibliotecaAppView bibliotecaAppView;
    private Menu menu;

    public MenuController(BibliotecaAppView bibliotecaAppView, Menu menu) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.menu = menu;
    }

    public void selectOption() {
        menu.compute(Integer.parseInt(bibliotecaAppView.readInput()));
    }
}
