package com.bookmyshow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Screens {
    private int screenNo;
    private int seatCapacity;
    private int theatreId;


    private List<Seats> seats = new ArrayList<>();

    public Screens(int screenNo, int seatCapacity, int theatreId) {
        this.screenNo = screenNo;
        this.seatCapacity = seatCapacity;
        this.theatreId = theatreId;

        for(char row = 'A'; row<='j'; row++){
            for(int seatNum = 1; seatNum<=12; seatNum++){
                Seats seat = new Seats(row+ String.format("%02d",seatNum));
                seats.add(seat);
            }
        }
    }

    public boolean reserveSeat(String seatNumber){
        Seats requestedSeat = new Seats(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat>=0){
            return seats.get(foundSeat).reserve();
        }
        else{
            System.out.println(seatNumber+" Seat is already booked");
            return false;
        }

    }

    public List<Seats> getAllSeats(){
        return seats;
    }


    public int getScreenNo() {
        return screenNo;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }


    public class Seats implements Comparable<Seats>{
        private String seatNo;
        private boolean isReserved = false;

        public Seats(String seatNo) {
            this.seatNo = seatNo;
        }

        public boolean reserve(){
            if(this.isReserved){
                System.out.println(this.seatNo+" is already reserved");
                return false;
            }
            this.isReserved = true;
            System.out.println(seatNo+" has been successfully booked");
            return true;
        }

        public String getSeatNo() {
            return seatNo;
        }

        public boolean isReserved() {
            return isReserved;
        }

        @Override
        public int compareTo(Seats seats) {
            return  this.seatNo.compareToIgnoreCase(seats.getSeatNo());
        }
    }
}
