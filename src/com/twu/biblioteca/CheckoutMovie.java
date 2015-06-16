package com.twu.biblioteca;

public class CheckoutMovie implements MenuActionPerformed {

    private BibliotecaAppView bibliotecaAppView;
    private MovieController movieController;

    public CheckoutMovie(BibliotecaAppView bibliotecaAppView, MovieController movieController) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.movieController = movieController;
    }

    @Override
    public void compute() {
        movieController.checkout();
    }
}
