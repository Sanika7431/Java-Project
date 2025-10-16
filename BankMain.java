package JAVA;

import java.util.Scanner;

class Bank {
	String accHolder;
	int accno;
	double balance;
	
	Bank(String accHolder,int accno,double balance){
		this.accHolder=accHolder;
		this.accno=accno;
		this.balance=balance;
	}
	void deposit(double amt ) {
		balance +=amt;
		System.out.println(amt + "Deposited successfully");
	}
	void withdraw(double amt) {
		if(amt<=balance) {
			balance-=amt;
			System.out.println(amt + "Withdrwa sucessfully");
		}else {
			System.out.println("insufficient balance");
		}
	}
	void dispalyBalance() {
		System.out.println("Acc Holder"+accHolder);
		System.out.println("Acc no:" + accno);
		System.out.println("Current Balance:" + balance);
	}
}
public class BankMain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter AccHolder");
	String accHolder=sc.next();
	System.out.println("Enter accno:");
	int accno=sc.nextInt();
	System.out.println("Enter balance ");
	double balance = sc.nextDouble();
	Bank b = new Bank(accHolder,accno,balance);
	
	while(true) {
	System.out.println("\n menu");
	System.out.println("\t1.Deposit\t2.withdraw\t3.displayBalance\t4.exit");
	System.out.println("Enter your choice:");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:
		System.out.println("Enter amt to deposit:");
		double dep = sc.nextDouble();
		b.deposit(dep);
		break;
		
	case 2:
		System.out.println("Enter amt to withdraw:");
		double wth = sc.nextDouble();
		b.withdraw(wth);
		break;
		
	case 3:
		b.dispalyBalance();
		
	case 4:
		System.out.println("Existing....");
		System.exit(0);
		
		default:
			System.out.println("Invalid choice:");
	}
	}
}
}
