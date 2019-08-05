package com.inheritance;

public class Vehicle {
    private String name;
    private String color;
    private String vehicleNo;
    private int tyers;
    private int currentVelocity = 0;
    Vehicle(String name, String color, String vehicleNo, int tyers){
        this.name = name;
        this.vehicleNo = vehicleNo;
        this.color = color;
        this.tyers = tyers;
    }

    public void Vehicle_speed(int speed){
        currentVelocity+=speed;
        System.out.println("moving at a speed of "+speed);
    }
    public void move(int speed){
        System.out.println("vehicle is moving..");
        Vehicle_speed(speed);
    }

    public void stop(){
        this.currentVelocity = 0;
    }
    public int getCurrentVelocity(){
        return currentVelocity;
    }

}
