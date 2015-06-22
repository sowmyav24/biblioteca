package com.twu.menuoptions;

import com.twu.biblioteca.Message;
import com.twu.items.ItemsController;
import com.twu.items.LibrarySection;
import com.twu.items.Movie;
import com.twu.menuoptions.CheckoutHistory;
import com.twu.menuoptions.CheckoutMovie;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CheckoutMovieTest {
    @Test
    public void shouldReadBookName() {
        String UserId = "xyz";
        ItemsController itemsController = mock(ItemsController.class);
        ArrayList<Movie> availableMovie = new ArrayList<Movie>();
        availableMovie.add(new Movie("Titanic", "1993", "Cameron", "9"));
        CheckoutHistory checkoutHistory = mock(CheckoutHistory.class);
        LibrarySection<Movie> librarySection = new LibrarySection<Movie>(availableMovie, new ArrayList<Movie>(), checkoutHistory);

        CheckoutMovie checkoutMovie = new CheckoutMovie(itemsController, librarySection);

        checkoutMovie.compute(UserId);

        verify(itemsController, times(1)).checkout(librarySection, Message.SUCCESSFULL_MOVIE_CHECKOUT, Message.UNSUCCESSFULL_MOVIE_CHECKOUT, UserId);
    }
}