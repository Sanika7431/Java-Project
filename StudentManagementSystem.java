package Web;
class Student77{
	private String name;
	private int rollno;
	private double marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
	void calculateResult(int marks) {
		if(marks >= 40) {
			System.out.println("Student Pass in subject.");
		}else {
			System.out.println("Student Fail in subject.");
		}
	}
	
	
	void calculateResult(double marks,double totalMarks) {
		double percentage = (marks/totalMarks)*100;
		
		System.out.println("Percentage:" + percentage);
		
		
		if(percentage >=90) {
			System.out.println("Grade A");
		}else if(percentage >=70) {
			System.out.println("Grade B");
		}else if(percentage >= 50) {
			System.out.println("Grade C");
		}else if(percentage >=35) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
	}
	void calculateResult(double cgpa) {
	    double percentage = cgpa * 9.5;   // CGPA to percentage conversion
	    System.out.println("Percentage from CGPA: " + percentage + "%");

	    if (percentage >= 90) {
	        System.out.println("Grade A and class First");
	    } else if (percentage >= 70) {
	        System.out.println("Grade B and class Second");
	    } else if (percentage >= 50) {
	        System.out.println("Grade C and class Third");
	    } else if (percentage >= 35) {
	        System.out.println("Pass and class Fourth");
	    } else {
	        System.out.println("Fail and class Zero");
	    }
	}

}
public class StudentManagementSystem {
public static void main(String[] args) {
	Student77 student = new Student77();
	student.setName("Sanika");
	student.setRollno(7);
	student.setMarks(95.99);
	System.out.println("Student name :" + student.getName());
	System.out.println("Student Roll no :" + student.getRollno());
	System.out.println("Student Marks :" +student.getMarks());
	System.out.println("");
	student.calculateResult(90);
	System.out.println(" ");
	student.calculateResult(90,100);
	System.out.println(" ");
	student.calculateResult(9.89);
}
}
