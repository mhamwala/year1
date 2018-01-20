/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneericsPart2;

/**
 *
 * @author u0011481
 */
public class GenericsPart2 {

    public static void main(String[] args) {
        
        // Create the players
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        // 4. The Team class now needs to specify which type of player it can have
        //    using the angel brackets as before, and add the <> to the new call
        Team<FootballPlayer> billinghamBombers = new Team<>("Billingham Bombers");
        // Joe can be added as he is a football player
        billinghamBombers.addPlayer(joe);
        // we can't add pat and beckham anymore as they are not Football Players
//        billinghamBombers.addPlayer(pat);
//        billinghamBombers.addPlayer(beckham);
        System.out.println(billinghamBombers.numPlayers());
        Team<BaseballPlayer> nortonTown = new Team<>("Norton Town");

        nortonTown.addPlayer(pat);
       
        Team<FootballPlayer> middlesbrough = new Team<>("Middlesbrough");
        FootballPlayer banks = new FootballPlayer("Gordon");
        middlesbrough.addPlayer(banks);

        Team<FootballPlayer> thornaby = new Team<>("Thornaby");
        Team<FootballPlayer> marton = new Team<>("Marton");

        thornaby.matchResult(marton, 1, 0);
        thornaby.matchResult(billinghamBombers, 3, 8);

       billinghamBombers.matchResult(marton, 2, 1);
       billinghamBombers.matchResult(middlesbrough, 1, 1);
    }

}
