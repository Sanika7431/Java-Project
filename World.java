package Web;
class Bird{
	static  String BirdName = "Sparrow";
	static int BirdEyes = 2;
	static short BirdWings = 2;
	static String BirdColor = "Brown";
	static boolean BirdCanFly= true;
	static long BirdPopulation = 20456789L;
	static float BirdWeight = 10.23f;
	
	 static void Method()
	{  
		
		System.out.println("Bird Name is :" + BirdName);
		System.out.println("Bird Eyes is :" +BirdEyes);
		System.out.println("Bird Wing is :" +BirdWings);
		System.out.println("Bird Color is :"+ BirdColor);
		System.out.println("Bird Can Fly is :" + BirdCanFly);
		System.out.println("Bird Population is :" + BirdPopulation);
		System.out.println("Bird Weight is = "+ BirdWeight);
		System.out.println(" ");
		
	}
}
class Animals{
	 static String AnimalName = "Cat";
	 static String AnimalColor = "White";
	 static int AnimalLegs = 4;
	 static boolean AnimalCanFly = false;
	 static short AnimalAge = 10;
	 static long AnimalPopulation = 43678978L;
	 static float AnimalWeight = 23.45f;
	 
	 static void Method()
	{
		System.out.println("Animal Name is :" + AnimalName);
		System.out.println("Animal Color is :" + AnimalColor);
		System.out.println("Animal legs are :" + AnimalLegs);
		System.out.println("Animal Can Fly ;" + AnimalCanFly);
		System.out.println("Animal Age is :" + AnimalAge);
		System.out.println("Animal Weight =" + AnimalWeight);
		System.out.println("Animal Population ="+ AnimalPopulation);
		
	}
}
public class World {

	public static void main(String[] args)
	{
		
		Bird.Method();
		Animals.Method();
	}
}
