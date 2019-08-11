package com.bookmyshow;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String cityName;
    private List<Theatre> theatres = new ArrayList<>();

    public City(String cityName) {
        this.cityName = cityName;
    }

    public boolean addTheatre(Theatre th){
        if(theatres.contains(th)){
            System.out.println("Theatre object already exists");
            return false;
        }
        this.theatres.add(th);
        return true;
    }

    public String getCityName() {
        return cityName;
    }
}
