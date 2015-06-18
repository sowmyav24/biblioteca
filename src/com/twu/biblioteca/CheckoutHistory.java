package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckoutHistory<Section extends Item> {
    private HashMap<String, ArrayList<Section>> checkoutList;

    public CheckoutHistory(HashMap<String, ArrayList<Section>> checkoutList) {
        this.checkoutList = checkoutList;
    }

    public void add(String userId, Section book) {
        ArrayList<Section> checkout = checkoutList.get(userId);
        checkout.add(book);
    }

    public String displayCheckedOutItems() {
        String userName = "";
        String result = "";
        ArrayList<Section> books;

        for (String user : checkoutList.keySet()) {
            userName = user;
            books = checkoutList.get(user);
            if(books.size() != 0)
            result += displayDetailsOfAUser(userName, books) + "\n";
        }
        return result;
    }

    private String displayDetailsOfAUser(String userName, ArrayList<Section> books) {
        String resultData = "";
        resultData=userName + "\n";
        for (Section book : books)
            resultData += book.toString() + "\n";
        return resultData;
    }

    public void remove(String userId, Section item) {
        ArrayList<Section> checkout = checkoutList.get(userId);
        checkout.remove(item);
    }
}
