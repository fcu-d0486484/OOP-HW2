package fcu.iecs.oop.java;
import java.util.Scanner;

public class KeyboardScanner
{
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int outint;
		float outflo;
		String outstr;
		System.out.print("Enter a integer:");
		outint=keyboard.nextInt();
		System.out.print("Enter a float point number:");
		outflo=keyboard.nextFloat();
		System.out.print("Enter a you name:");
		outstr=keyboard.next();
		System.out.print("\nHi "+outstr+", the multiplication of "+outint+" and "+outflo+" is ");
		System.out.printf("%e",outflo*outint);
		keyboard.close();
	}
		
}
