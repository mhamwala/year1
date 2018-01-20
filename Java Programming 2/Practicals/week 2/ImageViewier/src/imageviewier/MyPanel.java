/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewier;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author Q5110442
 */
public class MyPanel extends JPanel implements ActionListener
{
    
    JPanel left;
    JPanel right;
    JPanel middle;
    
    JButton leftClick;
    JButton rightClick;
    
    JLabel view;
    Dimension size;
    
    ImageIcon a;
    ImageIcon b;
    ImageIcon c;
    ImageIcon d;
    MyPanel()
    {
        size = new Dimension(400,400);
        
        this.setLayout(new BorderLayout());
        
        left = new JPanel();
        leftClick = new JButton("Previous");
        leftClick.addActionListener(this);
        
        left.add(leftClick);
        
        this.add(left,BorderLayout.WEST);
        
        right = new JPanel();
        rightClick = new JButton("Next");
        rightClick.addActionListener(this);
        
        right.add(rightClick);
        
        this.add(right,BorderLayout.EAST);
        
        middle = new JPanel();
        middle.setPreferredSize(size);
        
        a = new ImageIcon("images/image1.jpg");
        b = new ImageIcon("images/image2.png");
        c = new ImageIcon("images/image3.png");
        d = new ImageIcon("images/image4.jpg");
        
        view = new JLabel(a);
        view.setPreferredSize(size);
        view.setBackground(Color.GREEN);
        view.setOpaque(true);
        
        middle.add(view);
        
        this.add(middle,BorderLayout.CENTER);
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == leftClick){
            if(view.getIcon() == a){
                view.setIcon(d);
            }else if(view.getIcon() == d){
                view.setIcon(c);
            }else if(view.getIcon() == c){
            view.setIcon(b);
            }else{
                view.setIcon(a);
            }
        }else if(e.getSource() == rightClick){
             if(view.getIcon() == a){
                view.setIcon(b);
            }else if(view.getIcon() == b){
                view.setIcon(c);
            }else if(view.getIcon() == c){
            view.setIcon(d);
            }else{
                view.setIcon(a);
            }
            
        }
    }
}
