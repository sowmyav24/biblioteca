package com.twu.biblioteca;

public interface Message {
    String WELCOME_MESSAGE = "Welcome to BIBLIOTECA";
    String INVALID_MENU_OPTION_MESSAGE = "Select a valid option!";
    String MENU_LIST = "Menu\n" + "List Library\n" + "Checkout Book\n" + "Return Book\n" + "Quit";
    String SUCCESSFULL_CHECKOUT = "Thank you! Enjoy the book";
    String UNSUCCESSFULL_CHECKOUT = "That book is not available";
    String SUCCESSFULL_RETURN = "Thank you for returning the book";
    String UNSUCCESSFULL_RETURN = "That is not a valid book to return";
}
