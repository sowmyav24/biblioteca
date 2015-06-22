package com.twu.items;

import com.twu.biblioteca.BibliotecaAppView;
import com.twu.biblioteca.Message;

public class ItemsController {
    private BibliotecaAppView bibliotecaAppView;

    public ItemsController(BibliotecaAppView bibliotecaAppView) {
        this.bibliotecaAppView = bibliotecaAppView;
    }

    public void returnListOfAllItems(LibrarySection librarySection) {
        String listOfBooks = librarySection.toString();
        bibliotecaAppView.displayMessage("Details");
        bibliotecaAppView.displayMessage(listOfBooks);
    }

    public void checkout(LibrarySection librarySection, String successfullMessage, String unsuccessfullMessage, String userId) {
        bibliotecaAppView.displayMessage("Enter the title name");
        String itemInput = bibliotecaAppView.readInput();
        bibliotecaAppView.displayMessage(librarySection.checkout(itemInput, successfullMessage, unsuccessfullMessage, userId));
    }

    public void returnItem(LibrarySection librarySection, String successfullMessage, String unsuccessfullMessage, String userId) {
        bibliotecaAppView.displayMessage("Enter the title name");
        String itemInput = bibliotecaAppView.readInput();
        bibliotecaAppView.displayMessage(librarySection.returnItem(itemInput, successfullMessage, unsuccessfullMessage, userId));
    }

    public void returnInvalidOption() {
        bibliotecaAppView.displayMessage(Message.INVALID_MENU_OPTION_MESSAGE);
    }
}
