package carparking;

import java.awt.BorderLayout;
import static java.lang.System.in;
import java.util.Scanner;
import javax.swing.JFrame;

public class CarParking
{

    public static void main(String[] args)
    {
        JFrame home = new JFrame("Car Parking System");
        Scanner in = new Scanner(System.in);
        
        myPanel carPanel = new myPanel();
                
        home.setSize(800,600);
        
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setVisible(true);
        home.add(carPanel, BorderLayout.CENTER);
    }
    
}
