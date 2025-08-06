//.Use a nested for loop to print the multiplication table for numbers from 1 to 3. The output should look like this:


package greek;

import java.util.Scanner;

public class PracticeMultiTableForLoop {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int num=sc.nextInt();
		
		for(int i=1;i<=3;i++)
		{
			System.out.println("Tables of " + i);
			for(int j=1;j<=10;j++)
			{
				int n = i*j;
				System.out.println(i+" x "+j+" = "+n);
			}
			System.out.println();
		}
		sc.close();
	}
}
