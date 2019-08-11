package com.bookmyshow;

public class User {
    private static int totalUser = 0;
    private int userId;
    private String name;
    private String email;
    private int phoneNumber;
    private Address address;

    public User(String name, String email, int phoneNumber, Address address) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userId = totalUser+1;
        this.totalUser+=1;
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
    public String getCity(){
        return this.address.getCity();
    }
}
