package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaAppView {

    public void displayMessage(String message) {

        System.out.println(message);
    }

    public String readInput() {
        Scanner scanner= new Scanner(System.in);
        return scanner.nextLine();
    }
}

