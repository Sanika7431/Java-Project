package JAVA;

class Account{
	String cname;
	int accNo;
	
	Account(){
		cname="";
		accNo=0;
	}
	Account(String cname,int accNo){
		this.cname=cname;
		this.accNo=accNo;
	}
	
}
class SavingBalance extends Account{
	double savingbal;
	double minbal;
	SavingBalance( String cname,int accNo ,double savingbal,double minbal){
		super(cname,accNo);
		this.savingbal=savingbal;
		this.minbal=minbal;
	}
}

class AccountDetails extends SavingBalance{
	double dipositamt;
	double withdrawamt;
	
	AccountDetails( String cname,int accNo ,double savingbal,double minbal,double dipositamt,double withdrawamt){
		super(cname,accNo,savingbal,minbal);
		this.dipositamt=dipositamt;
		this.withdrawamt=withdrawamt;
	}
	void displayAccount() {
		System.out.println("Customername:" + cname);
		System.out.println("accNo:" + accNo);
		System.out.println("savingbal" + savingbal);
		System.out.println("minbal:" + minbal);
		System.out.println("diposit="+ dipositamt);
		System.out.println("withdraw:" + withdrawamt);
		double bal = savingbal + dipositamt - withdrawamt;
		System.out.println("Total Balance : " + bal);
	}
}
public class AccountMain {
public static void main(String[] args) {
	AccountDetails a1 = new AccountDetails("Sanika",7645125,51285,16595,26912,28);
	a1.displayAccount();
}
}
