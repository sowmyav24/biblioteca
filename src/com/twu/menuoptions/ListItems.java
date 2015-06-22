package com.twu.menuoptions;

import com.twu.items.LibrarySection;
import com.twu.items.ItemsController;
import com.twu.menuactions.MenuActionPerformed;

public class ListItems implements MenuActionPerformed {

    private ItemsController itemsController;
    private LibrarySection librarySection;

    public ListItems(ItemsController itemsController, LibrarySection librarySection) {
        this.itemsController = itemsController;
        this.librarySection = librarySection;
    }

    public void compute(String userId) {
        itemsController.returnListOfAllItems(librarySection);
    }
}
