/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericsIntro;

import java.util.ArrayList;

/**
 *
 * @author u0011481
 */
public class RawTypeEg {
 
    public static void main(String[] args) {
        
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("Jackie");
        items.add(4);
        items.add(5);
        
        printDoubled(items);
        
    }
    
    private static void printDoubled(ArrayList n)
    {
        for (Object i : n){
            System.out.println((Integer) i * 2);
        }
    }
    
}