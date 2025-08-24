package greek;

class Vehicles {
   String carname;
   int carno;
   
   Vehicles()
   {
	   System.out.println("--super with  constructor.--");
   }
   Vehicles(String carname)
   {
	   this(2006);
	   this.carname=carname;
	   System.out.println("Carname :" + carname);
   }
   Vehicles( int carno)
   {
	   System.out.println("CarNo: "+carno);
   }
}
class LandVehi extends Vehicles{
	String name;
	double price;
	LandVehi(String name)
	{
		super("Audi");
		this.name=name;
		System.out.println(" vehicle Name - " + name);
	}
}

public class SuperWithConstructor {
    public static void main(String[] args) {
        Vehicles v1 = new Vehicles(); 
        LandVehi l1 = new LandVehi("Bike");
    }
}

