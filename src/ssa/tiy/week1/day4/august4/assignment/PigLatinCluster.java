package ssa.tiy.week1.day4.august4.assignment;

import java.util.Scanner;

public class PigLatinCluster 
{

	private static boolean pigLatin = true;
	
	public static void main(String[] args) 
	{		
		while (pigLatin == true)
		{
			Scanner word = new Scanner(System.in);
			System.out.println("Please type the word you want me to translate into Pig Latin\n");
			String userInput = word.nextLine();
			userInput = userInput.toLowerCase();
			StringBuilder modifiedUserInput = new StringBuilder(userInput);
			char firstLetter = modifiedUserInput.charAt(0);
			char secondLetter = modifiedUserInput.charAt(1);
			
			if (isVowel(firstLetter)) 
			{
				modifiedUserInput.append("ay");
				System.out.println("\n" + modifiedUserInput + "\n");
			}


			else 
			{
				modifiedUserInput.deleteCharAt(0);
				modifiedUserInput.deleteCharAt(0);
				
				modifiedUserInput.append(firstLetter);
				modifiedUserInput.append(secondLetter);
				
				modifiedUserInput.append("ay");
				System.out.println("\n" + modifiedUserInput + "\n");
			}
			
		}

	}
	
	public static boolean isVowel(char firstLetter)
	{
		char[] listOfVowels = {'a', 'e', 'i', 'o', 'u'};
		boolean isVowel = false;
		for (int i = 0; i < listOfVowels.length; i++) 
		{
			if (firstLetter == listOfVowels[i]) 
			{
				isVowel = true;
			} 
			
		}
		return false;
	}
	
	public static boolean isConsonant(char secondLetter)
	{
		char[] listOfVowels = {'a', 'e', 'i', 'o', 'u'};
		boolean isACluster = false;
		for (int i = 0; i < listOfVowels.length; i++) 
		{
			if (secondLetter == listOfVowels[i]) 
			{
				isACluster = true;
			} 
			
		}
		return false;
	}
	
}
