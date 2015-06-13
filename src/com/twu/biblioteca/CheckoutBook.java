package com.twu.biblioteca;

public class CheckoutBook implements MenuActionPerformed {

    private BibliotecaAppView bibliotecaAppView;
    private BooksController booksController;

    public CheckoutBook(BibliotecaAppView bibliotecaAppView, BooksController booksController) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.booksController = booksController;
    }

    @Override
    public void compute() {
        booksController.checkout();
    }

}
