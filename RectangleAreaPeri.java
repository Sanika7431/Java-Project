package Web;

import java.util.Scanner;

public class RectangleAreaPeri {

	public static void main(String[] args)
	{
		Scanner c = new Scanner(System.in);
		System.out.println("Enter Length:");
		int Length = c.nextInt();
		System.out.println("Lentgh :" + Length);
		System.out.println(" ");
		
		System.out.println(" Enter Width:");
		int Width = c.nextInt();
		System.out.println("Width :" + Width);
		System.out.println(" ");
		
		System.out.println("Area of Rectangle is : "+ (Length * Width));
		System.out.println("Perimeter of Rectangle is :" + (2*(Length + Width)));
		c.close();
	}
}