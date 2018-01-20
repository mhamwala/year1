/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JPanel;


public class ShapesPanel extends JPanel implements Serializable{
        ArrayList<Shape> art;
    
    public ShapesPanel(){
         art = new ArrayList<Shape>();
        
        art.add(new Oval(50,50,Color.RED,30,30));
        art.add(new Oval(20,200,Color.GREEN,60,60));
        art.add(new Rectangle(150, 200, Color.YELLOW, 70, 50));
        art.add(new Rectangle(250,20,Color.BLUE,120,30));
        
        

    }
    protected void paintComponent(Graphics g)
    {
        for(Shape s : art){
            s.drawShape(g);
        }
        
    }

}
