package com.twu.biblioteca;

//Contains details of a particular Book

public class Book {
    String author;
    String name;
    String yearOfPublication;

    public Book(String name, String author, String yearOfPublication) {
        this.author = author;
        this.name = name;
        this.yearOfPublication = yearOfPublication;
    }

    public String toString() {
        return name + ", " + author + ", " + yearOfPublication;
    }

    public boolean equals(String o) {
        return this.name.equals(o);
    }
}
