package ica;

public class Policy
{
    private String fName;
    private String lName;
    private String ref;
    private int items;
    private int gadgetPrice;
    private double prices;
    private double chooseExcess;
    private double excessPremium;
    private double payment;
    private double summary;
    private String getDate;
    private String terms;

    Policy()
    {
        fName = null;
        lName = null; 
        ref = null;
        items = 0;
        gadgetPrice = 0;
        prices = 0;
        chooseExcess = 0;
        excessPremium = 0;
        payment = 0;
        summary = 0;
        getDate = null;
        terms = null;
    }

    Policy(String fName, String lName, String ref, int items, int gadgetPrice, double prices,
            double chooseExcess, double excessPremium, int payment, double summary, String getDate, String terms)
    {
        this.fName = fName;
        this.lName = lName;
        this.ref = ref;
        this.items = items;
        this.gadgetPrice = gadgetPrice;
        this.prices = prices;
        this.chooseExcess = chooseExcess;
        this.excessPremium = excessPremium;
        this.payment = payment;
        this.summary = summary;
        this.getDate = getDate;
        this.terms = terms;
    }

    public String getlName()
    {
        return lName;
    }

    public void setlName(String lName)
    {
        this.lName = lName;
    }

    public String getTerms()
    {
        return terms;
    }

    public void setTerms(String terms)
    {
        this.terms = terms;
    }

    public String getGetDate()
    {
        return getDate;
    }

    public void setGetDate(String getDate)
    {
        this.getDate = getDate;
    }
    
    public void setRef(String ref)
    {
        this.ref = ref;
    }

    public void setChooseExcess(double chooseExcess)
    {
        this.chooseExcess = chooseExcess;
    }

    public String getRef()
    {
        return ref;
    }

    public double getChooseExcess()
    {
        return chooseExcess;
    }

    public String getfName()
    {
        return fName;
    }

    public void setfName(String fName)
    {
        this.fName = fName;
    }

    public int getItems()
    {
        return items;
    }

    public void setItems(int items)
    {
        this.items = items;
    }

    public int getGadgetPrice()
    {
        return gadgetPrice;
    }

    public void setGadgetPrice(int gadgetPrice)
    {
        this.gadgetPrice = gadgetPrice;
    }

    public double getPrices()
    {
        return prices;
    }

    public void setPrices(double prices)
    {
        this.prices = prices;
    }

    public double getExcessPremium()
    {
        return excessPremium;
    }

    public void setExcessPremium(double excessPremium)
    {
        this.excessPremium = excessPremium;
    }

    public double getPayment()
    {
        return payment;
    }

    public void setPayment(double payment)
    {
        this.payment = payment;
    }
    
    public double getSummary()
    {
        return summary;
    }

    public void setSummary(double summary)
    {
        this.summary = summary;
    }
}
