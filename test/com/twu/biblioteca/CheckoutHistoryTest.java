package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CheckoutHistoryTest {

    @Test
    public void shouldAddCheckedOutBooks() {
        HashMap<String, ArrayList<Book>> checkoutList = new HashMap<>();
        checkoutList.put("User 1", new ArrayList<Book>());

        CheckoutHistory checkoutHistory = new CheckoutHistory(checkoutList);

        checkoutHistory.add("User 1", new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));

        String actualData = checkoutHistory.displayCheckedOutItems();

        assertEquals("User 1\nThe Monk Who Sold His Ferrari | Robin Sharma | 2007\n\n", actualData);
    }

    @Test
    public void shouldDisplayForMoreThanOneBook() {
        HashMap<String, ArrayList<Book>> checkoutList = new HashMap<>();
        checkoutList.put("User 1", new ArrayList<Book>());

        CheckoutHistory checkoutHistory = new CheckoutHistory(checkoutList);

        checkoutHistory.add("User 1", new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        checkoutHistory.add("User 1", new Book("Java", "Jones", "2007"));

        String actualData = checkoutHistory.displayCheckedOutItems();

        assertEquals("User 1\nThe Monk Who Sold His Ferrari | Robin Sharma | 2007\nJava | Jones | 2007\n\n", actualData);
    }

    @Test
    public void shouldRemoveReturnedBooks() {
        HashMap<String, ArrayList<Book>> checkoutList = new HashMap<>();
        checkoutList.put("User 1", new ArrayList<Book>());

        CheckoutHistory checkoutHistory = new CheckoutHistory(checkoutList);

        checkoutHistory.remove("User 1", new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));

        String actualData = checkoutHistory.displayCheckedOutItems();

        assertEquals("", actualData);
    }
}