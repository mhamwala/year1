package carparking;

import java.awt.BorderLayout;
import static java.lang.System.in;
import java.util.Scanner;
import javax.swing.JFrame;

public class CarParking
{

    public static void main(String[] args)
    {
        JFrame home = new JFrame("Car Park");
        Scanner in = new Scanner(System.in);
        
        myPanel carPanel = new myPanel();
        
//        int length = 4;
//        boolean disabledBadge = false;
//        int numOfHours = 5;
//        String regNum = "REG fejo";
//        Car Car = new Car(regNum, length, disabledBadge, numOfHours);
//        System.out.println(Car.toString());
//
//        int weight = 5;
//        int numDays = 3;
//        Lorry Lorry = new Lorry(weight, numDays, regNum);
//        System.out.println(Lorry.toString());
//        
//        int numOfPassengers = 21;
//        boolean touristOperator = true;
//        Coach Coach = new Coach(numOfPassengers, touristOperator, regNum);
//        System.out.println(Coach.toString());
        
        home.setSize(800,600);
        
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setVisible(true);
        home.add(carPanel, BorderLayout.CENTER);
    }
    
}
