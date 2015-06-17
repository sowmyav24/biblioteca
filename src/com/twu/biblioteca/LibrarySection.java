package com.twu.biblioteca;

import java.util.ArrayList;

public class LibrarySection<Section extends Item> {
    private ArrayList<Section> availableItems;
    private ArrayList<Section> issuedItems;

    LibrarySection(ArrayList<Section> availableItems, ArrayList<Section> issuedItems) {
        this.availableItems = availableItems;
        this.issuedItems = issuedItems;
    }

    @Override
    public String toString() {
        String itemList = new String();
        for (Section item : availableItems)
            itemList += item.toString() + "\n";
        return itemList;
    }

    public String checkout(String searchItemName, String successfull, String unsuccessfull) {
        ArrayList<Section> searchResult = search(searchItemName, availableItems);
        for (Section item : searchResult) {
            availableItems.remove(item);
            issuedItems.add(item);
            return successfull;
        }
        return unsuccessfull;
    }

    public String returnItem(String searchItemName, String successfull, String unsuccessfull) {
        ArrayList<Section> searchResult = search(searchItemName, issuedItems);
        for (Section item : searchResult) {
            availableItems.add(item);
            issuedItems.remove(item);
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
