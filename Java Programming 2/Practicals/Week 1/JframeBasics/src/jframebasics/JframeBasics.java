/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframebasics;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author q5110442
 */
public class JframeBasics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates frame and sets closing operation
        JFrame Frame = new JFrame("Jframes");
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //create label, color and size to put into frame then add it
        JLabel label = new JLabel("MY LABEL");
        Dimension size = new Dimension(600,600);
        Color color = new Color(255,239,8);
        label.setPreferredSize(size);
        label.setBackground(color);
        label.setOpaque(true);
        
        // Set the alignment
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        
        //add label to frame
        Frame.add(label);
        
        //sets visable and size to whats inside frame
        Frame.pack();
        Frame.setVisible(true);
    }
    
}
