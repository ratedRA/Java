package com.adventuregame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        locations.put(0, new Location(0,"you are sitting in front of computer learning java"));
        locations.put(1, new Location(1,"you are standing at the end of a road before a small brick"));
        locations.put(2, new Location(2,"you are at the top of a hill"));
        locations.put(3, new Location(3,"you are inside the building, a well house for a small spring"));
        locations.put(4, new Location(4,"you are in a valley beside a stream"));
        locations.put(5, new Location(4,"you are in the forest"));

        locations.get(1).addExits("W",2);
        locations.get(1).addExits("E",3);
        locations.get(1).addExits("S",4);
        locations.get(1).addExits("N",5);

        locations.get(2).addExits("N",5);

        locations.get(3).addExits("W",1);
        locations.get(4).addExits("N",1);
        locations.get(4).addExits("W",2);
        locations.get(5).addExits("S",1);
        locations.get(5).addExits("W",2);

        Map<String, String> vocab = new HashMap<>();
        vocab.put("QUIT","Q");
        vocab.put("NORTH","N");
        vocab.put("SOUTH","S");
        vocab.put("EAST","E");
        vocab.put("WEST","W");


        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are");
            for(String exit: exits.keySet()){
                System.out.print(exit+ ", ");
            }
            System.out.println();
            String direction = sc.nextLine().toUpperCase();
            if(direction.length()>1){
                String[] words = direction.split(" ");
                for(String word: words){
                    if(vocab.containsKey(word)){
                        direction = vocab.get(word);
                        break;
                    }
                }
            }
            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            }else{
                System.out.println("you cannot go in that direction");
            }
        }
    }
}
