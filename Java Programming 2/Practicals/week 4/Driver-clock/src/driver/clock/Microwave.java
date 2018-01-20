/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver.clock;

/**
 *
 * @author Q5110442
 */
public class Microwave {
    
    Clock theClock;
    int maxPower = 900;
    int CurrentPower;
    
    Microwave(){ 
        maxPower = 500;
        CurrentPower = 500;
        theClock = new Clock();
    }
    Microwave(int Mpower, Clock c){
        maxPower = Mpower;
        theClock = c;
    }
    public int getCurrentPower(){
        
        return CurrentPower;
    }
    
    public int getMaxPower(){
        
        return maxPower;
    }
    
    public String getTime(){
        
        return theClock.toString();
    }
    
    public void cook(int power, int time){
        
        CurrentPower = power;
        if(CurrentPower > maxPower){
            System.out.println("BOOOMM! broke your microwave");
           
        }else{
        int count = 1;
        
        while(count <= time){
        String a = theClock.tick();
            System.out.println(a);
        count++;
        }
        }
        
    }
}
