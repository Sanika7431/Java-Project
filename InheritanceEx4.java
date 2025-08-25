//Create a Vehicle class with a protected method startEngine(). Create a Car class that inherits from 
//Vehicle. In the main method, create a Car object and call the startEngine() method. Explain why this works.

package greek;

class Vehicle1{
	protected void startEngine()
	{
		System.out.println("Engine Starting.");
	}
}
class Car7 extends Vehicle1{
	void display()
	{
		System.out.println(" It's Work.");
	}
}
public class InheritanceEx4 {
public static void main(String[] args) {
	Car7 c1 = new Car7();
	c1.startEngine();
	c1.display();
}
}
