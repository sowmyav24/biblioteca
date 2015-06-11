package com.twu.biblioteca;

import java.util.HashMap;

//Contains Details of all Books in a list

public class Books {
    private HashMap<Book, Boolean> books;

    Books(HashMap<Book, Boolean> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        String bookList = new String();
        for (Book book : books.keySet())
            if (books.get(book) == true)
                bookList += book.toString() + "\n";
        return bookList;
    }

    public Boolean checkoutBook(String bookName) {
        for (Book book : books.keySet())
            if (book.name == bookName) {
                books.put(book, false);
                return true;
            }
        return false;
    }
}