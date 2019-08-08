package com.generics;

import javax.swing.plaf.TableHeaderUI;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;

public class Team<T> {
    private String name;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    private int played = 0;

    ArrayList<T> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean addPlayer(T player){
        if(players.contains(((Player) player).getName())){
            System.out.println("Player "+((Player) player).getName()+" already exists");
            return false;
        }
        else{
            this.players.add(player);
            System.out.println(((Player) player).getName()+" is added to "+this.name);
            return true;
        }
    }
    public int numOfPlayers(){
        return this.players.size();
    }

    public void matchResult(Team Oponent, int ourScore, int theirScore){
        if (ourScore>theirScore){
            this.won+=1;
            System.out.println("won against "+Oponent.getName());
        }
        else if (ourScore== theirScore){
            this.tied+=1;
            System.out.println("tied with "+Oponent.getName());
        }
        else{
            this.lost+=1;
            System.out.println("Lost against "+Oponent.getName());
        }
        played+=1;
        if(Oponent!=null){
            Oponent.played+=1;
            //System.out.println(Oponent.played);
        }
    }
    public int raking(){
        return (this.won*2)+tied;
    }
}
