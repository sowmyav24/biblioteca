package com.twu.biblioteca;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Book, Boolean> book = new HashMap<Book, Boolean>();
        book.put(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"), true);

        HashMap<Integer, MenuActionPerformed> menuItems = new HashMap<Integer, MenuActionPerformed>();

        Books books = new Books(book);

        BibliotecaAppView bibliotecaAppView = new BibliotecaAppView();

        BooksController booksController = new BooksController(bibliotecaAppView, books);

        menuItems.put(1, new ListBooks(booksController));
        menuItems.put(2, new InvalidMenuOption(bibliotecaAppView));
    }
}
