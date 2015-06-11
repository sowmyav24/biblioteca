package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<>();
        book.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));

        HashMap<Integer, MenuActionPerformed> menuItems = new HashMap<Integer, MenuActionPerformed>();

        Books books = new Books(book);

        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        BooksController booksController = new BooksController(bibliotecaApp,books);

        menuItems.put(1, new ListBooks(booksController));
        menuItems.put(2, new InvalidMenuOption());
    }
}
