package com.twu.biblioteca;

public class BibliotecaApp {

    private BibliotecaAppView bibliotecaAppView;
    private MenuController menuController;
    private User user;
    private LoginAuthentication loginAuthentication;
    private CheckoutHistory checkoutHistory;

    public BibliotecaApp(BibliotecaAppView bibliotecaAppView, MenuController menuController, User user, LoginAuthentication loginAuthentication,CheckoutHistory checkoutHistory) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.menuController = menuController;
        this.user = user;
        this.loginAuthentication = loginAuthentication;
        this.checkoutHistory = checkoutHistory;
    }

    public void start() {
        String input;
        bibliotecaAppView.displayMessage(Message.WELCOME_MESSAGE);
        bibliotecaAppView.displayMessage(Message.LOGIN_PASSWORD);
        String result = loginAuthentication.authenticate(bibliotecaAppView.readInput(), bibliotecaAppView.readInput());
        if (result == "User") {
            do {
                bibliotecaAppView.displayMessage(user.returnDetails());
                bibliotecaAppView.displayMessage(Message.MENU_LIST);
                input = bibliotecaAppView.readInput();
                menuController.selectOption(input);
            } while (input != "Quit");
        }
        else if(result == "Librarian")
            do {
                bibliotecaAppView.displayMessage(user.returnDetails());
                bibliotecaAppView.displayMessage(checkoutHistory.displayCheckedOutItems());
                bibliotecaAppView.displayMessage(Message.MENU_LIST);
                input = bibliotecaAppView.readInput();
                menuController.selectOption(input);
            } while (input != "Quit");
    }
}

