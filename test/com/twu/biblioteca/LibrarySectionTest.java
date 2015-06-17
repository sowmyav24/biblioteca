package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibrarySectionTest {

    @Test
    public void shouldReturnListOfBookDetails() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        LibrarySection librarySection = new LibrarySection(bookList,new ArrayList<Book>());

        String actualList = librarySection.toString();

        assertEquals("The Monk Who Sold His Ferrari, Robin Sharma, 2007\n", actualList);
    }

    @Test
    public void shouldReturnIfBookIsAvailable() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        LibrarySection librarySection = new LibrarySection(bookList,new ArrayList<Book>());

        String actualResult = librarySection.checkout("The Monk Who Sold His Ferrari",Message.SUCCESSFULL_BOOK_CHECKOUT,Message.UNSUCCESSFULL_BOOK_CHECKOUT);

        assertEquals("Thank you! Enjoy the book", actualResult);
    }

    @Test
    public void shouldReturnFalseIfBookIsNotAvailable() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        LibrarySection librarySection = new LibrarySection(bookList,new ArrayList<Book>());

        String actualResult = librarySection.checkout("The  Who Sold His Ferrari",Message.SUCCESSFULL_BOOK_CHECKOUT,Message.UNSUCCESSFULL_BOOK_CHECKOUT);

        assertEquals("That book is not available", actualResult);
    }

    @Test
    public void shouldReturnIfBookCanBeReturned() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        LibrarySection librarySection = new LibrarySection(new ArrayList<Book>(),bookList);

        String actualResult = librarySection.returnItem("The Monk Who Sold His Ferrari",Message.SUCCESSFULL_BOOK_RETURN,Message.UNSUCCESSFULL_BOOK_RETURN);

        assertEquals("Thank you for returning the book", actualResult);
    }

    @Test
    public void shouldReturnFalseIfBookCannotBeReturned() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        LibrarySection librarySection = new LibrarySection(new ArrayList<Book>(),bookList);

        String actualResult = librarySection.returnItem("The Monk  Sold His Ferrari",Message.SUCCESSFULL_BOOK_RETURN,Message.UNSUCCESSFULL_BOOK_RETURN);

        assertEquals("That is not a valid book to return", actualResult);
    }
}
