//Superclass: BankAccount with method calculateInterest(). 
//Subclasses: SavingsAccount, CurrentAccount. 
//Override interest calculation. Use polymorphism to call the correct method at runtime. 

package Web;
class BankAccount{
	void calculateInterest() {
		System.out.println("General Bankaccount Interest.");
	}
}
class SavingAccount extends BankAccount{
	@Override
	void calculateInterest() {
		System.out.println("Saving account Interest = 5%");
	}
}
class CurrentAccount extends BankAccount{
	@Override
	void calculateInterest() {
		System.out.println("Current Account Interest = 7%");
	}
}
public class polymorphism_Banking {
public static void main(String[] args) {
	BankAccount bank = new BankAccount();
	BankAccount save = new SavingAccount();
	BankAccount current = new CurrentAccount();
	save.calculateInterest();
	current.calculateInterest();
	bank.calculateInterest();
}
}
