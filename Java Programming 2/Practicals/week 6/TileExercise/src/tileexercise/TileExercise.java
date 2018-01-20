/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tileexercise;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author q5110442
 */
public class TileExercise {

    
    public static void main(String[] args) {
        Dimension size = new Dimension(600,600);
        	// Create and set up the JFrame
        JFrame win = new JFrame("Tile Exercise");
        // Set the default close operation of the JFrame object to dispose
       	win.setDefaultCloseOperation(3);
        win.setMinimumSize(size);
  		// Instance the standalone class containing the components
  		TilePanelA tpa = new TilePanelA();
      	
      	// Add intermediate container to top level container
        win.add(tpa,BorderLayout.CENTER);
        
		// Display the window.
        win.pack();
        win.setVisible(true);
    }
    
}
