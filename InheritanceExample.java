package greek;

class Shape
{
	
	void calculateArea()
	{
		System.out.println("Calculate Area of Shapes:" );
	}
}

class Circle extends Shape
{
	int radius ;
	double pi= 3.142;
	
	Circle(int radius)
	{
		this.radius = radius;
	}
	void calculateArea1()
	{
		double area = pi*radius*radius;
		System.out.println("The ara of Circle is :" + area);
	}
}

class Square extends Shape
{
	int side;
	
	Square(int side)
	{
		this.side= side;
	}
	void calculateArea2()
	{
		double area = side*side;
		System.out.println("The area of Square is :" + area);
	}
}

class Triangle extends Shape
{
	double base;
	double height;

	Triangle(double base,double height)
	{
		this.base = base;
		this.height= height;
	}
	void calculateArea3()
	{
		double area = 0.5 * base * height;
		System.out.println("The area of Rectangle is :" + area);
	}
}
public class InheritanceExample {

	public static void main(String[] args)
	{
		Shape s1 = new Shape();
		Circle c1 = new Circle(5);
		Square s = new Square(5);
		Triangle t1 = new Triangle(5,8);
		s1.calculateArea();
		c1.calculateArea1();
		s.calculateArea2();
		t1.calculateArea3();
	}
}
