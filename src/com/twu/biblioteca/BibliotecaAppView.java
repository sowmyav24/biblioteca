package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaAppView {
    private Scanner scanner;

    BibliotecaAppView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayMessage(String message) {

        System.out.println(message);
    }

    public String readInput() {
        try {
            Integer.parseInt(scanner.nextLine());
            return scanner.nextLine();
        } catch (NumberFormatException n) {
            return "4";
        }
    }
}

