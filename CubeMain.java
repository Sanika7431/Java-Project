package JAVA;

import java.util.Scanner;
interface Cube{
	public int findcube(int n) ;
}
public class CubeMain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number:");
	int num = sc.nextInt();
	Cube c = (n) -> n*n*n;
	int result = c.findcube(num);
	System.out.println("Cube : " + result);
}
}
