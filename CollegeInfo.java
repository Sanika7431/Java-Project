package Web;

class FYBCA{
	static String studclass  = "BCA"; 
	String studname = "Sham";
	static int studrollno = 12;
	 static short studmathmark= 88;
	static short studcsmark =98;
	static short studdsmark= 99;
	
	    static void Per() 
	    {
		int TotalMarks= (studmathmark+  studcsmark+ studdsmark);
		float sum = TotalMarks/3;
		System.out.println("student percentage is :"+ sum +"%");
		System.out.println("  ");
	    }
	    
	    static void MN()
	    {
	    	System.out.println(" student class is :"+ studclass);
	    	System.out.println("student math marks is :"+ studmathmark);
	    	System.out.println(" ");
	    }
	    
	    void add()
	    {
	    	int x;
	    	x = (studmathmark +studdsmark +studrollno)/2;
	    	System.out.println(x);
	    	System.out.println(" ");
	    }
}
public class CollegeInfo {
	public static void main(String[] args)
	{ 
		FYBCA.Per();
		FYBCA.MN();
		 
		FYBCA f1  = new FYBCA();
		f1.add();
		System.out.println("student name is:" + f1.studname);
		System.out.println(" ");
		
	}
}
