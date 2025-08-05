//Write a Java program that:

   //* Uses a final variable to store the value of Pi (3.14)
  // * Accepts a radius from the user
//   * Calculates and prints the area of a circle and Triangle


package greek;

import java.util.Scanner;

public class CircleAreaUsingFinal {

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