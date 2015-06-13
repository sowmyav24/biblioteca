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

    public boolean equals(Object o) {
        if(o instanceof Book)
        return (this.name.equals(((Book)o).name));
        else
            return false;
    }
}
