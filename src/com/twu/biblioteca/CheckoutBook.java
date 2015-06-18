package com.twu.biblioteca;

public class CheckoutBook implements MenuActionPerformed {

    private LibrarySection librarySection;
    private ItemsController itemsController;

    public CheckoutBook(ItemsController itemsController, LibrarySection librarySection) {
        this.itemsController = itemsController;
        this.librarySection = librarySection;
    }

    @Override
    public void compute(String userId) {
        itemsController.checkout(librarySection, Message.SUCCESSFULL_BOOK_CHECKOUT, Message.UNSUCCESSFULL_BOOK_CHECKOUT, userId);
    }
}
