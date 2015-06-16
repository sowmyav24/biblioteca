package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ListMoviesTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintListOfAllMovies() {
        MovieController movieControllerStub = mock(MovieController.class);
        ListMovies listbooks = new ListMovies(movieControllerStub);

        listbooks.compute();

        verify(movieControllerStub, times(1)).returnListOfAllMovies();
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}