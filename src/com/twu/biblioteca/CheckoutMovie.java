package com.twu.biblioteca;

public class CheckoutMovie implements MenuActionPerformed {

    private BibliotecaAppView bibliotecaAppView;
    private LibrarySection librarySection;
    private ItemsController itemsController;
    private String userId;

    public CheckoutMovie(BibliotecaAppView bibliotecaAppView, ItemsController itemsController, LibrarySection librarySection, String userId) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.itemsController = itemsController;
        this.librarySection = librarySection;
        this.userId = userId;
    }

    @Override
    public void compute() {
        itemsController.checkout(librarySection, Message.SUCCESSFULL_MOVIE_CHECKOUT, Message.UNSUCCESSFULL_MOVIE_CHECKOUT,userId);
    }
}
