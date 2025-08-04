//Find the Type of Quadrilateral
//Choose between square, rectangle, parallelogram, and classify it.


package greek;

import java.util.Scanner;

public class SwitchQudrilateral {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("---Quadrilateral type---");
		System.out.println("1.Square");
		System.out.println("2.Rectangle");
		System.out.println("3.Parallelogram");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
	
		 System.out.println("Enter side A :");
		 int a = sc.nextInt();
		 System.out.println("Enter side B :");
		 int b = sc.nextInt();
		 System.out.println("Enter side C :");
		 int c = sc.nextInt();
		 System.out.println("Enter side D :");
		 int  d= sc.nextInt();
		 
		 System.out.println("Enter angle1:");
		 int angle1= sc.nextInt();
		 System.out.println("Enter angle2:");
		 int angle2= sc.nextInt();
		 System.out.println("Enter angle3:");
		 int angle3= sc.nextInt();
		 System.out.println("Enter angle4:");
		 int angle4= sc.nextInt();
		 
		 
		switch(choice)
		{

		case 1:
		
			if(a==b && b==c && c==d && angle1==90 && angle2==90 && angle3==90 && angle4==90)
			{
				System.out.println(" It is a Square");
			}else {
				System.out.println(" It is not a Square");
			}
			
			break;
			
		case 2:
			if(a==c && b==d && angle1==90 && angle3==90 && angle3==90 && angle4==90)
			{
				System.out.println("It is a Rectangle");
			}else {
				System.out.println("It is not a Rectangle");
			}
			break;
			
		case 3:
			if(a==c && b==d && angle1==angle3 && angle2==angle4)
			{
				System.out.println("It is a Parallelogram");
			}else {
				System.out.println("It is not a Parallelogram");
			}
			break;
			
		default :
			System.out.println("Invalid choice. Please try again...");
		}
		sc.close();
	}
}
