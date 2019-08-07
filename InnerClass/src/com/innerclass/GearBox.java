package com.innerclass;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 1;
    private boolean clutchIsIn;

    public GearBox(int maxGears) {
        this.gears = new ArrayList<Gear>();
        this.maxGears = maxGears;

    }
    public void setClutchIsIn(boolean in){
        this.clutchIsIn = in;
    }
    public void addGear(int number, double ratio){
        if((number>=0 && number<=maxGears)&& clutchIsIn){
            this.gears.add(new Gear(number, ratio));
        }
    }
    public void changeGear(int number){
        if (number>=0 && number <=maxGears) {
            this.currentGear = number;
        }
        else{
            System.out.println("Grind!");
        }

    }
    public double wheelSpeed(int revs){
        return revs*(this.gears.get(currentGear).getRatio());
    }

    public class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }
        public double driveSpeed(int revs){
            return (this.ratio)*revs;
        }

        public double getRatio() {
            return ratio;
        }
    }
}
