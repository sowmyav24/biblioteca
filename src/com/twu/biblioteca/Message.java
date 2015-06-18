package com.twu.biblioteca;

public interface Message {
    String WELCOME_MESSAGE = "Welcome to BIBLIOTECA";
    String INVALID_MENU_OPTION_MESSAGE = "Select a valid option!";
    String MENU_LIST = "Menu\n" + "List Books\n" + "Checkout Book\n" + "Return Book\n" + "List Movies\n" + "Checkout Movie\n" + "Return Movie\n" + "Quit";
    String SUCCESSFULL_BOOK_CHECKOUT = "Thank you! Enjoy the book";
    String SUCCESSFULL_MOVIE_CHECKOUT = "Thank you! Enjoy the movie";
    String UNSUCCESSFULL_BOOK_CHECKOUT = "That book is not available";
    String UNSUCCESSFULL_MOVIE_CHECKOUT = "That movie is not available";
    String SUCCESSFULL_BOOK_RETURN = "Thank you for returning the book";
    String SUCCESSFULL_MOVIE_RETURN = "Thank you for returning the movie";
    String UNSUCCESSFULL_BOOK_RETURN = "That is not a valid book to return";
    String UNSUCCESSFULL_MOVIE_RETURN = "That is not a valid movie to return";
    String LOGIN_PASSWORD = "Enter you Login ID and Passsword";
}
