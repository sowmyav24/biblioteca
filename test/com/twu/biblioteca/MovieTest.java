package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MovieTest {

    @Test
    public void shouldReturnMovieDetails() {
        Movie movie= new Movie("Titanic","1993","Cameron","9");

        String actualDetails = movie.toString();

        assertThat(actualDetails, is(equalTo("Titanic, 1993, Cameron, 9")));
    }

}