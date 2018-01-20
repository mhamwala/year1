/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.GenericsPart1;

/**
 *
 * @author u0011481
 */
public class GenericsPart1 {

    public static void main(String[] args) {
        
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        
        Team BillinghamBombers = new Team("Billingham Bombers");
        BillinghamBombers.addPlayer(joe);
        BillinghamBombers.addPlayer(pat);
        BillinghamBombers.addPlayer(beckham);
        // how do we make sure the correct type of player to be accepted on the right type of team?
        System.out.println(BillinghamBombers.numPlayers());

    }
}
