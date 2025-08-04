//Convert Currency (USD, INR, EUR)
//Take a currency and convert it to another using predefined rates.



package greek;

import java.util.Scanner;

public class Switchcurrency {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("---Conversion of Currency---");
		System.out.println("1.Convert USD to INR");
		System.out.println("2.Convert USD to EUR");
		System.out.println("3.Convert INR to USD");
		System.out.println("4.Convert INR to EUR");
		System.out.println("5.Convert EUR to INR");
		System.out.println("6.Convert EUR to USD");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		
		System.out.println("Enter the amount:");
		float amount = sc .nextFloat();
		
		float convertedAmount;
		switch(choice)
		{
		case 1:
			convertedAmount = amount * 83;
			System.out.println("Amount convert USD to INR :" + convertedAmount );
		    break;
		    
		case 2:
			convertedAmount = amount  * 0.92f;
			System.out.println("Amount convert USD to EUR :" + convertedAmount );
			break;
			
		case 3:
			convertedAmount = amount / 83;
			System.out.println("Amount convert INR to USD :" + convertedAmount );
			break;
			
		case 4:
			convertedAmount = amount / 90;
			System.out.println("Amount convert INR to EUR :" + convertedAmount );
			break;
			
		case 5:
			convertedAmount = amount * 90;
			System.out.println("Amount convert EUR to INR :" + convertedAmount );
			break;
			
		case 6:
			convertedAmount = amount * 1.08f;
			System.out.println("Amount convert EUR to USD :" + convertedAmount );
			break;
			
			default:
				System.out.println("Invalid choice.   Please try again...");
		}
		sc.close();
	}
}
