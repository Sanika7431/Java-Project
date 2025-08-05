//Print even numbers from 1 to 20 using a while loop.


package greek;

public class WhileLoopEvenNumber {

	public static void main(String[] args)
	{
		int num=1;
		
		while(num<=20)
		{
			if(num % 2 == 0)
			{
			System.out.println( num);
			
			}
			num++;
		}
	}
}
