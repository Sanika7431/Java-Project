//Write a class Calculator with overloaded add() methods: 
// add(int, int) 
// add(double, double) 
//Demonstrate calling both.   Method Overloading........

package Web;

class Calculator{
	int add(int a,int b) {
		return a+b;
	}
	double add(double a,double b){
		return a-b;
	}	
	
}
public class Polymorphism_Calculator {
public static void main(String[] args) {
	Calculator c1 = new Calculator();
	System.out.println("A="+c1.add(5, 6));
	System.out.println("B="+ c1.add(1.2, 1));
	
}
}
