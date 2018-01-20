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
 * @author arsen
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
       
        ObjectOutputStream output = new ObjectOutputStream( new FileOutputStream("myfile.dat"));
        
        output.writeObject(this);
        output.close();    
    }

    public Car[] getCar()
    {
        return car;
    }

    public Lorry[] getLorry()
    {
        return lorry;
    }

    public Coach[] getCoach()
    {
        return coach;
    }

    public void load() throws FileNotFoundException, IOException, ClassNotFoundException
    {
          
       ObjectInputStream input = new ObjectInputStream( new FileInputStream("myfile.dat"));
       carParkRecords newRecords = (carParkRecords)input.readObject();
       
       if(newRecords.car == null)
       {
       }
       else
       {
           this.car = newRecords.car;
       }
       if(newRecords.lorry == null)
       {
       }
       else
       {
           this.lorry = newRecords.lorry;
       }
       if(newRecords.coach == null)
       {
       }
       else
       {
           this.coach = newRecords.coach;
       }
    }
}
