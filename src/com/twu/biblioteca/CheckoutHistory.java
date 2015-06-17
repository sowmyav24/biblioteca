package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckoutHistory {
    private HashMap<String, ArrayList<Book>> checkoutList;

    public CheckoutHistory(HashMap<String, ArrayList<Book>> checkoutList) {
        this.checkoutList = checkoutList;
    }

    public void add(String userId, Book book) {

        ArrayList<Book> checkout = checkoutList.get(userId);
        checkout.add(book);
    }

    public String displayCheckedOutItems() {
        String userName = "";
        String result = "";
        ArrayList<Book> books;

        for (String user : checkoutList.keySet()) {
            userName = user;
            books = checkoutList.get(user);
            result += displayDetailsOfAUser(userName, books) + "\n";
        }
        return result;
    }

    private String displayDetailsOfAUser(String userName, ArrayList<Book> books) {
        String resultData = "";
        resultData=userName + "\n";
        for (Book book : books)
            resultData += book.toString() + "\n";
        return resultData;
    }
}
