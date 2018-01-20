


package currencyconverter;

import java.awt.Dimension;
import javax.swing.JFrame;



public class CurrencyConverter {

    
    
    public static void main(String[] args) {
        
        JFrame win = new JFrame("Converter");
        Dimension size = new Dimension(600,200);
        win.setMinimumSize(size);
        win.setDefaultCloseOperation(3);
        
        MyPanel panel = new MyPanel();
        win.add(panel);
        
        win.pack();
        win.setVisible(true);
    }
    
}
