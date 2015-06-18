package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class CheckoutBookTest {

    @Test
    public void shouldReadBookName() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        ItemsController itemsController = mock(ItemsController.class);
        ArrayList<Book> availableBook = new ArrayList<Book>();
        availableBook.add(new Book("The Monk Who Sold His Ferrari","Robin Sharma","2007"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        LibrarySection<Book> librarySection= new LibrarySection<Book>(availableBook,new ArrayList<Book>(),checkoutHistory);

        CheckoutBook checkoutBook = new CheckoutBook(bibliotecaAppViewStub,itemsController,librarySection);

        checkoutBook.compute("xyz");

        verify(itemsController, times(1)).checkout(librarySection,Message.SUCCESSFULL_BOOK_CHECKOUT,Message.UNSUCCESSFULL_BOOK_CHECKOUT,"xyz");
    }
}