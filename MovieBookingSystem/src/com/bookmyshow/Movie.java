package com.bookmyshow;

public class Movie {
    private String name;
    private String language;
    private double rating;

    public Movie(String name, String language, double rating) {
        this.name = name;
        this.language = language;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public double getRating() {
        return rating;
    }
}
