// BankProgram
// JP2 class
// February 2015

package bankprogram;

public class BankProgram 
{
    public static void main(String[] args)
    {
        char choice;
        int size;
        System.out.print("Maximum number of accounts ? ");
        size = EasyScanner.nextInt();

        // create Bank object
        Bank myBank = new Bank(size);

        // offer menu
        do
        {
            System.out.println();
            System.out.println("1, Create new account");
            System.out.println("2, Remove an account");
            System.out.println("3, Deposit money");
            System.out.println("4, withdraw money");
            System.out.println("5, Check account details");
            System.out.println("6, Quit");
            System.out.println();
            System.out.print("Enter choice [1-6]: ");

            // get choice
            choice = EasyScanner.nextChar();
            System.out.println();

            // process menu options
            switch (choice)
            {
                case '1': newAccount(myBank);
                          break;
                case '2': removeAccount(myBank);
                          break;
                case '3': deposit(myBank);
                          break;
                case '4': withdraw(myBank);
                          break;
                case '5': checkDetails(myBank);
                          break;
                case '6': System.out.println("Goodbye");
                          break;
                default : System.out.println("Invalid entry");
            }
        }while (choice != '6');
    }// end of main()

    // add account
    static void newAccount(Bank bankIn)
    {
        // get details from user
        System.out.print("Enter account number: ");
        String number = EasyScanner.nextWord();
        System.out.print("Enter account name: ");
        String name = EasyScanner.nextWord();

        // create new account
        BankAccount account = new BankAccount(number, name);

        // add account to list
        boolean ok = bankIn.add(account);
        if (!ok)
        {
            System.out.println("The list is full");
        }
        else
        {
            System.out.println("Account created");
        }
    }// end of newAccount()

    // remove account
    static void removeAccount(Bank bankIn)
    {
        // get account number of account to remove
        System.out.print("Enter acount number: ");
        String number = EasyScanner.nextWord();

        // delete item if it exists
        boolean ok = bankIn.remove(number);
        if (!ok)
        {
            System.out.println("No such account number");
        }
        else
        {
            System.out.println("Account removed");
        }
    }// end of removeAccount()

    // deposit money in an account
    static void deposit(Bank bankIn)
    {
        // get details from user
        System.out.print("Enter account number: ");
        String number = EasyScanner.nextWord();

        System.out.print("Enter amount to deposit: ");
        double amount = EasyScanner.nextDouble();

        // attempt to deposit
        boolean ok = bankIn.depositMoney(number, amount);
        if (!ok)
        {
            System.out.println("No such account number");
        }
        else
        {
            System.out.println("Money deposited");
        }
    }// end of deposit()

    // withdraw money from an account
    static void withdraw(Bank bankIn)
    {
        // get details from user
        System.out.print("Enter account number: ");
        String number = EasyScanner.nextWord();

        System.out.print("Enter amount to withdraw: ");
        double amount = EasyScanner.nextDouble();

        // attempt to withdraw
        boolean ok = bankIn.withdrawMoney(number, amount);
        if (!ok)
        {
            System.out.println("No such account number or insufficient funds");
        }
        else
        {
            System.out.println("Money withdrawn");
        }
    }// end of withdraw()

    // check account details
    static void checkDetails(Bank bankIn)
    {
        // get details from user
        System.out.print("Enter account number: ");
        String number = EasyScanner.nextWord();

        BankAccount account = bankIn.getAccount(number);
        if (account == null)
        {
            System.out.println("No such account number");
        }
        else
        {
            System.out.println("Account number: " + account.getAccountNumber());
            System.out.println("Account name: " + account.getAccountName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println();
        }
    }// end of checkDetails()
}// end of class BankProgram
