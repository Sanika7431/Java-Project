package Web;

class Bank
{
	static String BankName = "SBI ";
	String accountHolder = "Ruhi";
	float balance = 7000000.89f;
	float Deposited =1200f;
	
	 Bank(float deposit)
	 {
		System.out.println("------Details-------");
		System.out.println("Account Holder :" + accountHolder);
		System.out.println("Bank Balance :" + balance);
		System.out.println("Deposited :" + deposit);
		System.out.println("New Balance :" + (balance + Deposited));
		
	 }
	
}
public class Demo 
{
	public static void main(String[] args)
	{
		Bank b = new Bank(78000.678f);
	}

}
