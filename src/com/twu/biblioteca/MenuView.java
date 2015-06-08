package com.twu.biblioteca;

public class MenuView {
    private Menu menu;

    MenuView(Menu menu) {
        this.menu = menu;
    }

    public void displayMenu() {
        System.out.print(menu.returnMenu());
    }
}
