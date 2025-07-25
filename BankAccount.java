package greek;

import java.util.Scanner;
public class BankAccount {

	static String BankName="Central Bank"; ;
	float BankBalance ;
	
	static void showBankName()
	{
		System.out.println("BankName:" + BankName);
		String customerName="sanika";
		System.out.println("Customer name:" + customerName);
	}
	 
	void displayBalance()
	{
		Scanner s = new Scanner(System.in);
		String currency= "USD";
		System.out.println("Currency :" + currency);
		System.out.println("Enter the Balance:");
		float Balance = s.nextFloat();
		System.out.println("Current Balance :" + Balance);
		s.close();
	}	
	
	public static void main(String[] args) 
	{
	
	BankAccount.showBankName();
	BankAccount b1 = new BankAccount();
	b1.displayBalance();
	
	}
	
	
}
