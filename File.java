package Web;

class Dik
{
	static void demo(int a,int b)
	{ 
		int Remainder;
		Remainder = (a % b);
		System.out.println("Remainder is :" + Remainder  );
	}
}
public class File {
	public static void main(String[] args)
	{
		Dik.demo(10,5);
	}
}
