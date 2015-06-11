package com.twu.biblioteca;

import java.util.ArrayList;

//Contains Details of all Books in a list

public class Books {
    private ArrayList<Book> books;

    Books(ArrayList<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        String bookList = new String();
        for (Book book : books)
            bookList += book.toString() + "\n";
        return bookList;
    }
}