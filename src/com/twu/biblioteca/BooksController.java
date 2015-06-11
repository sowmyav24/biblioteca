package com.twu.biblioteca;

public class BooksController {
    private BibliotecaApp bibliotecaApp;
    private Books books;

    public BooksController(BibliotecaApp bibliotecaApp, Books books) {
        this.bibliotecaApp = bibliotecaApp;
        this.books = books;
    }

    public void returnListOfAllBooks() {
        String listOfBooks = books.toString();
        bibliotecaApp.displayMessage(listOfBooks);
    }
}
