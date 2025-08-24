package greek;

class Flower{
	String name="Lily";
	String color="Purple";
	void displayDetails()
	{
		System.out.println("Flower name: " + name);
		System.out.println("Flower color " + color);
	}
	
	void price(double price)
	{
		System.out.println("Flower Price: " + price);
	}
}

class Methods extends Flower {
	String name ="Rose";
	String color="Red";
	void display() {
		System.out.println("------super with Methods-----");
		System.out.println("Flower name "+ this.name);
		System.out.println("Flower color " +this.color);
		super.displayDetails();
		this.disp();
	}
	 void disp()
	 {
		 super.price(50.40);
	 }
}
public class SuperWithMethod {

	public static void main(String[] args) {
		Methods m1 = new Methods();
		m1.display();
		
	}
}
