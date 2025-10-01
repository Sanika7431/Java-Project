/*Vehicle Management System (Abstract Class + Method Implementation)

Create an abstract class Vehicle with:

Abstract methods: start(), stop().

A concrete method: fuelType() that prints "Different vehicles use different fuels."


Then, create two classes Car and Bike that extend Vehicle and implement the abstract methods.
👉 Write a main method to demonstrate polymorphism using the abstract class reference.
*/

package Abstraction;
abstract class Vehicle{
	abstract void start();
	abstract void stop();
	
	void FuelType() {
		System.out.println("Different Vehicle uses different Fuels.");
	}
}


class Car extends Vehicle{
	@Override
	void start() {
		System.out.println("Car is Starting....");
	}
	@Override
	void stop() {
		System.out.println("Car is Stop.");
	}
}
class Bike extends Vehicle{
	@Override
	void start() {
		System.out.println("Bike is Starting...");
	}
	@Override
	void stop() {
		System.out.println("Bike is Stop.");
	}
}


public class AbstractionVehicleManagementSystem {
public static void main(String[] args) {
	Vehicle car = new Car();
	Vehicle bike = new Bike();
	car.start();
	car.stop();
	car.FuelType();
	bike.start();
	bike.stop();
	bike.FuelType();
}
}
