/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmenu;

import java.util.ArrayList;



/**
 *
 * @author q5110442
 */
public class FoodMenu {

    
    public static void main(String[] args) {
        
//        Meal mondayMeal = new Meal(12.99);
//        Breakfast meal = new Breakfast(4.99,"continetal","full english");
//        Breakfast meal2 = new Breakfast(5.99,"Home-Made porridge","bacon and eggs");
//        Dinner dinner = new Dinner(17.99, "delicate tomato soup", "rack of lamb with garlic", "red");
//        Dinner fridayDinner = new Dinner(19.99,  "platter of stuffed mushrooms", "sea bass with almonds", "white");
//        
//        
        
        
        ArrayList<Meal> menu = new ArrayList<Meal>();
        
        menu.add(new Meal(12.99));
        menu.add(new Breakfast(4.99,"continetal","full english"));
        menu.add(new Breakfast(5.99,"Home-Made porridge","bacon and eggs"));
        menu.add(new Dinner(17.99, "delicate tomato soup", "rack of lamb with garlic", "red"));
        menu.add(new Dinner(19.99,  "platter of stuffed mushrooms", "sea bass with almonds", "white"));
        
        for(Meal a : menu){
            String b = a.getMenuDescription();
            System.out.println(b);
        }
    }
    
}
