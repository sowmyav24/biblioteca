package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Book, Boolean> book = new HashMap<>();
        book.put(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"), true);

        Books books = new Books(book);

        BibliotecaAppView bibliotecaAppView = new BibliotecaAppView(scanner);

        BookItemTokenizer bookItemTokenizer = new BookItemTokenizer();

        BooksController booksController = new BooksController(bibliotecaAppView, books, bookItemTokenizer);

        HashMap<Integer, MenuActionPerformed> menuItems = new HashMap<>();
        menuItems.put(1, new ListBooks(booksController));
        menuItems.put(2, new CheckoutBook(bibliotecaAppView, booksController));
        menuItems.put(3, new QuitMenu());
        menuItems.put(4, new InvalidMenuOption(bibliotecaAppView));

        Menu menu = new Menu(menuItems);

        MenuController menuController = new MenuController(bibliotecaAppView, menu);

        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaAppView, menuController, booksController);

        bibliotecaApp.start();
    }
}
