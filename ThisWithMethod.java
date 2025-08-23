package greek;

class Stud
{
	void add()
	{
		System.out.println("This is add Method");
		this.sub();
		this.mul();
	}
	
	void sub()
	{
		System.out.println("This is sub Method");
	}
	
	void mul()
	{
		System.out.println("This is mul Method");
	}
}
public class ThisWithMethod {
	public static void main()
	{
		Stud s1 = new Stud();
		s1.add();
	}
}
