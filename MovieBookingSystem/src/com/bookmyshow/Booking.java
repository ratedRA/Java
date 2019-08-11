package com.bookmyshow;

public class Booking {
    private static int bookingId;
    private int userId;
    private int theatreId;
    private int transactionId;
    private String status;
    private String seatNo;

    public Booking(int userId, int theatreId, int transactionId, String status, String seatNo) {
        this.userId = userId;
        this.theatreId = theatreId;
        this.transactionId = transactionId;
        this.status = status;
        this.seatNo = seatNo;
    }

    public String getStatus() {
        return status;
    }

    public String getSeatNo() {
        return seatNo;
    }
}
