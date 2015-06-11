package com.twu.biblioteca;

import java.util.HashMap;

public class Menu {
    HashMap<Integer, MenuActionPerformed> menuItems;

    public Menu(HashMap menuItems) {
        this.menuItems = menuItems;
    }

    public void compute(int menuOption) {
        if (menuItems.get(menuOption) == null)
            menuItems.get(2).compute();
        else
            menuItems.get(menuOption).compute();
    }
}

