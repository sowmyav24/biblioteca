package com.twu.menuoptions;

import com.twu.biblioteca.Message;
import com.twu.items.Book;
import com.twu.items.ItemsController;
import com.twu.items.LibrarySection;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class ReturnBookTest {

    @Test
    public void shouldCallReturnBook() {
        ArrayList<Book> issuedBook = new ArrayList<Book>();
        issuedBook.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        LibrarySection<Book> librarySection = new LibrarySection<Book>(new ArrayList<Book>(), issuedBook, checkoutHistory);
        ItemsController itemsController = mock(ItemsController.class);
        ReturnBook returnBook = new ReturnBook(itemsController, librarySection);

        returnBook.compute("abc");

        verify(itemsController, times(1)).returnItem(librarySection, Message.SUCCESSFULL_BOOK_RETURN, Message.UNSUCCESSFULL_BOOK_RETURN, "abc");
    }
}