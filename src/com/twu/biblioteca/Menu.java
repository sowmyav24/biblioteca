package com.twu.biblioteca;

import java.util.HashMap;

public class Menu {
    HashMap<Integer, MenuActionPerformed> menuItems;
    BibliotecaAppView bibliotecaAppView;

    public Menu(HashMap menuItems, BibliotecaAppView bibliotecaAppView) {
        this.menuItems = menuItems;
        this.bibliotecaAppView = bibliotecaAppView;
    }

    public void returnMenu() {
        String menu = "Menu\n1.List Books\n2.Quit";
        bibliotecaAppView.displayMessage(menu);
    }
}

