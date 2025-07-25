package greek;

import java.util.Scanner;

public class Cars {

	final int MAX_SPEED = 200;
	String model;
	float speed;
	
	Cars(String model,float speed)
	{
		this.model=model;
		this.speed= speed;
	}
	
	void Speed()
	{
		if( speed > MAX_SPEED)
		{
			System.out.println("Result: Car is Over-speeding");
		}else {
			System.out.println("Result: Car is driving safely");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter car model:");
		String model = s.nextLine();
		System.out.println("Enter car speed:");
		float speed = s.nextFloat();
		
		System.out.println("Car Model :" + model);
		System.out.println("Car Speed:" + speed);
	
		Cars c1 = new Cars(model,speed);
		c1.Speed();	
		s.close();
	}
}
