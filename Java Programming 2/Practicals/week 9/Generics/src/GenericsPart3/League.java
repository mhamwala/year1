/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsPart3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author u0011481
 */
public class League<T extends Team> 
{
    
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }
    
    public boolean add(T team)
    {
        if(league.contains(team)){
            return false;
        }
        league.add(team);
        return true;
    }
    
    public void showLeagueTable(){
        // this autmatically uses our compareTo method in Team
        Collections.sort(league);
        
        for(T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
    
    
}
