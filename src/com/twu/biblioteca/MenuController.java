package com.twu.biblioteca;

public class MenuController {
    private Menu menu;

    public MenuController(Menu menu) {
        this.menu = menu;
    }

    public void selectOption(String menuOption, String userId) {
        menu.compute(menuOption, userId);
    }
}

