package Web;

class  Operator
{
	static int a=2;
	static int b=5;
	static int c;
	static int d;
		
	static  void cal()
	{
		c = (a * 2);
		System.out.println("The square of number is :" + c );
		
		d= (b * b* b);
		System.out.println("The cube of number is :" + d );
	}
}
public class Square {

	public static void main(String[] args)
	{
		Operator.cal();
	}
}
