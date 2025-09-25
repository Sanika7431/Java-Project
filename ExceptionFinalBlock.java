package Exceptions;

public class ExceptionFinalBlock {
public static void main(String[] args) {
	try {
		int s = 5/0;
		System.out.println("s= "+s);
	}catch(ArithmeticException a) {
		System.out.println("Exception Handled!");
	}finally {
		System.out.println("Finally Block executed!");
	}
}
}
