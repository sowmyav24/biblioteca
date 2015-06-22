package com.twu.authentication;

import com.twu.authentication.User;
import com.twu.biblioteca.BibliotecaAppView;

import java.util.ArrayList;

public class LoginAuthentication {
    private ArrayList<User> users;
    private BibliotecaAppView bibliotecaAppView;

    public LoginAuthentication(ArrayList<User> users, BibliotecaAppView bibliotecaAppView) {
        this.users = users;
        this.bibliotecaAppView = bibliotecaAppView;
    }

    public String authenticate(String userId, String password) {
        for (User user : users)
            if (user.match(userId, password)) {
                bibliotecaAppView.displayMessage(user.returnDetails());
                if (user.isLibrarian())
                    return "Librarian";
                else
                    return "User";
            }
        return "Invalid";
    }
}
