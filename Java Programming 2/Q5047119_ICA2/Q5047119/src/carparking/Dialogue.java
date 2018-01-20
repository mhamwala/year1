package carparking;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Musa II Hamwala
 */
public class Dialogue extends JDialog implements ActionListener {

    JLabel addReg, addBadge, addLength, numHours, addCoachReg, NumPassengers, touristOpr, lorryReg;
    JTextField Reg, Badge, length, Hours, coachReg, passengers, tourist, charge, RegLorry;

    JLabel NumDays, addWeight;
    JTextField days, lorryWeight;

    JPanel buttonGrid, grid;

    JButton carOk, carCancel, coachOk, coachCancel, lorryOk, lorryCancel;

    Car newCar;
    Coach newCoach;
    Lorry newLorry;
    
    String operator;

    Dialogue() {
    }

    Dialogue(Car car) {
        this.setModalityType(DEFAULT_MODALITY_TYPE);
        this.setLayout(new GridLayout(5, 1));
        this.newCar = car;
        this.setSize(400, 300);

        addReg = new JLabel("Add Reg (Must be 7 digits long): ");
        this.add(addReg);
        Reg = new JTextField(7);
        this.add(Reg);
        addBadge = new JLabel("Disabled Badge (Y/N): ");
        this.add(addBadge);
        Badge = new JTextField(2);
        this.add(Badge);
        addLength = new JLabel("Length (Must be less than 35): ");
        this.add(addLength);
        length = new JTextField(4);
        this.add(length);
        numHours = new JLabel("No. Of Hours: ");
        this.add(numHours);
        Hours = new JTextField(4);
        this.add(Hours);

        carOk = new JButton("Ok ");
        carCancel = new JButton("Cancel ");

        carOk.addActionListener(this);
        carCancel.addActionListener(this);

        this.add(carOk);
        this.add(carCancel);
        this.setVisible(true);
    }
/**
 * This is the constructor i use when i edit my cars with a middle mouse click 
 * @param car
 * @param regNumber
 * @param disabledBadge
 * @param numOfHours
 * @param len 
 */
    Dialogue(Car car, String regNumber, boolean disabledBadge, int numOfHours, int len)
    {
        this.setModalityType(DEFAULT_MODALITY_TYPE);
        this.setLayout(new GridLayout(5, 1));
        this.newCar = car;
        this.setSize(400, 300);

        addReg = new JLabel("Add Reg (Must be 7 digits long): ");
        this.add(addReg);
        Reg = new JTextField(regNumber,7);
        this.add(Reg);
        addBadge = new JLabel("Disabled Badge (Y/N): ");
        this.add(addBadge);
        if(disabledBadge)
        {
            Badge = new JTextField("Y",2);
        }
        else
        {
            Badge = new JTextField("N",2);
        }
        
        this.add(Badge);
        
        addLength = new JLabel("Length (Must be less than 35): ");
        this.add(addLength);
        
        String leng = Integer.toString(len);
        
        length = new JTextField(leng,4);
        this.add(length);
        
        numHours = new JLabel("No. Of Hours: ");
        this.add(numHours);
        
        String hour = Integer.toString(numOfHours);
        
        Hours = new JTextField(hour,4);
        this.add(Hours);

        carOk = new JButton("Ok ");
        carCancel = new JButton("Cancel ");

        carOk.addActionListener(this);
        carCancel.addActionListener(this);

        this.add(carOk);
        this.add(carCancel);
        this.setVisible(true);
    }
/**
 * This is the method i use to validate my car JTextFields
 * @return 
 */
    public String carValidation() 
    {
        newCar.regNumber = Reg.getText();
        String badge = Badge.getText();
        //Validation Check if its an empty string
        if (length.getText().isEmpty() || Hours.getText().isEmpty() || Reg.getText().isEmpty())
        {
            return "no empty fields";
        }
        if (newCar.regNumber.length() != 7) 
        {
            return "Reg invalid";
        }
        if (!(badge.equals("Y") || badge.equals("y")) && !(badge.equals("N") || badge.equals("n"))) 
        {
            return "Y/N plz";
        }
        int size = Integer.parseInt(length.getText());
        int hour = Integer.parseInt(Hours.getText());

        if (size > 30) 
        {
            return "Car can be no larger than 30 meters";
        }
        if (hour > 24) 
        {
            return "Sorry! maximum stay is 24 Hours";
        }
        return "-";
    }

