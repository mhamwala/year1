package carparking;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author q5047119
 */
public class myPanel extends JPanel implements ActionListener, MouseListener
{

    JLabel[] lorries = new JLabel[4];
    JLabel[] cars = new JLabel[12];
    JLabel CarGrid;

    int carCount = 0;
    int vehicleCount = 0;

    double overallTotal;
    double total;

    Car[] carList = new Car[12];
    Lorry[] lorryList = new Lorry[4];
    Coach[] coachList = new Coach[4];

    JButton addCar, addLorry, addCoach, Clear, Load, Save, currTotal, dailyTotal;

    JLabel view;

    JPanel left;

    ImageIcon carImage, coachImage, lorryImage;
    carParkRecords records;
/**
 * myPanel constructor which stores my GUI 
 */
    myPanel()
    {
        this.setLayout(new BorderLayout());

        JPanel carPanel = new JPanel();
        JPanel coachPanel = new JPanel();
        JPanel southPanel = new JPanel();
        JPanel southWestPanel = new JPanel();
        JPanel southEastPanel = new JPanel();
        JPanel southCenterPanel = new JPanel();
        JPanel centerRect = new JPanel(new GridLayout());
        JPanel northRect = new JPanel(new GridLayout());

        JLabel CoachGrid = new JLabel();

        Dimension Coach = new Dimension(800, 325);
        Dimension Car = new Dimension(800, 225);
        Dimension button = new Dimension(800, 50);
        Dimension center = new Dimension(770, 275);
        Dimension north = new Dimension(770, 210);
        Dimension centerGrid = new Dimension(100, 200);
        Dimension northGrid = new Dimension(100, 60);

        //Car-Panel
        carPanel.setPreferredSize(Car);
        carPanel.setOpaque(true);
        carPanel.setBackground(Color.BLACK);

        //Coach-Panel
        coachPanel.setPreferredSize(Coach);
        coachPanel.setOpaque(true);
        coachPanel.setBackground(Color.BLACK);

        // Rectangle inside Coach Panel
        centerRect.setPreferredSize(center);
        centerRect.setOpaque(true);
        centerRect.setBackground(Color.BLACK);

        // Rectangle inside Car Panel
        northRect.setPreferredSize(north);
        northRect.setOpaque(true);
        northRect.setBackground(Color.BLACK);

        //GRID FOR COACHES
        CoachGrid.setPreferredSize(center);
        CoachGrid.setBackground(Color.WHITE);
        //This for loop add coaches to the CoachGrid.
        CoachGrid.setLayout(new GridLayout(0, 4, 2, 2));
        for (int i = 0; i < 4; i++)
        {
            lorries[i] = new JLabel();
            lorries[i].setBackground(Color.LIGHT_GRAY);
            lorries[i].setOpaque(true);
            lorries[i].addMouseListener(this);
            CoachGrid.add(lorries[i]);
        }
        CoachGrid.setOpaque(true);

        //This for loop add cars to the CarGrid.
        CarGrid = new JLabel();
        CarGrid.setBackground(Color.WHITE);
        CarGrid.setLayout(new GridLayout(3, 2, 2, 2));

        for (int i = 0; i < 12; i++)
        {
            cars[i] = new JLabel();
            cars[i].setBackground(Color.DARK_GRAY);
            cars[i].setOpaque(true);
            cars[i].addMouseListener(this);
            CarGrid.add(cars[i]);
        }
        CarGrid.setOpaque(true);

        southPanel.setPreferredSize(button);

        southWestPanel.setOpaque(true);
        southWestPanel.setBackground(Color.BLACK);
        southCenterPanel.setOpaque(true);
        southCenterPanel.setBackground(Color.black);
        southEastPanel.setOpaque(true);
        southEastPanel.setBackground(Color.BLACK);
        southPanel.setBackground(Color.WHITE);

        //Adding each button to one of three panels inside southPanel
        southWestPanel.add(addCar = new JButton("Add Car "), BorderLayout.WEST);
        southWestPanel.add(addLorry = new JButton("Add Lorry "), BorderLayout.WEST);
        southWestPanel.add(addCoach = new JButton("Add Coach "), BorderLayout.WEST);
        southWestPanel.add(Clear = new JButton("Clear all "), BorderLayout.WEST);
        southCenterPanel.add(Save = new JButton("Save "), BorderLayout.CENTER);
        southCenterPanel.add(Load = new JButton("Load "), BorderLayout.CENTER);
        southEastPanel.add(currTotal = new JButton("Current Total "), BorderLayout.EAST);
        southEastPanel.add(dailyTotal = new JButton("Daily Total "), BorderLayout.EAST);

        southPanel.add(southWestPanel);
        southPanel.add(southCenterPanel);
        southPanel.add(southEastPanel);
        centerRect.add(CoachGrid);
        northRect.add(CarGrid);
        carPanel.add(northRect);
        coachPanel.add(centerRect, BorderLayout.CENTER);

        this.add(carPanel, BorderLayout.NORTH);
        this.add(coachPanel, BorderLayout.CENTER);
        this.add(southPanel, BorderLayout.SOUTH);

        addCar.addActionListener(this);
        addLorry.addActionListener(this);
        addCoach.addActionListener(this);
        Clear.addActionListener(this);
        currTotal.addActionListener(this);
        dailyTotal.addActionListener(this);
        Save.addActionListener(this);
        Load.addActionListener(this);

        carImage = new ImageIcon("ParkingImages/car3.png");
        lorryImage = new ImageIcon("ParkingImages/truck3.png");
        coachImage = new ImageIcon("ParkingImages/coach.jpg");
    }
/**
 * This method updates my currentTotal button
 * @return 
 */
    public double currentTotal()
    {
        total = 0;
        for (int i = 0; i < 12; i++)
        {
            if (carList[i] != null)
            {
                total = total + carList[i].calcCharge();
            }
        }
        for (int i = 0; i < 4; i++)
        {
            if (lorryList[i] != null)
            {
                total = total + lorryList[i].calcCharge();
            }
        }
        for (int i = 0; i < 4; i++)
        {
            if (coachList[i] != null)
            {
                total = total + coachList[i].calcCharge();
            }
        }
        return total;
    }
/**
 * Action performed method for my GUI buttons, - JButton addCar, addLorry, addCoach, Clear, Load, Save, currTotal, dailyTotal; 
 * @param e 
 */
    public void actionPerformed(ActionEvent e)
    {
        currentTotal();
        carCount = 0;
        while (carList[carCount] != null)
        {
            carCount++;
        }
        if (e.getSource() == addCar)
        {
            if (carCount < 12)
            {
                carList[carCount] = new Car();
                Dialogue car = new Dialogue(carList[carCount]);
                if (carList[carCount].valid)
                {
                    overallTotal = overallTotal + carList[carCount].calcCharge();
                    cars[carCount].setIcon(carImage);
                    carCount++;
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Car Parking spaces are full");
            }
        }

        if (e.getSource() == addLorry || e.getSource() == addCoach)
        {
            vehicleCount = 0;
            if (e.getSource() == addLorry)
            {
                while (lorryList[vehicleCount] != null || coachList[vehicleCount] != null)
                {
                    vehicleCount++;
                }
                if (vehicleCount < 4)
                {
                    lorryList[vehicleCount] = new Lorry();
                    Dialogue lorry = new Dialogue(lorryList[vehicleCount]);
                    if (lorryList[vehicleCount].valid)
                    {
                        overallTotal = overallTotal + lorryList[vehicleCount].calcCharge();
                        lorries[vehicleCount].setIcon(lorryImage);
                        vehicleCount++;
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Large vechicle parking spaces are full");
                }
            }
            if (e.getSource() == addCoach)
            {
                while (coachList[vehicleCount] != null || lorryList[vehicleCount] != null)
                {
                    vehicleCount++;
                }

                if (vehicleCount < 4)
                {
                    coachList[vehicleCount] = new Coach();
                    Dialogue coach = new Dialogue(coachList[vehicleCount]);
                    if (coachList[vehicleCount].valid)
                    {
                        overallTotal = overallTotal + coachList[vehicleCount].calcCharge();
                        lorries[vehicleCount].setIcon(coachImage);
                        vehicleCount++;
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Large vechicle parking spaces are full");
                }
            }
        }
        if (e.getSource() == Clear)
        {
            //This loops around each lorries and clears the ImageIcon
            for (int i = 0; i < 4; i++)
            {
                lorries[i].setIcon(null);
            }
            vehicleCount = 0;

            //This loops around each car and clears the ImageIcon
            for (int i = 0; i < 12; i++)
            {
                cars[i].setIcon(null);
            }
            carCount = 0;
        }
        if (e.getSource() == currTotal)
        {
            double a = currentTotal();
            JOptionPane.showMessageDialog(null, "Current Total is: " + a);
        }
        if (e.getSource() == dailyTotal)
        {
            JOptionPane.showMessageDialog(null, "Daily Total is: " + overallTotal);
        }
        if (e.getSource() == Save)
        {
            try
            {
                records = new carParkRecords(carList, lorryList, coachList);

            } catch (IOException ex)
            {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }

        if (e.getSource() == Load)
        {
            JOptionPane.showMessageDialog(null, "Loading file.. ");
            try
            {
                records.load();
            } catch (IOException ex)
            {
                JOptionPane.showMessageDialog(null, "There was a problem loading the file");
            } catch (ClassNotFoundException ex)
            {
                JOptionPane.showMessageDialog(null, "Can not find the class");
            }

            carList = records.car;
            lorryList = records.lorry;
            coachList = records.coach;

            resetGrid();
            currentTotal();
        }
    }
/**
 * Mouse listener looks after my left,middle and right click methods
 * @param e 
 */
    public void mouseClicked(MouseEvent e)
    {
        int button = e.getButton();
        if (button == 1)
        {
            for (int i = 0; i < 12; i++)
            {
                if (e.getSource() == cars[i])
                {
                    boolean a = carList[i].disabledBadge;
                    int b = carList[i].length;
                    int c = carList[i].numOfHours;
                    double d = carList[i].calcCharge();

                    if (a == true)
                    {
                        JOptionPane.showMessageDialog(null, "Details for car in parking space: " + i + 1 + "\n\nDisabled badge: " +
                                "Yes" + "\nLength: " + b + "\nNumber of Hours: " + c + "\nCharge: " + d);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Details for car in parking space: " + i + 1 + "\n\nDisabled badge: " + "No" + "\nLength: " + b + "\nNumber of Hours: " + c + "\nCharge: " + d);
                    }
                }
            }
            for (int i = 0; i < 4; i++)
            {
                if (e.getSource() == lorries[i])
                {
                    if (lorryList[i] != null)
                    {
                        double a = lorryList[i].weight;
                        int b = lorryList[i].numOfDays;
                        double c = lorryList[i].calcCharge();
                        JOptionPane.showMessageDialog(null, "Details for car in parking space: " + i + 1 + "\n\nWeight: " + a + "\nNumber of days: " + b + "\nCharge: " + c);
                    }
                    else if (coachList[i] != null)
                    {
                        JOptionPane.showMessageDialog(null, "Number of passengers: " + coachList[i].numOfPassengers + "\nCharge: " + coachList[i].charge);
                    }
                }
            }
        } //Mouse Event for Middle Click 
        else if (button == 2)
        {
            for (int i = 0; i < 12; i++)
            {
                if (e.getSource() == cars[i])
                {
                    Double firstPrice = carList[i].charge;
                    Dialogue editCar = new Dialogue(carList[i], carList[i].regNumber, carList[i].disabledBadge, carList[i].numOfHours, carList[i].length);
                    Double afterPrice = carList[i].charge;

                    Double difference = afterPrice - firstPrice;
                    total = total + difference;
                }
            }
            for (int i = 0; i < 4; i++)
            {
                if (e.getSource() == lorries[i] && lorryList[i] != null)
                {

                    Double firstPrice = lorryList[i].charge;
                    Dialogue editLorry = new Dialogue(lorryList[i], lorryList[i].numOfDays, lorryList[i].regNumber, lorryList[i].weight, lorryList[i].charge);
                    Double afterPrice = lorryList[i].charge;

                    Double difference = afterPrice - firstPrice;
                    total = total + difference;
                }
            }
            for (int i = 0; i < 4; i++)
            {
                if (e.getSource() == lorries[i] && coachList[i] != null)
                {
                    Double firstPrice = coachList[i].charge;
                    Dialogue editCoach = new Dialogue(coachList[i], coachList[i].numOfPassengers, coachList[i].regNumber, coachList[i].touristOperator);
                    Double afterPrice = coachList[i].charge;

                    Double difference = afterPrice - firstPrice;
                    total = total + difference;

                } //Mouse Event for Right Click
            }
            currentTotal();
        }
        else if (button == 3)
        {
            for (int i = 0; i < 12; i++)
            {
                if (e.getSource() == cars[i])
                {
                    cars[i].setIcon(null);
                    carList[i] = null;
                }
            }
            for (int i = 0; i < 4; i++)
            {
                if (e.getSource() == lorries[i])
                {
                    lorries[i].setIcon(null);
                    coachList[i] = null;
                    lorryList[i] = null;
                }
            }
        }
    }

    public void mousePressed(MouseEvent e)
    {
    }

    public void mouseReleased(MouseEvent e)
    {
    }

    public void mouseEntered(MouseEvent e)
    {
    }

    public void mouseExited(MouseEvent e)
    {
    }

    private void resetGrid()
    {
        for (int i = 0; i < 12; i++)
        {
            if (carList[i] != null)
            {
                cars[i].setIcon(carImage);
            }
        }
        for (int i = 0; i < 4; i++)
        {
            if (lorryList[i] != null)
            {
                lorries[i].setIcon(lorryImage);
            }
        }
        for (int i = 0; i < 4; i++)
        {
            if (coachList[i] != null)
            {
                lorries[i].setIcon(coachImage);
            }
        }
    }
}
