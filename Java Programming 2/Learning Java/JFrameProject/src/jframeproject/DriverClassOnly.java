package jframeproject;

import javax.swing.*;
import java.awt.*;

public class DriverClassOnly
{
    public static void main(String[] args)
    {
        JFrame win = new JFrame();
 
        win.setSize(600,600);
        
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Dimension LabelSize = new Dimension(200,200);
        
        Color red = new Color(246,13,11);
        Color white = new Color(255,255,255);
        Color blue = new Color(25,10,124);
        
        JLabel myRedLabel = new JLabel();
        JLabel myWhiteLabel = new JLabel();
        JLabel myBlueLabel = new JLabel();
        
        myRedLabel.setPreferredSize(LabelSize);
        myRedLabel.setBackground(red);
        myRedLabel.setOpaque(true);
        
        myWhiteLabel.setPreferredSize(LabelSize);
        myWhiteLabel.setBackground(white);
        myWhiteLabel.setOpaque(true);
        
        myBlueLabel.setPreferredSize(LabelSize);
        myBlueLabel.setBackground(blue);
        myBlueLabel.setOpaque(true);
        
        win.add(myRedLabel, BorderLayout.NORTH);
        win.add(myWhiteLabel, BorderLayout.CENTER);
        win.add(myBlueLabel, BorderLayout.SOUTH);
        
        win.setVisible(true);              
    }
    
}
