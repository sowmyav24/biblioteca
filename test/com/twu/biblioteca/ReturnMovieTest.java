package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ReturnMovieTest {

    @Test
    public void shouldCallReturnMovie() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        MovieController movieControllerStub = mock(MovieController.class);

        ReturnMovie returnMovie = new ReturnMovie(bibliotecaAppViewStub,movieControllerStub);

        returnMovie.compute();

        verify(movieControllerStub, times(1)).returnMovie();
    }
}