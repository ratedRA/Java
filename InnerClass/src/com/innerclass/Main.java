package com.innerclass;

public class Main {
    public static void main(String []args){
        GearBox mcLaren = new GearBox(6);
        GearBox.Gear gear = mcLaren.new Gear(1,12.3);
        mcLaren.setClutchIsIn(true);
        mcLaren.addGear(1,1.23);
        mcLaren.addGear(2,3.24);
        mcLaren.addGear(3,5.24);
        mcLaren.changeGear(1);
        System.out.println(mcLaren.wheelSpeed(1000));
        System.out.println(gear.driveSpeed(1000));
    }
}
