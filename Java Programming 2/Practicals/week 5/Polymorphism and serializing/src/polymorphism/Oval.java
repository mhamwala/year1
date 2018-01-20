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
public class Oval extends Shape implements Serializable  {
    private int radiusA, radiusB;
    
    Oval(int x, int y, Color c, int a, int b){
        super (x ,y, c);
        radiusA = a;
        radiusB = b; 
    }
    Oval(){
        radiusA = radiusB = 10;

    }

    @Override
    public double calcArea() {
       return radiusA * radiusB * 3.142;

    }

    @Override
    public void drawShape(Graphics g) {
        g.setColor(colour);
        g.fillOval(topX, topY, radiusA * 2, radiusB * 2); 
    }
}
