//Print the sum of numbers from 1 to N using a while loop.


package greek;

import java.util.Scanner;

public class WhileLoopSumofNatural {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int number= sc.nextInt();
		int num=1;
		int sum=0;
		while(num<=number)
		{
			sum = sum+num;
			num++;
		}
		System.out.println("Sum=" + sum);
	
		sc.close();
	}
}
