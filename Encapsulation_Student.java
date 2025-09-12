package Web;

class Employee{ 
	  
	 private int Emp_id; 
	 private String Emp_Name; 
	 private String Emp_Desig; 
	  
	 public int getEmp_id() { 
	  return Emp_id; 
	 } 
	 public void setEmp_id(int emp_id) { 
	  Emp_id = emp_id; 
	 } 
	 public String getEmp_Name() { 
	  return Emp_Name; 
	 } 
	 public void setEmp_Name(String emp_Name) { 
	  Emp_Name = emp_Name; 
	 } 
	 public String getEmp_Desig() { 
	  return Emp_Desig; 
	 } 
	 public void setEmp_Desig(String emp_Desig) { 
	  Emp_Desig = emp_Desig; 
	 } 
} 
	 
	public class Encapsulation_Student{ 
	 
	 public static void main(String[] args) { 
	  Employee e1 = new Employee(); 
	  e1.setEmp_id(1); 
	  e1.setEmp_Name("Sanika"); 
	  e1.setEmp_Desig("Engineer"); 
	  System.out.println(e1.getEmp_id()); 
	  System.out.println(e1.getEmp_Name()); 
	  System.out.println(e1.getEmp_Desig()); 
	 }   
}