package com.twu.biblioteca;

import java.util.ArrayList;

public class LoginAuthentication {
    private ArrayList<User> users;

    public LoginAuthentication(ArrayList<User> users) {
        this.users = users;
    }

    public Boolean authenticate(String userId, String password) {
        for (User user : users) {
            if (user.match(userId, password))
                return true;
        }
        return false;
    }
}
