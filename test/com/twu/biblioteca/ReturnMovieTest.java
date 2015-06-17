package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ReturnMovieTest {

    @Test
    public void shouldCallReturnMovie() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        ItemsController itemsController = mock(ItemsController.class);
        ArrayList<Movie> issuedMovie = new ArrayList<Movie>();
        issuedMovie.add(new Movie("Titanic","1993","Cameron","9"));
        LibrarySection<Movie> librarySection= new LibrarySection<Movie>(new ArrayList<Movie>(),issuedMovie);


        ReturnMovie returnMovie = new ReturnMovie(bibliotecaAppViewStub,itemsController,librarySection);

        returnMovie.compute();

        verify(itemsController, times(1)).returnItem(librarySection, Message.SUCCESSFULL_MOVIE_RETURN,Message.UNSUCCESSFULL_MOVIE_RETURN);
    }
}