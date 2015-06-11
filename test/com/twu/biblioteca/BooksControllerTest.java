package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class BooksControllerTest {

    @Test
    public void shouldReturnListOfBooks() {
        Books booksStub = mock(Books.class);
        when(booksStub.toString())
                .thenReturn("Book List");

        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        BooksController booksController = new BooksController(bibliotecaAppViewStub, booksStub);

        booksController.returnListOfAllBooks();

        verify(bibliotecaAppViewStub, times(1)).displayMessage(anyString());
    }
}