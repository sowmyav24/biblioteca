package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CheckoutHistoryTest {

    @Test
    public void shouldAddCheckedOutBooks() {
        HashMap<String, List<Book>> checkoutList = new HashMap<>();
        checkoutList.put("User 1", new ArrayList<Book>());

        CheckoutHistory checkoutHistory = new CheckoutHistory(checkoutList);

        checkoutHistory.add("User 1", new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));

        String actualData = checkoutHistory.displayCheckedOutItems();

        assertEquals("The Monk Who Sold His Ferrari, Robin Sharma, 2007\n", actualData);

    }
}