package driver.clock;

import javax.swing.JFrame;

public class DriverClock {

    public static void main(String[] args ) 
    {
        JFrame window = new JFrame();
        
        Clock myClock = new Clock(10,25,0);
        
        window.setSize(600,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        
        window.add(myClock);
    }
    
}
