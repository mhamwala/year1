/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author Q5110442
 */
public class MyPanel extends JPanel implements ActionListener {
    JButton on;
    JButton off;
    
    JLabel label;
    
    ImageIcon a;
    ImageIcon b;
    MyPanel()
    {
        
    
    
    on = new JButton("ON");
    this.add(on);
    on.addActionListener(this);
    
    off = new JButton("OFF");
    this.add(off);
    off.addActionListener(this);
    
    Dimension size = new Dimension(50,50);
    a = new ImageIcon("images/light_off.png");
    b = new ImageIcon("images/light_on.png");
    label = new JLabel(a);
    label.setPreferredSize(size);
    label.setOpaque(true);
    this.add(label);
    
    }
     public void actionPerformed(ActionEvent e){
         
         if(e.getSource() == on)
        {
            label.setIcon(b);
        }else if(e.getSource()== off){
            label.setIcon(a);
        }
     }
     
    
}
