package com.twu.biblioteca;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class BooksTest {

    @Test
    public void shouldReturnListOfBookDetails() {
        HashMap<Book, Boolean> bookList = new HashMap<>();
        bookList.put(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"), true);
        Books books = new Books(bookList);

        String actualList = books.toString();

        assertEquals("The Monk Who Sold His Ferrari, Robin Sharma, 2007\n", actualList);
    }

    @Test
    public void shouldReturnIfBookIsAvailable() {
        HashMap<Book, Boolean> bookList = new HashMap<>();
        bookList.put(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"), true);
        Books books = new Books(bookList);

        Boolean actualList = books.checkoutBook(new Book("The Monk Who Sold His Ferrari", " ", " "));

        assertEquals(true, actualList);
    }

    @Test
    public void shouldReturnFalseIfBookIsNotAvailable() {
        HashMap<Book, Boolean> bookList = new HashMap<>();
        bookList.put(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"), true);
        Books books = new Books(bookList);

        Boolean actualList = books.checkoutBook(new Book("The  Who Sold His Ferrari", " ", " "));

        assertEquals(false, actualList);
    }

    @Test
    public void shouldReturnIfBookCanBeReturned() {
        HashMap<Book, Boolean> bookList = new HashMap<>();
        bookList.put(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"), false);
        Books books = new Books(bookList);

        Boolean actualList = books.returnBook(new Book("The Monk Who Sold His Ferrari", " ", " "));

        assertEquals(true, actualList);
    }

    @Test
    public void shouldReturnFalseIfBookCannotBeReturned() {
        HashMap<Book, Boolean> bookList = new HashMap<>();
        bookList.put(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"), false);
        Books books = new Books(bookList);

        Boolean actualList = books.returnBook(new Book("The Monk  Sold His Ferrari", " ", " "));

        assertEquals(false, actualList);
    }
}
