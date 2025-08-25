//Create three classes: Vehicle, Car, and ElectricCar. 
//Vehicle has a no-argument constructor that prints "Vehicle created." 
//Car inherits from Vehicle and has a constructor that takes one argument for the number of wheels. It should 
//use super() to call the parent's constructor. 
//ElectricCar inherits from Car and has a constructor that takes arguments for both number of wheels and 
//battery life. It should use super() to call the Car's constructor. 
//In your main method, create an instance of ElectricCar and observe the constructor call order. 



package greek;

class Vehicles2{
	Vehicles2()
	{
		System.out.println("Vehicle Created.");
	}
}
class Car2 extends Vehicles2{
	Car2(int wheels )
	{
		super();
		System.out.println("Wheels:"+ wheels);
	}
}
class ElectricCar extends Car2{
	ElectricCar(int wheels,double battery)
	{
		super(4);
		System.out.println("Battery:"+battery);
	}
}
public class InheritanceEx2 {
public static void main(String[] args) {
	ElectricCar e1 = new ElectricCar(4,10.30);
}
}
