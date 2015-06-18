package com.twu.biblioteca;

public class ReturnMovie implements MenuActionPerformed {
    private ItemsController itemsController;
    private LibrarySection librarySection;

    public ReturnMovie(ItemsController itemsController, LibrarySection librarySection) {
        this.itemsController = itemsController;
        this.librarySection = librarySection;
    }

    @Override
    public void compute(String userId) {
        itemsController.returnItem(librarySection, Message.SUCCESSFULL_MOVIE_RETURN, Message.UNSUCCESSFULL_MOVIE_RETURN, userId);
    }
}
