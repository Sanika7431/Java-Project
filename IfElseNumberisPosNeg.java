//Write a Java program that takes an integer as input from the user. If the number is positive, print a message "The number is positive."



package greek;

import java.util.Scanner;

public class IfElseNumberisPosNeg {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Integer:");
		int x= sc.nextInt();
		
		if(x >=0)
		{
			System.out.println("The number is Positive");
		}
		else
		{
			System.out.println("The number is Negative");
		}
		sc.close();
	}
}