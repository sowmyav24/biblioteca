package com.twu.biblioteca;

public class BibliotecaApp {

    private BibliotecaAppView bibliotecaAppView;
    private MenuController menuController;
    private User user;
    private LoginAuthentication loginAuthentication;
    private CheckoutHistory checkoutHistory;
    private String userId;

    public BibliotecaApp(BibliotecaAppView bibliotecaAppView, MenuController menuController, User user, LoginAuthentication loginAuthentication, CheckoutHistory checkoutHistory) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.menuController = menuController;
        this.user = user;
        this.loginAuthentication = loginAuthentication;
        this.checkoutHistory = checkoutHistory;
        this.userId = "";
    }

    public void start() {
        String input;
        bibliotecaAppView.displayMessage(Message.WELCOME_MESSAGE);
        bibliotecaAppView.displayMessage(Message.LOGIN_PASSWORD);
        String result = loginAuthentication.authenticate(this.userId = bibliotecaAppView.readInput(), bibliotecaAppView.readInput());
        if (result != "Invalid") {
            do {
                if (result == "User")
                    bibliotecaAppView.displayMessage(Message.USER_MENU_LIST);
                else if (result == "Librarian")
                    bibliotecaAppView.displayMessage(Message.LIBRARIAN_MENU_LIST);
                input = bibliotecaAppView.readInput();
                if (input.equals("Logout"))
                    start();
                else
                    menuController.selectOption(input, userId);
            } while (input != "Quit");
        }
    }
}



