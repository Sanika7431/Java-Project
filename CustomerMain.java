package JAVA;

import java.util.Scanner;

class Customer{
	String name;
	int phoneNo;
	
	Customer(String name,int phoneNo){
		this.name=name;
		this.phoneNo=phoneNo;
	}
	void displayCustomer() {
		System.out.println("Name:" + name);
		System.out.println("Phon no :" + phoneNo);
	}
}
class Depositor extends Customer{
	int accno;
	double balance;
	
	Depositor(String name,int phoneNo,int accno,double balance){
		super(name,phoneNo);
		this.accno=accno;
		this.balance=balance;
	}
	void displayDepositor() {
		displayCustomer();
		System.out.println("AccNo:" + accno);
		System.out.println("Balance:" + balance);
	}
}
class Borrower extends Depositor{
	int loanNo;
	double loanamt;
	
	Borrower(String name,int phoneNo,int accno,double balance,int loanNo,double loanamt){
		super(name,phoneNo,accno,balance);
		this.loanNo=loanNo;
		this.loanamt=loanamt;
	}
	void displayBorrower() {
		displayDepositor();
		System.out.println("loan No" + loanNo);
		System.out.println("loanamt" + loanamt);
	}
}
public class CustomerMain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number of Customer:");
	int n = sc.nextInt();
	Borrower[] b = new Borrower[n];
	
	for(int i=0;i<n;i++) {
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter PhoneNumber:");
		int phoneNo=sc.nextInt();
		System.out.println("Enter accno");
		int accno=sc.nextInt();
		System.out.println("Enter balance");
		double balance = sc.nextDouble();
		System.out.println("Enter loan no");
		int loanNo= sc.nextInt();
		System.out.println("Loan Amount ");
		double loanamt = sc.nextDouble();
		
		b[i]=new Borrower(name,phoneNo,accno,balance,loanNo,loanamt);
	}
	
	System.out.println("Customer detail:");
	for(Borrower c:b) {
		c.displayBorrower();
		System.out.println();
	}
}
}
