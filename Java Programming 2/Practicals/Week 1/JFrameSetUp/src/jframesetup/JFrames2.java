/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframesetup;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;


public class JFrames2 {

    public static void main(String[] args) {
        //creates frame
        JFrame window = new JFrame("test frame");
        window.setSize(600,600);
        //create an instance of our panel
        
        MyPanel panel = new MyPanel();
       
        //add it to frame
        window.add(panel);
        
        //set defaults
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        
    }
    
}
