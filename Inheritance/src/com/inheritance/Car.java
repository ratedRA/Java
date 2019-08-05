package com.inheritance;

public class Car extends Vehicle{
    private int wheels;
    private int gears;
    private int doors;
    private int currentDirection;
    private boolean isMannual;
    private int currentGear;

    public Car(String name, String color, String vehicleNo, int wheels, int gears, int doors, boolean isMannual) {
        super(name, color, vehicleNo, wheels);
        this.wheels = wheels;
        this.gears = gears;
        this.doors = doors;
        this.currentDirection = 1;
        this.isMannual = isMannual;
    }
    public void changeGear(int gear){
        this.currentGear = gear;
        System.out.println("The gear has been changed to: "+currentGear);
    }
    public void changeVelocity(int speed){
        move(speed);
    }

}
