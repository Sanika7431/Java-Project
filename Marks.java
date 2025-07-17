package Web;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args)
	{
		
	Scanner s = new Scanner(System.in);

	//System.out.println("Enter the  Marks ");
	System.out.println("Enter the MATH marks :");
	int math = s.nextInt();
	System.out.println("Enter the CS marks :");
	int cs = s.nextInt();
	System.out.println("Enter DBMS marks :");
	int dbms = s.nextInt();
	System.out.println("Math marks:" + math);
	System.out.println("CS marks  :" + cs);
	System.out.println("DBMS marks :" + dbms);
	float average = (math + cs + dbms)/3;
	
	System.out.println("Result");
	System.out.println("Average marks :" + average);
	System.out.println("Total marks: " + (math + cs + dbms) );
	s.close();
	}
}
