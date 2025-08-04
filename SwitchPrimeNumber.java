//Check if a Number is Prime
//Take a number and check if it is prime using if-else.


package greek;

import java.util.Scanner;

public class SwitchPrimeNumber
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
			boolean isPrime = true;
			
			if(num <=1)
			{
				isPrime =false;
			}else
			{
				for(int i=2 ;num <i/2;i++)
				{
					if(num% i==0)
					{
						isPrime = false;
					}
				}
			}
			
			switch(isPrime ? 1 : 0)
			{
			case 1: 
				if(isPrime)
				{
					System.out.println("Number is Prime");
				}
				break;
				
			case 0:
				if(isPrime)
				{
					System.out.println("Number is Not Prime");
				}
				break;
				
			}
			sc.close();
	}
	
}

