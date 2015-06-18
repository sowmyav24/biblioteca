package com.twu.biblioteca;

public class Movie implements Item {
    private String title;
    private String year;
    private String director;
    private String rating;


    public Movie(String title, String year, String director, String rating) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;

    }

    public String toString() {
        return title + ", " + year + ", " + director + ", " + rating;
    }

    public boolean match(String o) {
        return (this.title.equals(o));
    }
}



