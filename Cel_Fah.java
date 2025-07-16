package Web;

import java.util.Scanner;

public class Cel_Fah {
	
	public static void main(String[] args)
	{
		Scanner m = new Scanner(System.in);
		System.out.println("Enter the Temp in celsius:");
		float celsius =m.nextFloat();
		System.out.println("Celsius :" + celsius + "C");
		System.out.println(" ");
		float Fahrenheit = celsius * (1.8f) + 32;
		System.out.println("Fahrenheit:" + Fahrenheit + "F");
		m.close();
	}

}
