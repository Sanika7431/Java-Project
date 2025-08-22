package greek;

import java.util.Scanner;

//Q1------------------------
public class HelloJava {
public static void main(String[] args)
{
	System.out.println("Hello Java!");
}
}




  //Q2----------------------
public class MyDetails
{
	public static void main(String[] args)
	{
		String name="Sanika";
		int age=19;
		String city = "Sangamner";
		
		System.out.println("My name is :" + name);
		System.out.println("My age is :"+age);
		System.out.println("My City is :" + city);
	}
}


//Q3-----------------------------

public class Numbers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number 1:");
		int num1 = sc.nextInt();
		System.out.println("enter the number 2:");
		int num2 = sc.nextInt();
		
		System.out.println("Sum of numbers:" + (num1+num2));
		System.out.println("Difference of numbers:" + (num1-num2));
		System.out.println("Product of numbers:" + (num1*num2));
		System.out.println("Division of numbers:" + (num1/num2));
		sc.close();
	}
}


//Q4--------------------------------

public class Datatypes{
	
	int age;
	long mob;
	short height;
	float weight;
	double per;
	boolean isProgres;
	char batch;
	byte by;
	
	void display()
	{
		System.out.println("Null value of integer:" + age);
		System.out.println("Null value of long:" + mob);
		System.out.println("Null value of short:" + height);
		System.out.println("Null value of float:" + weight);
		System.out.println("Null value of double:" + per);
		System.out.println("Null value of boolean:" + isProgres);
		System.out.println("Null value of char:" + batch);
		System.out.println("Null value of byte:" + by);
	}
	
	
	public static void main(String[] args)
	{
		Datatypes d1 = new Datatypes();
		d1.display();
	}
}

//Q5---------------------------------

public class TempVariable       //using temporary variable
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int a = sc.nextInt();
		System.out.println("Enter number 2:");
		int b = sc.nextInt();
		System.out.println("a="+a);
		System.out.println("b="+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping a="+a);
		System.out.println("After Swapping b=" + b);
	}
	
}


public class TempVariable       // without using temporary variable
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int a = sc.nextInt();
		System.out.println("Enter number 2:");
		int b = sc.nextInt();
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a="+a);
		System.out.println("After Swapping b=" + b);
	}
	
}

//Q6-----------------------------

public class TypeCasting
{
	public static void main(String[] args)
	{
		int num1 = 10;
		float n= num1;
		System.out.println("int value="+num1);
		System.out.println("float value="+n);

		float num2 = 20f;
		int a = (int)num2;
		
		System.out.println("float value=" + num2);
		System.out.println("int value=" + a);
	}
	
}


//Q7---------------------------------------

public class EvenOddNum{
	public static void main(String[] args)
	{
		int n=6;
		if(n%2==1)
		{
			System.out.println("Number is Odd.");
		}else
		{
			System.out.println("Number is Even.");
		}
	}
}


//Q8-----------------------------------------

public class LargestNumber{
	public static void main(String[] args)
	{
		int a=61;
		int b=95;
		int c=70;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest number");
		}else if(b>a && b>c)
		{
			System.out.println("b is largest number");
		}else
		{
			System.out.println("c is largest number");
		}
	}
}


//Q9------------------------------------

public class AreaofCircleRectangle
{
	public static void main(String[] args)
	{
		float pi=3.142f;
		int rad = 5;
		
		float area =pi*rad*rad;
		System.out.println("Area of Circle:" + area);
		
		int length=5;
		int breadth=6;
		int Area =length*breadth;
		System.out.println("Area of Rectangle:"+Area);
	}
}


//Q10--------------------------------------------

public class PrintNumber{
	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}



//Q11--------------------------------------------

public class MutiplicationTable{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
				int mul= n*i;
				System.out.println(n + " * " + i + " = "   + mul );
			
		}
	}
}


//Q12----------------------------------------------


public class FibonacciSeries
{
	public static void main(String[] args)
	{
		int a=0;
		int b=1;
		System.out.println("Fibanacci series upto 10 terms:");
		for(int i=1;i<=10;i++)
		{
			System.out.print(a+" ");
			int next=a+b;
			a=b;
			b=next;
		}
	}
	
}


//Q13----------------------------


public class Factorial{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		
		int fact = 1;
		if(n<0)
		{
			System.out.println(" ");
		}else
		{
			for(int i=1;i<=n;i++)
			{
				fact = fact*i;
			}
			System.out.println(n + "!= " + fact);
		}
		
	}
}

//Q14-------------------------------------------
	

public class Prime
{
	static boolean isPrime(int n)
	{
		if(n<=1)
		{
		   return false;
		}
			for(int i=2;i<n;i++) 
			{
				if(n%i==0)
				{
					return false;
				}
			}
			return true;
    }
		
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n= sc.nextInt();
		
		if(isPrime(n))
		{
			System.out.println(n + " is a prime .");
		}else
		{
			System.out.println(n + " is not a prime.");
		}
	 }
}








