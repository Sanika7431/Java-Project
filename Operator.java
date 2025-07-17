package Web;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int a = s.nextInt();
		System.out.println("Enter the 2nd number:");
		int b = s.nextInt();
		System.out.println(" a :" + a);
		System.out.println("b :" + b);
		
		System.out.println("Addition:" + (a+b));
		System.out.println("Subtraction:" + (a-b));
		System.out.println("Multiplication :" + (a*b));
		System.out.println("Division:" + (b/a));
		System.out.println("Remainder:" + (a%b));
		System.out.println( "a>b:" +(a>b));
		System.out.println("a<b:" +(a<b));
		System.out.println("a==b:" + (a==b));
		System.out.println("a!=:" + (a!=b));
		s.close();
	}
}
