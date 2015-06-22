package com.twu.menuoptions;

import com.twu.biblioteca.Message;
import com.twu.items.ItemsController;
import com.twu.items.LibrarySection;
import com.twu.items.Movie;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class ReturnMovieTest {

    @Test
    public void shouldCallReturnMovie() {
        ItemsController itemsController = mock(ItemsController.class);
        ArrayList<Movie> issuedMovie = new ArrayList<Movie>();
        issuedMovie.add(new Movie("Titanic", "1993", "Cameron", "9"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        LibrarySection<Movie> librarySection = new LibrarySection<Movie>(new ArrayList<Movie>(), issuedMovie, checkoutHistory);


        ReturnMovie returnMovie = new ReturnMovie(itemsController, librarySection);

        returnMovie.compute("abc");

        verify(itemsController, times(1)).returnItem(librarySection, Message.SUCCESSFULL_MOVIE_RETURN, Message.UNSUCCESSFULL_MOVIE_RETURN, "abc");
    }
}