/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JFrame;

/**
 *
 * @author q5110442
 */
public class testDrawPanel {
    
    public void main(String[] args) throws IOException, ClassNotFoundException{
        
        //running file
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("myfile.dat"));
        
        ShapesPanel recoveredPanel = (ShapesPanel)input.readObject();
        
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.add(recoveredPanel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
