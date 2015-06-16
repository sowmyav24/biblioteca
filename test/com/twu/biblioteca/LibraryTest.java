package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void shouldReturnListOfBookDetails() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        Library library = new Library(bookList,new ArrayList<Book>());

        String actualList = library.toString();

        assertEquals("The Monk Who Sold His Ferrari, Robin Sharma, 2007\n", actualList);
    }

    @Test
    public void shouldReturnIfBookIsAvailable() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        Library library = new Library(bookList,new ArrayList<Book>());

        String actualResult = library.checkoutBook("The Monk Who Sold His Ferrari");

        assertEquals("Thank you! Enjoy the book", actualResult);
    }

    @Test
    public void shouldReturnFalseIfBookIsNotAvailable() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        Library library = new Library(bookList,new ArrayList<Book>());

        String actualResult = library.checkoutBook("The  Who Sold His Ferrari");

        assertEquals("That book is not available", actualResult);
    }

    @Test
    public void shouldReturnIfBookCanBeReturned() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        Library library = new Library(bookList,new ArrayList<Book>());

        String actualResult = library.returnBook("The Monk Who Sold His Ferrari");

        assertEquals("Thank you for returning the book", actualResult);
    }

    @Test
    public void shouldReturnFalseIfBookCannotBeReturned() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        Library library = new Library(bookList,new ArrayList<Book>());

        String actualResult = library.returnBook("The Monk  Sold His Ferrari");

        assertEquals("That is not a valid book to return", actualResult);
    }
}
