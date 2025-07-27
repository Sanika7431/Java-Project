package greek;

import java.util.Scanner;


public class MAXNUM {

	void Findmax(int a,int b,int c)
	{
		int max ;
		
		if (a >= b && a>=c )
		{
			max=a;
		}else if(b>=a && b>=c )
		{
			max=b;
		}else {
			max=c;
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
                Findmax f = new Findmax(a,b,c);
		f.Findmax();
		
	    s.close();
	}
}
