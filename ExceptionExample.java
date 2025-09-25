package Exceptions;

public class ExceptionExample {
public static void main(String[] args) {
	int a[] = {10,20,30};
	try {
		System.out.println(a[5]);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
		System.out.println("Invalid Index Array!");
	}
}
}
