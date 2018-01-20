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
    /**
     * This is my Lorry calcCharge which i, override through my Vehicle class and 
     * call in my myPanel class
     * @return 
     */
    public double calcCharge()
    {
        double charge = 0;
        
        if (weight < 20)
        {
            charge = 5.00 * numOfDays;
        }
        else if (weight > 20)
        {
            charge = 8.00 * numOfDays;
        }
        return charge;
    }
    
     public String toString()
    {
        return super.toString() + this.calcCharge() + "  " + "Weight: " + weight;
    }
}
