package com.twu.biblioteca;

public class ReturnMovie implements MenuActionPerformed{
    private BibliotecaAppView bibliotecaAppView;
    private MovieController movieController;

    public ReturnMovie(BibliotecaAppView bibliotecaAppView, MovieController movieController) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.movieController = movieController;
    }

    @Override
    public void compute() {
        movieController.returnMovie();
    }
}
