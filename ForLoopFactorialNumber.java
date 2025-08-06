//Factorial of a Number
//Find the factorial of a given number N using a for loop.



package greek;

import java.util.Scanner;

public class ForLoopFactorialNumber {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int factorial =1;
		for(int i=1;i<=num;i++)
		{
			factorial = factorial * i;
		}
		System.out.println("Factorial of number=" + factorial);
		sc.close();
	}
}
