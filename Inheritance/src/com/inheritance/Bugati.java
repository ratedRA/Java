package com.inheritance;

public class Bugati extends Car{
    private int roadServiceMonths;

    public Bugati(int roadServiceMonths) {
        super("Bugati", "Black", "ABC 1234", 4, 5, 4, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void accelerate(int rate){
        int velocity = getCurrentVelocity()+rate;
        if(velocity==0){
            stop();
        }
        else if(velocity<=20 && velocity>=1){
            changeGear(1);
        }
        else if(velocity<=60 && velocity>=21){
            changeGear(2);
        }
        else{
            changeGear(3);
        }
        if(velocity>0){
            changeVelocity(velocity);
        }
    }
}
