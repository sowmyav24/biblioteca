package com.twu.biblioteca;

import java.util.ArrayList;

public class LoginAuthentication {
    private ArrayList<User> users;

    public LoginAuthentication(ArrayList<User> users) {
        this.users = users;
    }

    public String authenticate(String userId, String password) {
        for (User user : users) {
            if (user.match(userId, password))
                if (user.isLibrarian())
                    return "Librarian";
            else
                return "User";
        }
        return "Invalid";
    }
}
