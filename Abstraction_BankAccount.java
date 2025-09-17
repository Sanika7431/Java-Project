package Web; 

abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingAccount extends BankAccount 
{
    SavingAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Saving Account");
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from Saving Account");
        } else {
            System.out.println("Insufficient Balance in Saving Account");
        }
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Current Account");
    }

    @Override
    void withdraw(double amount) {
        balance -= amount; // overdraft allowed
        System.out.println("Withdrawn " + amount + " from Current Account");
    }
}

public class Abstraction_BankAccount {
    public static void main(String[] args) {
        BankAccount sAcc = new SavingAccount(1000);
        BankAccount cAcc = new CurrentAccount(2000);

        sAcc.deposit(500);
        sAcc.withdraw(700);
        sAcc.showBalance();

        cAcc.deposit(1000);
        cAcc.withdraw(3500);
        cAcc.showBalance();
    }
}
