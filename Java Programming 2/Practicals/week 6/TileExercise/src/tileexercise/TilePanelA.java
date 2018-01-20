
package tileexercise;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

class TilePanelA extends JPanel implements MouseListener
{
        Random r=new Random();
	JLabel[] label = new JLabel[9];
	public TilePanelA() 
	{
            this.setLayout(new GridLayout(3,3));
            Random r=new Random();
            for(int i = 0; i < 9; i ++){
                
            
            label[i] = new JLabel();
            label[i].setSize(100,100);
            label[i].setBackground(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
            label[i].setOpaque(true);
            label[i].addMouseListener(this);
            this.add(label[i]);
            
            }
            
            
            
            
            
	} // end of constructor

    
    public void mouseClicked(MouseEvent me) {
        
       
        }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        for(int i = 0; i < 9; i++){
            if(me.getSource() == label[i]){
                
                   
                 label[i].setBackground(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
                 
                }
            }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    

} // end of class

