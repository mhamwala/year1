package foodmenu;

/*
 * Description: This java class is a general description of one meal served at a restaurant. 
 * JP2 class - March 2015
*/

class Meal 
{
	// Instance variables
	double price;

	// Constructor
	public Meal(double p)
	{
		price = p;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double p)
	{
		price = p;
	}

	public String getMenuDescription()
	{
		return "A delicious home cooked meal for only " + price + " pounds."; 
	}
}
