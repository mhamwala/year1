package buttons;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author q5110442
 */
public class MyPanel extends JPanel implements ActionListener
{
    JButton greenOrBlue;
    JButton YellowOrRed;
    
    MyPanel(){
    
       
        
        this.setBackground(Color.GREEN);
    
        greenOrBlue = new JButton("pick me!");
        YellowOrRed = new JButton("na fam, pick me!");
        
        this.add(greenOrBlue);
        this.add(YellowOrRed);
        
        greenOrBlue.addActionListener(this);
        YellowOrRed.addActionListener(this);
    
    }
    
    public void actionPerformed(ActionEvent e){
        
        Color currentColor = getBackground();
        
        if(e.getSource() == greenOrBlue)
        {
        
            if(currentColor == Color.GREEN){
                setBackground(Color.BLUE);
            }
            else 
            {
                setBackground(Color.GREEN);
            }
            
        }
        else if(e.getSource() == YellowOrRed)
        {
            if(currentColor == Color.YELLOW)
            {
                setBackground(Color.RED);
            }
            else
            {
                setBackground(Color.YELLOW);
            }
        }
    }
}
