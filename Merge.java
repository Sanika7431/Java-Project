package Web;

import java.util.Scanner;

public class Merge {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the First number:");
		int num1 = s.nextInt();
		System.out.println("Enter the second number :");
		int num2 = s.nextInt();
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
		
		
		System.out.println(" ");
		System.out.println( "Addition :" + (num1 + num2));		
		System.out.println("Subtrsction :" + (num1 - num2));
		System.out.println("Multipilcation :" + (num1 * num2));
		System.out.println("Division :" + (num1 / num2));
		System.out.println("Remainder :" + (num1 % num2));
		
		System.out.println(" ");
		System.out.println("Enter the temperature in celsius:");
		int celsius = s.nextInt();
		float fahrenheit = (celsius * (1.8f) + 32);
		System.out.println(" In fahrenheit :" + fahrenheit + "F");
		
		System.out.println(" ");
		System.out.println("The square of num1:" + (num1 * num1));
		System.out.println("The cube of num1 :" + (num1 * num1 * num1));
		
		System.out.println(" ");
		System.out.println("Area of Rectangle:" + (num1 * num2));
		System.out.println("Perimeter of Rectangle :" + (2*(num1 + num2)));
	    
		s.close();
	}
}
