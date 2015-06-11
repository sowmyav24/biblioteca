package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class BooksControllerTest {

    @Test
    public void shouldReturnListOfBooks() {
        Books booksStub = mock(Books.class);
        when(booksStub.toString())
                .thenReturn("Book List");

        BibliotecaApp bibliotecaAppStub = mock(BibliotecaApp.class);
        BooksController booksController = new BooksController(bibliotecaAppStub, booksStub);

        booksController.returnListOfAllBooks();

        verify(bibliotecaAppStub, times(1)).displayMessage(booksStub.toString());
    }
}