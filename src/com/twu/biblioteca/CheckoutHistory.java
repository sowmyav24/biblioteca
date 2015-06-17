package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CheckoutHistory {
    private HashMap<String, List<Book>> checkoutList;

    public CheckoutHistory(HashMap<String, List<Book>> checkoutList) {
        this.checkoutList = checkoutList;
    }

    public void add(String userId,Book book) {
        checkoutList.get(userId).add(book);
    }
    public String displayCheckedOutItems() {
        String userName = new String();
        String result = new String();
        List<Book> books = new ArrayList<>();

        for (String user : checkoutList.keySet()) {
            userName = user;
            books = checkoutList.get(user);
            result = displayDetailsOfAUser(userName, books) + "\n";
        }
        return result;
    }

    private String displayDetailsOfAUser(String userName, List<Book> books) {
        String resultData = userName;
        for (Book book : books)
            resultData = book.toString();
        return resultData;
    }
}
