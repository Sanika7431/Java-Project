//Check if a Given Number is Odd or Even Using Switch
//Use modulo operation inside switch-case.



package greek;

import java.util.Scanner;

public class SwitchEvenOdd {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
	    int num = sc.nextInt();
	    int remainder = num % 2;
	    System.out.println("Remainder:" + remainder);

	    switch(remainder)
		{
		case 0: 
			System.out.println( "Number is Even");
			break;
			
		case 1:
			System.out.println( "Number is Odd");
			break;
			
		default:
			System.out.println( "Invalid Number .  Please try again...");
		}
		sc.close();
	}
}
