package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ReturnBookTest {

    @Test
    public void shouldCallReturnBook() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        BooksController booksControllerStub = mock(BooksController.class);

        ReturnBook returnBook = new ReturnBook(bibliotecaAppViewStub,booksControllerStub);

        returnBook.compute();

        verify(booksControllerStub, times(1)).returnBook();
    }
}