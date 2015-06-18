package com.twu.biblioteca;

public class CheckoutBook implements MenuActionPerformed {

    private BibliotecaAppView bibliotecaAppView;
    private LibrarySection librarySection;
    private ItemsController itemsController;
    private String userId;

    public CheckoutBook(BibliotecaAppView bibliotecaAppView, ItemsController itemsController, LibrarySection librarySection,String userId) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.itemsController = itemsController;
        this.librarySection = librarySection;
        this.userId = userId;
    }

    @Override
    public void compute() {
        itemsController.checkout(librarySection,Message.SUCCESSFULL_BOOK_CHECKOUT,Message.UNSUCCESSFULL_BOOK_CHECKOUT,userId);
    }
}
