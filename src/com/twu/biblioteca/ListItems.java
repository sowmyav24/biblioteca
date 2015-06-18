package com.twu.biblioteca;

public class ListItems implements MenuActionPerformed {

    private ItemsController itemsController;
    private LibrarySection librarySection;

    ListItems(ItemsController itemsController, LibrarySection librarySection) {
        this.itemsController = itemsController;
        this.librarySection = librarySection;
    }

    public void compute(String userId) {
        itemsController.returnListOfAllItems(librarySection);
    }
}
