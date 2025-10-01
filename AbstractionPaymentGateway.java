/*Payment Gateway (Interface Example)

Define an interface Payment with methods:

pay(double amount)

refund(double amount)


Implement it in two classes: CreditCardPayment and UPIPayment.
👉 Demonstrate their usage in a shopping application where different payment methods are used.*/

package Abstraction;

interface Payment{
	
	abstract void pay(double ammount);
	abstract void refund(double ammount);
}

class CreditCardPayment implements Payment{
	@Override
	public void pay(double ammount) {
		System.out.println("Paid Rs. " + ammount + "using credit card.");
	}
	@Override
	public void refund(double ammount) {
		System.out.println("Refunded Rs." + ammount + "to credit card.");
	}
}
class UPIPayment implements Payment{
	@Override
	public void pay(double ammount) {
		System.out.println("Paid Rs." + ammount + "using UPI.");
	}
	@Override
	public void refund(double ammount){
		System.out.println("Refunded Rs." + ammount + "to UPI account.");
	}
}
public class AbstractionPaymentGateway {
public static void main(String[] args) {
	CreditCardPayment card= new CreditCardPayment();
	UPIPayment upi = new UPIPayment();
	card.pay(5000);
	card.refund(2000);
	upi.pay(500);
	upi.refund(1000);
}
}
