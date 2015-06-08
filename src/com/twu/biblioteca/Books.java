package com.twu.biblioteca;

import java.util.ArrayList;

public class Books {
    private ArrayList<Book> books = new ArrayList();

    Books(){
        books.add(new Book("The Monk Who Sold His Ferrari","Robin Sharma", "2007"));
    }

    @Override
    public String toString() {
        String bookList = new String();
        for (Book book : books)
            bookList += book.toString() + "\n";
        return bookList;
    }
}