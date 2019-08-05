package com.encapsulation;

public class player {
    private int health=100;
    private String name;

    public player(String name, int health) {
        if(health>0 && health<=100) {
            this.health = health;
        }
        this.name = name;
    }

    public void loosehealth(int damage){
        this.health -= damage;
        if(health<=0){
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return health;
    }
}
