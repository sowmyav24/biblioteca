package com.twu.biblioteca;

import java.util.Scanner;

public class MenuView {
    private Menu menu;
    private Scanner scanner;

    MenuView(Menu menu) {
        this.menu = menu;
    }

    public void displayMenu() {

        System.out.print(menu.returnMenu());
    }

    public int readMenuOption() {
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
