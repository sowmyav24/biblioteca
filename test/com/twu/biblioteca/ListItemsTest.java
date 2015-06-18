package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class ListItemsTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintListOfAllBooks() {
        ItemsController itemsControllerStub = mock(ItemsController.class);
        ArrayList<Book> availableBook = new ArrayList<Book>();
        availableBook.add(new Book("The Monk Who Sold His Ferrari","Robin Sharma","2007"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        LibrarySection<Book> librarySection= new LibrarySection<Book>(availableBook,new ArrayList<Book>(),checkoutHistory);
        ListItems listbooks = new ListItems(itemsControllerStub,librarySection);

        listbooks.compute("abc");

        verify(itemsControllerStub, times(1)).returnListOfAllItems(librarySection);
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}