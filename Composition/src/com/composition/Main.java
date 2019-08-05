package com.composition;


public class Main {
    public static void main(String []args) {
        Dimensions bdidemsion = new Dimensions(15, 24, 18);
        Dimensions tdimension = new Dimensions(34, 12, 29);
        Dimensions cdimensions = new Dimensions(18, 16, 15);
        Furniture furniture = new Furniture(1, 1, 1, bdidemsion, tdimension, cdimensions);
        Cloths shirt = new Cloths(10, 5, 2);
        int x = furniture.getBed();
        int y = furniture.getBdimensions().getX();
        System.out.println("Beds " + x + " dimensions " + y);
    }
}
