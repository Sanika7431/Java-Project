package Web;

import java.util.Scanner;

public class Num {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number :");
		float num1 = s.nextFloat();
		System.out.println(" num1 :" + num1);
		System.out.println(" ");
		
		
		System.out.println("Enter 2nd number :");
		float num2 = s.nextFloat();
		System.out.println("num2 :" + num2);
		System.out.println(" ");
		
		
		System.out.println("The Addition  is : "+ (num1 + num2));
		System.out.println("The Subtraction  is :" + (num1 - num2));
		System.out.println("The Multiplication  is :" + (num1 * num2));
		System.out.println("The Division is : " + (num1 / num2));
		System.out.println("The Remainder is :" + (num1 % num2));
		s.close();
	}

}
