/*Shape Area Calculator (Abstract Class + Interface Combination)

Create an abstract class Shape with:

Abstract method: calculateArea()

Concrete method: displayShapeName()


Also create an interface Resizable with method resize(double factor).
👉 Implement Circle and Rectangle classes using both abstract class and interface.
👉 Test area calculation and resizing*/

package Abstraction;

abstract class Shape{
	abstract void calculateArea();
	void displayShapeName() {
		System.out.println("Display Shape Name.");
	}
}

interface Resizable{
	void reSize(double factor) ;
}

class Circle extends Shape implements Resizable{
	double radius = 5;
	double PI = 3.14;
	@Override
	public void reSize(double factor) {
		radius *=factor;
	}
	void calculateArea() {
		double area = PI * radius * radius;
		System.out.println("Area of Circle: " + area);
	}
}
class Rectangle extends Shape implements Resizable{
	double length = 10;
	double width = 12;
	@Override
	public void reSize(double factor) {
		length *= factor;
		width *= factor;
	}
	void calculateArea() {
		double area = length * width;
		System.out.println("Area of Rectangle: " + area);
	}
}
public class AbstractionShapeAreaCalculator {
public static void main(String[] args) {
	Circle circle = new Circle();
	Rectangle rectangle = new Rectangle();
	circle.displayShapeName();
	circle.reSize(2);
	circle.calculateArea();
	rectangle.displayShapeName();
	rectangle.reSize(2);
	rectangle.calculateArea();
}
}
