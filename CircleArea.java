package greek;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args)
	{
		final float PI = 3.14f;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the radius:");
		float radius = s.nextFloat();
		System.out.println("Radius of Circle :" + radius);
		float area = PI * radius * radius;
		System.out.println("Area of Circle:" + area);
		
		System.out.println("");
		System.out.println("Enter the base:");
		float base = s.nextFloat();
		System.out.println("Enter the height:");
		float height = s.nextFloat();
		float Tarea = 0.5f*base*height;
		System.out.println("Area of Triangle: " + Tarea);
		s.close();
	}
}
