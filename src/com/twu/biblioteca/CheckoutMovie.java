package com.twu.biblioteca;

public class CheckoutMovie implements MenuActionPerformed {

    private BibliotecaAppView bibliotecaAppView;
    private LibrarySection librarySection;
    private ItemsController itemsController;

    public CheckoutMovie(BibliotecaAppView bibliotecaAppView, ItemsController itemsController,LibrarySection librarySection) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.itemsController = itemsController;
        this.librarySection = librarySection;
    }

    @Override
    public void compute() {
        itemsController.checkout(librarySection);
    }
}
