package com.twu.biblioteca;

public class BooksView {
    private Books books;

    public BooksView(Books books) {

        this.books = books;
    }

    public void displayBooks() {

        System.out.print(books.toString());
    }
}
