package carparking;

public class Coach extends Vehicle
{
    int numOfPassengers;
    boolean touristOperator;
    boolean valid = false;
    
    Coach()
    {
        regNumber = null;
        numOfPassengers = 4;
        touristOperator = true;
    }
    
    Coach(int np, boolean touristOp, String rn)
    {
        super();
        numOfPassengers = np;
        touristOperator = touristOp;
        charge = calcCharge();
    }
    
    @Override
    public double calcCharge()
    {        
        if (numOfPassengers < 20)
        {
            charge = 4.50;
        }
        if (numOfPassengers > 20)
        {
            charge = 6.00;
        }
        if (touristOperator == true)
        {
            charge = charge * 0.90;
            return charge;
        }
        
        return charge;
 
    }
    
    public String toString()
    {
        return super.toString() + this.calcCharge() + "  " + "Number of passengers: " + numOfPassengers;
    }
}
