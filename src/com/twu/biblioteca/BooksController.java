package com.twu.biblioteca;

public class BooksController {
    private BibliotecaAppView bibliotecaAppView;
    private LibrarySection librarySection;

    public BooksController(BibliotecaAppView bibliotecaAppView, LibrarySection librarySection) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.librarySection = librarySection;
    }

    public void returnListOfAllBooks() {
        String listOfBooks = librarySection.toString();
        bibliotecaAppView.displayMessage(listOfBooks);
    }

    public void checkout() {
        String bookInput = bibliotecaAppView.readInput();
        bibliotecaAppView.displayMessage(librarySection.checkoutBook(bookInput));
    }

    public void returnBook() {
        String bookInput = bibliotecaAppView.readInput();
        bibliotecaAppView.displayMessage(librarySection.returnBook(bookInput));
    }
}
