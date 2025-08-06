//Write a Java program that uses a do-while loop to repeatedly ask the user to enter a message.
// The program should stop only when the user types the word "exit".


package greek;

import java.util.Scanner;

public class PracticeSMSWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String message;
		do {
			System.out.println("Enter the message");
			message= sc.nextLine();
		}while(!message.equals("exit"));
		
		sc.close();

	}

}
