package com.twu.biblioteca;

import org.junit.Test;

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

}