package carparking;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author q5047119
 */
public class carParkRecords implements Serializable
{
    Car[] car;
    Lorry[] lorry;
    Coach[] coach;
    ObjectOutputStream output;
    FileOutputStream test;
    
    carParkRecords()
    {
        
    }
    
    carParkRecords(Car[] car, Lorry[] lorry, Coach[] coach) throws FileNotFoundException, IOException
    {
        this.car = car;
        this.lorry = lorry;
        this.coach = coach;
       
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("myfile.dat"));
        
        output.writeObject(this);
        output.close();    
    }
/**
 * this method gets the car info
 * @return 
 */
    public Car[] getCar()
    {
        return car;
    }
/**
 * This method gets the lorry info
 * @return 
 */
    public Lorry[] getLorry()
    {
        return lorry;
    }
/**
 * this method gets the coach info
 * @return 
 */
    public Coach[] getCoach()
    {
        return coach;
    }
/**
 * This is my load method, reads my object from my .dat file which i save in the constructor
 * @throws FileNotFoundException
 * @throws IOException
 * @throws ClassNotFoundException 
 */
    public void load() throws FileNotFoundException, IOException, ClassNotFoundException
    {
          
       ObjectInputStream input = new ObjectInputStream( new FileInputStream("myfile.dat"));
       carParkRecords newRecords = (carParkRecords)input.readObject();
       
       if(newRecords.car != null)
       {      
           this.car = newRecords.car;
       }
       if(newRecords.lorry != null)
       {      
           this.lorry = newRecords.lorry;
       }
       if(newRecords.coach != null)
       {       
           this.coach = newRecords.coach;
       }
    }
}
