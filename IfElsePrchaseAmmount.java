//Write a Java program that helps a user determine their discount eligibility for an online
//store. The store offers discounts based on two criteria



package greek;

import java.util.Scanner;

public class IfElsePrchaseAmmount {



	public static void main(String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Purchase Amount:");
		float amount = sc.nextFloat();
		
		sc.nextLine();
		System.out.println("Enter Loyalty Status(Gold,Silver,None):");
		String loyalty = sc.nextLine();
		float discount = 0; 
		if(amount>=500)
		{
			 discount =10;
		}
		
		if(loyalty.equalsIgnoreCase("Gold"))// .equalsIgnoreCase  allow   Gold,GOLD,gold      and use : compare two strings
		{
			discount += 5;
		}
		System.out.println("Final discount :" + discount + "%");
		sc.close();
	}
}