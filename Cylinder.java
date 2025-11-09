package JAVA;

interface Operation{
	double volume();
	double PI = 3.142;
}

public class Cylinder implements Operation{
	double radius;
	double height;
	
	Cylinder(double height,double radius){
		this.radius=radius;
		this.height=height;
	}
	public double volume() {
		return PI*radius*radius * height;
	}
	
	public static void main(String[] args) {
		Cylinder c1 = new Cylinder(5,11);
		System.out.println("Volume= " + c1.volume());
	}
}