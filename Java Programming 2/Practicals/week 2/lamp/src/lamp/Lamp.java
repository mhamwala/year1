/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamp;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Q5110442
 */
public class Lamp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame win = new JFrame("!");
        win.setSize(600,600);
        
        MyPanel panel = new MyPanel();
        
        win.add(panel);
        
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
    
}
