package com.twu.biblioteca;

import com.twu.authentication.LoginAuthentication;
import com.twu.menuactions.MenuController;

public class BibliotecaApp {

    private BibliotecaAppView bibliotecaAppView;
    private MenuController menuController;
    private LoginAuthentication loginAuthentication;
    private String userId;

    public BibliotecaApp(BibliotecaAppView bibliotecaAppView, MenuController menuController, LoginAuthentication loginAuthentication) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.menuController = menuController;
        this.loginAuthentication = loginAuthentication;
        this.userId = "";
    }

    public void start(String userId) {
        String input;
        bibliotecaAppView.displayMessage(Message.WELCOME_MESSAGE);
        bibliotecaAppView.displayMessage(Message.MAIN_MENU_LIST);
        do{
            bibliotecaAppView.displayMessage(Message.MENU_INPUT);
            input = bibliotecaAppView.readInput();
            menuController.selectOption(input, userId);
            if(input!= "Login")
                bibliotecaAppView.displayMessage(Message.MAIN_MENU_LIST);
        } while (input != "Quit");
    }
}



