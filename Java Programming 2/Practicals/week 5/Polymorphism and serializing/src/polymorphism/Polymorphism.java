/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;


/**
 *
 * @author Q5110442
 */
public class Polymorphism   {

    
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        
        ShapesPanel panel = new ShapesPanel();
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.add(panel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        //save File
        ObjectOutputStream output = new ObjectOutputStream( new FileOutputStream("myfile.dat"));
        output.writeObject(panel);
        
        output.close();
        
        
        
        
    }
    
}
