package Web;

 import java.util.Scanner;

public class Cpp
{
    public static void main(String[] args) 
    {
   
    	 Scanner sc = new Scanner(System.in);
    	 System.out.printf("Enter the  first number:");
    	 int num1 = sc.nextInt();
    	 System.out.println( "num1 :"+num1); 
    	 System.out.println(" ");
    	 
    	 System.out.printf("Enter the  second number:");
    	 int num2 = sc.nextInt();
    	 System.out.println("num2 :" + num2);
    	 System.out.println(" ");
    	 
    	 System.out.println("The remainder of two number is :"+ (num1 % num2));
    	 sc.close();
          
    }  
}




