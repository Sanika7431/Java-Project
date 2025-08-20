package greek;

class Cars{
	String name="Audi";
	long number=2006;
	void display()
	{
		System.out.println("Car name :" + name);
		System.out.println("Car number:" + number);
	}
}
	class Audi extends Cars {
		
		void display1()
		{
			System.out.println("I am Audi");
		}
	}

public class InheritanceSinglelevel {

	public static void main(String[] args)
	{
		Audi a1 = new Audi();
		a1.display();
		a1.display1();
	}
}


