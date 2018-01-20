package carparking;

public class Lorry extends Vehicle
{   
    int weight;
    int numOfDays;
    boolean valid = false;
    
    Lorry()
    {
        weight = 10;
        numOfDays = 5;
    }
    
    Lorry(int w, int numberOfDays, String rn)
    {
        super(rn);
        weight = w;
        numOfDays = numberOfDays;
        charge= calcCharge();
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public double calcCharge()
    {
        double charge = 0;
        
        if (weight < 20)
        {
            charge = numOfDays * 5;
        }
        else if (weight > 35)
        {
            charge = numOfDays * 8;
        }
        if (weight > 35)
        {
            return charge;
        }
        return charge;
    }
    
     public String toString()
    {
        return super.toString() + this.calcCharge() + "  " + "Weight: " + weight;
    }
}
