package Web;

class FYBCS{
	String StudName = "Soniya";
	int StudRollNo = 10;
	float StudPer = 89.80f;
	short StudAge= 20;
	long StudMobNo = 1234567890L;
	char StudBatch = 'C';
	boolean IsAdult = true;
	
	void StudInfo()
	{
		System.out.println("Student name  is :" + StudName);
		System.out.println("Student roll number is :" + StudRollNo);
		System.out.println("Student Percentage is:" + StudPer);
		System.out.println("Student Age is :"+ StudAge);
		System.out.println("Student Mobile number :" + StudMobNo);
		System.out.println("student Batch is:" + StudBatch);
		System.out.println("Student  is Adult :" + IsAdult );
		System.out.println(" ");
	}
}

class SYBCS{
	String StudName = "Rohit";
	int StudRollNo = 30;
	float StudPer = 90.80f;
	short StudAge= 21;
	long StudMobNo = 1234770890L;
	char StudBatch = 'B';
	boolean IsAdult = true;
	
	void StudInfo()
	{
		System.out.println("Student name  is :" + StudName);
		System.out.println("Student roll number is :" + StudRollNo);
		System.out.println("Student Percentage is:" + StudPer);
		System.out.println("Student Age is :"+ StudAge);
		System.out.println("Student Mobile number :" + StudMobNo);
		System.out.println("student Batch is:" + StudBatch);
		System.out.println("Student  is Adult :" + IsAdult );
		System.out.println(" ");
	}
} 

class TYBCS{
	String StudName = "Sanika";
	int StudRollNo = 20;
	float StudPer = 95.80f;
	short StudAge= 20;
	long StudMobNo = 7434567890L;
	char StudBatch = 'A';
	boolean IsAdult = true;
	
	void StudInfo()
	{
		System.out.println("Student name  is :" + StudName);
		System.out.println("Student roll number is :" + StudRollNo);
		System.out.println("Student Percentage is:" + StudPer);
		System.out.println("Student Age is :"+ StudAge);
		System.out.println("Student Mobile number :" + StudMobNo);
		System.out.println("student Batch is:" + StudBatch);
		System.out.println("Student  is Adult :" + IsAdult );
		System.out.println(" ");
	}
}

public class Methods {

	public static void main(String[] args) {
	FYBCS f1 = new FYBCS();
	SYBCS s1 = new SYBCS();
	TYBCS t1 = new TYBCS();
	f1.StudInfo();
    s1.StudInfo();
    t1.StudInfo();	
	}
}
