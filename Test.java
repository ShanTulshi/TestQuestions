public class Test{
	public Test(String test, String number)
	{
		runTest(StringUtil.convertToInt(test),StringUtil.convertToInt(number));
	}
	
	public static void main(String [] args)
	{
		if (args.length > 1)
		{
			Test run = new Test(args [0], args[1]);
		}
		else
		{
			Test run = new Test(Prompt.getString("Please enter the test number: "), Prompt.getString("Please enter the question number: "));
		}
	}
	
	public void runTest(int test, int number)
	{
		if (number == 0)
		{
			System.out.print("\nError! The string you have entered for the question number is invalid!\n");
			System.exit(0);
		}
		else if (test == 0)
		{
			System.out.print("\nError! The string you have entered for the question number is invalid!\n");
			System.exit(0);
		}
		
		System.out.print("\nTest number: " + test + ", Question number: " + number + "\n-------------------------------------------------------------\n");
		
		switch (test)
		{
			case 0: 
				System.out.println("Error! The string you have entered for the test number is invalid!");
				break;
			case 1: 
				switch (number)
				{
					case 28:
						T1Q28.run();	break;
					default: System.out.println("This question is not in the program. Please try another, or add it to the program.");
				}
				
				break;
			case 2:
				break;
			case 3:
				switch (number)
				{
					case 2:
						T3Q2.run();
						break;
					case 7:
						T3Q7.run();
						break;
					default: System.out.println("This question is not in the program. Please try another, or add it to the program.");
						
				}
				break;
			default: System.out.println("This question is not in the program. Please try another, or add it to the program."); 
		}
	}
}
