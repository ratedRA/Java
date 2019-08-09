package com.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean addLeague(T team){
        if(league.contains(team)){
            System.out.println("team already exists");
            return false;
        }
        else{
            league.add(team);
            System.out.println("team "+team.getName()+" get add to league "+this.name);
            return true;
        }
    }
    public void showTable(){
        Collections.sort(league);
        for(T t: league){
            System.out.println(t.getName()+" : "+t.ranking());
        }
    }

}
