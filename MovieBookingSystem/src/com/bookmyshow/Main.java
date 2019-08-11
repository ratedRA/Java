package com.bookmyshow;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Address  firstAddress = new Address("Bangalore", "Karnataka");
        User first = new User("Aman", "meaman@gmail.com", 720918758,firstAddress);
        User second = new User("Aman", "meaman@gmail.com", 720918758,new Address("Ranchi", "Jharkhand"));

        /*System.out.println(first.getUserId());
        System.out.println(second.getUserId());
        System.out.println(first.getCity());*/

        Theatre th = new Theatre("PVR",9.3,firstAddress);
        th.addMovies(new Movie("Avengers","English",9.5));
        Details getDetails = new Details();
        List<Movie> thMovies = getDetails.getMovies(th);
        for(Movie movie: thMovies){
            System.out.println(movie.getName());
        }

        Screens screen1 = new Screens(1,100, th.getTheatreId());
        th.addScreens(screen1);

        for(Screens screen:th.getScreens()){
            for(Screens.Seats seat:screen.getAllSeats()){
                System.out.printf(" "+seat.getSeatNo());
            }
            System.out.println("");
        }
        if(screen1.reserveSeat("A01")){
            Booking booked = new Booking(first.getUserId(), th.getTheatreId(), 1234, "booked", "A01");
            System.out.println(first.getName()+" your ticket has been successfully booked in theatre "+ th.getName()+", "+th.getAddress().getCity());
            System.out.println("your seat number is: A01");
        }



    }
}