    Dialogue(Lorry lorry) {
        this.setModalityType(DEFAULT_MODALITY_TYPE);
        this.setLayout(new GridLayout(4, 1));
        this.newLorry = lorry;
        this.setSize(400, 300);

        lorryReg = new JLabel("Add Reg (Must be 7 digits long): ");
        this.add(lorryReg);
        RegLorry = new JTextField(7);
        this.add(RegLorry);
        addWeight = new JLabel("Weight");
        this.add(addWeight);
        lorryWeight = new JTextField(5);
        this.add(lorryWeight);
        NumDays = new JLabel("Number of Days");
        this.add(NumDays);
        days = new JTextField(5);
        this.add(days);

        lorryOk = new JButton("Ok ");
        lorryCancel = new JButton("Cancel ");

        lorryOk.addActionListener(this);
        lorryCancel.addActionListener(this);

        this.add(lorryOk);
        this.add(lorryCancel);
        this.setVisible(true);
    }
/**
 * This is the method i use to validate my lorry JTextFields
 * @return 
 */
    private String lorryValidation() {
        if (lorryWeight.getText().isEmpty() || days.getText().isEmpty() || RegLorry.getText().isEmpty()) {
            return "no empty fields";
        }
        if (RegLorry.getText().length() != 7) {
            return "Reg invalid";
        }
        
        double t = Integer.valueOf(lorryWeight.getText());
        int a = Integer.valueOf(days.getText());
         
        if (t > 35) {
            return "Lorrys over 35 tonnes are not permitted to use the car park.";
        }
        //Validation Check if its an empty string
        if (a > 10) {
            return "Can only park for less than 10 days";
        }
        return "-";
    }
    /**
     * This is the constructor i use when i edit my lorries with a middle mouse click
     * @param lorry
     * @param numOfDays
     * @param regNumber
     * @param weight
     * @param charge 
     */
    Dialogue(Lorry lorry, int numOfDays, String regNumber, int weight, double charge)
    {
        this.setModalityType(DEFAULT_MODALITY_TYPE);
        this.setLayout(new GridLayout(4, 1));
        this.newLorry = lorry;
        this.setSize(400, 300);

        lorryReg = new JLabel("Add Reg (Must be 7 digits long): ");
        this.add(lorryReg);
        RegLorry = new JTextField(regNumber,7);
        this.add(RegLorry);
        addWeight = new JLabel("Weight");
        this.add(addWeight);
        
        String Weight = Integer.toString(weight);
        
        lorryWeight = new JTextField(Weight,5);
        this.add(lorryWeight);
        NumDays = new JLabel("Number of Days");
        this.add(NumDays);
        
        String day = Integer.toString(numOfDays);
        days = new JTextField(day,5);
        this.add(days);

        lorryOk = new JButton("Ok ");
        lorryCancel = new JButton("Cancel ");

        lorryOk.addActionListener(this);
        lorryCancel.addActionListener(this);

        this.add(lorryOk);
        this.add(lorryCancel);
        this.setVisible(true);
    }

