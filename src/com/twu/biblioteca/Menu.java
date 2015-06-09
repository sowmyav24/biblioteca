package com.twu.biblioteca;

import java.util.HashMap;

public class Menu {
    HashMap<Integer, MenuActionPerformed> menuItems = new HashMap<Integer, MenuActionPerformed>();

    public Menu() {

        menuItems.put(1, new ListBooks(new BooksView(new Books())));
        menuItems.put(2, new InvalidMenuOption());
    }

    public String returnMenu() {

        return "Menu\n1.List Books";
    }

    public void selectOption(MenuView menuView) {
        int optionNo = menuView.readMenuOption();
        MenuActionPerformed menuOption = menuItems.get(optionNo);
        if (menuOption == null)
            new InvalidMenuOption().compute();
        else
            menuOption.compute();
    }
}

