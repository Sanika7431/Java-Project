package Web;

import java.util.Scanner;
public class Squ_cub {

	public static void main(String[] args)
	{
		Scanner sq = new Scanner(System.in);
		System.out.println("Enter the   number :");
		int num = sq.nextInt();
		System.out.println("num :" + num);
		System.out.println(" ");
		
		System.out.println("The cube of num1 :" + (num* num *num));
		System.out.println("the square of num1 :" + (num*num));
		sq.close();
	}
}
