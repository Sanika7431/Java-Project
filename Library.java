package greek;

import java.util.Scanner;

class Books
{
	
	String title;
	String author;
	double price;
	
	Books(String title,String author,double price)
	{
		this.title = title;
		this.author= author;
		this.price = price;
	}
	
	 void display()
	{
		System.out.println("------Book Details-----");
		System.out.println("Book Title:" + title);
		System.out.println("Auther:" + author);
		System.out.println("Price:" + price);
	}
}
public class Library {
 
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Book Title :" );
	String title = s.nextLine();
	System.out.println("Enter the Author name : ");
	String author = s.nextLine();
	System.out.println("Enter the book Price:" );
	double price = s.nextDouble();
	
	Books l2= new Books(title,author,price);
	l2.display();
	s.close();
}
}

