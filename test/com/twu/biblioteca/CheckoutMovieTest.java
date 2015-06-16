package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CheckoutMovieTest {
    @Test
    public void shouldReadBookName() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        MovieController movieControllerStub = mock(MovieController.class);

        CheckoutMovie checkoutMovie = new CheckoutMovie(bibliotecaAppViewStub,movieControllerStub);

        checkoutMovie.compute();

        verify(movieControllerStub, times(1)).checkout();
    }
}