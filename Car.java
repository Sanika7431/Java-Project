package Web;

class  Cars
{
	void start()
	{
		String Car= "Car is Start"; 
		System.out.println(Car);
	}
	 
	static void showCompanyName()
	{
		String CompanyName = "Toyota";
		System.out.println("Company name is :" + CompanyName );
	}

}
public class Car {

	public static void main(String[] args)
	{
		Cars s = new Cars();
		s.start();
		Cars.showCompanyName();
	}
}
