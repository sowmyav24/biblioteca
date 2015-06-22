package com.twu.menuoptions;

import com.twu.biblioteca.BibliotecaAppView;
import com.twu.items.Item;
import com.twu.menuactions.MenuActionPerformed;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckoutHistory<Section extends Item> implements MenuActionPerformed {
    private HashMap<String, ArrayList<Section>> checkoutList;
    private BibliotecaAppView bibliotecaAppView;

    public CheckoutHistory(HashMap<String, ArrayList<Section>> checkoutList, BibliotecaAppView bibliotecaAppView) {
        this.checkoutList = checkoutList;
        this.bibliotecaAppView = bibliotecaAppView;
    }

    public void add(String userId, Section book) {
        ArrayList<Section> checkout = checkoutList.get(userId);
        checkout.add(book);
    }

    private String displayDetailsOfAUser(String userName, ArrayList<Section> books) {
        String resultData = "";
        resultData = userName + "\n";
        for (Section book : books)
            resultData += book.toString() + "\n";
        return resultData;
    }

    public Boolean remove(String userId, Section item) {
        ArrayList<Section> checkout = checkoutList.get(userId);
        Boolean isEmpty= checkout.isEmpty();
        checkout.remove(item);
        return isEmpty;
    }

    @Override
    public void compute(String userId) {
        String userName = "";
        String result = "";
        ArrayList<Section> books;

        for (String user : checkoutList.keySet()) {
            userName = user;
            books = checkoutList.get(user);
            if (books.size() != 0)
                result += displayDetailsOfAUser(userName, books) + "\n";
        }
        bibliotecaAppView.displayMessage(result);
    }
}
