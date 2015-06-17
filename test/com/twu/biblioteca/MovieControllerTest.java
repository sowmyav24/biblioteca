package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class MovieControllerTest {

    @Test
    public void shouldReturnListOfMovies() {
        LibrarySection librarySectionStub = mock(LibrarySection.class);
        when(librarySectionStub.toString())
                .thenReturn("Movie List");

        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        MovieController movieController = new MovieController(bibliotecaAppViewStub, librarySectionStub);

        movieController.returnListOfAllMovies();

        verify(bibliotecaAppViewStub, times(1)).displayMessage("Movie List");
    }

    @Test
    public void shouldCheckoutMovie() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        when(bibliotecaAppViewStub.readInput())
                .thenReturn("Titanic");
        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Titanic","1993","Cameron","9"));
        LibrarySection librarySection = new LibrarySection(movieList,new ArrayList<Movie>());

        MovieController movieController = new MovieController(bibliotecaAppViewStub, librarySection);

        movieController.checkout();

        verify(bibliotecaAppViewStub, times(1)).displayMessage(Message.SUCCESSFULL_CHECKOUT);

    }

    @Test
    public void shouldReturnMessageForUnSuccesfullCheckoutBook() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        when(bibliotecaAppViewStub.readInput())
                .thenReturn("Titani");
        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Titanic", "1993", "Cameron", "9"));
        LibrarySection librarySection = new LibrarySection(movieList,new ArrayList<Book>());

        MovieController movieController = new MovieController(bibliotecaAppViewStub, librarySection);

        movieController.checkout();

        verify(bibliotecaAppViewStub, times(1)).displayMessage(Message.UNSUCCESSFULL_CHECKOUT);
    }

    @Test
    public void shouldReturnMovie() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        when(bibliotecaAppViewStub.readInput())
                .thenReturn("Titanic");
        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Titanic","1993","Cameron","9"));
        LibrarySection librarySection = new LibrarySection(new ArrayList<Book>(),movieList);

        MovieController movieController = new MovieController(bibliotecaAppViewStub, librarySection);

        movieController.returnMovie();

        verify(bibliotecaAppViewStub, times(1)).displayMessage(Message.SUCCESSFULL_RETURN);

    }

    @Test
    public void shouldReturnUnsuccessfullMessageForUnsuccessfullReturnBook() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        when(bibliotecaAppViewStub.readInput())
                .thenReturn("Titaic");
        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Titanic","1993","Cameron","9"));
        LibrarySection librarySection = new LibrarySection(new ArrayList<Book>(),movieList);

        MovieController movieController = new MovieController(bibliotecaAppViewStub, librarySection);

        movieController.returnMovie();

        verify(bibliotecaAppViewStub, times(1)).displayMessage(Message.UNSUCCESSFULL_RETURN);

    }
}