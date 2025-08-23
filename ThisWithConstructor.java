package greek;

class Students{
	
	Students()
	{
		this(1,"Sanika");
	}
	
	Students(int id,String name)
	{
		this("Sanika",1);
		System.out.println("1.Student id =" + id);
		System.out.println("1.Student name =" + name);
	}
	
	Students(String name,int id)
	{
		this("Sanika");
		System.out.println("2.Student name =" + name);
		System.out.println("2.Student id =" + id);
	}
	
	Students(String name)
	{
		this(1);
		System.out.println("3.Student name =" + name);
	}
	
	Students(int id)
	{
		System.out.println("4.Student id =" + id);
	}
}
public class ThisWithConstructor {
public static void main(String[] args)
{
	Students s1 = new Students();
}
}
