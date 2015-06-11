package com.twu.biblioteca;

public class CheckoutBook implements MenuActionPerformed {

    private BibliotecaAppView bibliotecaAppView;

    public CheckoutBook(BibliotecaAppView bibliotecaAppView) {
        this.bibliotecaAppView=bibliotecaAppView;
    }

    @Override
    public void compute() {
        String bookInput=bibliotecaAppView.readInput();
    }

}
