package com.twu.biblioteca;

public class BooksController {
    private BibliotecaAppView bibliotecaAppView;
    private Books books;
    private BookItemTokenizer bookItemTokenizer;

    public BooksController(BibliotecaAppView bibliotecaAppView, Books books,BookItemTokenizer bookItemTokenizer) {
        this.bibliotecaAppView = bibliotecaAppView;
        this.books = books;
        this.bookItemTokenizer = bookItemTokenizer;
    }

    public void returnListOfAllBooks() {
        String listOfBooks = books.toString();
        bibliotecaAppView.displayMessage(listOfBooks);
    }

    public void checkout() {
        String bookInput = bibliotecaAppView.readInput();
        Book book = bookItemTokenizer.getBook(bookInput);
        if (books.checkoutBook(book))
            bibliotecaAppView.displayMessage(Message.SUCCESSFULL_CHECKOUT);
        else
            bibliotecaAppView.displayMessage(Message.UNSUCCESSFULL_CHECKOUT);
    }

    public void returnBook() {
        String bookInput = bibliotecaAppView.readInput();
        Book book = bookItemTokenizer.getBook(bookInput);

    }
}
