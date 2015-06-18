package com.twu.biblioteca;

public class ReturnBook implements MenuActionPerformed {
    private ItemsController itemsController;
    private LibrarySection librarySection;

    public ReturnBook(ItemsController itemsController, LibrarySection librarySection) {
        this.itemsController = itemsController;
        this.librarySection = librarySection;
    }

    @Override
    public void compute(String userId) {
        itemsController.returnItem(librarySection, Message.SUCCESSFULL_BOOK_RETURN, Message.UNSUCCESSFULL_BOOK_RETURN, userId);
    }
}
