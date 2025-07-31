package greek;

import java.util.Scanner;

public class Integer {

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
