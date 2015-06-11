package com.twu.biblioteca;

import java.util.HashMap;

public class Menu {
    HashMap<Integer, MenuActionPerformed> menuItems;
    BibliotecaAppView bibliotecaAppView;

    public Menu(HashMap menuItems, BibliotecaAppView bibliotecaAppView) {
        this.menuItems = menuItems;
        this.bibliotecaAppView = bibliotecaAppView;
    }

    public void compute(int menuOption) {
        if (menuItems.get(menuOption) == null)
            menuItems.get(2).compute();
        else
            menuItems.get(menuOption).compute();
    }
}

