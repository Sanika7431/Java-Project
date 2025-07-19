package Web;

class Circ
{
	static  float PI = 3.14f;
	int radius;
	void calculatearea(int radius)
	{
		
		float area = (PI * radius * radius);
		System.out.println("The area of circle: " + area);
		
		
	}
}

public class Circle {

	public static void main(String[] args)
	{
		Circ c = new Circ();
		c.calculatearea(5 );
		c.calculatearea(6 );
	}
}
