/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsPart3;

/**
 *
 * @author u0011481
 */
public class GenericsPart3 {

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
       
        System.out.println("Rankings");
        System.out.println(billinghamBombers.getName() + ": " + billinghamBombers.ranking());
        System.out.println(middlesbrough.getName() + ": " + middlesbrough.ranking());
        System.out.println(marton.getName() + ": " + marton.ranking());
        System.out.println(thornaby.getName() + ": " + thornaby.ranking());
        
        System.out.println(billinghamBombers.compareTo(marton));
        System.out.println(billinghamBombers.compareTo(thornaby));
        System.out.println(thornaby.compareTo(billinghamBombers));
        
        League<Team<FootballPlayer>> footballLeague = new League<>("NFL");
        
        footballLeague.add(billinghamBombers);
        footballLeague.add(middlesbrough);
        footballLeague.add(thornaby);
        footballLeague.add(marton);
        
        footballLeague.showLeagueTable();
    }

}
