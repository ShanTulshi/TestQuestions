/* StringUtil.java
* Shantanu Tulshibagwale
* 9/19/13
* This is a class that contains miscellaneous utilities for dealing with Strings.
* It includes methods for deleting a particular character in a String and for
* converting a Scanner object to a String. 
*/

import java.util.Scanner;

public class StringUtil{

	//A method that deletes a character at a given index from a given string.
	public static String delCharAt(String input, int index){
		if(index == 0) return input.substring(1);
		else if (index == input.length()) return input.substring(0,index);
		else return (input.substring(0,index) + input.substring(index+1));
	
	}
	
	//A method that converts a Scanner object to a String.
	public static String convertToString(Scanner input){
		String out = new String("");
		while(input.hasNext()){
			out += "\n" + input.nextLine();
		}
		return out;
	}
	
	//A method that removes all instances of a given String from another String.
	//Similar to the String.removeAll(String, String) method. Whoops.
	public static String removeString(String remove, String input){
		String out = new String("");
		int index, i;
		index = i = 0;
		while(index >= 0 && i >= 0){
			index = input.indexOf(remove,i);
			if(index < 0){
				return out + input.substring(i + remove.length()-1);
			}
			out += input.substring(i, index);
			i = index + remove.length();
			///System.out.println(out);
			
		}
		return out;
	}
	
	
	//A method to insert a given String into another String before the given index.
	public static String insertString(String insert, int i, String input){
		if (i == 0){
			return insert + input;
		}
		if (i == input.length()){
			return input + insert;
		}
		return input.substring(0, i) + insert + input.substring(i);
	}
	
	public static int convertToInt(String in)
	{
		int out = 0;
		boolean invalid = false, negative = false;
		if (in.charAt(0) == '-')
		{
			negative = true;
		}
		for (int i = 0; i < in.length(); i++)
		{
			if (in.charAt(i) > 47 && in.charAt(i) < 58)
			{
				out += (int)(in.charAt(i)-48) * (int)(Math.pow(10,in.length() - i - 1));
			}
			else
			{
				invalid = true;
				break;
			}
		}
		if (invalid)
		{
			return 0;
		}
		if (negative)
		{
			out = (out)*(-1);
		}
		return out;
	}
}
