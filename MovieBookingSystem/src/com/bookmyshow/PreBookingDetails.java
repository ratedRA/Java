package com.bookmyshow;

import java.util.List;

public interface PreBookingDetails {
    List<Theatre> getTheatres(String cityName);
    List<Movie> getMovies(Theatre th);
}
