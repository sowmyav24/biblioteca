package com.twu.biblioteca;

import java.util.HashMap;

public class Menu {
    HashMap<Integer, MenuActionPerformed> menuItems = new HashMap<Integer, MenuActionPerformed>();

    public Menu() {
        menuItems.put(1, new ListBooks());
    }

    public String returnMenu() {
        return "Menu\n1.List Books";
    }

    public void selectOption(MenuView menuView) {
        int optionNo = menuView.readMenuOption();
        menuItems.get(optionNo).compute();
    }
}

