package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> book = new ArrayList<>();
        book.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));

        LibrarySection librarySection = new LibrarySection(book,new ArrayList<Book>());

        BibliotecaAppView bibliotecaAppView = new BibliotecaAppView(scanner);

        BooksController booksController = new BooksController(bibliotecaAppView, librarySection);

        HashMap<String, MenuActionPerformed> menuItems = new HashMap<>();
        menuItems.put("List LibrarySection", new ListBooks(booksController));
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
