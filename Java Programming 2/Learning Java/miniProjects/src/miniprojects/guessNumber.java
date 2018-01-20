package miniprojects;

import java.util.Scanner;

public class guessNumber
{
        static void display()
        {
                System.out.print("Guess a number between (1-100): ");
        }
        static void difficulty()
        {
            System.out.println("Difficulty:\nEasy = 1\nMedium = 2\nHard = 3\n");
            System.out.println("Enter your difficulty level (1-3):");
        }
    public static void main(String[] args)
    {
        Scanner keyb = new Scanner(System.in);
        int attempts = 20;
        boolean correct = true;
        
        difficulty();
        int entry = keyb.nextInt();
        display();
        int num =keyb.nextInt();
        
        while (correct)
        {
            if (entry == 1)
            {
                attempts = 20;
            }
            else if (entry == 2)
            {
                attempts = 15;
            }
            else if (entry == 3)
            {
                attempts = 7;
            }
                attempts--;
                if (num == 56)
                        {
                            System.out.println("You have guessed the correct num: ");
                            System.out.println("Number of attempts: "+(20 - attempts));
                            correct = false;
                        }
                else
                {
                    if (num > 56)
                    {
                        System.out.println("too high");
                    }
                    else
                    {
                        System.out.println("too low");
                    }
                    System.out.println("Wrong num, try again\nNumber of attempts left: "+attempts+"\n");
                    display();
                    num = keyb.nextInt();
                }   
        }
    } 
}
