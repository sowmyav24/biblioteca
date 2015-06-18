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

    public void checkout(LibrarySection librarySection, String successfullMessage, String unsuccessfullMessage,String userId) {
        String itemInput = bibliotecaAppView.readInput();
        bibliotecaAppView.displayMessage(librarySection.checkout(itemInput,successfullMessage,unsuccessfullMessage,userId));
    }

    public void returnItem(LibrarySection librarySection, String successfullMessage, String unsuccessfullMessage,String userId) {
        String itemInput = bibliotecaAppView.readInput();
        bibliotecaAppView.displayMessage(librarySection.returnItem(itemInput,successfullMessage,unsuccessfullMessage,userId));
    }
}
