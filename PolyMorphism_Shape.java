//Shape Example (Polymorphic Behavior) 
//Create an abstract class Shape with a method area(). 
// Subclasses: Circle, Rectangle, Triangle. 
// Override area() to compute correctly. 
//Write a method printArea(Shape s) that prints the area of any shape passed

package Web;

import java.util.Scanner;

abstract class Shape{
	double area;
	abstract double area();
}
class Circle extends Shape{
int radius;
double pi=3.14;
Circle(int radius){
	this.radius = radius;
}

@Override
double area() {
	return pi*radius*radius;
}
}

class Rectangle extends Shape {
	double length = 4.6;
	double width = 5.4;
Rectangle(double length,double width){
	this.length=length;
	this.width=width;
}
@Override
double area() {
	return length*width;
}
}

class Triangle extends Shape{
	double base = 4.8;
	double height = 7;
	Triangle(double base,double height){
		this.base=base;
		this.height=height;
	}
	@Override
double area() {
	return 0.5*base*height;
}
}

public class PolyMorphism_Shape {
	
	static void  printArea(Shape s) {
		System.out.println("Area = " + s.area());
	}
public static void main(String[] args) {
	Shape s1 = new Circle(5);
	Shape s2 = new Rectangle(7.4,2);
	Shape s3 = new Triangle(4.5,6.6);
	printArea(s1);
	printArea(s2);
	printArea(s3);
}
}
