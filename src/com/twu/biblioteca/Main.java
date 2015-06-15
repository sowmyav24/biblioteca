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

        HashMap<String, MenuActionPerformed> menuItems = new HashMap<>();
        menuItems.put("List Books", new ListBooks(booksController));
        menuItems.put("Checkout Book", new CheckoutBook(bibliotecaAppView, booksController));
        menuItems.put("Return Book", new ReturnBook(bibliotecaAppView, booksController));
        menuItems.put("Quit", new QuitMenu());
        menuItems.put("Invalid", new InvalidMenuOption(bibliotecaAppView));

        Menu menu = new Menu(menuItems);

        MenuController menuController = new MenuController(bibliotecaAppView, menu);

        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaAppView, menuController, booksController);

        bibliotecaApp.start();
    }
}
