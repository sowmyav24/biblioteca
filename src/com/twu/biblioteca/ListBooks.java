package com.twu.biblioteca;

public class ListBooks implements MenuActionPerformed{

    public void compute() {
        new BooksView(new Books()).displayBooks();
    }
}
