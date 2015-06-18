package com.twu.biblioteca;

import java.util.ArrayList;

public class LibrarySection<Section extends Item> {
    private ArrayList<Section> availableItems;
    private ArrayList<Section> issuedItems;
    private CheckoutHistory<Section> checkoutHistory;

    LibrarySection(ArrayList<Section> availableItems, ArrayList<Section> issuedItems, CheckoutHistory<Section> checkoutHistory) {
        this.availableItems = availableItems;
        this.issuedItems = issuedItems;
        this.checkoutHistory = checkoutHistory;
    }

    @Override
    public String toString() {
        String itemList = new String();
        for (Section item : availableItems)
            itemList += item.toString() + "\n";
        return itemList;
    }

    public String checkout(String searchItemName, String successfull, String unsuccessfull, String userId) {
        ArrayList<Section> searchResult = search(searchItemName, availableItems);
        for (Section item : searchResult) {
            availableItems.remove(item);
            issuedItems.add(item);
            checkoutHistory.add(userId, item);
            return successfull;
        }
        return unsuccessfull;
    }

    public String returnItem(String searchItemName, String successfull, String unsuccessfull, String userId) {
        ArrayList<Section> searchResult = search(searchItemName, issuedItems);
        for (Section item : searchResult) {
            availableItems.add(item);
            issuedItems.remove(item);
            checkoutHistory.remove(userId, item);
            return successfull;
        }
        return unsuccessfull;
    }

    private ArrayList<Section> search(String bookName, ArrayList<Section> listOfBooks) {
        ArrayList<Section> result = new ArrayList<>();
        for (Section item : listOfBooks) {
            if (item.match(bookName))
                result.add(item);
        }
        return result;
    }
}
