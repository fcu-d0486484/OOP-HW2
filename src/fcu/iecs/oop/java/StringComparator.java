package fcu.iecs.oop.java;

import java.util.Scanner;

public class StringComparator 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String com1,com2;
		System.out.print("Enter a string 1:");
		com1=keyboard.next();
		System.out.print("Enter a string 2:");
		com2=keyboard.next();
		if(com1.compareToIgnoreCase(com2)==0)
		System.out.print("The two strings are the same.");
		else
		System.out.print("The two strings are not the same.");
	}	
}
