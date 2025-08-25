//Create a BaseClass with a no-argument constructor and a parameterized constructor. The parameterized 
//constructor should print a message with the integer passed. Create a DerivedClass that inherits from 
//BaseClass. The DerivedClass should have two constructors: 
//A no-argument constructor that uses this() to call the parameterized constructor of the same class. 
//A parameterized constructor that uses super() to call the parameterized constructor of the BaseClass. 
//In your main method, create a new instance of the DerivedClass using the no-argument constructor and 
//explain the flow of constructor calls.

package greek;

class BaseClass{
	BaseClass()
	{
		
	}
	BaseClass(int age ,String name)
	{
		System.out.println("age-" +age);
		System.out.println("name-" + name);
	}
}
class DerivedClass extends BaseClass{
	DerivedClass()
	{
		this(3,6);
	}
	DerivedClass(int a,int b){
		
		super(19,"sanika");
		System.out.println("sum="+ (a+b));
	}
}
public class InheritanceEx5 {
public static void main(String[] args) {
	DerivedClass d1 = new DerivedClass();
}
}
