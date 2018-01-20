/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import javax.swing.*;

/**
 *
 * @author Q5110442
 */
public class Driver  {

    
    
    public static void main(String[] args) {
        
        //create a frame
        JFrame app = new JFrame();
        
        //create and instance of my panel
        MyPanel panel = new MyPanel();
        
        //add my panel to the frame
        app.add(panel);
        
        //set default frame values
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(600,600);
        app.setVisible(true);
    }
    
}
