package Web;

public class POJOClassMain {
public static void main(String[] args) {
	Pojo p1 = new Pojo();
	p1.setAge(19);
	p1.setName("Sanika");
	System.out.println("Age: " + p1.getAge());
	System.out.println("Name: " + p1.getName());
	System.out.println(p1.toString());
}
}
