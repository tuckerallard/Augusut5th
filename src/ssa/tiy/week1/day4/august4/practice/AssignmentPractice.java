package ssa.tiy.week1.day4.august4.practice;

import java.util.Scanner;

public class AssignmentPractice 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is your name?");
		String userInput = sc.nextLine();
		
		System.out.println(userInput);
		StringBuilder modUserInput = new StringBuilder(userInput);
		char firstLetter = modUserInput.charAt(0);
		
		System.out.println(firstLetter);
		
		modUserInput.deleteCharAt(0);
		System.out.println(modUserInput);
		
		
		
		System.out.println(modUserInput);
		
		char[] hi = {'h', 'i', ' '};
		
		modUserInput.insert(0, hi);
		
		System.out.println(modUserInput);
		
		modUserInput.append(hi);
		
		
	}

}
