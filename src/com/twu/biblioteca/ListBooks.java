package com.twu.biblioteca;

public class ListBooks implements MenuActionPerformed {

    private BooksController booksController;

    ListBooks(BooksController booksController) {
        this.booksController = booksController;
    }

    public void compute() {
        booksController.returnListOfAllBooks();
    }
}
