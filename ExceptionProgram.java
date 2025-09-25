package Exceptions;

public class ExceptionProgram {
public static void main(String[] args) {
	 try
	 {
	int a = 10;
	int b=0;
	float c=a/b;
	System.out.println("c= "+c);
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage());
		System.out.println("Invalid Input!");
	}finally {
		System.out.println("I am in Finally Block!");
	}
}
}
