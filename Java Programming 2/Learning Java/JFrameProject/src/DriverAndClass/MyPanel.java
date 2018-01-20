package DriverAndClass;

import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout;

public class MyPanel extends JPanel
{
    MyPanel()
    {
        Dimension LabelSize = new Dimension(200,200);
        ImageIcon Star = new ImageIcon("image1.GIF");
        
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
        
        this.add(myRedLabel, BorderLayout.NORTH);
        this.add(myWhiteLabel, BorderLayout.CENTER);
        this.add(myBlueLabel, BorderLayout.SOUTH);
    }

}
