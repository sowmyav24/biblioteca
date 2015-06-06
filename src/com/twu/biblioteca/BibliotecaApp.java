package com.twu.biblioteca;

public class BibliotecaApp {

    public void displayWelcomeMessage(Messages message) {
        System.out.println(message.greetUser());
    }

    public void displayBookListDetails(Books books){
        System.out.println(books.toString());
    }
}

