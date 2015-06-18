package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> book = new ArrayList<>();
        book.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));

        BibliotecaAppView bibliotecaAppView = new BibliotecaAppView(scanner);

        ArrayList<Movie> movie = new ArrayList<>();
        movie.add(new Movie("Titanic", "1993", "Cameron", "9"));
        ItemsController itemsController = new ItemsController(bibliotecaAppView);
        HashMap<String, ArrayList<Book>> checkoutList = new HashMap<>();
        checkoutList.put("xyz", new ArrayList<Book>());

        CheckoutHistory checkoutHistory = new CheckoutHistory(checkoutList);

      //  checkoutHistory.add("User 1", new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
      //  checkoutList.put("User 1", new ArrayList<Book>());

        User user = new User("User1", "xyz@gmail.com", "9999", "xyz", "xyz123", "User");
        User librarian = new User("User2", "abc@gmail.com", "8888", "abc", "abc123", "Librarian");

        ArrayList<User> users = new ArrayList<User>();
        users.add(user);
        users.add(librarian);

        LoginAuthentication loginAuthentication = new LoginAuthentication(users);


        LibrarySection bookSection = new LibrarySection(book, new ArrayList<Book>(),checkoutHistory);
        LibrarySection movieSection = new LibrarySection(movie, new ArrayList<Movie>(),checkoutHistory);

        HashMap<String, MenuActionPerformed> menuItems = new HashMap<>();
        menuItems.put("List Books", new ListItems(itemsController, bookSection));
        menuItems.put("List Movies", new ListItems(itemsController, movieSection));
        menuItems.put("Checkout Book", new CheckoutBook(bibliotecaAppView, itemsController, bookSection,"xyz"));
        menuItems.put("Return Book", new ReturnBook(bibliotecaAppView, itemsController, bookSection));
        menuItems.put("Checkout Movie", new CheckoutMovie(bibliotecaAppView, itemsController, movieSection,"xyz"));
        menuItems.put("Return Movie", new ReturnMovie(bibliotecaAppView, itemsController, movieSection));
        menuItems.put("Quit", new QuitMenu());
        menuItems.put("Invalid", new InvalidMenuOption(bibliotecaAppView));

        Menu menu = new Menu(menuItems);

        MenuController menuController = new MenuController(bibliotecaAppView, menu);

        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaAppView, menuController, user,loginAuthentication,checkoutHistory);

        bibliotecaApp.start();
    }
}
