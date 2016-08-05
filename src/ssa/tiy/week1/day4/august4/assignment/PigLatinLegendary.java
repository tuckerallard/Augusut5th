package ssa.tiy.week1.day4.august4.assignment;

import java.util.Scanner;

public class PigLatinLegendary
{
	private static boolean pigLatin = true;
	
	public static void main(String[] args) 
	{		
		while (pigLatin == true)
		{
				Scanner word = new Scanner(System.in);
			
				System.out.println("\nPlease enter the sentence you would like me to translate.");
				String sentence = word.nextLine();
				
				String [] wordsInTheSentence = sentence.split(" ");
		
				for (int i = 0; i < wordsInTheSentence.length; i++) 
				{
					StringBuilder modifiedWordsInTheSentence = new StringBuilder(wordsInTheSentence[i]);
					char firstLetter = modifiedWordsInTheSentence.charAt(0);
					char secondLetter = modifiedWordsInTheSentence.charAt(1);
					
					if (isVowel(firstLetter)) 
					{
						modifiedWordsInTheSentence.append("ay ");
						System.out.print(modifiedWordsInTheSentence);
					}
		
					else if(isConsonant(secondLetter))
					{
						modifiedWordsInTheSentence.append(firstLetter);
						modifiedWordsInTheSentence.append(secondLetter);
						modifiedWordsInTheSentence.deleteCharAt(0);
						modifiedWordsInTheSentence.deleteCharAt(0);
						modifiedWordsInTheSentence.append("ay ");
						System.out.print(modifiedWordsInTheSentence);
					}
					
					else
					{
						modifiedWordsInTheSentence.append(firstLetter + "ay ");
						modifiedWordsInTheSentence.deleteCharAt(0);
						System.out.print(modifiedWordsInTheSentence);
					}

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
		return isVowel;
	}
	
	public static boolean isConsonant(char secondLetter)
	{
		char[] listOfVowels = {'a', 'e', 'i', 'o', 'u'};
		boolean isACluster = true;
		for (int i = 0; i < listOfVowels.length; i++) 
		{
			if (secondLetter == listOfVowels[i]) 
			{
				isACluster = false;
			} 
			
		}
		return isACluster;
	}
	
}