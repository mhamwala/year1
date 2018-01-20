/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;

/**
 *
 * @author Q5110442
 */
public class Rectangle extends Shape implements Serializable {
    private int height,width;
    
    Rectangle(int x, int y, Color c, int w, int h){
        super( x, y, c);
        width = w;
        height = h; 
    }
    
    Rectangle(){
        height = 10; width = 10;

    }

    @Override
    public double calcArea() {
       
        return height * width;

    }

    @Override
    public void drawShape(Graphics g) {
        g.setColor(colour);
        g.fillRect (topX, topY, width, height); 
    }
}
