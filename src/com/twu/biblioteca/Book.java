package com.twu.biblioteca;

//Contains details of a particular Book

public class Book implements Item{
    private String author;
    private String name;
    private String yearOfPublication;


    public Book(String name, String author, String yearOfPublication) {
        this.author = author;
        this.name = name;
        this.yearOfPublication = yearOfPublication;

    }

    public String toString() {
        return name + " | " + author + " | " + yearOfPublication;
    }

    public boolean match(String o) {
        return (this.name.equals(o));
    }
}
