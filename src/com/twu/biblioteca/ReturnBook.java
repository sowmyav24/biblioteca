package com.twu.biblioteca;

public class ReturnBook implements  MenuActionPerformed{

    private BibliotecaAppView bibliotecaAppView;
    private BooksController booksController;

    public ReturnBook(BibliotecaAppView bibliotecaAppView, BooksController booksController) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.booksController = booksController;
    }

    @Override
    public void compute() {
        booksController.returnBook();
    }
}
