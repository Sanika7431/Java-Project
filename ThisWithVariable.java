package greek;

class Studs{
	int id;
	String name;
	
	Studs(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println("ID :" + id);
		System.out.println("Name : " + name);
	}
}
public class ThisWithVariable {
	public static void  main(String[] args)
	{
		Studs s1 = new Studs(1 , "Sanika");
	}
}
