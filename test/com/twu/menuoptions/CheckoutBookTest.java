package com.twu.menuoptions;

import com.twu.biblioteca.Message;
import com.twu.items.Book;
import com.twu.items.ItemsController;
import com.twu.items.LibrarySection;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class CheckoutBookTest {

    @Test
    public void shouldReadBookName() {
        ItemsController itemsController = mock(ItemsController.class);
        ArrayList<Book> availableBook = new ArrayList<Book>();
        availableBook.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        LibrarySection<Book> librarySection = new LibrarySection<Book>(availableBook, new ArrayList<Book>(), checkoutHistory);

        CheckoutBook checkoutBook = new CheckoutBook(itemsController, librarySection);

        checkoutBook.compute("xyz");

        verify(itemsController, times(1)).checkout(librarySection, Message.SUCCESSFULL_BOOK_CHECKOUT, Message.UNSUCCESSFULL_BOOK_CHECKOUT, "xyz");
    }
}