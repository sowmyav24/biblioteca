package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ReturnBookTest {

    @Test
    public void shouldCallReturnBook() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        ArrayList<Book> issuedBook = new ArrayList<Book>();
        issuedBook.add(new Book("The Monk Who Sold His Ferrari","Robin Sharma","2007"));
        LibrarySection<Book> librarySection= new LibrarySection<Book>(new ArrayList<Book>(),issuedBook);
        ItemsController itemsController = mock(ItemsController.class);
        ReturnBook returnBook = new ReturnBook(bibliotecaAppViewStub,itemsController,librarySection);

        returnBook.compute();

        verify(itemsController, times(1)).returnItem(librarySection, Message.SUCCESSFULL_BOOK_RETURN,Message.UNSUCCESSFULL_BOOK_RETURN);
    }
}