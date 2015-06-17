package com.twu.biblioteca;

public class ReturnMovie implements MenuActionPerformed{
    private BibliotecaAppView bibliotecaAppView;
    private ItemsController itemsController;
    private LibrarySection librarySection;

    public ReturnMovie(BibliotecaAppView bibliotecaAppView, ItemsController itemsController,LibrarySection librarySection) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.itemsController = itemsController;
        this.librarySection = librarySection;
    }

    @Override
    public void compute() {
        itemsController.returnItem(librarySection, Message.SUCCESSFULL_MOVIE_RETURN,Message.UNSUCCESSFULL_MOVIE_RETURN);
    }
}
