


package driver.clock;



public class DriverClock {

    
    public static void main(String[] args) {
        Clock myClock = new Clock(10,25,0);
        
        
       
        String a = myClock.tick();
        System.out.println(a);
        int power = 800;
        int p =900;
        Microwave smeg = new Microwave(power, myClock);
        
        smeg.cook(p,120);
    }
    
}
