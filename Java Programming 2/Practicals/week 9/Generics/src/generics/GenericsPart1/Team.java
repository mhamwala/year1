/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.GenericsPart1;

import java.util.ArrayList;

/**
 *
 * @author u0011481
 */
public class Team {
    // Team name
    private String name;
    private ArrayList<Player> members = new ArrayList<>();
    
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    // constructor
    public Team(String name) {
        this.name = name;
    }
    //get team name
    public String getName() {
        return name;
    }

    // boolean to indicate whether we have successfully added them or not
    public boolean addPlayer(Player player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    // getter to show how many players on the team
    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if(ourScore > theirScore) {
            won++;
        } else if(ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }
        played++;
        // update opponent results too
        if(opponent != null) {
            // update the opponent score too
            opponent.matchResult(null, theirScore, ourScore);
        }
    }
    // very simple ranking system
    public int ranking() {
        return (won * 2) + tied;
    }

}

