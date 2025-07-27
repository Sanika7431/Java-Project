package greek;

import java.util.Scanner;


public class MAXNUM {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a = s.nextInt();
		System.out.println("Enter 2nd number:");
		int b= s.nextInt();
		System.out.println("Enter 3rd number:");
		int c = s.nextInt();
        int max ;
		
		if (a >= b && a>=c )
		{
			max=a;
		}else if(b>=a && b>=c )
		{
			max=b;
		}else {
			(max=b);
		}
		System.out.println("The largest Number :" +max );
		
	    s.close();
	}
}
