package com.generics;

import com.sun.source.tree.Scope;

public class Main {
    public static void main(String[] args) {
        CricketPlayer cricket = new CricketPlayer("Dhoni");
        CricketPlayer cricket2 = new CricketPlayer("Clarke");
        BaseballPlayer baseball = new BaseballPlayer("John");
        SoccerPlayer football = new SoccerPlayer("Messi");

        Team<CricketPlayer> India = new Team<>("CSK");
        Team<BaseballPlayer> baseballTeam = new Team<>("RSP");
        Team<SoccerPlayer> footballTeam = new Team<>("MI");
        Team<SoccerPlayer> footballTeam2 = new Team<>("RCB");
        Team<CricketPlayer> Australia = new Team<>("Kp");
        India.addPlayer(cricket);
        Australia.addPlayer(cricket2);
        baseballTeam.addPlayer(baseball);
        footballTeam.addPlayer(football);

        footballTeam.matchResult(footballTeam2, 5, 1);
        India.matchResult(Australia,5,2);

        System.out.println("ranking of "+footballTeam.getName()+" "+footballTeam.ranking());
        System.out.println("ranking of "+India.getName()+" "+India.ranking());

        System.out.println("Number of players in India "+India.numOfPlayers());
        System.out.println(India.compareTo(Australia));

        League<Team<SoccerPlayer>> footBallleague = new League<>("World cup");
        footBallleague.addLeague(footballTeam);
        footBallleague.addLeague(footballTeam2);
        System.out.println(footBallleague.getName());
        footBallleague.showTable();

    }
}
