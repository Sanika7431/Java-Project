/*Employee Management (Interface Inheritance)

Create an interface Workable with a method work().
Create another interface Payable with a method getSalary().
Then create a class Employee that implements both interfaces.
👉 Extend it further by creating Manager and Developer classes with different implementationspackage Abstraction;*/

package Abstraction;

interface Workable{
	abstract void work();
}
interface Payable{
	abstract void getSalary();
}


class Employee implements Workable,Payable{
	@Override
	public void work() { }
	public void getSalary() { }
}


class Manager extends Employee{
	@Override
	public void work() {
		System.out.println("Manager managing our team.");
	}
	public void getSalary() {
		System.out.println("Manager Salary: 80000" );
	}
}


class Developer extends Employee{
	@Override
	public void work() {
		System.out.println("Developer writing code.");
	}
	public void getSalary() {
		System.out.println("Developer Salary: 60000" );
	}
}


public class AbstractionEmployeeManagementSystem {
public static void main(String[] args) {
	Manager manager = new Manager();
	Developer developer = new Developer();
	manager.work();
	manager.getSalary();
	developer.work();
	developer.getSalary();
}
}
