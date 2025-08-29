//Create an employee class (id, name, deptname, salary). Define a default and parameterized
//  constructor. Use this keyword to initialize instance variables. Keep a count of objects
//  created. Create objects using parameterized constructor and display the object count after
//  each object is created (use static member and method). Also display the contents of each object.


package SYCLass;

public class Employee {
    private int empId;
    private String empName;
    private String empDesignation;
    private double empSal;

    public Employee(int empId, String empName, String empDesignation, double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                ", empSal=" + empSal +
                '}';
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "John Doe", "Manager", 50000.0);
        Employee employee2 = new Employee(102, "Jane Smith", "Developer", 45000.0);

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
