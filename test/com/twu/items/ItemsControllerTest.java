package com.twu.items;

import com.twu.biblioteca.BibliotecaAppView;
import com.twu.biblioteca.Message;
import com.twu.items.Book;
import com.twu.items.ItemsController;
import com.twu.items.LibrarySection;
import com.twu.menuoptions.CheckoutHistory;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class ItemsControllerTest {

    @Test
    public void shouldReturnListOfItems() {
        LibrarySection librarySectionStub = mock(LibrarySection.class);
        when(librarySectionStub.toString())
                .thenReturn("List");

        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        ItemsController itemsController = new ItemsController(bibliotecaAppViewStub);

        itemsController.returnListOfAllItems(librarySectionStub);

        verify(bibliotecaAppViewStub, times(1)).displayMessage("List");
    }

    @Test
    public void shouldCheckoutBook() {
        String UserId = "xyz";
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        when(bibliotecaAppViewStub.readInput())
                .thenReturn("The Monk Who Sold His Ferrari");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        LibrarySection librarySection = new LibrarySection(bookList, new ArrayList<Book>(), checkoutHistory);

        ItemsController itemsController = new ItemsController(bibliotecaAppViewStub);

        itemsController.checkout(librarySection, Message.SUCCESSFULL_BOOK_CHECKOUT, Message.UNSUCCESSFULL_BOOK_CHECKOUT, UserId);

        verify(bibliotecaAppViewStub, times(1)).displayMessage(Message.SUCCESSFULL_BOOK_CHECKOUT);

    }

    @Test
    public void shouldReturnMessageForUnSuccesfullCheckoutBook() {
        String userId = "xyz";
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        when(bibliotecaAppViewStub.readInput())
                .thenReturn("The Monk Who Sold His Ferrar");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        LibrarySection librarySection = new LibrarySection(bookList, new ArrayList<Book>(), checkoutHistory);

        ItemsController itemsController = new ItemsController(bibliotecaAppViewStub);

        itemsController.checkout(librarySection, Message.SUCCESSFULL_BOOK_CHECKOUT, Message.UNSUCCESSFULL_BOOK_CHECKOUT, userId);

        verify(bibliotecaAppViewStub, times(1)).displayMessage(Message.UNSUCCESSFULL_BOOK_CHECKOUT);
    }

    @Test
    public void shouldReturnBook() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        when(bibliotecaAppViewStub.readInput())
                .thenReturn("The Monk Who Sold His Ferrari");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        LibrarySection librarySection = new LibrarySection(new ArrayList<Book>(), bookList, checkoutHistory);

        ItemsController itemsController = new ItemsController(bibliotecaAppViewStub);

        itemsController.returnItem(librarySection, Message.SUCCESSFULL_BOOK_RETURN, Message.UNSUCCESSFULL_BOOK_RETURN, "abc");

        verify(bibliotecaAppViewStub, times(1)).displayMessage(Message.SUCCESSFULL_BOOK_RETURN);

    }

    @Test
    public void shouldReturnUnsuccessfullMessageForUnsuccessfullReturnBook() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        when(bibliotecaAppViewStub.readInput())
                .thenReturn("The Monk Who Sold His Ferrar");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);

        LibrarySection librarySection = new LibrarySection(bookList, new ArrayList<Book>(), checkoutHistory);

        ItemsController itemsController = new ItemsController(bibliotecaAppViewStub);

        itemsController.returnItem(librarySection, Message.SUCCESSFULL_BOOK_RETURN, Message.UNSUCCESSFULL_BOOK_RETURN, "abc");

        verify(bibliotecaAppViewStub, times(1)).displayMessage(Message.UNSUCCESSFULL_BOOK_RETURN);

    }

    @Test
    public void shouldReturnInvalidOption() {
        BibliotecaAppView bibliotecaAppView = mock(BibliotecaAppView.class);
        ItemsController itemsController = new ItemsController(bibliotecaAppView);

        itemsController.returnInvalidOption();

        verify(bibliotecaAppView, times(1)).displayMessage(Message.INVALID_MENU_OPTION_MESSAGE);
    }
}