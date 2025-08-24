package greek;

class Bird{
     String name="Crow";
     int age=1;
}
class Sparrow extends Bird{

	String name = "Sparrow";
	 int age = 2;
	 int count;
	 void displayDetails()
     {
		 System.out.println("-----super with Variable-----");
    	 System.out.println("Bird: "+this.name);
    	 System.out.println("Age: "+this.age);
    	 System.out.println("Bird: "+super.name);
    	 System.out.println("Age: "+super.age);
     }
}
public class SuperWithVariable {

	public static void main(String[] args) {
		Sparrow s1 = new Sparrow();
		s1.displayDetails();
	}
}
