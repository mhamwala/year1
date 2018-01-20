/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframesetup;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

/**
 *
 * @author q5110442
 */
public class MyPanel extends JPanel 
{
    
    MyPanel()
    {
        
        Dimension size = new Dimension(600,200);
  
        //this.add(new BorderLayout());
        JPanel box = new JPanel(new BorderLayout());
        
        
        JLabel labelGreen = new JLabel();
        labelGreen.setBackground(Color.GREEN);
        labelGreen.setPreferredSize(size);
        labelGreen.setOpaque(true);
        box.add(labelGreen,BorderLayout.NORTH);
        
        JLabel labelRed = new JLabel();
        labelRed.setBackground(Color.RED);
        labelRed.setPreferredSize(size);
        labelRed.setOpaque(true);
        box.add(labelRed,BorderLayout.CENTER);
        
        JLabel labelBlue = new JLabel();
        labelBlue.setBackground(Color.BLUE);
        labelBlue.setPreferredSize(size);
        labelBlue.setOpaque(true);
        box.add(labelBlue,BorderLayout.SOUTH);
        
        
        this.add(box);
        
    }
    
}
