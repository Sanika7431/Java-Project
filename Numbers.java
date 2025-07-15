package Web;

class Src
{
	int c;
	int d;
	int e;
	int f;
	int g;
	
	 void calculate(int a,int b) {
		c = a + b;
		d = a - b;
		e = a * b;
		f = a / b;
		g = a % b;
		System.out.println("Addition of two number = :" + c);
		System.out.println("Subtraction of two number = :" + d);
		System.out.println("Multiplication of two number = :" + e);
		System.out.println("Division of two number = :" + f);
		System.out.println(" ");
		System.out.println("Remainder of two number = :" + g);
		
	}
}
public class Numbers {
	public static void main(String[] args)
	{
		Src s1 = new Src();
		s1.calculate(10, 5);
	}
}
