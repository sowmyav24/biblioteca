package com.twu.menuoptions;

import com.twu.biblioteca.BibliotecaAppView;
import com.twu.items.Book;
import com.twu.menuoptions.CheckoutHistory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class CheckoutHistoryTest {

    @Test
    public void shouldAddCheckedOutBooks() {
        HashMap<String, ArrayList<Book>> checkoutList = new HashMap<>();
        checkoutList.put("User 1", new ArrayList<Book>());

        BibliotecaAppView bibliotecaAppView = mock(BibliotecaAppView.class);
        CheckoutHistory checkoutHistory = new CheckoutHistory(checkoutList,bibliotecaAppView);


        checkoutHistory.add("User 1", new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));

        checkoutHistory.compute("abc");

        verify(bibliotecaAppView,times(1)).displayMessage(anyString());
    }

    @Test
    public void shouldDisplayForMoreThanOneBook() {
        HashMap<String, ArrayList<Book>> checkoutList = new HashMap<>();
        checkoutList.put("User 1", new ArrayList<Book>());
        BibliotecaAppView bibliotecaAppView = mock(BibliotecaAppView.class);
        CheckoutHistory checkoutHistory = new CheckoutHistory(checkoutList,bibliotecaAppView);

        checkoutHistory.add("User 1", new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        checkoutHistory.add("User 1", new Book("Java", "Jones", "2007"));

        checkoutHistory.compute("abc");

        verify(bibliotecaAppView,times(1)).displayMessage(anyString());
    }

    @Test
    public void shouldRemoveReturnedBooks() {
        HashMap<String, ArrayList<Book>> checkoutList = new HashMap<>();
        checkoutList.put("User 1", new ArrayList<Book>());
        BibliotecaAppView bibliotecaAppView = mock(BibliotecaAppView.class);
        CheckoutHistory checkoutHistory = new CheckoutHistory(checkoutList,bibliotecaAppView);

        checkoutHistory.remove("User 1", new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));

        checkoutHistory.compute("abc");

        verify(bibliotecaAppView,times(1)).displayMessage(anyString());
    }
}