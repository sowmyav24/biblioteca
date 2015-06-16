package com.twu.biblioteca;

import java.util.ArrayList;

//Contains Details of all LibrarySection in a list

public class LibrarySection {
    private ArrayList<Book> availablebooks;
    private ArrayList<Book> issuedBooks;

    LibrarySection(ArrayList<Book> availablebooks, ArrayList<Book> issuedBooks) {
        this.availablebooks = availablebooks;
        this.issuedBooks = issuedBooks;
    }

    @Override
    public String toString() {
        String bookList = new String();
        for (Book book : availablebooks)
                bookList += book.toString() + "\n";
        return bookList;
    }

    public String checkoutBook(String bookName) {
        ArrayList<Book> searchResult = search(bookName, availablebooks);
        for (Book book : searchResult) {
            availablebooks.remove(book);
            issuedBooks.add(book);
            return Message.SUCCESSFULL_CHECKOUT;
        }
        return Message.UNSUCCESSFULL_CHECKOUT;
    }

    public String returnBook(String bookName) {
        ArrayList<Book> searchResult = search(bookName, issuedBooks);
        for (Book book : searchResult) {
            availablebooks.add(book);
            issuedBooks.remove(book);
            return Message.SUCCESSFULL_RETURN;
        }
        return Message.UNSUCCESSFULL_RETURN;
    }

    private ArrayList<Book> search(String bookName, ArrayList<Book> listOfBooks) {
        ArrayList<Book> result = new ArrayList<Book>();
        for (Book book : listOfBooks) {
            if (book.equals(bookName))
                result.add(book);
        }
        return result;
    }
}