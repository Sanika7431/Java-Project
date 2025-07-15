package Web;

  class Temp
{
  static int Fahrenheit;
 //  static int Celsius = 25;
   
    static void cel(  int Celsius)
    {
    	Fahrenheit = Celsius * (9 / 5) + 32;
    	System.out.println("The temperature is :" + Fahrenheit +"F");
    }
}
public class Temperature {
	 
	public static void main(String[] args)
	{
		Temp.cel(25);
	}

}
