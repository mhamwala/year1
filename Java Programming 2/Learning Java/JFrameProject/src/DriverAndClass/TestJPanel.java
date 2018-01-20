package DriverAndClass;

import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;

public class TestJPanel
{
    public static void main(String[] args)
    {
        JFrame win = new JFrame("My panel");
        JPanel firstPanel = new JPanel(new BorderLayout());
        JLabel myLabel = new JLabel();

        win.setSize(600,600);
        
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        win.add(firstPanel);

        win.setVisible(true);              
    }
    
}
