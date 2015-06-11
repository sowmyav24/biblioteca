package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class CheckoutBookTest {

    @Test
    public void shouldReadBookName() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);

        CheckoutBook checkoutBook = new CheckoutBook(bibliotecaAppViewStub);

        checkoutBook.compute();
        
        verify(bibliotecaAppViewStub, times(1)).readInput();

    }

}