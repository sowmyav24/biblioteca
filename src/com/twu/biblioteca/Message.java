package com.twu.biblioteca;

public interface Message {
    String WELCOME_MESSAGE = "Welcome to BIBLIOTECA";
    String INVALID_MENU_OPTION_MESSAGE = "Select a valid option!";
    String MENU_LIST = "Menu\n" + "1.List Books\n" + "2.Checkout Book\n" + "3.Return Book\n" + "3.Quit";
    String SUCCESSFULL_CHECKOUT = "Thank you! Enjoy the book";
    String UNSUCCESSFULL_CHECKOUT = "That book is not available";
    String SUCCESSFULL_RETURN = "Thank you for returning the book";
    String UNSUCCESSFULL_RETURN = "That is not a valid book to return";
}
