package com.twu.biblioteca;

import java.util.ArrayList;

public class Books {
    private ArrayList<Book> books = new ArrayList();

    Books(ArrayList<Book> books){
        this.books = books;
    }

    @Override
    public String toString() {
        String bookList = new String();
        for (Book book : books)
            bookList += book + "\n";
        return bookList;
    }
}