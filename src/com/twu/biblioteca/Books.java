package com.twu.biblioteca;

import java.util.ArrayList;

public class Books {
    private ArrayList<String> books = new ArrayList();

    Books() {
        books.add("Kite Runner");
        books.add("Java");
    }

    @Override
    public String toString() {
        String bookList = new String();
        for (String book : books)
            bookList += book + "\n";
        return bookList;
    }
}