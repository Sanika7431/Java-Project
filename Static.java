package Web;
 
class Var
{
	static String collegeName = "SMBST";
	String studentName = "Sanika";
	int rollNumber = 77;
	 
	void cd()
	{
		System.out.println("CollegeName :" + collegeName);
		System.out.println("StudentName :" + studentName);
		System.out.println("RollNumber :" + rollNumber);
	}
}
public class Static {

	public static void main(String[] args)
	{
		Var v= new Var();
		v.cd();
	}
}
