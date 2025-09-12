package Web;

class BankAccount1 { 
    private String accountHolder; 
    private double balance;
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance > 0)
		{
		this.balance = balance;
		}
		else {
			System.out.println("Balance cannot be Negative!");
		}
	} 
    
    
} 
 
public class Encapsulation_BankAccount { 
    public static void main(String[] args) { 
        BankAccount1 acc = new BankAccount1(); 
        acc.setAccountHolder("Sanika"); 
        acc.setBalance(5000); 
 
        System.out.println("Account Holder: " + acc.getAccountHolder()); 
        System.out.println("Balance: ₹" + acc.getBalance()); 
 
        acc.setBalance(-1000); 
    } 
} 
