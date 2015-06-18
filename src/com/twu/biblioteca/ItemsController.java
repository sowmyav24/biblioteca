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

    public void checkout(LibrarySection librarySection, String successfullMessage, String unsuccessfullMessage,String userID) {
        String itemInput = bibliotecaAppView.readInput();
        bibliotecaAppView.displayMessage(librarySection.checkout(itemInput,successfullMessage,unsuccessfullMessage,userID));
    }

    public void returnItem(LibrarySection librarySection, String successfullMessage, String unsuccessfullMessage) {
        String itemInput = bibliotecaAppView.readInput();
        bibliotecaAppView.displayMessage(librarySection.returnItem(itemInput,successfullMessage,unsuccessfullMessage));
    }
}
