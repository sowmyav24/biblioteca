package com.twu.biblioteca;

public class User {
    private String name;
    private String email;
    private String phone;
    private String logid;
    private String pwd;

    public User(String name, String email, String phone, String logid, String pwd) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.logid = logid;
        this.pwd = pwd;
    }

    public String returnDetails() {
        return name + "," + email + "," + phone;
    }

    public boolean match(String userId, String password) {
        return (userId.equals(this.logid) && password.equals(this.pwd));
    }
}
