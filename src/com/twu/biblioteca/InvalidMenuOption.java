package com.twu.biblioteca;

public class InvalidMenuOption implements MenuActionPerformed {

    private ItemsController itemsController;
    private LibrarySection librarySection;

    public InvalidMenuOption(ItemsController itemsController, LibrarySection librarySection) {
        this.itemsController = itemsController;
        this.librarySection = librarySection;
    }

    public void compute(String userId) {
       itemsController.returnInvalidOption();
    }
}
