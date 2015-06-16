package com.twu.biblioteca;

import org.junit.Test;

import java.util.HashMap;

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

    @Test
    public void shouldCheckoutBook() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        when(bibliotecaAppViewStub.readInput())
                .thenReturn("The Monk Who Sold His Ferrari");
        HashMap<Book, Boolean> bookList = new HashMap<>();
        bookList.put(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"), true);
        Books books = new Books(bookList);
        BooksController booksController = new BooksController(bibliotecaAppViewStub, books);

        booksController.checkout();

        verify(bibliotecaAppViewStub, times(1)).displayMessage(Message.SUCCESSFULL_CHECKOUT);

    }

    @Test
    public void shouldReturnMessageForUnSuccesfullCheckoutBook() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        when(bibliotecaAppViewStub.readInput())
                .thenReturn("The Monk Who Sold His Ferrari");
        HashMap<Book, Boolean> bookList = new HashMap<>();
        bookList.put(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"), false);
        Books books = new Books(bookList);
        BooksController booksController = new BooksController(bibliotecaAppViewStub, books);

        booksController.checkout();

        verify(bibliotecaAppViewStub, times(1)).displayMessage(Message.UNSUCCESSFULL_CHECKOUT);

    }

    @Test
    public void shouldReturnBook() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        when(bibliotecaAppViewStub.readInput())
                .thenReturn("The Monk Who Sold His Ferrari");
        HashMap<Book, Boolean> bookList = new HashMap<>();
        bookList.put(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"), false);
        Books books = new Books(bookList);
        BooksController booksController = new BooksController(bibliotecaAppViewStub, books);

        booksController.returnBook();

        verify(bibliotecaAppViewStub, times(1)).displayMessage(Message.SUCCESSFULL_RETURN);

    }

    @Test
    public void shouldReturnUnsuccessfullMessageForUnsuccessfullReturnBook() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        when(bibliotecaAppViewStub.readInput())
                .thenReturn("The Monk Who Sold His Ferrari");
        HashMap<Book, Boolean> bookList = new HashMap<>();
        bookList.put(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"),true);
        Books books = new Books(bookList);
        BooksController booksController = new BooksController(bibliotecaAppViewStub, books);

        booksController.returnBook();

        verify(bibliotecaAppViewStub, times(1)).displayMessage(Message.UNSUCCESSFULL_RETURN);

    }
}