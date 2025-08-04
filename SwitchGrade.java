//Convert a Grade into Remarks
//A = Excellent, B = Good, C = Average, D = Poor, F = Fail.
//switch statement

package greek;

import java.util.Scanner;

public class SwitchGrade {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Grade :");
		String grade = sc.next();
		
		switch(grade)
		{
		case "A" : System.out.println("Excellent");
		break;
		
		case "B" :  System.out.println("Good");
		break;
		
		case "C" : System.out.println("Average");
		break;
		
		case "D" : System.out.println("Poor");
		break;
		
		case "E" : System.out.println("Fail");
		break;
		
		default:System.out.println(" Invalid Grade.  Please try again...");
		}
		sc.close();
	}
}