    Dialogue(Coach coach) {
        this.setModalityType(DEFAULT_MODALITY_TYPE);
        this.setLayout(new GridLayout(4, 1));
        this.newCoach = coach;
        this.setSize(400, 300);

        addCoachReg = new JLabel("Add Reg");
        this.add(addCoachReg);
        coachReg = new JTextField(5);
        this.add(coachReg);
        NumPassengers = new JLabel("Number of Passengers");
        this.add(NumPassengers);
        passengers = new JTextField(5);
        this.add(passengers);
        touristOpr = new JLabel("Tourist operator? Y/N");
        this.add(touristOpr);
        tourist = new JTextField(5);
        this.add(tourist);

        coachOk = new JButton("Ok ");
        coachCancel = new JButton("Cancel ");

        coachOk.addActionListener(this);
        coachCancel.addActionListener(this);

        this.add(coachOk);
        this.add(coachCancel);
        this.setVisible(true);
    }
/**
 * This is the method i use to validate my coach JTextFields
 * @return 
 */
    private String coachValidation() 
    {
        newCoach.regNumber = coachReg.getText();

        if (passengers.getText().isEmpty() || tourist.getText().isEmpty() || coachReg.getText().isEmpty()) {
            return "no empty fields";
        }
        if (newCoach.regNumber.length() != 7) {
            return "Reg invalid";
        }
        if (!(tourist.getText().equals("Y") || tourist.getText().equals("y")) && !(tourist.getText().equals("N") || tourist.getText().equals("n"))) 
        {
            JOptionPane.showMessageDialog(null, "Y/N plz");
            return "Y/N plz";
        }
        //Validation Check if its an empty string
        return "-";
    }
    /**
     * This is the constructor i use when i edit my coach with a middle mouse click
     * @param coach
     * @param numOfPassengers
     * @param regNumber
     * @param touristOperator 
     */
    Dialogue(Coach coach, int numOfPassengers, String regNumber, boolean touristOperator)
    {
        this.setModalityType(DEFAULT_MODALITY_TYPE);
        this.setLayout(new GridLayout(4, 1));
        this.newCoach = coach;
        this.setSize(400, 300);

        addCoachReg = new JLabel("Add Reg");
        this.add(addCoachReg);
        coachReg = new JTextField(regNumber,5);
        this.add(coachReg);
        NumPassengers = new JLabel("Number of Passengers");
        this.add(NumPassengers);
        
        String pass = Integer.toString(numOfPassengers);
        
        passengers = new JTextField(pass,5);
        this.add(passengers);
        touristOpr = new JLabel("Tourist operator? Y/N");
        this.add(touristOpr);
        
        if(touristOperator)
        {
            tourist = new JTextField("Y",5);
            
        }
        else
        {
           tourist = new JTextField("N",5); 
        }
        
        
        this.add(tourist);

        coachOk = new JButton("Ok ");
        coachCancel = new JButton("Cancel ");

        coachOk.addActionListener(this);
        coachCancel.addActionListener(this);

        this.add(coachOk);
        this.add(coachCancel);
        this.setVisible(true);
    }
    /**
     * This is my action performed method for all my ok and Cancel buttons used
     * on my JTextFields.
     * @param e 
     */
    public void actionPerformed(ActionEvent e)
    {
        if ((e.getSource() == carCancel) || (e.getSource() == coachCancel) || (e.getSource() == lorryCancel)) 
        {
            dispose();
        }
        if (e.getSource() == carOk) 
        {
            if (carValidation() == "-") 
            {
                newCar.valid = true;
                String badge = Badge.getText();
                String carLength = length.getText();
                int length = Integer.valueOf(carLength);
                newCar.length = length;
                newCar.numOfHours = Integer.parseInt(Hours.getText());                
                if (badge.equals("Y") || badge.equals("y")) {
                    newCar.disabledBadge = true;
                    JOptionPane.showMessageDialog(null, "Car Added \n\n" + "Reg No: " + Reg.getText() + "\nBadge Holder: " + "Yes" + "\nCarLength: " + length);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Car Added \n\n" + "Reg No: " + Reg.getText() + "\nBadge Holder: " + "No" + "\nCarLength: " + length+"\nCharge : "+newCar.calcCharge());
                    dispose();
                }
            } 
            else
            {
                JOptionPane.showMessageDialog(null, carValidation());
            }
        }
//*************************************************************
        if (e.getSource() == coachOk) 
        {
            if (coachValidation() == "-") 
            {
                newCoach.valid = true;
                newCoach.numOfPassengers = Integer.valueOf(passengers.getText());
                operator = tourist.getText();
                newCoach.regNumber = coachReg.getText();
                if (operator.equals("Y") || operator.equals("y")) {
                    newCoach.touristOperator = true;
                    JOptionPane.showMessageDialog(null, "Coach Added \n\n" + "Reg No: " + newCoach.regNumber + "\nPassengers: " + passengers.getText() + "\nTourists: " + "Yes");
                } else {
                    JOptionPane.showMessageDialog(null, "Coach Added \n\n" + "Reg No: " + newCoach.regNumber + "\nPassengers: " + passengers.getText() + "\nTourists: " + "No"+"\nCharge : "+newCoach.calcCharge());
                }
                dispose();
            } 
            else 
            {
            JOptionPane.showMessageDialog(null, coachValidation());
            }
        }
        
//*************************************************************
        if (e.getSource() == lorryOk) 
        {
            if (lorryValidation() == "-") 
            {
                newLorry.valid = true;
                newLorry.regNumber = RegLorry.getText();
                int t = Integer.valueOf(lorryWeight.getText());
                newLorry.weight = t;
                newLorry.numOfDays = Integer.valueOf(days.getText());
                JOptionPane.showMessageDialog(null, "Lorry Added \n\n" + "Reg No: " + newLorry.regNumber + "\nWeight: " + lorryWeight.getText() + "\nNumber of days: " + days.getText()+"\nCharge : "+newLorry.calcCharge());
                dispose();
            }
             else 
            {
                JOptionPane.showMessageDialog(null, lorryValidation());
            }
        } 
    }
}
