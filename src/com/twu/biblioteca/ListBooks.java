package com.twu.biblioteca;

public class ListBooks implements MenuActionPerformed {

    private BooksView booksView;

    ListBooks(BooksView booksView) {

        this.booksView=booksView;
    }
    public void compute() {
        booksView.displayBooks();
    }
}
