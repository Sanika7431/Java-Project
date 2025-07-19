package Web;

class Frame
{
	String PersonName = "Sanika";
	int PersonAge  = 19;
   
	 
	 Frame(String Person , int Age)
	 {
		
		
		 System.out.println("-------Person Details-------");
		 System.out.println("Person name is :" + Person);
		 System.out.println("Person Age is :" + Age);
		 System.out.println("") ;
	 }
	 
	
}
public class Sarthak {

	public static void main(String[] args)
	{
		Frame s = new Frame("Sanika" ,19);
		Frame s1 = new Frame("Ruhi" ,18);
		
	}
}
