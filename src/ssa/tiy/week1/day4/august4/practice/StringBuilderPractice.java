package ssa.tiy.week1.day4.august4.practice;

import java.util.Scanner;

public class StringBuilderPractice
{

	public static void main(String[] args) 
	{
		Scanner alien = new Scanner(System.in);
		
		
		for (int day = 0; day <= 8; day++) 
		{
			switch (day)
			{
			case 1:
				happyDay(day);
				break;
			case 2:
				happyDay(day);
				break;

			default:
				thatsNotADay(day);
				break;
			}
		}
		System.out.println("How was your day");
		System.out.println("You can choose 'great' or 'bad'");
		
		String theDayIs = alien.nextLine();
		
		switch (theDayIs.toLowerCase()) 
		{
		case "great":
			System.out.println("Great to hear");
			break;
		case "bad":
			System.out.println("I'm sorry");
			break;
		default:
			System.out.println("What?");
			break;
		}

		
		
		
	}

	private static void thatsNotADay(int day) 
	{
		System.out.println("There are only 7 days in a week!!!");
		
	}

	private static void happyDay(int day)
	{
		System.out.println("Have a great day!");
		
	}

}
