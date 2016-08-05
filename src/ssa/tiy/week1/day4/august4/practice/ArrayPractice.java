package ssa.tiy.week1.day4.august4.practice;

public class ArrayPractice 
{

	public static void main(String[] args) 
	{
//		StringBuilder stuffNThings = new StringBuilder("Hi Jason");
		
//		char[] someChars = new char[15];
		
		char[] sayHiClass = {'H', 'i', ' ', 'c', 'l', 'a', 's', 's'};

		String sayingHiClass =  new String(sayHiClass);
				
		System.out.println(sayingHiClass);
		
		String stuff = "Hi all";
		
		String hiErin = "Hi Erin";
		String hiJason = "Hi Jason";
		
		String hiEverybody = hiErin + hiJason;
		
		int someIndexing = hiErin.indexOf(0);
		
		System.out.println(someIndexing);
		
		System.out.println(hiErin + hiJason);
		
//		System.out.println(stuff.toLowerCase());
//		System.out.println(stuffNThings.deleteCharAt(0));
//		System.out.println(stuffNThings.deleteCharAt(0));
//		System.out.println(stuffNThings.deleteCharAt(0));
	}

}
