//Menu-Based Program for Arithmetic Operations
//Choose an operation (+, -, *, /) and perform it.
//switch statement

package greek;

import java.util.Scanner;

public class SwitchArithmaticOperation {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1:");
		float num1 = sc.nextFloat();
		System.out.println("Enetr the number 2:");
		float num2 = sc.nextFloat();
		
		float result;
		
		System.out.println("Choose your choice:");
		System.out.println("Addition" );
		System.out.println("Subtraction" );
		System.out.println("Multiplication");
		System.out.println("Division");
		System.out.println("Enter the operation (+,-,*,/):");
		String operator = sc.next();
		
		switch(operator)
		{
		case "+" : 
			result = num1+num2;
			System.out.println("Addition = " + result);
			break;
			
		case "-" :
			result = num1-num2;
			System.out.println("Subtraction = " + result);
			break;
			
		case "*" :
			result = num1*num2;
			System.out.println("Multiplication =" + result);
			break;
		
		case "/" :
			if(num2 !=0)
			{
				result = num1/num2;
				System.out.println("Division = " + result);
			}else
			{
				System.out.println("Error:Division by zero is not allowed");
			}
			break;
			
			default:
				System.out.println("Invalid operator. Please try again...");
		}
	    sc.close();
	}
}
