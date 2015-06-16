package com.twu.biblioteca;

public class MovieController {

    private BibliotecaAppView bibliotecaAppView;
    private LibrarySection librarySection;

    public MovieController(BibliotecaAppView bibliotecaAppView, LibrarySection librarySection) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.librarySection = librarySection;
    }

    public void returnListOfAllMovies() {
        String listOfMovies = librarySection.toString();
        bibliotecaAppView.displayMessage(listOfMovies);
    }
}

