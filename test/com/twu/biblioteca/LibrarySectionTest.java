package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class LibrarySectionTest {

    @Test
    public void shouldReturnListOfBookDetails() {
        ArrayList<Book> bookList = new ArrayList<>();
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        LibrarySection librarySection = new LibrarySection(bookList,new ArrayList<Book>(),checkoutHistory);


        String actualList = librarySection.toString();

        assertEquals("The Monk Who Sold His Ferrari, Robin Sharma, 2007\n", actualList);
    }

    @Test
    public void shouldReturnIfBookIsAvailable() {
        String userId="xyz";
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        LibrarySection librarySection = new LibrarySection(bookList,new ArrayList<Book>(),checkoutHistory);

        String actualResult = librarySection.checkout("The Monk Who Sold His Ferrari",Message.SUCCESSFULL_BOOK_CHECKOUT,Message.UNSUCCESSFULL_BOOK_CHECKOUT,userId);

        assertEquals("Thank you! Enjoy the book", actualResult);
    }

    @Test
    public void shouldReturnFalseIfBookIsNotAvailable() {
        String userId="xyz";
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        LibrarySection librarySection = new LibrarySection(bookList,new ArrayList<Book>(),checkoutHistory);

        String actualResult = librarySection.checkout("The  Who Sold His Ferrari",Message.SUCCESSFULL_BOOK_CHECKOUT,Message.UNSUCCESSFULL_BOOK_CHECKOUT,userId);

        assertEquals("That book is not available", actualResult);
    }

    @Test
    public void shouldReturnIfBookCanBeReturned() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);

        LibrarySection librarySection = new LibrarySection(new ArrayList<Book>(),bookList,checkoutHistory);

        String actualResult = librarySection.returnItem("The Monk Who Sold His Ferrari",Message.SUCCESSFULL_BOOK_RETURN,Message.UNSUCCESSFULL_BOOK_RETURN);

        assertEquals("Thank you for returning the book", actualResult);
    }

    @Test
    public void shouldReturnFalseIfBookCannotBeReturned() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        LibrarySection librarySection = new LibrarySection(new ArrayList<Book>(),bookList,checkoutHistory);

        String actualResult = librarySection.returnItem("The Monk  Sold His Ferrari",Message.SUCCESSFULL_BOOK_RETURN,Message.UNSUCCESSFULL_BOOK_RETURN);

        assertEquals("That is not a valid book to return", actualResult);
    }
}
