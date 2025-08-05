// Create a Java class Employee that has:

  // * A static variable companyName
 //  * Instance variables name, salary, and id
 //  * A static block to initialize companyName
  // * A constructor to initialize name, id, and salary
  // * A method to display employee details
  // * Use Scanner to input data


package greek;

import java.util.Scanner;

class Employee
{
	
	String empName;
	float empSalary;
	int empId;
	static String companyName;
	
	static
	{
		 companyName = "Tech Solution";
		
	}
	
	Employee(String empName,float empSalary,int empId)
	{
	     this.empName = empName;
	     this.empSalary = empSalary;
	     this.empId = empId;
		
	}
	
	void employeeDetails()
	{
		System.out.println("---Employee Details---");
	    System.out.println("Employee Company name :" +companyName);
		System.out.println("Employee name is :" + empName);
		System.out.println("Employee Salary is :" + empSalary);
		System.out.println("Employee ID :" +empId);
	  

	}
}
public class EmployeeDetailsUsingConstructor {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Employee name:");
		String name = s.nextLine();
		System.out.println("Enter the Employee salary:" );
		float salary = s.nextFloat();
		System.out.println("Enter the Employee ID:");
		int id= s.nextInt();
	
		Employee e1 = new Employee(name,salary,id);
		e1.employeeDetails();
		s.close();
		
		
	}
}
