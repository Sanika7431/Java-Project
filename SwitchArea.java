//Find the Area of Different Shapes
//Choose from circle, rectangle, triangle, and find the area.


package greek;

import java.util.Scanner;

public class SwitchArea {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eter the Shape:");
		String shape = sc.nextLine();
		
		switch(shape)
		{
		case "circle" :
			float pi= 3.14f;
			System.out.println("Enter the radius :");
			float radius = sc.nextFloat();
			System.out.println("Area of Circle is :" + pi*radius *radius );
			break;
			
		case "triangle" :
			System.out.println("Enter the base:");
			float base = sc.nextFloat();
			System.out.println("Enter the height:");
			float height = sc.nextFloat();
			System.out.println("Area of Triangle is : " + (1/2f)*base *height);
			
			break;
			
		case "rectangle" :
			System.out.println("Enter the Length:");
			float length= sc.nextFloat();
			System.out.println("Enter the Width:");
			float width = sc.nextFloat();
			System.out.println("Area of Rectangle is :"+ length* width );
			break;
			
		default :
			System.out.println("Invalid Shape .  Please try again....");
		}
		sc.close();
	}
}
