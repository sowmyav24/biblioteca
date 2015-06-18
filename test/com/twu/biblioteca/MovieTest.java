package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MovieTest {

    @Test
    public void shouldReturnMovieDetails() {
        Movie movie= new Movie("Titanic", "1993", "Cameron", "9");

        String actualDetails = movie.toString();

        assertThat(actualDetails, is(equalTo("Titanic, 1993, Cameron, 9")));
    }

    @Test
    public void shouldCheckIfMovieNamesMatch() {
        Movie movie= new Movie("MovieName","Year","Director","Rating");

        Boolean actualResult=movie.match("MovieName");

        assertEquals(true, actualResult);
    }

    @Test
    public void shouldCheckIfMovieNamesDoesNotMatch() {
        Movie movie= new Movie("MovieName","Year","Director","Rating");

        Boolean actualResult=movie.equals("Movie");

        assertEquals(false, actualResult);
    }

}