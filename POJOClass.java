package Web;

class Pojo{
	int age;
	String name;
	Pojo(){
		
	}
	Pojo(int age,String name){
		this.age=age;
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Pojo [age=" + age + ", name=" + name + "]";
	}
	
}
public class POJOClass {
public static void main(String[] args) {
	Pojo p1 = new Pojo();
	p1.setAge(19);
	p1.setName("Sanika");
	System.out.println("Age: " + p1.getAge());
	System.out.println("Name: " + p1.getName());
	System.out.println(p1.toString());
}
}
