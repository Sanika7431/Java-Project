package greek;

import java.util.Scanner;

public class Login {

	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Username:");
		String username= sc.next();
		System.out.println("Enter Password:");
		int password = sc.nextInt();
		
		int Password=123456;
		String Username ="admin";
		
		if(username.equals("admin"))// for  string .equal and for int ==
		{
			if(password==123456)
			{
				System.out.println("Login Successfully");
			}
		    else 
		    	{
		    	System.out.println("Incorrect Password");
		    	}
		}
		else
			{
				System.out.println("Incorrect Username");
				System.out.println("Login Unsuccessful. Please Try Again...");
			}
	    sc.close();
	}
}
	