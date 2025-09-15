package Web;

class Pojo{
	private int age;
	private String name;
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

}
