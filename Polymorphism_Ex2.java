package Web;
class Member{
	void calculateDiscount(double amount) {
		
	}
}
class StudentMember extends Member{
	@Override
	void calculateDiscount(double amount) {
		System.out.println(" To give 20% discount.");
	}
}
class FacultyMember extends Member{
	@Override
	void calculateDiscount(double amount) {
		System.out.println("To give 10% discount.");
	}
}
public class Polymorphism_Ex2 {
public static void main(String[] args) {
	StudentMember student = new StudentMember();
	FacultyMember faculty = new FacultyMember();
	student.calculateDiscount(5000);
	faculty.calculateDiscount(10000);
}
}
