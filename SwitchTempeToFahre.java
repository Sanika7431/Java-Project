//Convert Temperature Between Celsius and Fahrenheit
//Use switch-case to select the conversion type
//switch statement


package greek;

import java.util.Scanner;

public class SwitchTempeToFahre {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Temperature Conversion menu-----");
		System.out.println("1.Celcius to Fahrenheit");
		System.out.println("2.Fahrenheit to Celcius ");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: 
			System.out.println("Enter temeprature in celcius:");
			float celcius = sc.nextFloat();
			System.out.println("Fahrenheit:" + (celcius * (9f/5) +32 ));
			break;
			
		case 2:
			System.out.println("Enter temperature in Fahrenheit:");
			float Fahrenheit = sc.nextFloat();
			System.out.println("Celcius:" + ((Fahrenheit-32)*(5f/9)));
			break;
			
			default:
				System.out.println("Invalid temperature . Please try again...");
		}
		sc.close();
	}
}
