/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author q5110442
 */
public class MyPanel extends JPanel implements ActionListener {
    JTextField Pound;
    JTextField Euro;
    JButton button;
    MyPanel(){
        
        JLabel label = new JLabel("UK POUND");
        label.setOpaque(true);
        Pound = new JTextField("Pound",10);
        
                
        Pound.setOpaque(true);
        
        this.add(label);
        this.add(Pound);
        
        JLabel label2 = new JLabel("EURO");
        label2.setOpaque(true);
        Euro = new JTextField(10);
        Euro.setOpaque(true);
        
        this.add(label2);
        this.add(Euro);
        
        button = new JButton("Push me!");
        button.addActionListener(this);
        this.add(button);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
       String a = Pound.getText();
       
       //coverts string to doulbe
       Double b = Double.parseDouble(a);
       //does math
       Double math = b*1.166;
       
       //converts double to string
       
       String answer = new Double(math).toString();
       
       Euro.setText(answer);
       
       
       
               }
}
