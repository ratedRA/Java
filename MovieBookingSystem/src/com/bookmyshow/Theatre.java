package com.bookmyshow;

import javafx.stage.Screen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Theatre {
    private String name;
    private static int totalTheatres = 0;
    private  int theatreId;
    private List<Movie> movies = new ArrayList<Movie>();
    private List<Screens> screens = new ArrayList<Screens>();
    private double rating;
    private Address address;

    public Theatre(String name, double rating, Address address) {
        this.name = name;
        this.rating = rating;
        this.address = address;
        this.theatreId = totalTheatres+1;
        this.totalTheatres+=1;
    }

    public boolean addMovies(Movie movie){
        if(movies.contains(movie)){
            System.out.println(movie.getName()+" is already added");
            return false;
        }
        movies.add(movie);
        System.out.println(movie.getName()+" has successfully been added to "+this.name);
        return true;
    }
    public boolean addScreens(Screens screen){
        if(screens.contains(screen)){
            System.out.println(screen.getScreenNo());
            return false;
        }
        screens.add(screen);
        System.out.println(screen.getScreenNo()+" has successfully been added to "+this.name);
        return true;

    }

    public String getName() {
        return name;
    }

    public int getTheatreId() {
        return theatreId;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Screens> getScreens() {
        return screens;
    }

    public double getRating() {
        return rating;
    }

    public Address getAddress() {
        return address;
    }
}
