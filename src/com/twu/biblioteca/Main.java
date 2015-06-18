package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> book = new ArrayList<>();
        book.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        book.add(new Book("The Kite Runner", "Khaled Hosseini", "2003"));

        BibliotecaAppView bibliotecaAppView = new BibliotecaAppView(scanner);

        ArrayList<Movie> movie = new ArrayList<>();
        movie.add(new Movie("Titanic", "1993", "Cameron", "9"));
        ItemsController itemsController = new ItemsController(bibliotecaAppView);
        HashMap<String, ArrayList<Book>> checkoutList = new HashMap<>();
        checkoutList.put("xyz", new ArrayList<Book>());
        checkoutList.put("pqr", new ArrayList<Book>());

        CheckoutHistory checkoutHistory = new CheckoutHistory(checkoutList);

        User user = new User("User1", "xyz@gmail.com", "9999", "xyz", "xyz123", "User");
        User secondUser = new User("User2", "pqr@gmail.com", "9999", "pqr", "pqr123", "User");
        User librarian = new User("User3", "abc@gmail.com", "8888", "abc", "abc123", "Librarian");

        ArrayList<User> users = new ArrayList<User>();
        users.add(user);
        users.add(secondUser);
        users.add(librarian);

        LoginAuthentication loginAuthentication = new LoginAuthentication(users);


        LibrarySection bookSection = new LibrarySection(book, new ArrayList<Book>(), checkoutHistory);
        LibrarySection movieSection = new LibrarySection(movie, new ArrayList<Movie>(), checkoutHistory);

        HashMap<String, MenuActionPerformed> menuItems = new HashMap<>();
        menuItems.put("List Books", new ListItems(itemsController, bookSection));
        menuItems.put("List Movies", new ListItems(itemsController, movieSection));
        menuItems.put("Checkout Book", new CheckoutBook(itemsController, bookSection));
        menuItems.put("Return Book", new ReturnBook(bibliotecaAppView, itemsController, bookSection));
        menuItems.put("Checkout Movie", new CheckoutMovie(bibliotecaAppView, itemsController, movieSection));
        menuItems.put("Return Movie", new ReturnMovie(bibliotecaAppView, itemsController, movieSection));
        menuItems.put("Quit", new QuitMenu());
        menuItems.put("Invalid", new InvalidMenuOption(itemsController,bookSection));

        Menu menu = new Menu(menuItems);

        MenuController menuController = new MenuController(bibliotecaAppView, menu);

        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaAppView, menuController, user, loginAuthentication, checkoutHistory);

        bibliotecaApp.start();
    }
}
