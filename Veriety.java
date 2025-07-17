package Web;

//import java.util.Scanner;
class Mac
{
	void greetUser()
	{
		System.out.println("Welcome to java");
	}
	
	int square(int num)
	{
		System.out.println("Square of the number :" + (num*num));
		return num;
	}
	
	void showDetails(String name,int age)
	{
		System.out.println("Student name :" + name);
		System.out.println("Student age :" + age);
	}
	
	double getPi(float pi)
	{
		System.out.println("The value of Pi is :" + pi);
	    return pi;
	}
}
public class Veriety {

	public static void main(String[] args)
	{
		//Scanner s= new Scanner(System.in);
		Mac abc = new Mac();
		abc.greetUser();
		abc.square(8);
		abc.showDetails("Sanika", 19);
		abc.getPi(3.14159f);
	}
}
