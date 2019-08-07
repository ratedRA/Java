package com.gameplayer;

import javafx.beans.binding.ObjectBinding;

import java.lang.management.MonitorInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player john = new Player("John", 12,15);
        System.out.println(john.toString());
        saveObjects(john);
        john.setHitPoints(22);
        System.out.println(john);
        john.setWeapon("Gun");
        saveObjects(john);
        loadObjects(john);
        System.out.println(john);
        ISaveable mons = new Monster("godzilla", 11,30);
        System.out.println(mons.toString());
        saveObjects(mons);

    }

    public static ArrayList<String> readValues() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> values = new ArrayList<String>();
        boolean quit = false;
        System.out.println("Enter 0 to quit\r enter 1 to choose a string");
        int index = 0;

        while (!quit) {
            System.out.println("enter your choice");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("enter a string");
                    String yourInput = sc.nextLine();
                    values.add(index, yourInput);
                    index += 1;
                    break;
                case 0:
                    quit = true;
                    break;
            }
        }
        return values;
    }
    public static void saveObjects(ISaveable objectsToSave){
        for(int i =0; i<objectsToSave.write().size();i++){
            System.out.println("saving object "+objectsToSave.write().get(i)+" to storage device");
        }
    }
    public static void loadObjects(ISaveable objectsToLoad){
        List<String> values = readValues();
        objectsToLoad.read(values);
    }
}
