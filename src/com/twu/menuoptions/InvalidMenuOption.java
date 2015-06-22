package com.twu.menuoptions;

import com.twu.items.ItemsController;
import com.twu.items.LibrarySection;
import com.twu.menuactions.MenuActionPerformed;

public class InvalidMenuOption implements MenuActionPerformed {

    private ItemsController itemsController;
    private LibrarySection librarySection;

    public InvalidMenuOption(ItemsController itemsController, LibrarySection librarySection) {
        this.itemsController = itemsController;
        this.librarySection = librarySection;
    }

    public void compute(String userId) {
       itemsController.returnInvalidOption();
    }
}
