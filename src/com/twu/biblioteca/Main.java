package com.twu.biblioteca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<>();
        book.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        Books books = new Books(book);

        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        BooksController booksController = new BooksController(bibliotecaApp, books);
    }
}
