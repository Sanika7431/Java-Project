//Convert a Number (1-7) into a Weekday
//1 = Sunday, 2 = Monday, ..., 7 = Saturday.
//switch statements


package greek;

import java.util.Scanner;

public class SwitchWeekends {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value:");
		int value = sc.nextInt();
		
		switch(value)
		{
		case 1:	System.out.println("Sunday");
			break;
			
		case 2: System.out.println("Monday");
		    break;
		    
		case 3: System.out.println("Tuesday");
		    break;
		    
		case 4: System.out.println("Wednesday");
		    break;
		
		case 5:System.out.println("Thursday");
		    break;
		    
		case 6:System.out.println("Friday");
		    break;
		    
		case 7: System.out.println("Saturday");
		    break;
		    
		default:System.out.println("Invalid day . Please try again...");
		}
		sc.close();
	}
}
