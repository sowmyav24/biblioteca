package com.twu.biblioteca;

public class BooksController {
    private BibliotecaAppView bibliotecaAppView;
    private Books books;

    public BooksController(BibliotecaAppView bibliotecaAppView, Books books) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.books = books;
    }

    public void returnListOfAllBooks() {
        String listOfBooks = books.toString();
        bibliotecaAppView.displayMessage(listOfBooks);
    }

    public void checkout(String bookInput) {
    }
}
