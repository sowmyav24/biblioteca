package com.twu.menuoptions;

import com.twu.items.ItemsController;
import com.twu.items.LibrarySection;
import com.twu.biblioteca.Message;
import com.twu.menuactions.MenuActionPerformed;

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
