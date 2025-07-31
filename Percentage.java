package greek;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Percentage:");
		int per = sc.nextInt();
		
		if(per<60)
		{
			System.out.println("Grade:F");
		}
		else if(per<70)
		{
			System.out.println("Grade:D");
		}
		else if(per<80)
		{
			System.out.println("Grade:C");
		}
		else if(per<90)
		{
			System.out.println("Grade:B");
		}
		else if(per<100)
		{
			System.out.println("Grade:A");
		}
		else
		{
			System.out.println("Grade:F");
		}
		sc.close();
	}
}
