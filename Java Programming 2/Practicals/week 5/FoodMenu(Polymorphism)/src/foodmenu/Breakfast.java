/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmenu;

/**
 *
 * @author q5110442
 */
public class Breakfast extends Meal {
    
    String optionOne;
    String optionTwo;
      
    
    Breakfast(double p,String a, String b) {
        super(p);
        optionOne = a;
        optionTwo = b;
        
        
    }
   
    
    public String getMenuDescription()
	{
		return "Enjoy a hearty breakfast! Options - "+optionOne+" or "+optionTwo+". Only £"+price; 
	}
    
}
