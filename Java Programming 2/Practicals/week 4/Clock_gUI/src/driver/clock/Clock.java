/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver.clock;

import javax.swing.JPanel;
import java.awt.*;
/**
 *
 * @author Q5110442
 */
public class Clock extends JPanel{
    int Hour;
    int Min;
    int Sec;
    
    Clock(){
        Hour = 0;
        Min = 0;
        Sec = 0;
    }
    Clock(int hour,int min,int sec){
        Hour = hour;
        Min = min;
        Sec = sec;
        
    }
    public int getHour(){
        
        return Hour;
    }
    public int getMin(){
        
        return Min;
    }
    public int getSec(){
        
        return Sec;
    }
    public String toString(){
        
        return "The time is "+Hour+":"+Min+":"+Sec;
    }
    
    public String tick(){
        
       
        
        if(Sec >= 60)
        {
           Min = Min + 1;
           Sec = 0;
        }else{
            Sec++;
        }
        
        if(Min >= 60){
            Hour++;
            Min = 0;
        }
        
        if(Hour >= 24){
            Hour = 0;
        }
        
        return "The time is "+Hour+":"+Min+":"+Sec;
        
        this.add(Hour, Min, Sec);
    }
}
