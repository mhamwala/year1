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
public class Dinner extends Meal{
    
    String courseOne;
    String courseTwo;
    String wine;
    
    Dinner(double p,String a,String b, String c){
        super(p);
        courseOne = a;
        courseTwo = b;
        wine = c;
        
    }
    
    
    public String getMenuDescription()
	{
		return "Dine in style! start with a "+courseOne+" then feast on "+courseTwo+" which includes a bottle of "+wine+" wine, only £"+price; 
	}
}
