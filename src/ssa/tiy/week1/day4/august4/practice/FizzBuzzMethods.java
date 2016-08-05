package ssa.tiy.week1.day4.august4.practice;

public class FizzBuzzMethods 
{

	public static void main(String[] args) 
	{
		for (int i = 1; i < 110; i++) 
		{
			if (divisableByAllThree(i))
			{
				System.out.println("FizzBuzzBang");
			}
		
			else if(divisableByAllThreeAndFive(i))
			{
				System.out.println("FizzBuzz");
			}
			
			else if(divisableByAllThreeAndSeven(i))
			{
				System.out.println("FizzBang");
			}
		
			else if(divisableByAllFiveAndSeven(i))
			{
				System.out.println("BuzzBang");
			}
			
			else if(divisableByThree(i))
			{
				System.out.println("Fizz");
			}
			
			else if(divisableByFive(i))
			{
				System.out.println("Buzz");
			}
			
			else if(divisableBySeven(i))
			{
				System.out.println("Bang");
			}
			else
			{
				System.out.println(i);
			}
		

		
		}

	}

	public static boolean divisableByAllThree(int fromTheForLoop)
	{
		//	int i = 0; (Java)
		//	String s = "erin"; (Java)
		//	var i = 0; (JavaScript)
		//	var s = "erin"; (JavaScript)
		
		boolean howsThisMethod = false;
		
		if (((fromTheForLoop % 3) == 0) && ((fromTheForLoop % 5) == 0) && ((fromTheForLoop % 7) == 0))
		{
			howsThisMethod =  true;
		}
		
		return howsThisMethod;
		
	}
	
	public static boolean divisableByAllThreeAndFive(int fromTheForLoop)
	{
		
		boolean threeAndFive= false;
		
		if (((fromTheForLoop % 3) == 0) && ((fromTheForLoop % 5) == 0))
		{
			threeAndFive =  true;
		}
		
		return threeAndFive;
		
	}
	
	public static boolean divisableByAllThreeAndSeven(int fromTheForLoop)
	{
		
		boolean threeAndSeven= false;
		
		if (((fromTheForLoop % 3) == 0) && ((fromTheForLoop % 7) == 0))
		{
			threeAndSeven =  true;
		}
		
		return threeAndSeven;
		
	}
	
	public static boolean divisableByAllFiveAndSeven(int fromTheForLoop)
	{
		
		boolean fiveAndSeven= false;
		
		if (((fromTheForLoop % 5) == 0) && ((fromTheForLoop % 7) == 0))
		{
			fiveAndSeven =  true;
		}
		
		return fiveAndSeven;
		
	}
	
	public static boolean divisableByThree(int fromTheForLoop)
	{
		
		boolean three= false;
		
		if ((fromTheForLoop % 3) == 0)
		{
				three =  true;
		}
		
		return three;
		
	}
	
	public static boolean divisableByFive(int fromTheForLoop)
	{
		
		boolean five= false;
		
		if ((fromTheForLoop % 5) == 0)
		{
				five =  true;
		}
		
		return five;
		
	}
	
	public static boolean divisableBySeven(int fromTheForLoop)
	{
		boolean seven = false;
		
		if ((fromTheForLoop % 7) == 0)
		{
			seven = true;
		}
		
		return seven;
		
	}
	
}
