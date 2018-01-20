package ica;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class PolicyManager
{

    public static void main(String[] args)
    {
        menu();
    }

    public static void menu()
    {
        Scanner keyb = new Scanner(System.in);
        Policy p1 = new Policy();
        int textFile = 0;

        System.out.println("-MENU-\n");
        System.out.println("1. Enter new Policy: \n"
                + "2. Display Summary of Policies: \n"
                + "3. Display Summary of Policies for Selected Month: \n"
                + "4. Find and display Policy: \n"
                + "0. Exit: \n");

        int option = keyb.nextInt();

        while (option < 0 || option > 4)
        {
            System.out.println("\nInvalid choice, please pick option 0 - 4: \n");
            menu();
        }

        if (option == 1)
        {
            optionOne();
            menu();
        } else if (option == 2)
        {
            System.out.println("Would you like to read from the policy or archive?"
                    + "\n1 = Archive : Policy = 2: ");
            textFile = keyb.nextInt();

            while (textFile != 1 && textFile != 2)
            {
                System.out.println("\"Would you like to read from the policy or archive?" +
"                    \nPlease select 1 or 2\n1 = Archive : Policy = 2: ");
                textFile = keyb.nextInt();
            }
            displayPolicys(p1, textFile);
            menu();
        } else if (option == 3)
        {
            System.out.println("\n1 = Archive : Policy = 2: ");
            textFile = keyb.nextInt();

            while (textFile != 1 && textFile != 2)
            {
                System.out.println("\nPlease select 1 or 2\n1 = Archive : Policy = 2: ");
                textFile = keyb.nextInt();
            }
            optionThree(textFile);
            menu();
        } else if (option == 4)
        {
            System.out.println("\nOption 4 is incomplete!\nComing soon...\n");
            menu();
        } else if (option == 0)
        {
            System.out.println("\nGoodbye!...");
            System.exit(0);
        }
    }

    public static void optionOne()
    {
        Policy p1 = new Policy();

        String clientName = fName();
        p1.setfName(clientName);

        String lname = lName();
        p1.setlName(lname);

        String ref = ref();
        p1.setRef(ref);

        int numItems = items();
        p1.setItems(numItems);

        int gadget = gadgetPrice();
        p1.setGadgetPrice(gadget);

        double price = prices(numItems, gadget);
        p1.setPrices(price);

        int excess = chooseExcess();
        p1.setChooseExcess(excess);

        String choice = "";
        choice = terms(choice);
        p1.setTerms(choice);

        double finalPremium = payment(excess, price, choice);
        p1.setPayment(finalPremium);

        summary(finalPremium);
        p1.setSummary(finalPremium);

        String date = getDate();
        p1.setGetDate(date);

        display(p1);
        SavePolicy(p1);
    }

    public static void SavePolicy(Policy p1)
    {
        String terms = "";
        if ((p1.getSummary() == 0.00))
        {
            terms = "R";
        } else if ((p1.getTerms().matches("[M]*")) || (p1.getTerms().matches("[m]*")))
        {
            terms = "M";
        } else if ((p1.getTerms().matches("[A]*")) || (p1.getTerms().matches("[a]*")))
        {
            terms = "A";
        }

        try
        {
            File polfile = new File("Policy.txt");
            FileWriter fw = new FileWriter(polfile, true);

            PrintWriter output = new PrintWriter(fw);

            output.printf("\n%s\t" + "%s\t" + "%d\t" + "%d\t" + "%.2f\t" + "%.2f\t" + "%s\t" + "%s" + " " + "%1s",
                    p1.getGetDate(), p1.getRef(), p1.getItems(),
                    p1.getGadgetPrice(), p1.getChooseExcess(),
                    p1.getSummary(), terms, p1.getfName().charAt(0), p1.getlName());
            output.println();

            output.close();
        } catch (IOException e)
        {
            System.out.println("couldn't read file ");
        }
        menu();

    }
    public static String getMonth(){
        Scanner keyb = new Scanner(System.in);
        String month = "";
        System.out.println("\nPlease enter your month, 3 letter format starting with a captial letter: ");
        month = keyb.next();
        
        while (!month.matches("Jan")&&!month.matches("Feb")&&!month.matches("Mar")&&!month.matches("Apr")&&!month.matches("May")&&
                !month.matches("Jun")&&!month.matches("Jul")&&!month.matches("Aug")&&!month.matches("Sep")&&!month.matches("Oct")&&
                !month.matches("Nov")&&!month.matches("Dec"))
        {
            System.out.println("\nIncorrect format, please enter a 3 letter format starting with a captial letter: \n");
            month = keyb.next();
        }
        return month;
    }
    
    public static void optionThree(int textFile)
    {
        Scanner in = null;
        Scanner keyb = new Scanner(System.in);
        String month = getMonth();
        
        try
        {
            if (textFile == 2)
            {
                File PolicyReader = new File("Policy.txt");
                in = new Scanner(PolicyReader);
            } else if (textFile == 1)
            {
                File archiveReader = new File("archive.txt");
                in = new Scanner(archiveReader);
            }
            else
            {
                File archiveReader = new File("archive.txt");
                in = new Scanner(archiveReader);
            }

            int acceptedPolicies = 0;
            int totalPremium = 0;
            int declinedPolicies = 0;
            double monthlyPremium = 0;
            double averageMonthlyPremium = 0;
            int totalItems = 0;
            int acceptedMonthlyPolicies = 0;

            while (in.hasNext())
            {
                String date = in.next();
                String ref = in.next();
                int items = in.nextInt();
                int gadget = in.nextInt();
                double excess = in.nextDouble();
                double premium = in.nextDouble(); //Premuim 1 for Annaul 2 for monthly
                String terms = in.next();
                String name = in.next();
                String lname = in.next();
                
           if(month.equals(date.substring(3,6))){
               if (premium > 0)
               {
               acceptedPolicies++;
               totalItems = totalItems + items;
               monthlyPremium = monthlyPremium + premium;  
               }
           }
            }
            monthlyPremium = monthlyPremium /100;
             int monthlyItems = totalItems / acceptedPolicies;
        averageMonthlyPremium = monthlyPremium / acceptedPolicies;

        System.out.println("\nTotal Number of Policies: " + acceptedPolicies);
        System.out.println("Average Number of items (Accepted Policies): " + monthlyItems);
        System.out.printf("Average Premium: %.2f\n\n", averageMonthlyPremium);
    }
    catch (IOException e)
        {
            System.out.println("Couldn't read: ");
    }
    }

    public static void displayPolicys(Policy p1, int textFile)
    {
        Scanner in = null;
        Scanner keyb = new Scanner(System.in);
        
        try
        {
            if (textFile == 2)
            {
                File PolicyReader = new File("Policy.txt");
                in = new Scanner(PolicyReader);
            } else if (textFile == 1)
            {
                File archiveReader = new File("archive.txt");
                in = new Scanner(archiveReader);
            }
            else
            {
                File archiveReader = new File("archive.txt");
                in = new Scanner(archiveReader);
            }

            int acceptedPolicies = 0;
            int totalPremium = 0;
            int declinedPolicies = 0;
            double monthlyPremium = 0;
            double averageMonthlyPremium = 0;
            int totalItems = 0;
            int acceptedMonthlyPolicies = 0;

            int JanPolicy = 0;
            int FebPolicy = 0;
            int MarPolicy = 0;
            int AprPolicy = 0;
            int MayPolicy = 0;
            int JunPolicy = 0;
            int JulPolicy = 0;
            int AugPolicy = 0;
            int SepPolicy = 0;
            int OctPolicy = 0;
            int NovPolicy = 0;
            int DecPolicy = 0;

            while (in.hasNext())
            {
                String date = in.next();
                String ref = in.next();
                int items = in.nextInt();
                int gadget = in.nextInt();
                double excess = in.nextDouble();
                double premium = in.nextDouble(); //Premuim 1 for Annaul 2 for monthly
                String terms = in.next();
                String name = in.next();
                String lname = in.next();

                totalPremium++;

                if (premium > 0) //accepted premium
                {
                    totalItems = totalItems + items;
                    acceptedPolicies++;
                    if ((terms.matches("[M]*")) || (terms.matches("[m]*"))) // if annual premium
                    {
                        monthlyPremium = monthlyPremium + premium;
                        acceptedMonthlyPolicies++;
                    }
                } else //declined Premium
                {
                    declinedPolicies++;
                }

                if (null != date.substring(3, 6))
                {
                    switch (date.substring(3, 6))
                    {
                        case "Jan":
                            JanPolicy++;
                            break;
                        case "Feb":
                            FebPolicy++;
                            break;
                        case "Mar":
                            MarPolicy++;
                            break;
                        case "Apr":
                            AprPolicy++;
                            break;
                        case "May":
                            MayPolicy++;
                            break;
                        case "Jun":
                            JunPolicy++;
                            break;
                        case "Jul":
                            JulPolicy++;
                            break;
                        case "Aug":
                            AugPolicy++;
                            break;
                        case "Sep":
                            SepPolicy++;
                            break;
                        case "Oct":
                            OctPolicy++;
                            break;
                        case "Nov":
                            NovPolicy++;
                            break;
                        case "Dec":
                            DecPolicy++;
                            break;
                    }
                }
            }

        int monthlyItems = totalItems / acceptedPolicies;
        averageMonthlyPremium = monthlyPremium / acceptedMonthlyPolicies;

        System.out.println("\nTotal Number of Policies: " + totalPremium);
        System.out.println("Average Number of items (Accepted Policies): " + monthlyItems);
        System.out.printf("Average Monthly premium: %.2f\n", averageMonthlyPremium);
        System.out.println("Number of Policies per month (inc. non accepted: ): \n\nJan\t"
                + "Feb\tMar\tApr\tMay\tJun\tJul\tAug\tSep\tOct\tNov\tDec\n" + JanPolicy
                + "\t" + FebPolicy + "\t" + MarPolicy + "\t" + AprPolicy + "\t" + MayPolicy
                + "\t" + JunPolicy + "\t" + JulPolicy + "\t" + AugPolicy + "\t" + SepPolicy + "\t"
                + OctPolicy + "\t" + NovPolicy + "\t" + DecPolicy + "\n");
    }
    catch (IOException e )
        {
            System.out.println("Couldn't read: ");
    }
}

public static String fName()//Gets clients name
    {
        Scanner keyb = new Scanner(System.in);

        System.out.print("\nPlease enter your first name: ");
        String fName = keyb.next();

        while (fName.length() > 20 || fName.length() < 1)
        {
            System.out.println("Name must be less than 20 and greater than 1 char(s) long:\n\nPlease re-enter first name: ");
            fName = keyb.next();
        }

        fName = fName.toUpperCase();

        return fName;
    }

    public static String lName()//Gets clients name
    {
        Scanner keyb = new Scanner(System.in);

        System.out.print("\nPlease enter your last name: ");
        String lName = keyb.next();

        while (lName.length() > 20 || lName.length() < 1)
        {
            System.out.println("Name must be less than 20 and greater than 1 char(s) long:\n\nPlease re-enter last name: ");
            lName = keyb.next();
        }
        lName = lName.toUpperCase();

        return lName;
    }

    public static String ref()
    {//Gets the reference number and validates each charecter input and whether its long enough 
        Scanner keyb = new Scanner(System.in);
        String ref;

        System.out.print("\nPlease enter a valid reference number, e.g. DF456T: ");
        ref = keyb.next();
        boolean valid = false;

        while (!valid)
        {
            valid = true;
            if (ref.length() != 6)
            {
                System.out.println("\nReference number should be 6 chars long!");
                valid = false;
            } else if (!Character.isLetter(ref.charAt(0)) || !Character.isLetter(ref.charAt(1))
                    || !Character.isDigit(ref.charAt(2)) || !Character.isDigit(ref.charAt(3))
                    || !Character.isDigit(ref.charAt(4)) || !Character.isLetter(ref.charAt(5)))
            {
                System.out.println("Reference number should follow this format 'LLDDDL'\nL = Letter D = Digit");
                valid = false;
            }
            if (!valid)
            {
                System.out.println("Please enter reference number: e.g. DF456T:");
                ref = keyb.next();
            }
            ref = ref.toUpperCase();
        }
        return ref;
    }//End of getReference method

    public static int items()
    {
        Scanner keyb = new Scanner(System.in);
        int numItems;

        System.out.print("\nEnter number of items: ");
        numItems = keyb.nextInt();

        return numItems;
    }

    public static int gadgetPrice()
    {
        Scanner keyb = new Scanner(System.in);
        int gadget;

        System.out.print("\nEnter most expensive gadget: ");
        gadget = keyb.nextInt();

        return gadget;
    }

    public static String terms(String choice)
    {
        Scanner keyb = new Scanner(System.in);

        System.out.print("\nWould you like to pay [A:] Annually or [M:] Monthly: ");
        choice = keyb.next();

        while ((!choice.matches("[A]*")) && (!choice.matches("[a]*"))
                && (!choice.matches("[M]*")) && (!choice.matches("[m]*")))
        {
            System.out.println("Invalid choice please enter [A:] for annual or [M:] for monthly: ");
            choice = keyb.next();
        }
        return choice;
    }

    public static double payment(int excess, double price, String choice)
    {
        Scanner keyb = new Scanner(System.in);
        double annualPrice;
        double finalPremium = 0;
        double premium = excessPremium(excess, price);

        if ((choice.matches("[A]*")) || (choice.matches("[a]*"))) //choice option 1 is annual payment and multiplys the premuim by 12!
        {
            annualPrice = annualPayment();
            finalPremium = annualPrice * premium;
        } else if ((choice.matches("[M]*")) || (choice.matches("[m]*"))) //choice option 2 is monthly payment!
        {
            finalPremium = excessPremium(excess, price);
        }
        return finalPremium;
    }

    public static int chooseExcess()
    {
        Scanner keyb = new Scanner(System.in);
        int exAmount;

        System.out.print("\nEnter the excess amount: ");
        exAmount = keyb.nextInt();

        while (exAmount < 30 || exAmount > 70)
        {
            System.out.println("Excess amount must be between £30 and £70, Re-enter: ");
            exAmount = keyb.nextInt();
        }
        return exAmount;
    }

    public static double prices(int numItems, int gadget)
    {
        double price = 0;
        if (numItems <= 1)
        {
            if (gadget <= 550)
            {
                price = 4.99;
            } else if (gadget <= 800)
            {
                price = 6.15;
            } else if (gadget <= 1000)
            {
                price = 7.30;
            }
        } else if (numItems <= 3)
        {
            if (gadget <= 550)
            {
                price = 9.99;
            } else if (gadget <= 800)
            {
                price = 12.35;
            } else if (gadget <= 1000)
            {
                price = 14.55;
            }
        } else if (numItems <= 5)
        {
            if (gadget <= 550)
            {
                price = 14.99;
            } else if (gadget <= 800)
            {
                price = 18.60;
            } else if (gadget <= 1000)
            {
                price = 21.82;
            }
        }
        return price;
    }//end prices method

    public static double excessPremium(int excess, double price)
    {
        double totalPremium = 0;
        if (excess == 40)
        {
            totalPremium = price * 0.95;
        } else if (excess == 50)
        {
            totalPremium = price * 0.90;
        } else if (excess == 60)
        {
            totalPremium = price * 0.85;
        } else if (excess == 70)
        {
            totalPremium = price * 0.80;
        } else if (excess == 30)
        {
            totalPremium = price;
        }
        return totalPremium;
    } //end chooseExcess method

    public static double annualPayment()
    {
        double annualPrice;
        annualPrice = 0.90 * 12;
        return annualPrice;
    }//end annualPayment method

    public static double summary(double finalPremium)
    {
        return finalPremium;
    }

    public static String getDate()
    {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        return sdf.format(cal.getTime());
    }//end getDate method!

    public static void display(Policy p1)
    {
        String items;
        String choice = "";
        String terms = "";
        int gadget;

        String formattedDate = getDate();

        if ((p1.getTerms().matches("[A]*")) && (p1.getTerms().matches("[a]*")))
        {
            terms = "Annual";
        } else if ((p1.getTerms().matches("[M]*")) && (p1.getTerms().matches("[m]*")))
        {
            terms = "Monthly";
        }

        switch (p1.getItems())
        {

            case 1:
                items = "One";
                break;
            case 2:
                items = "Two";
                break;
            case 3:
                items = "Three";
                break;
            case 4:
                items = "Four";
                break;
            case 5:
                items = "Five";
                break;
            default:
                items = Integer.toString(p1.getItems());
                break;
        }

        if (p1.getGadgetPrice() <= 550)
        {
            gadget = 550;
        } else if (p1.getGadgetPrice() <= 800)
        {
            gadget = 800;
        } else if (p1.getGadgetPrice() <= 1000)
        {
            gadget = 1000;
        }

        System.out.println("\n+===============================================+");
        System.out.println("|                                               |");
        System.out.printf("| Client: %-1s %-35s |", p1.getfName().charAt(0), p1.getlName());
        System.out.println("\n|                                               |");
        System.out.printf("| Date: %-11s                 ref: %3s |", formattedDate, p1.getRef());
        System.out.printf("\n| Terms: %-11s              Items: %6s |", terms, items);
        System.out.printf("\n| Excess: £%-35.2f  |", p1.getChooseExcess());
        System.out.println("\n|                                               |");

        // This if-else statement checks if theres a invalid policy and returns rejected if the policy is out of bounds  
        if ((p1.getItems() < 1 || p1.getItems() > 5) || (p1.getGadgetPrice()) < 1 || (p1.getGadgetPrice() > 1000))
        {
            System.out.printf("|                                               |", terms);
            System.out.printf("\n|                Policy rejected...             |");
            System.out.println("\n|         invalid number of Gadgets/Items       |");
        } else
        {
            System.out.printf("| %-11s                 Limit per         |", terms);
            System.out.printf("\n| Premium: £%-11.2f          Gadget: %6d |", p1.getSummary(), p1.getGadgetPrice());
            System.out.println("\n|                                               |");
        }
        System.out.println("+===============================================+\n");
    }//End of Display method

}
