package Web;

import java.util.Scanner;

public class Casting {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Percentage:");
		float a = s.nextFloat();
		System.out.println("Percentage:"+a);
		int b= (int) a;
		System.out.println("In Integer:" + b);
		
		System.out.println(" ");
		System.out.println("Enter the Age :");
		int d=s.nextInt();
		System.out.println("Age:" + d);
		float c= d;
		System.out.println("In Float :" + c);
		
		s.close();
	}
}
