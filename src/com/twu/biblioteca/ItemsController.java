package com.twu.biblioteca;

public class ItemsController {
    private BibliotecaAppView bibliotecaAppView;

    public ItemsController(BibliotecaAppView bibliotecaAppView) {
        this.bibliotecaAppView = bibliotecaAppView;
    }

    public void returnListOfAllItems(LibrarySection librarySection) {
        String listOfBooks = librarySection.toString();
        bibliotecaAppView.displayMessage(listOfBooks);
    }

    public void checkout(LibrarySection librarySection) {
        String bookInput = bibliotecaAppView.readInput();
        bibliotecaAppView.displayMessage(librarySection.checkout(bookInput));
    }

    public void returnItem(LibrarySection librarySection) {
        String bookInput = bibliotecaAppView.readInput();
        bibliotecaAppView.displayMessage(librarySection.returnItem(bookInput));
    }
}
