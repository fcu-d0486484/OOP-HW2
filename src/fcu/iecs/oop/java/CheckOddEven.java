package fcu.iecs.oop.java;

import java.util.Scanner;

public class CheckOddEven 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int space;
		System.out.print("Enter a integer:");
		space=keyboard.nextInt();
		System.out.print("The input integer is ");
		if(space%2==0)
		System.out.print("Even Number.");
		else
		System.out.print("Odd Number.");
	}
}
