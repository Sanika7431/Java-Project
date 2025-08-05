//Count the number of digits in a given number using a while loop.

package greek;

public class WhileLoopCountDigit {

	public static void main(String[] args)
	{
		int n= 1234;
		int count=0;
		int temp=n;
		
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		}
		System.out.println("Total Count:" +count);
	}
}
