package Web;

class Area
{
	static int area;
	static int perimeter;
	 
	static void cals( int Length,int Width)
	{ 
		area = Length * Width;
		System.out.println("Area of the rectangle is :" + area);
		
		perimeter = 2 * (Length + Width);
		System.out.println("Perimeter of the rectangle is :" + perimeter);
	}
}
public class Parameter {
	
	public static void main(String[] args)
	{
		Area.cals(4, 6);
	}

}
