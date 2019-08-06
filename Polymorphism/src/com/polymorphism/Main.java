package com.polymorphism;

class Car{
    private boolean engine;
    private int wheels;
    private int cylinders;
    private String name;
    private int currentVelocity = 0;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }
    public void startEngine(){
        if(this.engine){
            System.out.println("Engine has been started.");
        }
    }
    public void applyBreak(){
        System.out.println("Brakes has been applied");
    }
    public void accelerate(int rate){
        System.out.println("acceleration has been applied");
        changeVelocity(rate);
    }
    public void changeVelocity(int rate){
        this.currentVelocity += rate;
        System.out.println("current velocity is: "+currentVelocity);
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return "generic name";
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }
}

class Skoda extends Car{
    Skoda(int cylinder, String name){
        super(cylinder, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Skoda->engine started");
    }

    @Override
    public void applyBreak() {
        System.out.println("Skoda->apply break");
    }

    @Override
    public void accelerate(int rate) {
        super.accelerate(rate);
        System.out.println("Skoda->accelerate");
    }
}
class Ford extends Car{
    Ford(int cylinder, String name){
        super(cylinder, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford->engine started");
    }

    @Override
    public void applyBreak() {
        System.out.println("Ford->apply break");
    }

    @Override
    public void accelerate(int rate) {
        super.accelerate(rate);
        System.out.println("Ford->accelerate");
    }
}

public class Main {
    public static void main(String []args){
        Car car = new Ford(6,"Fiesta");
        car.startEngine();
        car.applyBreak();
        car.accelerate(50);

        Car car2 = new Skoda(6,"Rapid");
        car2.startEngine();
        car2.applyBreak();
        car2.accelerate(40);



    }
}
