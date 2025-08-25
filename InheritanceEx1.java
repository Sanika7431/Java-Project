//Write a program with a Car class and a BMW class. BMW should inherit from Car. Both classes should have a 
//method called drive(). The Car's drive() method should print "The car is driving.", while the BMW's drive() 
//method should print "The BMW is driving smoothly." In your main method, create an instance of BMW and call 
//the drive() method.





package greek;

class Car{
	void drive()
	{
		System.out.println("Car is Driving .");
	}
}
class BMW extends Car{
	void drive() 
	{
		super.drive();
		System.out.println("BMW is driving smoothly.");
	}
}
public class InheritanceEx1 {
public static void main(String[] args) {
	BMW m1 = new BMW();
	m1.drive();
}
}
