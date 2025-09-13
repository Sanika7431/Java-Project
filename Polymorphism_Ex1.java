package Web;

class Book{
	private String title;
	private String auther;
	private double price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price > 0) {
		this.price = price;
		}
		else {
			System.out.println("Invalid price!");
		}
	}
	
}
public class Polymorphism_Ex1 {
public static void main(String[] args) {
	Book book = new Book();
	book.setAuther("MV Thakare ");
	book.setTitle("Java");
	book.setPrice(500.45);
	System.out.println("Book Auther:" + book.getAuther());
	System.out.println("Book Title:" + book.getTitle());
	System.out.println("Book price:" + book.getPrice());
}
}
