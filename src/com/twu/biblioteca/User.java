package com.twu.biblioteca;

public class User {
    private String name;
    private String email;
    private String phone;
    private String logid;
    private String pwd;
    private String role;

    public User(String name, String email, String phone, String logid, String pwd, String role) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.logid = logid;
        this.pwd = pwd;
        this.role = role;
    }

    public String returnDetails() {
        return "\nYour Details\n" + name + "|" + email + "|" + phone;
    }

    public boolean match(String userId, String password) {
        return (userId.equals(this.logid) && password.equals(this.pwd));
    }

    public boolean isLibrarian() {
        return (this.role.equals("Librarian"));
    }
}
