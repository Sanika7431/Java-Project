package greek;

import java.util.Scanner;

public class StudentReport {
	String StudName;
	int RollNo;
	char StudBloodGroup;
	boolean isProgressed;
	long MobNo;
	short Id;
	byte studAge;
	float Totalmarks;
	double Percentage;
	
//	 void print(String StudName,int RollNo,char StudBloodGroup,boolean isProgressed,
//			 long MobNo,short Id,byte studAge,float Totalmarks,double Percentage)
//	 {
//		this.StudName = StudName;
//		this.RollNo= RollNo;
//		this.isProgressed = isProgressed;
//		this.MobNo = MobNo;
//		this.Id =Id;
//		this.studAge = studAge;
//		this.Totalmarks = Totalmarks;
//		this.Percentage = Percentage;
//	 }
	public static void main(String[] args)
	{
		StudentReport s1 = new StudentReport();
		Scanner s = new Scanner(System.in);
		
	    System.out.println("Enter Student Name: ");
	    String name = s.nextLine();
	    System.out.println("Enter Student Roll number: ");
	    int rollno = s.nextInt();
	    System.out.println("Enter Student Blood group: ");
	    char bloodgroup = s.next().charAt(0);
	    System.out.println("Enter Student is progress: ");
	    boolean progress = s.nextBoolean();
	    System.out.println("Enter Student mobile no: ");
	    long mobno = s.nextLong();
	    System.out.println("Enter Student Id: ");
	    short id = s.nextShort();
	    System.out.println("Enter Student age: ");
	    byte age = s.nextByte();
	    System.out.println("Enter Student Total marks: ");
	    float marks = s.nextFloat();
	    System.out.println("Enter Student Percentage: ");
	    double percentage = s.nextDouble();
	    
	    System.out.println(" ");
	    System.out.println("-------student Report-------");
	    System.out.println(" student name:" + name);
		 System.out.println(" student Roll number:" + rollno);
		 System.out.println(" student Student Blood Group:" +bloodgroup );
		 System.out.println(" student is progressed:" + progress);
		 System.out.println(" student mobile number :" + mobno);
		 System.out.println(" student Id:" +id);
		 System.out.println(" student Student age:" + age);
		 System.out.println(" student Student Total marks:" +marks);
		 System.out.println(" student Student Percentage:" +percentage );
	 
	   
		//s1.print();
	    s.close();
	}

}
