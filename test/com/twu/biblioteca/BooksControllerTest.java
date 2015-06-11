package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

public class BooksControllerTest {

    @Test
    public void shouldReturnListOfBooks() {
        Books booksStub = mock(Books.class);
        when(booksStub.toString())
                .thenReturn("Book List");

        BibliotecaApp bibliotecaAppStub = mock(BibliotecaApp.class);
        BooksController booksController = new BooksController(bibliotecaAppStub, booksStub);

        booksController.returnListOfAllBooks();

        Mockito.verify(bibliotecaAppStub,times(1)).displayMessage(booksStub.toString());

    }
}