//Find the Number of Days in a Given Month and Year
//Consider leap years while checking February.  jan= 31 ,feb = 29 , march= 31
//switch statement

package greek;

import java.util.Scanner;

public class SwitchLeapyear {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month:");
		int month = sc.nextInt();
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		
		int days;
		
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days=31;System.out.println("Days" + (days= 31));
			break;
			
		case 2:
			if((year % 4 == 0)  && (year%100!=0) || (year%400==0) )
			{
				System.out.println("Days" + (days= 29));
				System.out.println("It is Leap Year");
			}
			else
			{
				System.out.println("Days" + (days= 28));
				System.out.println("It is not Leap Year");
			}
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Days" + (days= 30));
		
		break;
		
		default :
			days =-1;
			System.out.println("Invalid month.   Please try again...");
			break;
			}
		
		if(days != -1)
		{
			System.out.println(" Days in month " + month + " of year " + year + " is " + days+".");
		}
		sc.close();
	}
}
