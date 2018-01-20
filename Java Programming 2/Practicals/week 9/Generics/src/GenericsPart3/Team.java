/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsPart3;

import java.util.ArrayList;


/**
 *
 * @author u0011481
 * @param <T>
 */
// The Team class is now a generic class
// 1. Modify the class declaraation to include a Type parameter
//    We specify what tpye of parameters can be used her by 
//    extends Player.  This is a bounded Type parameter - provides a restricted
//    the type of class that we can use for Team
public class Team <T extends Player> implements Comparable<Team<T>>{
    
    // 5. This might look a bit complicated, but all we are doing is creating the
    //    ability to have generic Types, so Team is the Type in this case, it must copntain matching
    // types, eg
    //    <Football Player> so we can't compare a baseball team to a footballl team

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    // 2. modify members arraylist to take a Type parameter
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 3. modify add player to be a generic method
    // when we instantiate a class the T will be replaced by the actual type 
    // declared at instantiation
    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    // make sure the generic type matches the calling object
    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

        String message;

        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " drew with ";

        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if (opponent != null) {
            // not good practice, but ok for demonstration purposes
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;    
    }
    
    // The are the rules when using compareTo()
    // returns a -ve value if this is less than the object 
    
    //(ie in this case if the ranking is less than the object's ranking,
    // it would place it higher up the table)
    
    // returns a +ve value if this is greater than the object (ie the ranking is  greater than the object's ranking)
    // return a 0 if they are equal 

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        }
        else if (this.ranking()< team.ranking()){
            return 1;
        }
        return 0;
    }

   
}
