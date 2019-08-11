package com.bookmyshow;

import java.util.List;

public class Details implements  PreBookingDetails {
    @Override
    public List<Theatre> getTheatres(String cityName) {
        return null;
    }

    @Override
    public List<Movie> getMovies(Theatre th) {
        return th.getMovies();
    }
}
