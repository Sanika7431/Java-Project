package Web;

class TempratureConverter
{
	static void temp( float celsius)
	{
		System.out.println("Temp in celsius: "+ celsius +" C");
		float fahrenheit = (celsius * (1.8f) +32);
		System.out.println("Temp convert celsius to fahrenheit:" + fahrenheit + " F");
		double Celsius = ((fahrenheit-32)*(0.55555f));
		System.out.println("Temp convert fahrenheit  to celsius :" + Celsius +" C");
	}
}
public class TempToFahStaticMeth {

	public static void main(String[] args)
	{
		TempratureConverter.temp(77);
	}
}