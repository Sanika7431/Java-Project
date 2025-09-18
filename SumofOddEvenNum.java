package Web;

import java.util.Scanner;

public class SumofOddEvenNum {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enetr the number:");
	int num = sc.nextInt();
	int sum1 =0;
	int sum2 = 0;
	for(int i=1 ; i<=num;i++) {
		System.out.print(i + " : ");
		if (i%2==0) {
			System.out.println("Even Numbers");
			sum2 =sum2 + i;
		}else  {
			System.out.println("Odd Numbers");
			sum1 = sum1 + i;
		} 
       }
	System.out.println(" ");
	 System.out.println("Sum of odd Numbers : " + sum1);
	 System.out.println("Sum of Even Numbers : " + sum2);
	}
}

