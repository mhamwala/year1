package carparking;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Car extends Vehicle 
{
    int length;
    boolean disabledBadge;
    int numOfHours;
    boolean valid = false;
    
    Car()
    {
        length = 5;
        regNumber = null;
        disabledBadge = false;
               
    }
    
    Car(String rn, int l, boolean d, int nh)
    {
        super(rn);
        length = l;
        disabledBadge = false;
        numOfHours = nh;
        charge = calcCharge();
    }
    
    public double getLength()
    {
        return length; 
    }
    
    @Override
    public double calcCharge()
    {       
        if (disabledBadge == true)
        {
            charge = 0.00;
            return charge;
        }
        if (length < 6)
        {
            charge = 1.00 * numOfHours;
        }
        else
        {
            charge = 1.50 * numOfHours;
            
        }
        return charge;
    }
    
    public String toString()
    {
        return super.toString() + this.calcCharge() + "  " + "Length: " + " " + length;
    }
    
}
