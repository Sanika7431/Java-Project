//Take three numbers and determine the smallest one.
//Check if a Number is an Armstrong Number



package greek;

import java.util.Scanner;

public class SwitchSmallestnumber {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----Enter three numbers----");
		System.out.println("Enter 1 st num:");
		int a=sc.nextInt();
		System.out.println("Enter 2 st num:");
		int b=sc.nextInt();
		System.out.println("Enter 3 st num:");
		int c= sc.nextInt();

		if(a<b && a<c)
		{
			System.out.println(a+"is smallest");
		}else if(b<a && b<c)
		{
			System.out.println(b+"is smallest");
		}else
		{
			System.out.println(c+"is smallest");
		}
		
		sc.close();
	}
}
