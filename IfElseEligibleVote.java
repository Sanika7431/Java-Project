//Create a Java program that asks the user to enter their age. Based on the age, determine if they are eligible to vote.
//A person is eligible to vote if their age is 18 or greater. 
//Print "You are eligible to vote." or "You are not eligible to vote yet." accordingly.



package greek;

import java.util.Scanner;

public class IfElseEligibleVote {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age of  person:");
		int age = sc.nextInt();
		
		if(age >=18)
		{
			System.out.println("You are eligible to vote");
		}
		else
		{
			System.out.println("You are not eligible to vote");
		}
		sc.close();
	}

}
