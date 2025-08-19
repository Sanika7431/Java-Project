package greek;

//Parent class
class Animal{
	
	String name;
	int age;
	String type;
	
	Animal(String name,int age,String type)
	{
		this.name=name;
		this.age=age;
		this.type=type;
	}
	
	void displayDetails()
	{
		
		System.out.println("Anaimal name:" + name);
		System.out.println("Animal age:" + age);
		System.out.println("Animal type:" + type);
	}
}



class Carnivorous extends Animal //child class
{
    Carnivorous(String name,int age,String type) 
    {
    	super(name,age,type);
	    System.out.println("Eats Animals");
    }
}

class Herbivorous extends Animal
{//child class
     Herbivorous(String name,int age,String type) 
     {
		super(name,age,type);
	     System.out.println("Eats Plants and Vegetables");
	 }
}

class Amphibians extends Animal 
{//child class
	 Amphibians(String name , int age , String type) 
	 {
		 super(name,age,type);
	     System.out.println("Amphibians lives in land and water");
	}
}

class Reptiles extends Animal
{//child class
	Reptiles(String name,int age,String type) 
	{
       super(name,age,type);
	   System.out.println("Reptiles lives in land ,water ,deserts ,forest..");
	}
}

class Aquatic extends Animal
{//child class
    Aquatic(String name,int age,String type)
    {
    	super(name,age,type);
	    System.out.println("Aquatic lives only in water ");
    }
}



//main class
public class Animal_Inheritance {

	public static void main(String[] args)
	{
		Carnivorous tiger = new Carnivorous("Tiger", 2 , "Carnivorous");
		tiger.displayDetails();
		System.out.println(" ");
		
		Herbivorous cow = new Herbivorous("Cow",5,"Herbivorous");
		cow.displayDetails();
		System.out.println(" ");
		
		Amphibians frog = new Amphibians("Frog",1,"Amphibians");
		frog.displayDetails();
		System.out.println(" ");
		
		Reptiles snake = new Reptiles("Snake",1,"Reptiles");
		snake.displayDetails();
		System.out.println(" ");
		
		Aquatic fish = new Aquatic("Fish",2,"Aquatic");
		fish.displayDetails();
		System.out.println(" ");
	}
}
