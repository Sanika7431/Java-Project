package greek;

import java.util.Scanner;


public class MAXNUM {
	
	void Findmax(int a,int b,int c)
	{
		int max;
		if (a >= b && a>=c )
		{
			max=a;
		}else if(b>=a && b>=c )
		{
			max=b;
		}else {
			System.out.println(max=b);
		}
		System.out.println("The largest Number :" +max );
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a = s.nextInt();
		System.out.println("Enter 2nd number:");
		int b= s.nextInt();
		System.out.println("Enter 3rd number:");
		int c = s.nextInt();
       
		MAXNUM n1 = new MAXNUM();
		n1.Findmax(a,b,c);
	    s.close();
	}
}
