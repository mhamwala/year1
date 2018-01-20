


package schoolprogramme;

import java.util.*;

public class EasyScanner
{
    private static Scanner keyboard = new Scanner(System.in);

	public static int nextInt()
	{
		int i = keyboard.nextInt();
		return i;
	}

	public static double nextDouble()
	{
		double d = keyboard.nextDouble();
		return d;
	}

	public static String nextWord()
	{
		String s = keyboard.next();
		return s;
	}
        
        public static String nextLine()
	{
		String s = keyboard.nextLine();
		return s;
	}

	public static char nextChar()
	{
		char c = keyboard.next().charAt(0);
		return c;
	}
}
