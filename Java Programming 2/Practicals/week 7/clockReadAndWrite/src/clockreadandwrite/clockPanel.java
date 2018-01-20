/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockreadandwrite;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author q5110442
 */
public class clockPanel extends JPanel implements ActionListener {
    
    JButton update;
    JButton save;
    JButton load;
    JLabel time;
    Clock a = new Clock(10,25,0);;
    
    clockPanel()
    {
        
        
        
        save = new JButton("save");
        save.addActionListener(this);
        this.add(save);
        
        time = new JLabel(a.toString());
        time.setOpaque(true);
        this.add(time);
        
        load = new JButton("load");
        load.addActionListener(this);
        this.add(load);
        
        update = new JButton("tick");
        update.addActionListener(this);
        this.add(update);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == update){
            
            a.tick();
            time.setText(a.toString());
        }
        
        else if(e.getSource() == save){
            
            
            
            try {
                //save File
                ObjectOutputStream output = new ObjectOutputStream( new FileOutputStream("myfile.dat"));
                output.writeObject(a);
                
                output.close();
                
            } catch (IOException ex) {
                Logger.getLogger(clockPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }else if(e.getSource() == load){
            
            try {
                ObjectInputStream input = new ObjectInputStream(new FileInputStream("myfile.dat"));
                
                a = (Clock)input.readObject();
                
            } catch (IOException ex) {
                
                Logger.getLogger(clockPanel.class.getName()).log(Level.SEVERE, null, ex);
                
            } catch (ClassNotFoundException ex) {
                
                Logger.getLogger(clockPanel.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            
           time.setText(a.toString());
        }
    }
    
}
