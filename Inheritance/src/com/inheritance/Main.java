package com.inheritance;

public class Main {
    public static void main(String []args){
        Bugati b = new Bugati(23);
        b.accelerate(20);
        b.accelerate((10));
        b.stop();
        int vel = b.getCurrentVelocity();
        System.out.println(vel);

    }
}
