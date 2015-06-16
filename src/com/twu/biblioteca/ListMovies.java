package com.twu.biblioteca;

public class ListMovies implements MenuActionPerformed {
    private MovieController movieController;

    public ListMovies(MovieController movieController) {
        this.movieController = movieController;
    }

    @Override
    public void compute() {
        movieController.returnListOfAllMovies();
    }
}
