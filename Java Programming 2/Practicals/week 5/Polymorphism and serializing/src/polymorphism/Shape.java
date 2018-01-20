
package polymorphism;

import java.awt.*;
import java.io.Serializable;



public abstract class Shape implements Serializable {
    
    protected int topX, topY;
    protected Color colour;
    
    public Shape(int x, int y, Color c){
        topX = x;
        topY = y;
        colour = c;
    }
    public Shape(){
        topX = 10;
        topY = 10;
        colour = Color.BLACK; 
        
    }
    
    public abstract double calcArea();
    
    public abstract void drawShape(Graphics g);
    
}
