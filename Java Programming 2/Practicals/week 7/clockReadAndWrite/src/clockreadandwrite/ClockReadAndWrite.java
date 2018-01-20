/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockreadandwrite;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author q5110442
 */
public class ClockReadAndWrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        clockPanel GUI = new clockPanel();
        
        JFrame win = new JFrame();
        
        win.add(GUI);
        
        Dimension size = new Dimension(300,300);
        win.setMinimumSize(size);
        win.setDefaultCloseOperation(3);
        
       
        win.setVisible(true);
        
    }
    
}
