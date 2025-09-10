// Method Overloading with Constructors 
//Create a class Student with multiple constructors: 
// One accepting only name 
// One accepting name and rollNo 
// One accepting name, rollNo, and marks 
//Show constructor overloading. 

package Web;
class Student9{
	
	Student9(String name){
		System.out.println("Name:" + name);
	}
    Student9(String name ,int rollno){
    	System.out.println("Name:" + name +" and "+ " Rollno:" + rollno );
	}
    Student9(String name,int rollno,double marks){
		System.out.println("Name:" + name +" and "+ " Rollno:" + rollno + " and " + " Marks:" + marks );
	}
}

public class PolyMorphism_calculator2 {
public static void main(String[] args) {
	Student9 s1 = new Student9("sanika");
	Student9 s2 = new Student9("Sanika",7);
	Student9 s3 = new Student9("sanika",7,87);
	System.out.println();
}
}
