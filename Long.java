package Web;

import java.util.Scanner;

class Studinfo
{
    String name ;
    int age ;
    char gender ;
    float percentage ;
    
      
}
public class Long {

	public  static void main(String[] args)
	{
		
	    Scanner s= new Scanner(System.in);
	    Studinfo b = new Studinfo();
	    
	    System.out.println("Enter the Student name:" );
	    String name = s.nextLine();
	    System.out.println("Enter the student age:");
	    int age = s.nextInt();
	    System.out.println("Enter the student gender:");
	    String gender =s.next();
	    System.out.println("Enter the student percentage:");
	    float percentage = s.nextFloat();
	    
	    System.out.println("  Student Details:"  );
	    System.out.println("Student name:" + name);
		System.out.println("Student name:" + age);
		System.out.println("Student name:" + gender);
		System.out.println("Student name:" + percentage);
	    s.close();
	}
}
