/* Shantanu Tulshibagwale
 * 8/21/13
 * Promt.java
 * 
 * We will prompt the user to provide input from the keyboard.
 * We want to recover from "bad" input. We also would like to
 * restrict the range of values. */

import java.math.*;
import java.util.Scanner;

public class Prompt{
	public static String getString(String ask){
		Scanner keyboard = new Scanner(System.in);
		System.out.print(ask);
		String in = keyboard.nextLine();
		return in;
	}
	public static int getInt(String ask){
		boolean badIn = false;
		String input = new String ("");
		int value = 0;
		do{
			badIn = false;
			input = getString(ask);
			try {
				value = Integer.parseInt(input);
			} catch(NumberFormatException e){
				badIn = true;
				System.out.print("Bad Input! \n");
			}
		} while (badIn);
		return value;
	}
	
	public static int getInt(String ask, int min, int max){
		int value;
		do{
			value = getInt(ask +" (" + min + "-" + max + ") ->");
		} while(value > max || value < min);
		return value;
	}
	
	public static double getDouble (String ask){
		double value = 0;
		String input = new String ("");
		boolean badIn = false;
		do
		{
				badIn=false;
				input=getString(ask);
				try
				{
					value=Double.parseDouble(input);
				} catch (NumberFormatException e)
				{
					badIn=true;
					System.out.println("Bad input!");
				}
			} while (badIn);
			return value;
		}
	public static double getDouble(String ask, double min, double max){
		double value;
		do{
			value = getDouble(ask +  " (" + min + "-" + max + ") ->");
		} while(value > max || value < min);
		return value;
	}
	
	public static char getChar(String ask)
	{
		String out;
		do
		{
			out = getString(ask);
		}
		while (out.length() < 1);
		return out.charAt(0);
	}
}
