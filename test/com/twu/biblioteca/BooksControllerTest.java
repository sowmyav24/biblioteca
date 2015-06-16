package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class BooksControllerTest {

    @Test
    public void shouldReturnListOfBooks() {
        Library libraryStub = mock(Library.class);
        when(libraryStub.toString())
                .thenReturn("Book List");

        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        BooksController booksController = new BooksController(bibliotecaAppViewStub, libraryStub);

        booksController.returnListOfAllBooks();

        verify(bibliotecaAppViewStub, times(1)).displayMessage("Book List");
    }

    @Test
    public void shouldCheckoutBook() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        when(bibliotecaAppViewStub.readInput())
                .thenReturn("The Monk Who Sold His Ferrari");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        Library library = new Library(bookList,new ArrayList<Book>());

        BooksController booksController = new BooksController(bibliotecaAppViewStub, library);

        booksController.checkout();

        verify(bibliotecaAppViewStub, times(1)).displayMessage(Message.SUCCESSFULL_CHECKOUT);

    }

    @Test
    public void shouldReturnMessageForUnSuccesfullCheckoutBook() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        when(bibliotecaAppViewStub.readInput())
                .thenReturn("The Monk Who Sold His Ferrar");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        Library library = new Library(bookList,new ArrayList<Book>());

        BooksController booksController = new BooksController(bibliotecaAppViewStub, library);

        booksController.checkout();

        verify(bibliotecaAppViewStub, times(1)).displayMessage(Message.UNSUCCESSFULL_CHECKOUT);

    }

    @Test
    public void shouldReturnBook() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        when(bibliotecaAppViewStub.readInput())
                .thenReturn("The Monk Who Sold His Ferrari");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        Library library = new Library(bookList,new ArrayList<Book>());

        BooksController booksController = new BooksController(bibliotecaAppViewStub, library);

        booksController.returnBook();

        verify(bibliotecaAppViewStub, times(1)).displayMessage(Message.SUCCESSFULL_RETURN);

    }

    @Test
    public void shouldReturnUnsuccessfullMessageForUnsuccessfullReturnBook() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        when(bibliotecaAppViewStub.readInput())
                .thenReturn("The Monk Who Sold His Ferrar");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        Library library = new Library(bookList,new ArrayList<Book>());

        BooksController booksController = new BooksController(bibliotecaAppViewStub, library);

        booksController.returnBook();

        verify(bibliotecaAppViewStub, times(1)).displayMessage(Message.UNSUCCESSFULL_RETURN);

    }
}