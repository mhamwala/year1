/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author q5110442
 */
public class MyPanel extends JPanel implements ActionListener{
    
    MyPanel(){
    Dimension size = new Dimension(50,25);
    
    JButton button = new JButton("push me");
    
    JLabel label = new JLabel("hello");
    label.setPreferredSize(size);
    label.setBackground(Color.GREEN);
    label.setOpaque(true);
    
    this.add(button);
    button.addActionListener(this);
    
    this.add(label);
    
}
    public void actionPerformed(ActionEvent e){
        
        
    }
    
}
