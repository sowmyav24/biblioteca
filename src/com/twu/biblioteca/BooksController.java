package com.twu.biblioteca;

public class BooksController {
    private BibliotecaAppView bibliotecaAppView;
    private Library library;

    public BooksController(BibliotecaAppView bibliotecaAppView, Library library) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.library = library;
    }

    public void returnListOfAllBooks() {
        String listOfBooks = library.toString();
        bibliotecaAppView.displayMessage(listOfBooks);
    }

    public void checkout() {
        String bookInput = bibliotecaAppView.readInput();
        bibliotecaAppView.displayMessage(library.checkoutBook(bookInput));
    }

    public void returnBook() {
        String bookInput = bibliotecaAppView.readInput();
        bibliotecaAppView.displayMessage(library.returnBook(bookInput));
    }
}
