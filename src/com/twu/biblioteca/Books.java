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

    public Boolean checkoutBook(Book bookName) {
        for (Book book : books.keySet())
            if (book.equals(bookName) && (books.get(book) == true)) {
                books.put(book, false);
                return true;
            }
        return false;
    }

    public Boolean returnBook(Book bookName) {
        for (Book book : books.keySet())
            if (book.equals(bookName) && (books.get(book) == false)) {
                books.put(book, true);
                return true;
            }
        return false;
    }
}