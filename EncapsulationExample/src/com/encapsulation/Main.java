package com.encapsulation;

public class Main {
    public static void main(String []args){
        player p = new player("Tim", 200);
        System.out.println(p.getHealth());
        int damage = 40;
        p.loosehealth(damage);
        damage = 20;
        p.loosehealth(damage);
        int res = p.getHealth();
        System.out.println(res);
    }
}
