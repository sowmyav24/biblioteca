package com.twu.biblioteca;

import java.util.ArrayList;

public class LibrarySection<Section extends Item>  {
    private ArrayList<Section> availablebooks;
    private ArrayList<Section> issuedBooks;

    LibrarySection(ArrayList<Section> availablebooks, ArrayList<Section> issuedBooks) {
        this.availablebooks = availablebooks;
        this.issuedBooks = issuedBooks;
    }

    @Override
    public String toString() {
        String bookList = new String();
        for (Section book : availablebooks)
            bookList += book.toString() + "\n";
        return bookList;
    }

    public String checkoutBook(String bookName) {
        ArrayList<Section> searchResult = search(bookName, availablebooks);
        for (Section book : searchResult) {
            availablebooks.remove(book);
            issuedBooks.add(book);
            return Message.SUCCESSFULL_CHECKOUT;
        }
        return Message.UNSUCCESSFULL_CHECKOUT;
    }

    public String returnBook(String bookName) {
        ArrayList<Section> searchResult = search(bookName, issuedBooks);
        for (Section book : searchResult) {
            availablebooks.add(book);
            issuedBooks.remove(book);
            return Message.SUCCESSFULL_RETURN;
        }
        return Message.UNSUCCESSFULL_RETURN;
    }

    private ArrayList<Section> search(String bookName, ArrayList<Section> listOfBooks) {
        ArrayList<Section> result = new ArrayList<>();
        for (Section book : listOfBooks) {
            if (book.match(bookName))
                result.add(book);
        }
        return result;
    }
}
