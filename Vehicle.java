package Web;

class Car{
	int CarNumber = 1001;
	String CarName = "Maruti";
	String CarColor = "black";
	float CarPrice = 700000.89f;
}
class Bike{
	int BikeNumber = 2006;
	String BikeName = "Honda";
	String BikeColor = "Red" ;
	float BikePrice = 74000.08f;
}
class Bicycle{
	int BicycleNumber = 1002;
	String BicycleName = "Montra";
	String BicycleColor = "Blue";
	float BicyclePrice = 40000.06f;
}
public class Vehicle {
	public static void main(String[] args) {
		Car c1 = new Car();
		Bike b1 = new Bike();
		Bicycle b2 = new Bicycle();
		System.out.println( "Car number is :" +c1.CarNumber);
		System.out.println("Car name is :" +c1.CarName);
		System.out.println("Car color is :" +c1.CarColor);
		System.out.println("Car price is :" +c1.CarPrice);
		System.out.println(" ");
		
		System.out.println("Bike number is :" +b1.BikeNumber);
		System.out.println("Bike color is :" +b1.BikeColor);
		System.out.println("Bike name is :"  +b1.BikeName);
		System.out.println("Bike price is :" +b1.BikePrice);
		System.out.println(" ");
		
		System.out.println("Bicycle name is :" +b2.BicycleName);
		System.out.println("Bicycle color is :" +b2.BicycleColor);
		System.out.println("Bicycle number is :" +b2.BicycleNumber);
		System.out.println("Bicycle price is :" +b2.BicyclePrice);
		System.out.println(" ");
	}

}
