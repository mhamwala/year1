/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Q5110442
 */
public class MyPanel extends JPanel
{

      MyPanel()
      {
          this.setLayout(new BorderLayout());
          Dimension size = new Dimension(600,200);
          
          JLabel Greenlabel = new JLabel("this is a label");
          Greenlabel.setBackground(Color.GREEN);
          Greenlabel.setPreferredSize(size);
          Greenlabel.setOpaque(true);
          
          ImageIcon i = new ImageIcon("images/image1.gif");
          
          JLabel RedLabel = new JLabel(i);
          RedLabel.setBackground(Color.RED);
          RedLabel.setPreferredSize(size);
          RedLabel.setOpaque(true);
          
          JLabel BlueLabel = new JLabel("another label, again");
          BlueLabel.setBackground(Color.BLUE);
          BlueLabel.setPreferredSize(size);
          BlueLabel.setOpaque(true);
          
          this.add(Greenlabel, BorderLayout.NORTH);
          this.add(RedLabel, BorderLayout.CENTER);
          this.add(BlueLabel, BorderLayout.SOUTH);
      }
    
}
