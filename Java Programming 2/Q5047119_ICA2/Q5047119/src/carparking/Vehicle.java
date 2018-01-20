package carparking;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public abstract class Vehicle extends JPanel
{
    protected double charge;
    protected String regNumber;
    
    Vehicle(String rn)
    {
        regNumber = rn;
        charge = 0;
    }
    
    Vehicle()
    {
        charge = 0;
        regNumber = "REG NO24";
    }
    
    public double getCharge()
    {
        return charge;
    }
    
    public abstract double calcCharge();
   
    public String toString()
    {
        return("Registration no: " + "  " + regNumber) + " " + "Charge = £";
    }           
}
