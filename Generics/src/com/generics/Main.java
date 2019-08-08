package com.generics;

import com.sun.source.tree.Scope;

public class Main {
    public static void main(String[] args) {
        CricketPlayer cricket = new CricketPlayer("Dhoni");
        BaseballPlayer baseball = new BaseballPlayer("John");
        SoccerPlayer football = new SoccerPlayer("Messi");

        Team<CricketPlayer> cricketTeam = new Team<>("CSK");
        Team<BaseballPlayer> baseballTeam = new Team<>("RSP");
        Team<SoccerPlayer> footballTeam = new Team<>("MI");
        cricketTeam.addPlayer(cricket);
        baseballTeam.addPlayer(baseball);
        footballTeam.addPlayer(football);

        footballTeam.matchResult(cricketTeam, 1, 5);

        System.out.println(cricketTeam.numOfPlayers());
    }
}
